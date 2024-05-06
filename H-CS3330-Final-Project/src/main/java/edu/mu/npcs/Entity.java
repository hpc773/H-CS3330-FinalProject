package edu.mu.npcs;

import edu.mu.characters.*;

/**
 * This is the abstract superclass for all NPCs, it has the name, health value, attack damage, and experience value, as well as a type.
 * 
 * 
 * @author skylarperry
 */
public abstract class Entity {

	
	private String name;
	private int health;
	private int regularAttackValue;
	private int expValue;
	private int powerLevel;
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
	
	public int getPowerLevel() {
		return powerLevel;
	}

	protected void setPowerLevel(int powerLevel) {
		this.powerLevel = powerLevel;
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
	public boolean attackCharacter(PlayerCharacter character) {
		
		character.setHealth(character.getHealth() - getAttack());
		return true;
	}
	
	/** Method that triggers when the entity dies, gives the player character experience
	 * 
	 * @param PlayerCharacter PC
	 * @return returns true if the Entity did indead perish
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
		PC.incrementExp(this.getExpValue());
		
		return PC.getExp();
	}
	
	/** A special attack that each entity subclass has, each subclass will have a special effect tied to it
	 * 
	 * @param the player character PC
	 * @return
	 */
	public abstract int specialAttack(PlayerCharacter PC);
	
	protected abstract boolean entityPowerLevel(Entity NPC);
	
}
