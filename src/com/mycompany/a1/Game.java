package com.mycompany.a1;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import java.lang.String;

public class Game extends Form {
	private GameWorld gw;
	
	
	
	
	public Game() {
		gw = new GameWorld();
		gw.init();
		play();
		
	}
	
	private void play() {
		
		Label myLabel = new Label("Enter a Command: ");
		this.addComponent(myLabel);
		final TextField myTextField = new TextField();
		this.addComponent(myTextField);
		this.show();
		
		myTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String sCommand = myTextField.getText().toString();
				myTextField.clear();
				if(!sCommand.isEmpty()) {
				switch(sCommand.charAt(0)) {
				case 'a': 
					gw.addNewAsteroid();
					break;
				case 'y': 
					gw.newNPS();
					break;
				case 'b':
					gw.newSpaceStation();
					break;
				case 's':
					gw.newPS();
					break;
				case 'f': 
					gw.fireMissile();
					break;
				case 'L': 
					gw.launchMissile();
					break;
				case 'm':
					gw.printMap();
					break;
				case 'p':
					gw.printDisplay();
					break;
				case '>': 
					//gw.turnMissileLauncher();
					//gw.ML();
					gw.turnPSML();
					break;
				case 'n':
					gw.reSupply();
					break;
				case 'k':
					//gw.killAsteroid();
					gw.playerShipMissileKillAsteroid(); //works
					break;
				case 'e':
					//gw.killNonPlayerShip();
					//gw.playerShipMissileKillAsteroid(); 
					gw.removeMissileAndNPS(); //works
					break;
				case 'E':
					//gw.killPlayerShip();
					gw.removeMissileAndPS(); //works
					break;
				case 'c':
					//gw.asteroidCollide();
					gw.removeAstAndPS(); //works
					break;
				case 'h':
					//gw.shipcollide();
					gw.removeNPSAndPS(); //works
					break;
				case 'x':
					gw.removeAsteroids();//works
					//gw.removeAstAndAst();
					break;
				case 'I':
					//gw.turnLeft();
					gw.removeAstAndNPS(); //works
					break;
			
					
				
				}
				}//switch
			}
		});
				
		
		
		
		
		
		
		
		
	}
}
