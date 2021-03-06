var calcNum = [];
var calcFinal = 0;
var running = [];
var decimalCount = 0;
var operatorCount = 0;
var operators = ["CE", "C", "&gt;", "÷", "x", "-", "+", "=", "."
];
var opPresses = [];

$(document).ready(function () {
	var decimalCount = 0;
	$('.btn').click(function (e) {
		e.preventDefault();
		var buttonPressed = $(this).html();
		console.log(buttonPressed);

		if (jQuery.inArray(buttonPressed, operators) == -1) { // Check to see if the button the user pressed is an operator.
			calcNum.push(buttonPressed);
			if(calcNum[0] === '0' && calcNum[1] != ".") {
				calcNum.shift();
				$('#display-span').html("0");
			} else {
				$('#display-span').html(numString(calcNum));
			}
		} else if (jQuery.inArray(buttonPressed, operators) == 8) { // Insert a decimal and make sure only one is present.
			if (decimalCount < 1) {
				if (calcNum.length < 1) {
					calcNum.push("0");
					calcNum.push(".");
					decimalCount++;
				} else {
					calcNum.push(".");
					$('#display-span').html(numString(calcNum));
					decimalCount++;
				}
			}
		} else if (jQuery.inArray(buttonPressed, operators) == 0) { // Clear entry.
			calcNum = [];
			decimalCount = 0;
			$('#display-span').html("0");
		} else if (jQuery.inArray(buttonPressed, operators) == 1) { // Clear everything.
			calcNum = [];
			running = [];
			opPresses = [];
			decimalCount = 0;
			$('#display-span').html("0");
		} else if (jQuery.inArray(buttonPressed, operators) == 2) {
			calcNum.pop();
			$('#display-span').html(numString(calcNum));
		} else if (jQuery.inArray(buttonPressed, operators) > 2 && jQuery.inArray(buttonPressed, operators) != 8) {
			var opSelect = jQuery.inArray(buttonPressed, operators);
			if (running.length == 0 && opSelect != 7) {
				opPresses.push(opSelect);
				running.push(numString(calcNum));
				calcNum = [];
				decimalCount = 0;
			} else if (running.length == 1 && opSelect != 7) {
				opPresses.push(opSelect);
				running.push(numString(calcNum));
				var opIndex = opPresses.length - 2;
				var finalCalc = calculation(opPresses[opIndex], running);
				$('#display-span').html(finalCalc);
				calcNum = [];
				running.splice(0, 2, finalCalc);
			} else if (running.length == 1 && opSelect == 7) {
				running.push(numString(calcNum));
				var opIndex = opPresses.length - 1;
				var finalCalc = calculation(opPresses[opIndex], running);
				$('#display-span').html(finalCalc);
				calcNum = [];
				opPresses = [];
				running.splice(0, 2, finalCalc);
			}
		}
	})
});

function numString(calcNum) {
	var num = calcNum.toString();
	var finalNum = num.replace(/,\s?/g, "");
	return finalNum;
}

function calculation(op, running) {
	var total;
	switch(op) {
		case 3:
			total = parseFloat(running[0]) / parseFloat(running[1]);
			return total;
		case 4:
			total = parseFloat(running[0]) * parseFloat(running[1]);
			return total;
		case 5:
			total = parseFloat(running[0]) - parseFloat(running[1]);
			return total;
		case 6:
			total = parseFloat(running[0]) + parseFloat(running[1]);
			return total;
	}
}