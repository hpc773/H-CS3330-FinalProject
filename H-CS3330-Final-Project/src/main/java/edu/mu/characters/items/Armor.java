package edu.mu.characters.items;

public enum Armor {
ROBE(1),
LIGHT_ARMOR(3),
MEDIUM_ARMOR(4),
HEAVY_ARMOR(5),;// these are example values, can tweak later


private int armorValue;
private Armor(int armorValue) {
	this.armorValue = armorValue;
}

public int getArmorValue() {
	return this.armorValue;
}

}
