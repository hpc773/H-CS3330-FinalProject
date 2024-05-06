package edu.mu.npcs;

import java.util.Random;

import edu.mu.characters.*;

public class Zombie extends Entity {
	
	public Zombie() {
		this.setType(NpcType.ZOMBIE);
		entityPowerLevel(this);
	}

	@Override
	/**Special attack that is unique to the zombie enemy class, it has a chance to give the player character a disease
	 * 
	 * the disease is a poison like effect that will do damage every turn
	 * 
	 * @return the attack damage that the attack does, which is always five
	 */
	public int specialAttack(PlayerCharacter PC) {
		int attackDamage = 5;
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
		
		return attackDamage;
	}

	/**Method that randomly generates the power level of the spawned enemy
	 * 
	 */
	@Override
	protected boolean entityPowerLevel(Entity NPC) {
		// TODO Auto-generated method stub
		Random RNG = new Random();
 		this.setPowerLevel(RNG.nextInt(100));
 		if(getPowerLevel() == 100) {
 			NPC.setName("Overlord");
 			NPC.setHealth(50);
 			NPC.setExpValue(50);
 			return true;
 		}

 		else if(getPowerLevel() >= 75) {
 			NPC.setName("Lord");
 			NPC.setHealth(40);
 			NPC.setExpValue(35);
 			return true;
 		}

 		else if(getPowerLevel() >= 50 ) {
 			NPC.setName("Dread");
 			NPC.setHealth(30);
 			NPC.setExpValue(25);
 			return true;
 		}

 		else if(getPowerLevel() >= 25 ) {
 			NPC.setName("Intact");
 			NPC.setHealth(20);
 			NPC.setExpValue(15);
 			return true;
 		}

 		else if(getPowerLevel() >= 0) {
 			NPC.setName("Headless");
 			NPC.setHealth(10);
 			NPC.setExpValue(10);
 			return true;
 		}

 		else if(getPowerLevel() == 0) {
 			NPC.setName("Immobile");
 			NPC.setHealth(1);
 			NPC.setExpValue(1);
 			return true;
 		}
		return false;
	}

}
