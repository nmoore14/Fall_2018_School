var calcNum = [];
var calcFinal = 0;
var running = [];
var decimalCount = 0;
var operatorCount = 0;
var operators = ["CE", "C", "+/-", "÷", "x", "-", "+", "=", "."];
var opPresses = [];

$(document).ready(function () {
	var decimalCount = 0;
	$('.btn').click(function (e) {
		e.preventDefault();
		var buttonPressed = $(this).html();

		if (jQuery.inArray(buttonPressed, operators) == -1) {
			calcNum.push(buttonPressed);
			$('#display-span').html(numString(calcNum));
			console.log("This is the final number: " + numString(calcNum));
		} else if (jQuery.inArray(buttonPressed, operators) == 8) {
			if (decimalCount < 1) {
				if (calcNum.length < 1) {
					calcNum.push("0");
					calcNum.push(".");
					decimalCount++;
				} else {
					calcNum.push(".");
					$('#display-span').html(numString(calcNum));
					console.log("This is the final number: " + numString(calcNum));
					decimalCount++;
				}
			}
		} else if (jQuery.inArray(buttonPressed, operators) == 0) {
			calcNum = [];
			decimalCount = 0;
			$('#display-span').html("0");
			$("#btn-decimal").bind("click");
		} else if (jQuery.inArray(buttonPressed, operators) == 1) {
			calcNum = [];
			running = [];
			opPresses = [];
			decimalCount = 0;
			$('#display-span').html("0");
		} else if (jQuery.inArray(buttonPressed, operators) > 1 && jQuery.inArray(buttonPressed, operators) != 8) {
			var opSelect = jQuery.inArray(buttonPressed, operators);
			if (running.length < 1 && opSelect != 7) {
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
				running = [];
				running.push(finalCalc);
			} else if (running.length == 1 && opSelect == 7) {
				running.push(numString(calcNum));
				var opIndex = opPresses.length - 1;
				var finalCalc = calculation(opPresses[opIndex], running);
				$('#display-span').html(finalCalc);
				calcNum = [];
				running = [];
				running.push(finalCalc);
			}
			console.log(running);
			console.log(calcNum);
			console.log(opPresses);
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
			break;
		case 4:
			total = parseFloat(running[0]) * parseFloat(running[1]);
			return total;
			break;
		case 5:
			total = parseFloat(running[0]) - parseFloat(running[1]);
			return total;
			break;
		case 6:
			total = parseFloat(running[0]) + parseFloat(running[1]);
			return total;
			break;
	}
}