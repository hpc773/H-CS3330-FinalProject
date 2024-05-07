package edu.mu.characters.playerclasses;

import edu.mu.characters.items.Armor;
import edu.mu.characters.items.Weapons;
import edu.mu.npcs.Entity;
/**
 *This is the Wizard class, one of the playable classes. The player character derives their stats and items from this class, if chosen. 
 *The attack modifier for this class is defined here so that it can use the desired stat. This class also can use magic, so they have a magicModifier based off of the spellcasting stat, for Wizard it is Intelligence.
 * @author Henry Clark
 */
public class Wizard extends PlayerClassSuper {
	
	private int magicModifier;
	public Wizard() {
		super();
		this.stats.put("Strength", 8);
		this.stats.put("Dexterity", 14);
		this.stats.put("Constitution", 13);
		this.stats.put("Intelligence", 15);
		this.stats.put("Wisdom", 10);
		this.stats.put("Charisma", 12);
		
		this.weapon = Weapons.STAFF;
		this.armor = Armor.ROBE;
	
		
		double atkDoub = ((Math.floor(stats.get("Strength") - 10) / 2));
		this.attackModifier = (int)(atkDoub);
		double mgcDoub = ((Math.floor(stats.get("Intelligence") - 10) / 2));
		this.magicModifier = (int)(mgcDoub);
		
	}
	
	


	/**
	 *This is the Wizard's special move. It allows the player character to attack with a magical fireball, which increases power with higher levels.
	 *@param e is the target of the attack, like in the attackEnemy method it is an instance of the Entity object, which includes all of the enemies.
	 */
	@Override
	public boolean specialMove(Entity e) {
		System.out.println("You cast a fireball, to devastating effect!");
		int damageAmount = this.magicModifier + 7;
		e.setHealth(e.getHealth() - damageAmount);
		return true;
	}
}
