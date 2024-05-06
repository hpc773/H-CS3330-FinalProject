package edu.mu.characters.playerclasses;

import java.util.HashMap;

import edu.mu.characters.items.Armor;
import edu.mu.characters.items.Weapons;

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
	public void specialMove() {//extra attack, maybe just use the same attack method from playercharacter?
		
	}
}
	
	
