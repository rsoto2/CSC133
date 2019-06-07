package com.mycompany.a1;

import com.codename1.charts.util.ColorUtil;

public class Ship extends MovableGameObject {

	private int missileCount = 10;
	
	
	public Ship(int color, int speed, int dir) {
		super(ColorUtil.BLACK, 0, 0);
		this.setLocation(512,384);
		//this.setColor(50, 50, 50);
		//this.setDirection(0);
		//this.setSpeed(0);
	}
	
	public void decrementMissile() {
		missileCount--;
	}
	
	public void SetMissileCount(int mC) {
		this.missileCount = mC;
		
	}
	
	public int getMissileCount() {
		return missileCount;
	}
	
	
	
}
