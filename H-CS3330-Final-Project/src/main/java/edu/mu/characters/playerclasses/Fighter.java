package edu.mu.characters.playerclasses;

import java.util.HashMap;

import edu.mu.characters.items.Armor;
import edu.mu.characters.items.Weapons;
import edu.mu.npcs.Entity;

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
	@Override
	public void specialMove(Entity e) {
		System.out.println("Your incredible skill with a blade allows you to make a second strike!");
		int damageAmount = this.getAttackModifier() + this.weapon.getDamage();
		e.setHealth(e.getHealth() - damageAmount);
		
	}
}
	
	
