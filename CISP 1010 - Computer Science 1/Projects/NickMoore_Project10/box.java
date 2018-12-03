/**
 * -------------------------------------------------
 * File name: box.java
 * Project name: Project 10 Ship Desk
 * -------------------------------------------------
 * Creator's name: Nick Moore
 * Email: nmoore2@northeaststate.edu
 * Course and section: CISP 1010 A03
 * Creation date: 11-28-2018
 * -------------------------------------------------
 * 
 */

class Box 
{
	int h = 0;
	int l = 0;
	int w = 0;

	Box(int height, int width, int length)
	{
		h = height;
		w = width;
		l = length;
	}

	int calculatedVolume()
	{
		return l * w * h;
	}

	int calculatedSurfaceArea()
	{
		return 2 * (l * h + l * w + w * h);
	}

}