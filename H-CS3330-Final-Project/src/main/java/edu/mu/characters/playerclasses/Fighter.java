package edu.mu.characters.playerclasses;

import java.util.HashMap;

import edu.mu.characters.items.Armor;
import edu.mu.characters.items.Weapons;
import edu.mu.npcs.Entity;

/**
 *This is the Fighter class, one of the playable classes. The player character derives their stats and items from this class, if chosen. 
 *The attack modifier for this class is defined here so that it can use the desired stat.
 * @author Henry Clark
 */
public class Fighter extends PlayerClassSuper {
	
	public Fighter() {
		super();
		this.stats.put("Strength", 15);
		this.stats.put("Dexterity", 13);
		this.stats.put("Constitution", 14);
		this.stats.put("Intelligence", 8);
		this.stats.put("Wisdom", 12);
		this.stats.put("Charisma", 10);
		
		this.weapon = Weapons.SWORD;
		this.armor = Armor.MEDIUM_ARMOR;
		
		
		double atkDoub = ((Math.floor(stats.get("Strength") - 10) / 2));
		this.attackModifier = (int)(atkDoub);
	}
	/**
	 *This is the Fighter's special move. It allows the player character to attack twice in a turn.
	 *This is essentially a repeat of the attackEnemy method from the PlayerCharacter class.
	 *@param e is the target of the attack, like in the attackEnemy method it is an instance of the Entity object, which includes all of the enemies.
	 */
	@Override
	public boolean specialMove(Entity e) {
		System.out.println("Your incredible skill with a blade allows you to make a second strike!");
		int damageAmount = this.getAttackModifier() + this.weapon.getDamage();
		e.setHealth(e.getHealth() - damageAmount);
		return true;
		
	}
}
	
	
