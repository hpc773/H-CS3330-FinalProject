package edu.mu.npcs;

import java.util.Random;

public class Zombie extends Entity {
	
	public Zombie() {
		
	}

	@Override
	//special attack unique to Zombies that can give disease to the player
	public int specialAttack() {
		System.out.println("The"+getName() +"Zombie lunges at you with it's gangrenous mouth agape!");
		int diseaseResist = 50;
		Random RNG = new Random();
		
		int diseaseChance = RNG.nextInt(100);
		
		if(diseaseChance >= diseaseResist) {
			// TODO add poison effect to player character
			System.out.println("It's teeth latch onto your shoulder, you can already feel sick...");
		}
		else {
			System.out.println("It bites into your armor, it seems you've avoided sickness this time.");
		}
		
		return 0;
	}

	@Override
	protected void entityPowerLevel(Entity NPC) {
		// TODO Auto-generated method stub
		Random RNG = new Random();
 		int powerLevel = RNG.nextInt(100);
 		if(powerLevel == 100) {
 			setName("Overlord");
 			setHealth(50);
 			setExpValue(50);
 			setMoneyValue(100);
 		}

 		else if(powerLevel >= 75) {
 			setName("Lord");
 			setHealth(40);
 			setExpValue(35);
 			setMoneyValue(75);
 		}

 		else if(powerLevel >= 50 ) {
 			setName("Dread");
 			setHealth(30);
 			setExpValue(25);
 			setMoneyValue(50);
 		}

 		else if(powerLevel >= 25 ) {
 			setName("Intact");
 			setHealth(20);
 			setExpValue(15);
 			setMoneyValue(25);
 		}

 		else if(powerLevel >= 0) {
 			setName("Headless");
 			setHealth(10);
 			setExpValue(10);
 			setMoneyValue(10);
 		}

 		else if(powerLevel == 0) {
 			setName("Immobile");
 			setHealth(1);
 			setExpValue(1);
 			setMoneyValue(1);		
 		}
		
	}

}
