package edu.mu.npcs;
import java.util.Random;

public class Skeleton extends Entity {
	
	public Skeleton(){
			this.setType(NpcType.SKELETON);
			entityPowerLevel(this);
		}
			
			

	@Override
	// special attack unique to skeletons that has a chance to stun the player.
	public int specialAttack() {
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

	@Override
	//Method that generates the power level of the new Skeleton
	protected void entityPowerLevel(Entity NPC) {
		// TODO adjust values to better fit game balance
		Random RNG = new Random();
 		int powerLevel = RNG.nextInt(100);

 		if(powerLevel == 100) {
 			NPC.setName("King");
 			NPC.setHealth(50);
 			NPC.setExpValue(50);
 			NPC.setMoneyValue(100);
 		}

 		else if(powerLevel >= 75) {
 			NPC.setName("Knight");
 			NPC.setHealth(40);
 			NPC.setExpValue(35);
 			NPC.setMoneyValue(75);
 		}

 		else if(powerLevel >= 50 ) {
 			NPC.setName("Squire");
 			NPC.setHealth(30);
 			NPC.setExpValue(25);
 			NPC.setMoneyValue(50);
 		}

 		else if(powerLevel >= 25 ) {
 			NPC.setName("Commoner");
 			NPC.setHealth(20);
 			NPC.setExpValue(15);
 			NPC.setMoneyValue(25);
 		}

 		else if(powerLevel >= 0) {
 			NPC.setName("Pauper");
 			NPC.setHealth(10);
 			NPC.setExpValue(10);
 			NPC.setMoneyValue(10);
 		}

 		else if(powerLevel == 0) {
 			NPC.setName("Runt");
 			NPC.setHealth(1);
 			NPC.setExpValue(1);
 			NPC.setMoneyValue(1);		
 		}
 	}
 }
