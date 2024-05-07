package edu.mu.npcs;

import java.util.Random;

import edu.mu.characters.*;


public class Human extends Entity {

	public Human(){
		this.setType(NpcType.HUMAN);
		entityPowerLevel(this);
	}
	
	@Override
	public int specialAttack(PlayerCharacter PC) {
		
		System.out.println("The Pirate " + getName() + " viciously attacks with their cutlass!");
		
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
 			NPC.setAttack(6);
 			NPC.setInitative(14);
 			return true;
 		}

 		else if(getPowerLevel() >= 75) {
 			NPC.setName("First Mate");
 			NPC.setHealth(40);
 			NPC.setExpValue(35);
 			NPC.setAttack(5);
 			NPC.setInitative(12);
 			return true;
 		}

 		else if(getPowerLevel() >= 50 ) {
 			NPC.setName("Rapscallion");
 			NPC.setHealth(30);
 			NPC.setExpValue(25);
 			NPC.setAttack(4);
 			NPC.setInitative(10);
 			return true;
 		}

 		else if(getPowerLevel() >= 25 ) {
 			NPC.setName("Crewmate");
 			NPC.setHealth(20);
 			NPC.setExpValue(15);
 			NPC.setAttack(3);
 			NPC.setInitative(8);
 			return true;
 		}

 		else if(getPowerLevel() > 1) {
 			NPC.setName("Deckhand");
 			NPC.setHealth(10);
 			NPC.setExpValue(10);
 			NPC.setAttack(2);
 			NPC.setInitative(5);
 			return true;
 		}

 		else if(getPowerLevel() == 1) {
 			NPC.setName("Swabbie");
 			NPC.setHealth(1);
 			NPC.setExpValue(1);
 			NPC.setAttack(1);
 			NPC.setInitative(1);
 			return true;
 		}
 		return false;
		
	}
}


