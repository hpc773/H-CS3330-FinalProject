package edu.mu.characters.playerclasses;

public class Ranger extends PlayerClassSuper {
	private int attackModifier;
	public Ranger() {
		super();
		this.stats.put("Strength", 12);
		this.stats.put("Dexterity", 15);
		this.stats.put("Constitution", 14);
		this.stats.put("Intelligence", 8);
		this.stats.put("Wisdom", 13);
		this.stats.put("Charisma", 10);
		
		this.inventory.put("Weapon", "Bow");
		this.inventory.put("Clothing", "Medium Armor");
		this.inventory.put("Gold", "250");
		double atkDoub = ((Math.floor(stats.get("Dexterity") - 10) / 2));
		
		this.attackModifier = (int)(atkDoub);
	}
	@Override
	public void specialMove() {//extra attack but for bows
		
	}
}
