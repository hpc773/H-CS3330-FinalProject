package edu.mu.test.characters;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;


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

	@BeforeEach
	void setUp() {
		cc = new CharacterCreator();
		
		
		
		
				
	}
	
	
	@Test
	@Order(1)
	@DisplayName("testing name creator")
	void testnameCreator() {
		
		String input = "Henry";
		InputStream in = new ByteArrayInputStream(input.getBytes());
		System.setIn(in);
		
		assertEquals("Henry", cc.nameCreator() );
		
		
	}
}
