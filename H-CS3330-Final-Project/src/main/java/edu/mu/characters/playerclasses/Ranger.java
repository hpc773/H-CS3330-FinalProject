package edu.mu.characters.playerclasses;

import edu.mu.characters.items.Armor;
import edu.mu.characters.items.Weapons;
import edu.mu.npcs.Entity;

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
	public void specialMove(Entity e) {
		System.out.println("Your proficiency with a bow allows you to strike again!");
		int damageAmount = this.getAttackModifier() + this.weapon.getDamage();
		e.setHealth(e.getHealth() - damageAmount);
		
	}
}
