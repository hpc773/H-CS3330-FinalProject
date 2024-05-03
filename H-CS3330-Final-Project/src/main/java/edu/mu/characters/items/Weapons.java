package edu.mu.characters.items;

public enum Weapons {
STAFF(1),
BOW(4),
DAGGER(3),
SWORD(4),
WARHAMMER(6),;

private int damage;

private Weapons(int damage) {
	this.damage = damage;
	
}
}
