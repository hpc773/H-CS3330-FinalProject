package edu.mu.characters;




import java.util.HashMap;

import edu.mu.characters.playerclasses.PlayerClassEnum;
import edu.mu.characters.items.Armor;
import edu.mu.characters.items.Weapons;
import edu.mu.characters.playerclasses.*;
import edu.mu.npcs.*;


/**
 * This is the class that the player character belongs to. All of the fields that the player character has and their basic methods are here. 
 * The player's chosen class is an object from the playerclass package and the weapons and armor fields are objects from the Weapons and Armor enums. 
 * Many fields in this class, such as the initiative and the health, derive from properties of the player's chosen class' properties, such as their default stats.
 * The stat distributions are based off of D&D 5e Standard Array stats.
 * @author Henry Clark
 */



public class PlayerCharacter extends Character{
	private HashMap<String, Integer> stats;
	private Weapons weapon;
	private Armor armor;
	private PlayerClassSuper playerClass;
	private int exp;
	private int initiative;
	private int defense;
	private int level;
	private int expRequired;
	//private HashMap<String, String> inventory = new HashMap<String, String>();


	
	
	
	public PlayerCharacter(String name, Races race, PlayerClassSuper playerClass) {
		super(name, race);
		this.stats = playerClass.getStats();
		this.weapon = playerClass.getWeapon();
		this.armor = playerClass.getArmor();
		this.defense = armor.getArmorValue();
		this.playerClass = playerClass;
		double initDoub = ((Math.floor(stats.get("Dexterity") - 10) / 2));
		this.initiative = (int)(initDoub);
		double healDoub = ((Math.floor(stats.get("Constitution") - 10) / 2));
		this.health = 10 + (int)(healDoub) + this.defense;
		
		this.expRequired = 10;
		this.level = 1;
		this.exp = 0;
		
		
	}



	
	
	
	public HashMap<String, Integer> getStats() {
		return stats;
	}
	public void setStats(HashMap<String, Integer> stats) {
		this.stats = stats;
		
	}

	
	
	public PlayerClassSuper getPlayerClass() {
		return playerClass;
	}
	public void setPlayerClass(PlayerClassSuper playerClass) {
		this.playerClass = playerClass;
	}
	public void setExp(int newExp) {
		this.exp = newExp;
		
		}
	
	public void incrementExp(int incExp) {
		this.exp += incExp;
		while(this.getExp() >= this.getExpRequired()) {
			levelUp();
		}
	}
	public int getExp() {
		return this.exp;
	}
	
	
	public int getInitiative() {
		return initiative;
	}
	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	/*public HashMap<String, String> getInventory() {
		return inventory;
	}
	public void setInventory(HashMap<String, String> inventory) {
		this.inventory = inventory;
	}*/
	public Weapons getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapons weapon) {
		this.weapon = weapon;
	}
	public Armor getArmor() {
		return armor;
	}
	public void setArmor(Armor armor) {
		this.armor = armor;
	}
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

	public int getExpRequired() {
		return expRequired;
	}

	public void setExpRequired(int expRequired) {
		this.expRequired = expRequired;
	}


	//actions
	/**
	 * This method handles when the player has 0 health. Here, all it does is return true, while when implemented it is used to reset the run. 
	 * 
	 */
	
	public boolean perish() {
		System.out.println("You died!");
		return true;
	}
	/**
	 * This is the basic attack for every character. The attackModifier is based off of the player character's strength or dex, based on the class.
	 * This is meant to simulate finesse vs standard weapons. For example, a strength based ranger (with a bow) would be next to useless in 5e.
	 * Much of this project is based around 5e mechanics.
	 * @param e the target of the attack, it is an instance of the Entity class, from which the enemy npcs derive. Notice that the e.perish() method is NOT the perish() that is defined in the PlayerCharacter class.
	 * It is in fact a function with the same name defined for Entity objects and acts as a way to bestow EXP on the player.
	 */
	public boolean attackEnemy(Entity e) {
		int damageAmount = playerClass.getAttackModifier() + this.weapon.getDamage();
		e.setHealth(e.getHealth() - damageAmount);
		if(e.getHealth() <= 0) {
			e.perish(this);
		}
		return true;
		
	}
	/**
	 * This method handles when the player gains enough exp to level up. After increasing all of the stats by 1, it increases the level up requirement.
	 * The player levels up when the expRequired field is less than the exp field. This can be seen in the expIncrementor method 
	 * 
	 */
	public void levelUp() {
		System.out.println("Level up!");
		setLevel(getLevel()+1);
		this.stats.put("Strength", stats.get("Strength")+1);
		this.stats.put("Dexterity", stats.get("Dexterity")+1);
		this.stats.put("Constitution", stats.get("Constitution")+1);
		this.stats.put("Intelligence", stats.get("Intelligence")+1);
		this.stats.put("Wisdom", stats.get("Wisdom")+1);
		this.stats.put("Charisma", stats.get("Charisma")+1);
		setExpRequired(getExpRequired() + 5);
		
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "PlayerCharacter [stats=" + stats + ", weapon=" + weapon + ", armor=" + armor + ", playerClass="
				+ playerClass + ", exp=" + exp + ", initiative=" + initiative + ", defense=" + defense + /*", inventory="
				+ inventory +*/ ", name=" + name + ", race=" + race + ", health=" + health + "]";
	}
	
	
	
	

	
	
	
	
	
	
	
	







	



	
	}



	
	
	
	

