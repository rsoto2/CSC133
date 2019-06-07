package com.mycompany.a1;

import java.util.Random;
import java.util.Vector;

public class GameWorld  {
	
	
	Random rand = new Random();
	public Vector<GameObject> store = new Vector<GameObject>();
	private final static double xWidth = 1024;
	private final static double yHeight = 768;
	private boolean hasPlayerShip = false;
	private int elapsedGameTime = 0;
	private int playerScore = 0;
	private int numPSMissiles = 0;
	private int playerLives = 0;
	private int clock;
	
	
	
	public void addNewAsteroid() {
		Asteroid asteroid = new Asteroid();
		store.add(asteroid);
		System.out.println("A new Asteroid will be created");
	}
 	
	
	public void newSpaceStation() {
		SpaceStation b = new SpaceStation();
		store.add(b);
		System.out.println("A new space station will be created");
		
	}
	
	public void newPS() {
		PlayerShip s = new PlayerShip();
		store.add(s);
		System.out.println("A new PS will be created");
		
	}
	
	public void newNPS() {
		NonPlayerShip y = new NonPlayerShip();
		store.add(y);
		System.out.println("A new NPS will be created");
	}
	
	public void init() {
	playerScore = 0;
	playerLives = 3;
	clock =0;
		
	}	
	
	
	public void fireMissile () throws IllegalArgumentException {
		//Boolean playerShip = false;
		for(int i = 0 ; i < store.size() ; i++) {
			if(store.elementAt(i) instanceof PlayerShip) {
				PlayerShip ps = (PlayerShip) store.elementAt(i);
				if(ps.getMissileCount() > 0) { 
					ps.SetMissileCount(ps.getMissileCount() -1);//Dec missile count by 1
				Missile ms1 = new Missile(ps.getColor(), ps.getSpeed(), ps.getDirection(), ps);
				store.add(ms1);
				System.out.println("PlayerShip has fired a Missile!");
				return;
				}else {
					System.out.println("PlayerShip has no more Missiles!");
				}
			}

		}
	}
	
	
	public void launchMissile() throws IllegalArgumentException{
		for(int i = 0 ; i < store.size() ; i++) {
			if(store.elementAt(i) instanceof NonPlayerShip) {
				NonPlayerShip nps = (NonPlayerShip) store.elementAt(i);
				if(nps.getMissileCount() > 0)  {
					nps.SetMissileCount(nps.getMissileCount() -1);
				Missile ms1 = new Missile(nps.getColor(), nps.getSpeed(), nps.getDirection(), nps);
				store.add(ms1);
				System.out.println("NonPlayerShip has fired a Missile!");
				return;
			
			}else {
				System.out.println("NonPlayerShip has no more Missiles!");
			}
			}
		}
	}
	
	public void printMap() {
		//String map = null;
		for(GameObject i : store) {
			//map = (i.toString() + "\n");
			if(i instanceof Missile) {
				if( ((Missile) i).getOwner()      instanceof PlayerShip) {
					System.out.println(((Missile)i).missileString(true));
				}else {
					System.out.println(((Missile)i).missileString(false));
				}
			}else {
				System.out.println(i.toString());
			}
		}
		
	}
	
	
	public void printDisplay() throws IllegalArgumentException {
		for(int i = 0; i < store.size(); i++)
		{
			if(store.elementAt(i) instanceof PlayerShip) {
				System.out.println("PlayerShip: playerScore = " + this.playerScore +" Number of Missiles= " + (((Ship) store.get(i)).getMissileCount())
						+ " Number of lives = " + (((PlayerShip) store.get(i)).getLives())
						);
						
			}
		}
		
	}
	
	
	

}
