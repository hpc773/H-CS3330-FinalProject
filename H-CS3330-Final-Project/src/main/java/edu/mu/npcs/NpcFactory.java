package edu.mu.npcs;

/** Factory class to generate NPCs
 * 
 * @author skylarperry
 */
public class NpcFactory {
	/** The method that actually creates and returns the new NPCs
	 * 
	 * @param type of the NPC to be created
	 * @return a new NPC object of the specified type
	 */
	public Entity spawnNPC(NpcType type){
		Entity newNpc;
		switch (type){
		case ZOMBIE:
			newNpc = new Zombie();
		case SKELETON:
			newNpc = new Skeleton();
		case HUMAN:
			newNpc = new Human();
		default:
			newNpc = null;
		}
		return newNpc;
	}
}
	
