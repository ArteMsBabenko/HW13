package lesson13;

import java.util.*;

public class Main {
	
	static void menu() {
		System.out.println();
		System.out.println("Enter 1 to add a faction to the Supreme Council");
		System.out.println("Enter 2 to remove a faction from the Supreme Council");
		System.out.println("Enter 3 to display all factions in the Supreme Council");
		System.out.println("Enter 4 to clear entered fraction");
		System.out.println("Enter 5 to display the entered fraction");
		System.out.println("Enter 6 to add MP to faction");
		System.out.println("Enter 7 to remove an MP from a faction");
		System.out.println("Enter 8 to bring out the biggest bribe taker");
		System.out.println("Enter 9 for a list of bribe takers");		
	}
	
	public static void main(String[] args) {
		
		
Scanner sc = new Scanner(System.in);
		
		while (true) {
			menu();

			switch (sc.nextInt()) {

			case 1: {
				Supreme_Council.getInstance().addParty();
				break;
			}
			
			case 2: {
				Supreme_Council.getInstance().removeDeputyParty();
				break;
			}
			
			case 3: {
				Supreme_Council.getInstance().getAllPartyes();
				break;
			}
			
			case 4: {
				Supreme_Council.getInstance().Clear();
				break;
			}
			
			case 5: {
				Supreme_Council.getInstance().getParty();
				break;
			}
			
			case 6: {
				Supreme_Council.getInstance().addDeputyToParty();
				break;
			}
			
			case 7: {
				Supreme_Council.getInstance().revomeDeputyFromParty();
				break;
			}
			
			case 8: {
				Supreme_Council.getInstance().getCorruptorFromPary();
				break;
			}
			
			case 9: {
				Supreme_Council.getInstance().getAllMembersFromParty();
				break;
			}
			
			default: {
				System.out.println("Enter a number from 1 to 9");
				break;
			}
			}
		}
	}
		
		
	}
	


