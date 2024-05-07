package edu.mu.locations;

import java.util.Scanner;

import edu.mu.characters.PlayerCharacter;



public class LocationCurrent {
	

	
	
	LocationType currentLocation = LocationType.BASE;
	
	
	
	
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
			    	leave(currentLocation, character);
			    	travelToForest(character);
			    	currentLocation = LocationType.FOREST;
			        return LocationType.FOREST;
			    case 2:
			    	leave(currentLocation, character);
			    	travelToMountain(character);
			        return LocationType.MOUNTAIN;
			    case 3:
			    	leave(currentLocation, character);
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
    
    private void leaveForest(PlayerCharacter character) {
    	Forest forest = new Forest();
    	forest.Depart(character);
    	System.out.println("Leaving Forest... \n");
    }
    private void leaveMountain(PlayerCharacter character) {
    	Mountain mountain = new Mountain();
    	mountain.Depart(character);
    	System.out.println("Leaving Mountain... \n");
    	
    }
    private void leaveDesert(PlayerCharacter character) {
    	Desert desert = new Desert();
    	desert.Depart(character);
    	System.out.println("Leaving Desert... \n");
    	
    }
	private void leave (LocationType current, PlayerCharacter character) {
		switch(current) {
		case FOREST:
			leaveForest(character);
			break;
		case MOUNTAIN:
			leaveMountain(character);
			break;
		case DESERT:
			leaveDesert(character);
			break;
		default:
		}
	}
	
	

}
