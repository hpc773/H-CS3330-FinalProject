package edu.mu.npcs;

import java.util.Random;

public class Zombie extends Entity {
	
	public Zombie() {
		this.setType(NpcType.ZOMBIE);
		entityPowerLevel(this);
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
 			NPC.setName("Overlord");
 			NPC.setHealth(50);
 			NPC.setExpValue(50);
 			NPC.setMoneyValue(100);
 		}

 		else if(powerLevel >= 75) {
 			NPC.setName("Lord");
 			NPC.setHealth(40);
 			NPC.setExpValue(35);
 			NPC.setMoneyValue(75);
 		}

 		else if(powerLevel >= 50 ) {
 			NPC.setName("Dread");
 			NPC.setHealth(30);
 			NPC.setExpValue(25);
 			NPC.setMoneyValue(50);
 		}

 		else if(powerLevel >= 25 ) {
 			NPC.setName("Intact");
 			NPC.setHealth(20);
 			NPC.setExpValue(15);
 			NPC.setMoneyValue(25);
 		}

 		else if(powerLevel >= 0) {
 			NPC.setName("Headless");
 			NPC.setHealth(10);
 			NPC.setExpValue(10);
 			NPC.setMoneyValue(10);
 		}

 		else if(powerLevel == 0) {
 			NPC.setName("Immobile");
 			NPC.setHealth(1);
 			NPC.setExpValue(1);
 			NPC.setMoneyValue(1);		
 		}
		
	}

}
