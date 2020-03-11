package ClickerGameOne;
import java.util.Scanner; 

public class GameDemo {

	public static void main(String[] args) {
		Character test = new Character("mario", 1, 1, 0.0);
		System.out.println(test.toString()); 
		Character player = createCharacter(); 
		startGame(player);  

	}
	
	public static Character createCharacter( ) { 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Name: ");
		String Name = input.nextLine(); 
		Character player = new Character(Name, 1, 1, 0.0); 
		return player; 
	}
	
	public static void startGame(Character player) { 
		boolean play = true; 
		int day = 0;
		while (play == true) { 
			System.out.println("Day: " + day);
			int selection = printMenu(); 
			if (selection == 1) { 
				//player.printStats(); 
				System.out.println(player.toString());
			}
			else if (selection == 2) { 
				store(player); 
			}
			else if (selection == 3) { 
				advDay(player); 
				day +=1; 
			}
		}
	}
	
	public static int printMenu() { 
		boolean correct = false; 
		int choice = -1;
		while (correct == false){ 
			Scanner input = new Scanner(System.in);
			System.out.println("-----------------");
			System.out.println("Select: ");
			System.out.println("(1) Print Stats");
			System.out.println("(2) buy gear");
			System.out.println("(3) advance day");
			System.out.println("-----------------");
			choice = input.nextInt(); 
			if (choice > 0 && choice < 4 ) { correct = true;} 
		}
		return choice;
		
	}
	
	public static void store(Character p) {
		Scanner input = new Scanner(System.in);
		double money = p.getMoney();
		if (money < 0.0) {  
			System.out.println("You have no money");
			System.out.println("-----------------");
		}
		else { 
			boolean correct = false; 
			int c = -1;
			while (correct == false) { 
				System.out.println("-----------------");
				System.out.println("(1) buy amunition(50$) +2 atk");
				System.out.println("(2) Sharpan knife(10$)  +2 speed");
				System.out.println("-----------------");
				c = input.nextInt(); 
				if (c > 0 && c < 3) { 
					correct = true; 
				}
			}
			if (c == 1) { 
				if (money > 50.0) { 
					p.setAtk(2);
					p.subMoney(50.0);
				} 
				else {
					System.out.println("You do not have enough money");
					System.out.println("-----------------");
				}
			}
			else if (c == 2) { 
				if (money > 10.0) { 
					p.setspeed(2);
					p.subMoney(10.0);
				} 
				else {
					System.out.println("You do not have enough money");
					System.out.println("-----------------");
				}
			}
				
		}
	}
	
	public static void advDay(Character p) { 
		int a = p.getAtk(); 
		int s = p.getspeed(); 
		
		double jpd = ((s * 24) + (a * 24))/48;
		double income = jpd*5; 
		
		p.addMoney(income); 
		System.out.println("************************************************");
		System.out.println("you killed some monsters and earned : $" + income);
		System.out.println("************************************************");
	}

}
