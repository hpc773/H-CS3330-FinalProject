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
	public static void main(String[] args) {
        PlayerCharacter player = new PlayerCharacter("John", Races.Human, new Fighter());
        LocationCurrent locationCurrent = new LocationCurrent();
        
        System.out.println("Initial stats:");
        System.out.println("Player Stats: " + player.getStats());
        System.out.println("------------------");
        
        locationCurrent.chooseLocation(player);
        
        System.out.println("------------------");
        System.out.println("Updated stats:");
        System.out.println("Player Stats: " + player.getStats());
    }

	@Test
	void test() {
		fail("Not yet implemented");
	}

}