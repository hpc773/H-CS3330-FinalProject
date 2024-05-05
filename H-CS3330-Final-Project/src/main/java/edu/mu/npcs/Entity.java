package edu.mu.npcs;

import edu.mu.characters.*;
/**
 * This is the abstract superclass for all NPCs, it has the name, health value, attack damage, and experience value, as well as a type.
 * 
 * 
 * @author skylarperry
 */
abstract class Entity {
	
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

	protected void setHealth(int health) {
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
	
	/** Method that the entity uses to damage the player character
	 * 
	 *
	 * @return returns true if the damage was correctly taken
	 */
	protected boolean attackCharacter(PlayerCharacter character) {
		
		character.setHealth(character.getHealth() - regularAttackValue);
		return true;
	}
	
	/** Method that triggers when the entity dies, gives the player character experience
	 * 
	 * @param PlayerCharacter PC
	 * @return returns 
	 */
	public boolean perish(PlayerCharacter PC) {
		grantExp(PC);
		
		return true;
	}
	
	/** helper method that increments the player characters experience
	 * 
	 * @param PlayerCharacter PC
	 * @return the player characters amount of experience after execution
	 */
	private int grantExp(PlayerCharacter PC) {
		PC.setExp(PC.getExp()+ this.getExpValue());
		
		return PC.getExp();
	}
	
	
	public abstract int specialAttack();
	
	protected abstract void entityPowerLevel(Entity NPC);
	
}
