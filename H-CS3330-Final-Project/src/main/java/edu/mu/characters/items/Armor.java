package edu.mu.characters.items;
/**
 * This enum contains all of the armor that the individual classes use. Each element has an armor value that can be obtained using the getter method. The armor value is used in the calculation of the character's health.
 * @author Henry Clark
 */
public enum Armor {
ROBE(1),
LIGHT_ARMOR(3),
MEDIUM_ARMOR(4),
HEAVY_ARMOR(5),;


private int armorValue;
private Armor(int armorValue) {
	this.armorValue = armorValue;
}

public int getArmorValue() {
	return this.armorValue;
}

}
