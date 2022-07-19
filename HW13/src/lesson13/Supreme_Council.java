package lesson13;

import java.util.*;

public class Supreme_Council {
	
	private static Supreme_Council instance = new Supreme_Council();
	
	private Supreme_Council() {
		
	}
	
	public static Supreme_Council getInstance() {
		if (instance == null) {
			
			instance = new Supreme_Council();
		}
		return instance;
	}
	
	ArrayList<Party> SCArray = new ArrayList<Party>();
	
	public void addParty() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter party name:");
		String PartyName = sc.next();
		
		Party party = new Party(PartyName);
		
		SCArray.add(party);
		System.out.println(party.toString()+"successfully added to the Supreme Council");
	}
	
	public void removeDeputyParty() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter party name");
		String PartyName = sc.next();
		
		boolean Correct = isPartyExists(SCArray, PartyName);
		
		if(Correct) {
			Iterator<Party> iterator = SCArray.iterator();
			
			while(iterator.hasNext()) {
				Party nextParty = iterator.next();
				
				if(nextParty.getPartyName().equalsIgnoreCase(PartyName)) {
					iterator.remove();
					System.out.println(nextParty.toString() + "Succsessfully remove from the Supreme Council");
				}
			}
		}
		else {
			System.out.println("Faction does not exist");
		}
	}
	
	public void getAllPartyes() {
		System.out.println("Fractions registered in the Supreme Council");
		for(Party party : SCArray) {
			System.out.println(party.toString());
		}
	}
	
	public void Clear() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter party name");
		String PartyName = sc.next();
		
		boolean Correct = isPartyExists(SCArray,PartyName);
		
		if(Correct) {
			for(Party party : SCArray) {
				if (party.getPartyName().equalsIgnoreCase(PartyName)) {
					party.clearParty();
				}
			}
		}
		
		else {
			System.out.println("Faction does not exists");
		}
		
	}
	
	public void getParty() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter party name");
		String PartyName = sc.next();
		
		for(Party party : SCArray) {
			if(party.getPartyName().equalsIgnoreCase(PartyName)) {
				System.out.println(party.toString());
				party.getAllDeputies();
			}
		}
	}
	
	public void addDeputyToParty() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter party name");
		String PartyName = sc.next();
		
		boolean Correct = isPartyExists(SCArray,PartyName);
		
		if(Correct) {
			for (Party party :SCArray) {
				if(party.getPartyName().equalsIgnoreCase(PartyName)) {
					party.addDeputy();
				}
			}
		}
		
		else {
			System.out.println("Party does not exist");
		}
	}
	
	public void revomeDeputyFromParty() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of party");
		String PartyName = sc.next();
		
boolean Correct = isPartyExists(SCArray,PartyName);
		
		if(Correct) {
			for(Party party : SCArray) {
				if (party.getPartyName().equalsIgnoreCase(PartyName)) {
					party.removeDeputy();
				}
			}
		}
		
		else {
			System.out.println("Faction does not exist");
		}
		
	}
	
	public void getCorruptorFromPary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of party");
		String PartyName = sc.next();
		
boolean Correct = isPartyExists(SCArray,PartyName);
		
		if(Correct) {
			for(Party party : SCArray) {
				if (party.getPartyName().equalsIgnoreCase(PartyName)) {
					party.getBribeTakers();
				}
			}
		}
		
		else {
			System.out.println("Faction does not exist");
		}
		
	}
	
	public void getAllMembersFromParty() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of party");
		String PartyName = sc.next();
		
boolean Correct = isPartyExists(SCArray,PartyName);
		
		if(Correct) {
			for(Party party : SCArray) {
				if (party.getPartyName().equalsIgnoreCase(PartyName)) {
					party.getAllDeputies();
				}
			}
		}
		
		else {
			System.out.println("Faction does not exist");
		}
    }
	
	public void getLargestBribeTakerFromPary() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of party");
		String PartyName = sc.next();
		
boolean Correct = isPartyExists(SCArray,PartyName);
		
		if(Correct) {
			for(Party party : SCArray) {
				if (party.getPartyName().equalsIgnoreCase(PartyName)) {
					party.getLargestСorruptor();
				}
			}
		}
		
		else {
			System.out.println("Faction does not exist");
		}
	}
	
	
	static boolean isPartyExists(ArrayList<Party> SCArray, String PartyName) {
		boolean flag = false;

		for (Party party : SCArray) {
			if (party.getPartyName().equalsIgnoreCase(PartyName)) {
				flag = true;
			}
		}

		return flag;
	}
	
}
