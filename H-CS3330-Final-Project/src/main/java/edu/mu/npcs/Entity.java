package edu.mu.npcs;

import edu.mu.characters.*;
abstract class Entity {
	
	private String name;
	private int health;
	private int attack;
	private int expValue;
	private int moneyValue;
	

	public Entity() {
		
	}
	
	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	private void setHealth(int health) {
		this.health = health;
	}

	public int getAttack() {
		return attack;
	}

	private void setAttack(int attack) {
		this.attack = attack;
	}

	public int getExpValue() {
		return expValue;
	}

	private void setExpValue(int expValue) {
		this.expValue = expValue;
	}

	public int getMoneyValue() {
		return moneyValue;
	}

	private void setMoneyValue(int moneyValue) {
		this.moneyValue = moneyValue;
	}
	
	public abstract int specialAttack();
	
}
