package edu.mu.locations;

import java.util.HashMap;

import edu.mu.characters.PlayerCharacter;

public abstract class LocationSuper {

	protected int strengthMod;
	protected int dexMod;
	protected int constitutionMod;
	protected int IntelligenceMod;
	protected int wisdomMod;
	protected int charismaMod;
	
	protected HashMap<String, Integer> statsBase = new HashMap<String, Integer>();
	protected HashMap<String, Integer> statsAltered = new HashMap<String, Integer>();
	
	public int getStrengthMod() {
		return strengthMod;
	}
	public void setStrengthMod(int strengthMod) {
		this.strengthMod = strengthMod;
	}
	public int getDexMod() {
		return dexMod;
	}
	public void setDexMod(int dexMod) {
		this.dexMod = dexMod;
	}
	public int getConstitutionMod() {
		return constitutionMod;
	}
	public void setConstitutionMod(int constitutionMod) {
		this.constitutionMod = constitutionMod;
	}
	public int getIntelligenceMod() {
		return IntelligenceMod;
	}
	public void setIntelligenceMod(int intelligenceMod) {
		IntelligenceMod = intelligenceMod;
	}
	public int getWisdomMod() {
		return wisdomMod;
	}
	public void setWisdomMod(int wisdomMod) {
		this.wisdomMod = wisdomMod;
	}
	public int getCharismaMod() {
		return charismaMod;
	}
	public void setCharismaMod(int charismaMod) {
		this.charismaMod = charismaMod;
	}
	
	/*
	 * public void TravelTo(PlayerCharacter character) { statsBase =
	 * character.getStats();
	 * 
	 * }
	 */
	

}
