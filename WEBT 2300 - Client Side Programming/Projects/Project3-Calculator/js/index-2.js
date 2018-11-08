var previousEntry = 0;
var previousTotal = [];
var calcNum = [];
var calc = [];
var decimalCount = 0;
var operators = ["CE", "C", "&gt;", "÷", "x", "-", "+", "=", "."];
var opPresses = [];

function clearEntry() {
	calcNum = [];
	decimalCount = 0;
}

function clearAll() {
	calcNum = [];
	calc = [];
	opPresses = [];
	decimalCount = [];
}

function backspace(calcNum) {
	calcNum.pop();
}

function numString(calcNum) {
	var num = calcNum.toString();
	var finalNum = num.replace(/,\s?/g, "");
	return finalNum;
}

function calculation(btn, calcNum) {
	var num1 = 0;
	var num2 = 0;
	var total =0;

	if (calc.length == 2) { // New calc entry
		num1 = calc[0];
		num2 = calc[1];
	} else if (calc.length == 1 && previousTotal.length == 1) { // Operating a running total with a new number
		num1 = previousTotal[0];
		num2 = calc[0];
		previousTotal = [];
		previousEntry = calc[0];
	} else if (calc.length == 0 && previousTotal.length == 1) { // Hitting the same operator over and over
		num1 = previousTotal[0];
		num2 = previousEntry;
		previousTotal = [];
		btn = opPresses[-1];
	}

	switch(btn) {
		case 3:
			total = num1 / num2;
			previousTotal.push(total);
			return total;
		case 4:
			total = num1 * num2;
			previousTotal.push(total);
			return total;
		case 5:
			total = num1 - num2;
			previousTotal.push(total);
			return total;
		case 6:
			total = num1 + num2;
			previousTotal.push(total);
			return total;
	}
}

$(document).ready(function () {
	$('.btn').click(function (e) {
		e.preventDefault();
		var buttonPressed = $(this).html();
		var btn = jQuery.inArray(buttonPressed, operators);
		console.log(btn);
		// Check to see what button the user has entered
		if (btn == -1) {
			calcNum.push(buttonPressed);
			if (calcNum[0] === '0' && calcNum[1] != ".") {
				calcNum.shift();
				$('#display-span').html("0");
			} else {
				$('#display-span').html(numString(calcNum));
			}
		} else if (btn == 8) { // Insert a decimal and make sure only one is present.
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
		} else {
			if (btn == 0) {
				clearEntry();
				$('#display-span').html('0');
			} else if (btn == 1) {
				clearAll();
				$('#display-span').html('0');
			} else if (btn == 2) {
				backspace(calcNum);
				$('#display-span').html(numString(calcNum));
			} else {
				calc.push(numString(calcNum));
				if(btn != 7) {
					opPresses.push(btn);
				}
				if(calc.length == 0 && btn != 7) {
					calc.push(numString(calcNum));
					calcNum = [];
					decimalCount = 0;
				} else {
					calc.push(numString(calcNum));
					calcNum = [];
					var totalFinal = calculation(btn, calc);
					$('#display-span').html(totalFinal);
				}

			}
		}
	})
});