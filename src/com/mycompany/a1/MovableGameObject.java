package com.mycompany.a1;
import java.util.Random;
import com.codename1.charts.util.ColorUtil;

public abstract class MovableGameObject extends GameObject implements Movable {
	
	private int speed;
	private int direction;
	
	
	public MovableGameObject(int color, int speed, int dir) {
		super(0, color);
		this.speed = speed;
		this.direction = dir;
		
	}
//	public MovableGameObject() {
//		speed = rand.nextInt(16);
//		direction = rand.nextInt(360);
//	}
	
	public void setSpeed(int s) {
		this.speed = s;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setDirection(int d) {
		this.direction = d;
	}
	
	public int getDirection() {
		return direction;
	}
	
	public void move() {
		double ang = Math.PI * ((90 - this.getDirection()));
		double directionX = Math.cos(ang) * getSpeed();
		double directionY = Math.sin(ang) * getSpeed();
//		double directionX = Math.cos(ang) * getSpeed();
//		double directionY = Math.sin(ang) * getSpeed();
		//this.setLocationX((double) (this.getLocationX() + directionX));
		//this.setLocationY((double) (this.getLocationY() + directionY));
		this.setLocation(this.getLocationX(), this.getLocationY());
	}
	
	

}
