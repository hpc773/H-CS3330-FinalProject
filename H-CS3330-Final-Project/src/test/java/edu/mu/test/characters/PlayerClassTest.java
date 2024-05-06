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
import edu.mu.characters.items.Armor;
import edu.mu.characters.items.Weapons;
import edu.mu.characters.playerclasses.*;
import edu.mu.characters.playerclasses.PlayerClassSuper;
import edu.mu.npcs.*;
public class PlayerClassTest {

	private PlayerClassSuper pc;
	@BeforeEach
	void setUp() {
		pc = new Fighter();
	}
	
	@Test
	@DisplayName("Testing getStats")
	void testStats() {
		pc.getStats().get("Strength").equals(15);
	}
	@Test
	@DisplayName("Testing setWeapon")
	void testWeapon() {
		pc.setWeapon(Weapons.DAGGER);
		assertEquals(Weapons.DAGGER, pc.getWeapon());
		
	}
	@Test
	@DisplayName("Testing armor")
	void testArmor() {
		pc.setArmor(Armor.ROBE);
		assertEquals(Armor.ROBE, pc.getArmor());
		
	}
	@Test
	@DisplayName("Testing atkModifier")
	void testAtkMod() {
		pc.setAttackModifier(5);
		assertEquals(5, pc.getAttackModifier());
		
	}
	@Test
	@DisplayName("Testing fighter special move")
	void testFighterMove() {
		Entity e = new Skeleton();
		boolean boolTest = pc.specialMove(e);
		assertEquals(true, boolTest);
		
	}
	@Test
	@DisplayName("Testing paladin special move")
	void testPaladinMove() {
		pc = new Paladin();
		Entity e = new Skeleton();
		boolean boolTest = pc.specialMove(e);
		assertEquals(true, boolTest);
		
	}@Test
	@DisplayName("Testing ranger special move")
	void testRangerMove() {
		pc = new Ranger();
		Entity e = new Skeleton();
		boolean boolTest = pc.specialMove(e);
		assertEquals(true, boolTest);
		
	}@Test
	@DisplayName("Testing rogue special move")
	void testRogueMove() {
		pc = new Rogue();
		Entity e = new Skeleton();
		boolean boolTest = pc.specialMove(e);
		assertEquals(true, boolTest);
		
	}@Test
	@DisplayName("Testing wizard special move")
	void testWizardMove() {
		pc = new Wizard();
		Entity e = new Skeleton();
		boolean boolTest = pc.specialMove(e);
		assertEquals(true, boolTest);
		
	}
		
	}
	
	

