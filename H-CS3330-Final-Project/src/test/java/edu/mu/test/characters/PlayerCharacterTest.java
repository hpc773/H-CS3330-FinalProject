package edu.mu.test.characters;

import static org.junit.jupiter.api.Assertions.*;

import edu.mu.characters.playerclasses.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.jparams.verifier.tostring.ToStringVerifier;

import edu.mu.characters.PlayerCharacter;
import edu.mu.characters.Races;
import edu.mu.characters.items.Armor;
import edu.mu.characters.items.Weapons;
import edu.mu.npcs.*;



public class PlayerCharacterTest {

	private PlayerCharacter pc;
	
	@BeforeEach
	void setUp() {
		pc = new PlayerCharacter("Jane", Races.Gnome, new Ranger());
	}
	
	//CONSTRUCTOR----------------------------------------
	
	
	//--GETTERS AND SETTERS--------------------------------
	@Test
	@Order(1)
	@DisplayName("testing name getter/setter")
	void testsetName() {
		pc.setName("Henry");
		assertEquals("Henry", pc.getName());
		
		
	}
	@Test
	@Order(2)
	@DisplayName("testing race getter/setter")
	void testsetRace() {
		pc.setRace(Races.Dwarf);
		assertEquals(Races.Dwarf, pc.getRace());
		
		
	}
	@Test
	@Order(3)
	@DisplayName("testing health getter/setter")
	void testsetHealth() {
		pc.setHealth(20);
		assertEquals(20, pc.getHealth());
		
		
	}
	@Test
	@Order(4)
	@DisplayName("testing exp getter/setter")
	void testsetExp() {
		pc.setExp(100);
		assertEquals(100, pc.getExp());
		
		
	}
	//now for more complicated ones
	@Test
	@Order(5)
	@DisplayName("testing player class getter/setter")
	void testsetPlayerClass() {
		PlayerClassSuper pTest = new Paladin();
		pc.setPlayerClass(new Paladin());
		pTest.equals(pc.getPlayerClass());
		
		
	}
	@Test
	@Order(6)
	@DisplayName("testing weapon getter/setter")
	void testsetWeapon() {
		pc.setWeapon(Weapons.BOW);
		assertEquals(Weapons.BOW, pc.getWeapon());
		
	}
	@Test
	@Order(7)
	@DisplayName("testing armor getter/setter")
	void testsetArmor() {
		pc.setArmor(Armor.ROBE);
		assertEquals(Armor.ROBE, pc.getArmor());
	}
	@Test
	@Order(8)
	@DisplayName("testing stats getter/setter")
	void testsetStats() {
		PlayerClassSuper pTest = new Wizard();
		pc.setPlayerClass(new Wizard());
		pTest.getStats().equals(pc.getStats());
	}
	@Test
	@Order(9)
	@DisplayName("testing exp incrementor")
	void testIncExp() {
		pc.setExp(20);
		pc.incrementExp(10);
		assertEquals(30, pc.getExp());
	}
	@Test
	@Order(10)
	@DisplayName("testing initiative getter/setter")
	void testInit() {
		pc.setInitiative(10);
		assertEquals(10, pc.getInitiative());
		
		
	}
	@Test
	@Order(11)
	@DisplayName("testing defense getter/setter")
	void testDefense() {
		pc.setDefense(10);
		assertEquals(10, pc.getDefense());
		
		
	}
	
	@Test
	@Order(12)
	@DisplayName("testing perish")
	void testPerish() {
		boolean boolTest = pc.perish();
		assertEquals(true, boolTest);
	}
	@Test
	@Order(13)
	@DisplayName("testing attack")
	void testAttack() {
		Entity e = new Skeleton();
		boolean boolTest = pc.attackEnemy(e);
		assertEquals(true, boolTest);
		
		
	}
	@Test
	@Order(13)
	@DisplayName("testing toString")
	void testToString() {
		ToStringVerifier.forClass(PlayerCharacter.class).verify();
		
		
	}
	@Test
	@Order(14)
	@DisplayName("testing health incrementor")
	void testIncHeal() {
		pc.setHealth(20);
		pc.incrementHealth(10);
		assertEquals(30, pc.getHealth());
	}
	
	
	
	
		
		

	
	
	//----------------------------------------------------------
	
	
	
}
