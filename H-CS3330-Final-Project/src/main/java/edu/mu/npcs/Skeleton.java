package edu.mu.npcs;
import java.util.Random;

public class Skeleton extends Entity {
	
	public Skeleton(){
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
		
		System.out.println("The Skeleton" + getName() + "detaches his femur and attacks you with it!");
		
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
			setName("Overlord");
			setHealth(50);
			setExpValue(50);
			setMoneyValue(100);
		}
		
		else if(powerLevel >= 75) {
			setName("Champion");
			setHealth(40);
			setExpValue(35);
			setMoneyValue(75);
		}
		
		else if(powerLevel >= 50 ) {
			setName("Warrior");
			setHealth(30);
			setExpValue(25);
			setMoneyValue(50);
		}
		
		else if(powerLevel >= 25 ) {
			setName("Commoner");
			setHealth(20);
			setExpValue(15);
			setMoneyValue(25);
		}
		
		else if(powerLevel >= 0) {
			setName("Pauper");
			setHealth(10);
			setExpValue(10);
			setMoneyValue(10);
		}
		
		else if(powerLevel == 0) {
			setName("Runt");
			setHealth(1);
			setExpValue(1);
			setMoneyValue(1);		
		}
	}
}
