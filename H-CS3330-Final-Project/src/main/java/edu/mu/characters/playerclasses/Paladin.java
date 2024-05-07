package edu.mu.characters.playerclasses;

import edu.mu.characters.items.Armor;
import edu.mu.characters.items.Weapons;
import edu.mu.npcs.Entity;
/**
 *This is the Paladin class, one of the playable classes. The player character derives their stats and items from this class, if chosen. 
 *The attack modifier for this class is defined here so that it can use the desired stat. This class also can use magic, so they have a magicModifier based off of the spellcasting stat, for Paladin it is Charisma.
 * @author Henry Clark
 */
public class Paladin extends PlayerClassSuper {
	
	private int magicModifier;
	public Paladin() {
		super();
		this.stats.put("Strength", 15);
		this.stats.put("Dexterity", 8);
		this.stats.put("Constitution", 13);
		this.stats.put("Intelligence", 10);
		this.stats.put("Wisdom", 12);
		this.stats.put("Charisma", 14);
		
		this.weapon = Weapons.WARHAMMER;
		this.armor = Armor.HEAVY_ARMOR;
		
		
		double atkDoub = ((Math.floor(stats.get("Strength") - 10) / 2));
		this.attackModifier = (int)(atkDoub);
		double mgcDoub = ((Math.floor(stats.get("Charisma") - 10) / 2));
		this.magicModifier = (int)(mgcDoub);
	}
	/**
	 *This is the Paladin's special move. It allows the player character to attack with a magic-infused strike that deals much more damage.
	 *@param e is the target of the attack, like in the attackEnemy method it is an instance of the Entity object, which includes all of the enemies.
	 */
	@Override
	public boolean specialMove(Entity e) {
		System.out.println("The power of your oath allows you to make an empowered strike!");
		int damageAmount = this.getAttackModifier() + this.weapon.getDamage() + 5 + this.magicModifier;
		e.setHealth(e.getHealth() - damageAmount);
		return true;
	}
}
