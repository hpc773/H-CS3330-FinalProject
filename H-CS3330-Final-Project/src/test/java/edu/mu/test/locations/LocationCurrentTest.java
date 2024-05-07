package edu.mu.test.locations;

import static org.junit.jupiter.api.Assertions.*;

import edu.mu.characters.playerclasses.*;
import edu.mu.locations.LocationCurrent;
import edu.mu.npcs.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import edu.mu.characters.PlayerCharacter;
import edu.mu.characters.Races;

import org.junit.jupiter.api.Test;

class LocationCurrentTest {
	
	PlayerCharacter player;
    LocationCurrent locationCurrent;
	
	@BeforeEach
	void setUp(){
		player = new PlayerCharacter("John", Races.Human, new Fighter());
        locationCurrent = new LocationCurrent();
	}
	@Test
	@Order(1)
	void testchooseLocationForest() {
		System.out.println("Initial stats:");
        System.out.println("Player Stats: " + player.getStats());
        System.out.println("------------------");
        
        locationCurrent.chooseLocation(player);
        
        System.out.println("------------------");
        System.out.println("Updated stats:");
        System.out.println("Player Stats: " + player.getStats());
		
	}
	
        
		

	
	
	
        
        
       
    

	

}
