package edu.mu.characters.playerclasses;

import edu.mu.characters.items.Armor;
import edu.mu.characters.items.Weapons;

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
	@Override
	public void specialMove() {//idk, the ability to use magic?
		
	}
}
