package edu.mu.npcs;

import edu.mu.characters.*;
public abstract class Entity {
	
	private String name;
	private int health;
	private int regularAttackValue;
	private int expValue;
	private int moneyValue;
	NpcType Type;
	

	public Entity() {
		
	}
	
	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttack() {
		return regularAttackValue;
	}

	protected void setAttack(int attack) {
		this.regularAttackValue = attack;
	}

	public int getExpValue() {
		return expValue;
	}

	protected void setExpValue(int expValue) {
		this.expValue = expValue;
	}

	public int getMoneyValue() {
		return moneyValue;
	}

	protected void setMoneyValue(int moneyValue) {
		this.moneyValue = moneyValue;
	}
	
	public NpcType getType() {
		return Type;
	}

	public void setType(NpcType type) {
		Type = type;
	}
	
	protected boolean attackCharacter(PlayerCharacter character) {
		
		character.setHealth(character.getHealth() - regularAttackValue);
		return true;
	}
	
	public boolean perish(PlayerCharacter PC) {
		grantExp(PC);
		
		return true;
	}
	
	private int grantExp(PlayerCharacter PC) {
		PC.setExp(PC.getExp()+ this.getExpValue());
		
		return PC.getExp();
	}
	
	
	public abstract int specialAttack();
	
	protected abstract void entityPowerLevel(Entity NPC);
	
}
