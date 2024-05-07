package edu.mu.characters.playerclasses;

import edu.mu.characters.items.Armor;
import edu.mu.characters.items.Weapons;
import edu.mu.npcs.Entity;
/**
 *This is the Rogue class, one of the playable classes. The player character derives their stats and items from this class, if chosen. 
 *The attack modifier for this class is defined here so that it can use the desired stat.
 * @author Henry Clark
 */
public class Rogue extends PlayerClassSuper {
	
	
	public Rogue() {
		super();
		this.stats.put("Strength", 8);
		this.stats.put("Dexterity", 15);
		this.stats.put("Constitution", 10);
		this.stats.put("Intelligence", 13);
		this.stats.put("Wisdom", 12);
		this.stats.put("Charisma", 14);
		
		this.weapon = Weapons.DAGGER;
		this.armor = Armor.LIGHT_ARMOR;
	
		double atkDoub = ((Math.floor(stats.get("Dexterity") - 10) / 2));
		this.attackModifier = (int)(atkDoub);
	}
	/**
	 *This is the Rogue's special move. It allows the player character to attack with a strong sneak attack, perfect against weaker enemies.
	 
	 *@param e is the target of the attack, like in the attackEnemy method it is an instance of the Entity object, which includes all of the enemies.
	 */
	@Override
	public boolean specialMove(Entity e) {
		System.out.println("Your stealthiness allows you to get off a sneak attack!");
		int damageAmount = this.getAttackModifier() + this.weapon.getDamage() + 10;
		e.setHealth(e.getHealth() - damageAmount);
		return true;
	}
}
