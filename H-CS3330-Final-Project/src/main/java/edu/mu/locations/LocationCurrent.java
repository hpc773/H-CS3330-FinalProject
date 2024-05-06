package edu.mu.locations;

import java.util.Scanner;

import edu.mu.characters.PlayerCharacter;
import edu.mu.locations.Forest;

public class LocationCurrent {
	

	
	
	
	
	
	
	
	public LocationType chooseLocation(PlayerCharacter character) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Choose a location:");
			System.out.println("1. Forest");
			System.out.println("2. Mountain");
			System.out.println("3. Desert");
			System.out.print("Enter the number corresponding to your choice: ");
			
			int choice = scanner.nextInt();
			scanner.nextLine(); // read the newline character
			
			switch (choice) {
			    case 1:
			    	travelToForest(character);
			        return LocationType.FOREST;
			    case 2:
			    	travelToMountain(character);
			        return LocationType.MOUNTAIN;
			    case 3:
			    	travelToDesert(character);
			        return LocationType.DESERT;
			    default:
			        System.out.println("Invalid choice. Defaulting to Forest.");
			        return LocationType.FOREST;
			}
		}
        
        
    }
	private void travelToForest(PlayerCharacter character) {
        Forest forest = new Forest();
        forest.Apply(character);
        System.out.println("You traveled to the Forest.");
        
    }
    
    private void travelToMountain(PlayerCharacter character) {
        Mountain mountain = new Mountain();
        mountain.Apply(character);
        System.out.println("You traveled to the Mountain.");
        
    }
    
    private void travelToDesert(PlayerCharacter character) {
        Desert desert = new Desert();
        desert.Apply(character);
        System.out.println("You traveled to the Desert.");
        
    }
	
	
	

}
