package edu.mu.characters.items;

/**
 * This enum contains all of the weapons that the individual classes use. Each element has a damage value that can be obtained using the getter method. The damage value is used in the calculation of the character's attack damage.
 * @author Henry Clark
 */
public enum Weapons {
STAFF(2),
BOW(5),
DAGGER(4),
SWORD(5),
WARHAMMER(7),;

private int damage;

private Weapons(int damage) {
	this.damage = damage;
	
}
public int getDamage() {
	return this.damage;
}
}
