package edu.mu.characters.playerclasses;



import java.util.HashMap;

import edu.mu.characters.items.Armor;
import edu.mu.characters.items.Weapons;
import edu.mu.npcs.Entity;

/**
 *This is the parent class of the five playable classes. It defines the stats, equipment, and attack modifier for each class, which is then passed on to the player character.
 *The attack modifier is specific to each of the child classes, whether it is calculated from strength or dexterity.
 * @author Henry Clark
 */
public abstract class PlayerClassSuper {
	protected HashMap<String, Integer> stats = new HashMap<String, Integer>();
	protected Weapons weapon;
	protected Armor armor;
	protected int attackModifier;

	
	
	public PlayerClassSuper() {
		// TODO Auto-generated constructor stub
	}

	public HashMap<String, Integer> getStats() {
		return stats;
	}
	
	
		
	
	
	
	
	
	


	public Weapons getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapons weapon) {
		this.weapon = weapon;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}
	/**
	 *This method is overridden by the child classes. It deals with each class' special attack.
	 *@param e is an instance of the Entity class, which the enemy objects belong to. The player uses the special attack on the enemy Entity.
	 */
	public abstract boolean specialMove(Entity e);
	

	public int getAttackModifier() {
		return attackModifier;
	}
	
	public void setAttackModifier(int attackModifier) {
		this.attackModifier = attackModifier;
	}
	


}
