package edu.mu.npcs;

import java.util.Random;

import edu.mu.characters.*;


public class Human extends Entity {

	Human(){
		this.setType(NpcType.HUMAN);
		entityPowerLevel(this);
	}
	
	@Override
	public int specialAttack(PlayerCharacter PC) {
		
		System.out.println("The Pirate" + getName() + "viciouslt attakc with his cutlass!");
		
		return 0;
	}

	/**Method that randomly generates the power level of the spawned enemy
	 * 
	 */
	@Override
	protected boolean entityPowerLevel(Entity NPC) {
		// TODO Auto-generated method stub
		Random RNG = new Random();
		this.setPowerLevel(RNG.nextInt(101));
 		if(getPowerLevel() == 100) {
 			NPC.setName("Captain");
 			NPC.setHealth(50);
 			NPC.setExpValue(50);
 			return true;
 		}

 		else if(getPowerLevel() >= 75) {
 			NPC.setName("First Mate");
 			NPC.setHealth(40);
 			NPC.setExpValue(35);
 			return true;
 		}

 		else if(getPowerLevel() >= 50 ) {
 			NPC.setName("Rapscallion");
 			NPC.setHealth(30);
 			NPC.setExpValue(25);
 			return true;
 		}

 		else if(getPowerLevel() >= 25 ) {
 			NPC.setName("Crewmate");
 			NPC.setHealth(20);
 			NPC.setExpValue(15);
 			return true;
 		}

 		else if(getPowerLevel() > 1) {
 			NPC.setName("Deckhand");
 			NPC.setHealth(10);
 			NPC.setExpValue(10);
 			return true;
 		}

 		else if(getPowerLevel() == 1) {
 			NPC.setName("Swabbie");
 			NPC.setHealth(1);
 			NPC.setExpValue(1);
 			return true;
 		}
 		return false;
		
	}
}


