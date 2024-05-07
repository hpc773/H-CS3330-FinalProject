package edu.mu.characters.playerclasses;

import edu.mu.characters.items.Armor;
import edu.mu.characters.items.Weapons;
import edu.mu.npcs.Entity;
/**
 *This is the Ranger class, one of the playable classes. The player character derives their stats and items from this class, if chosen. 
 *The attack modifier for this class is defined here so that it can use the desired stat.
 * @author Henry Clark
 */
public class Ranger extends PlayerClassSuper {
	
	public Ranger() {
		super();
		this.stats.put("Strength", 12);
		this.stats.put("Dexterity", 15);
		this.stats.put("Constitution", 14);
		this.stats.put("Intelligence", 8);
		this.stats.put("Wisdom", 13);
		this.stats.put("Charisma", 10);
		
		this.weapon = Weapons.BOW;
		this.armor = Armor.MEDIUM_ARMOR;
		
		double atkDoub = ((Math.floor(stats.get("Dexterity") - 10) / 2));
		
		this.attackModifier = (int)(atkDoub);
	}
	@Override
	/**
	 *This is the Ranger's special move. It allows the player character to attack twice in a turn.
	 *This is essentially a repeat of the attackEnemy method from the PlayerCharacter class.
	 *@param e is the target of the attack, like in the attackEnemy method it is an instance of the Entity object, which includes all of the enemies.
	 */
	public boolean specialMove(Entity e) {
		System.out.println("Your proficiency with a bow allows you to strike again!");
		int damageAmount = this.getAttackModifier() + this.weapon.getDamage();
		e.setHealth(e.getHealth() - damageAmount);
		return true;
	}
}
