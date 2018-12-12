/**
 * ------------------------------------------------- 
 * File name: Motor.java 
 * Project name: Motor Inventory
 * -------------------------------------------------
 * Creator's name: Nick Moore 
 * Email: nmoore2@northeaststate.edu Course and
 * section: CISP 1010 A03 
 * Creation date: 12-12-2018
 * -------------------------------------------------
 * 
 */

class Motor {
	double rpm = 0;
	double tq = 0;

	Motor(double motorRPM, double motorTorque) {
		rpm = motorRPM;
		tq = motorTorque;
	}

	double calculatedHP() {
		int HP_CONSTANT = 5252;
		double hp = (rpm * tq) / HP_CONSTANT;
		return hp;
	}

}