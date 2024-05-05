package edu.mu.npcs;

import java.util.Random;

public class Human extends Entity {

	Human(){
		this.setType(NpcType.HUMAN);
		entityPowerLevel(this);
	}
	
	@Override
	public int specialAttack() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**Method that randomly generates the power level of the spawned enemy
	 * 
	 */
	@Override
	protected void entityPowerLevel(Entity NPC) {
		// TODO Auto-generated method stub
		Random RNG = new Random();
 		int powerLevel = RNG.nextInt(100);
 		if(powerLevel == 100) {
 			NPC.setName("Captain");
 			NPC.setHealth(50);
 			NPC.setExpValue(50);
 			NPC.setMoneyValue(100);
 		}

 		else if(powerLevel >= 75) {
 			NPC.setName("First Mate");
 			NPC.setHealth(40);
 			NPC.setExpValue(35);
 			NPC.setMoneyValue(75);
 		}

 		else if(powerLevel >= 50 ) {
 			NPC.setName("Rapscallion");
 			NPC.setHealth(30);
 			NPC.setExpValue(25);
 			NPC.setMoneyValue(50);
 		}

 		else if(powerLevel >= 25 ) {
 			NPC.setName("Crewmate");
 			NPC.setHealth(20);
 			NPC.setExpValue(15);
 			NPC.setMoneyValue(25);
 		}

 		else if(powerLevel >= 0) {
 			NPC.setName("Deckhand");
 			NPC.setHealth(10);
 			NPC.setExpValue(10);
 			NPC.setMoneyValue(10);
 		}

 		else if(powerLevel == 0) {
 			NPC.setName("Swabbie");
 			NPC.setHealth(1);
 			NPC.setExpValue(1);
 			NPC.setMoneyValue(1);		
 		}
		
	}
}


