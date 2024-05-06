package edu.mu.npcs;
import java.util.Random;

import edu.mu.characters.*;


/**Skeleton enemy class
 * 
 * @author skylarperry
 */
public class Skeleton extends Entity {
	
	public Skeleton(){
			this.setType(NpcType.SKELETON);
			entityPowerLevel(this);
		}
			
			

	@Override
	/**Special attack that is unique to the skeleton enemy class, it has a chance to stun the player
	 * 
	 * @return returns the damage that was done with the attack
	 */
	public int specialAttack(PlayerCharacter PC) {
		int stunResist = 75;
		int attackDamage = 2;
		String bodyPart = "left foot";
		Random RNG = new Random();
		int hit = RNG.nextInt(100);
		
		System.out.println("The Skeleton" + getName() + "detaches it's femur and attacks you with it!");
		
		if(hit >= stunResist) {
			// TODO Add stun effect to player character
			attackDamage = 10;
			System.out.println("The Skeleton " + getName() + "lands a ferocious blow on your temple, you've been stunned!");
		}
		
		else {
			if(hit >= 75) {
				attackDamage = 8;
				bodyPart = "liver!";
			}
			else if(hit >= 50) {
				attackDamage = 6;
				bodyPart = "shoulder!";
			}
			else if(hit >= 25) {
				attackDamage = 4;
				bodyPart = "arm!";
			}
			System.out.println("The Skeleton " + getName() + " whiffs his attack and lands a glancing blow on your" + bodyPart);
		}
		return attackDamage;
	}

	/**Method that randomly generates the power level of the spawned enemy
	 * 
	 */
	@Override
	protected boolean entityPowerLevel(Entity NPC) {
		// TODO adjust values to better fit game balance
		Random RNG = new Random();
 		this.setPowerLevel(RNG.nextInt(100));
 		if(getPowerLevel() == 100) {
 			NPC.setName("King");
 			NPC.setHealth(50);
 			NPC.setExpValue(50);
 			return true;
 		}

 		else if(getPowerLevel() >= 75) {
 			NPC.setName("Knight");
 			NPC.setHealth(40);
 			NPC.setExpValue(35);
 			return true;
 		}

 		else if(getPowerLevel() >= 50 ) {
 			NPC.setName("Squire");
 			NPC.setHealth(30);
 			NPC.setExpValue(25);
 			return true;
 		}

 		else if(getPowerLevel() >= 25 ) {
 			NPC.setName("Commoner");
 			NPC.setHealth(20);
 			NPC.setExpValue(15);
 			return true;
 		}

 		else if(getPowerLevel() >= 0) {
 			NPC.setName("Pauper");
 			NPC.setHealth(10);
 			NPC.setExpValue(10);
 			return true;
 		}

 		else if(getPowerLevel() == 0) {
 			NPC.setName("Runt");
 			NPC.setHealth(1);
 			NPC.setExpValue(1);
 			return true;
 		}
 		return false;
 	}
 }
