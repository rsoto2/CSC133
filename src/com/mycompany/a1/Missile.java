package com.mycompany.a1;

import com.codename1.charts.util.ColorUtil;

public class Missile extends MovableGameObject implements Movable{
	
private int fuelLevel = 15;
private Ship owner;

public Missile(int color, int speed, int direction, Ship owner) {
	
	super(ColorUtil.BLACK, 0, 0);
	this.owner = owner;
	//this.setLocationX(x);
	//this.setLocationY(y);
	//this.setDirection(direction);
  	//this.setSpeed(30);
    //  this.setLocation(x, y);
  	//this.setDirection(0);
	this.getDirection();
	this.getSpeed();
	
	
	
}

public Ship getOwner() {
	return this.owner;
}


public void setFuel(int f) {
	this.fuelLevel = f;
}

public int getFuel() {
	return fuelLevel;
}

public int decrementFuelLevel() {
	return fuelLevel--;
}



public String missileString(boolean x) {
	if(x == true) {
	return ("PS's Missile: loc= " + Math.round(this.getLocationX()) + "," + Math.round(this.getLocationY()) +
	" color= " + GameObject.getColorString(getColor()) + 
	" speed= " + Math.round(getSpeed()) + 
	" dir= " + getDirection() + 
	" fuel= " + getFuel());
	}else {
		return ("NPS's Missile: loc= " + Math.round(this.getLocationX()) + "," + Math.round(this.getLocationY()) +
				" color= " + GameObject.getColorString(getColor()) + 
				" speed= " + Math.round(getSpeed()) + 
				" dir= " + getDirection() + 
				" fuel= " + getFuel()
				);
	}
}

	
	







}
