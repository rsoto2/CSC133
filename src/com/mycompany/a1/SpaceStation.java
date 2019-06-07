package com.mycompany.a1;

import com.codename1.charts.util.ColorUtil;

public class SpaceStation extends FixedGameObject {
	
	private int blinkRate = 6;
	private boolean blinkLightOn = false;
	
	public SpaceStation() {
		super(0, ColorUtil.GREEN);
	}
		
	
	public String toString() {
		return ("Station: loc= " + Math.round(this.getLocationX()) + "," + Math.round(this.getLocationY()) +
		" color= " + GameObject.getColorString(getColor()) + 
		" blinkRate= " + blinkRate);
	}
}
