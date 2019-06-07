package com.mycompany.a1;

import com.codename1.charts.util.ColorUtil;

public class PlayerShip extends Ship{
	
	private int missileCount;
	private int max;
	private MissileLauncher launcher;
	private int lives;
	
	
	public PlayerShip() 
	{
		
		super(ColorUtil.BLUE, 0, 0);
		//super(ColorUtil.YELLOW, 0, 0);
		//this.setLocation(0, 0);
		//this.getDirection();
		//this.setSpeed(0);
		setColor(255,0,0);
		setLocation(512, 384);;
		 lives = 3;
		 //System.out.println(this.toString());
		
		
	}

	
	public void incrementSpeed() {
		
	}
	
	
	
	public void decreaseSpeed() {
		
	}
	
	
	public void setLives(int l) {
		lives = l;
		}
	
	public int getLives() {
		return lives;
	}
	
	
	public String toString() {
		return ("PlayerShip: loc= " + Math.round(this.getLocationX()) + "," + Math.round(this.getLocationY()) +
		" color= " + GameObject.getColorString(getColor()) + 
		" speed= " + Math.round(getSpeed()) + 
		" dir= " + getDirection() 
		);
	}
	
}
