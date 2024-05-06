package edu.mu.maven.H_CS3330_Final_Project;

import edu.mu.characters.CharacterCreator;
import edu.mu.characters.PlayerCharacter;
import edu.mu.characters.items.Armor;
import edu.mu.characters.items.Weapons;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CharacterCreator create = new CharacterCreator();
        PlayerCharacter player = create.createCharacter();
        System.out.println(player.toString());
    }
}
