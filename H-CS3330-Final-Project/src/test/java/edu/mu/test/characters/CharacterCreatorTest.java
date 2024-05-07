package edu.mu.test.characters;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;
import edu.mu.characters.playerclasses.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


import edu.mu.characters.*;
public class CharacterCreatorTest {
	private CharacterCreator cc;	
	Scanner scan = new Scanner(System.in);

	@BeforeEach
	void setUp() {
		cc = new CharacterCreator();
		
		
		
		
		
				
	}
	
	
	@Test
	@Order(1)
	@DisplayName("testing name creator")
	void testNameCreator() {
		String nameTest = null;
		/*String input = "Henry";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);*/
		String name = cc.nameCreator();
		System.out.println("Enter the same name as above to test the method.");
		while(true) {
			nameTest = scan.nextLine();
			if(!nameTest.equals(name)) {
				System.out.println("\nPlease enter the same string.");
				continue;
			}
			break;
		}
		assertEquals(name, nameTest );
		
		
	}
	@Test
	@Order(2)
	@DisplayName("testing race creator")
	void testRaceCreator() {
		
		
		Races race = cc.raceCreator();
		assertEquals(race.getClass(), Races.class);
		
		
	}
	@Test
	@Order(3)
	@DisplayName("testing player class creator")
	void testClassCreator() {
		
		
		PlayerClassEnum pClass = cc.createClass();
		assertEquals(pClass.getClass(), PlayerClassEnum.class);
		
		
	}
	@Test
	@Order(4)
	@DisplayName("testing player class factory")
	void testClassFactory() {
		PlayerClassSuper test = new Paladin();
		PlayerClassSuper pc = cc.classFactory(PlayerClassEnum.Paladin);
		pc.equals(test);
		
		
		
		
	}
}
