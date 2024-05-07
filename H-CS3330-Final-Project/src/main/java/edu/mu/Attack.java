package edu.mu;

import edu.mu;

public class Attack {
	
	public void startFight() {
		//identify character 
		boolean playStunned;
		int turnsOfDisease;
		System.out.println("You approach.");
		
		while (boolean a = true) {
			System.out.println("What's your next move?");
			boolean a;
			while( a = true) {
			System.out.println("[1] Chat"
					+ "\n[2] Argue"
					+ "\n[3] Attack"
					+ "\n[4] Run");
			String selectChoice = in.nextLine();
			try {
				int choiceNum = Integer.parseInt(selectChoice);
				
				switch(choiceNum) {
				case 1://chat
					System.out.println("You ask them how their day is."
							+ " They respond"); //enemy response string pending
					return;
				case 2://argue
					System.out.println("You tell them how silly they look."
							+ " They respond"); //enemy response string pending
					return;
				case 3: //attack
					
					System.out.println("How do you attack?");
					System.out.println("[1] Regular Attack"
							+ "\n[2] Specialized Attack");
					String selectAttack = in.nextLine();
					try {
						int attackNum = Integer.parseInt(selectAttack);
						
						switch(attackNum) {
						case 1: //regular attack
							System.out.println("You swing at the enemy!");
							//deal damage
						
						case 2: //specialized attack
							System.out.println("You use your weapon against the enemy!");
							//deal damage
						}
				case 4: //run
					
					System.out.println("You sprint from the enemy.");
					return;
							
				}	
			
			
}
