package edu.mu.locations;



import edu.mu.characters.PlayerCharacter;

public class Desert extends LocationSuper {

	protected int strengthMod;
	protected int dexMod;
	protected int constitutionMod;
	protected int IntelligenceMod;
	protected int wisdomMod;
	protected int charismaMod;
	
	
	
	public void Apply(PlayerCharacter character) {
		statsBase = character.getStats();
		statsAltered = character.getStats();
		if (statsAltered.containsKey("Dexterity")) {
            int currentDex = statsAltered.get("Dexterity");
            statsAltered.put("Dexterity", currentDex - 1);
            character.setStats(statsAltered);
            
        }
		
		
	}

	
	public void Depart(PlayerCharacter character) {
		character.setStats(statsBase);
	
	}

}
