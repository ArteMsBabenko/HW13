package lesson13;

import java.util.*;

public class Party {
	
	private String PartyName;
	
	public Party(String PartyName) {
		this.PartyName=PartyName;
	}

	public String getPartyName() {
		return PartyName;
	}

	public void setPartyName(String partyName) {
		PartyName = partyName;
	}
	
	ArrayList<Deputy> PartyArray = new ArrayList<Deputy>();

	public void addDeputy() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the deputy's second name:");
		String second_name = sc.next();
		System.out.println("Enter the deputy's first name:");
		String first_name = sc.next();
		System.out.println("Enter the age of the deputy:");
		int age = sc.nextInt();
		System.out.println("Enter the MP's height:");
		int height = sc.nextInt();
		System.out.println("Enter MP's weight:");
		int weight = sc.nextInt();
		System.out.println("Does the MP take bribes? True or false?:");
		boolean bribe_taker_ = sc.nextBoolean();
		
		Deputy deputy = new Deputy ( weight,  height, second_name, first_name,age,bribe_taker_);
		 
	    if (deputy.isBribe_taker()) {
	    	deputy.give_bribe();
	    }
	    
	    PartyArray.add(deputy);
	    System.out.println("Deputy " + deputy.toString() + " successfully added to faction");
	}
	
	public void removeDeputy() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the MP's secnond name:");
		String second_name = sc.next();
		System.out.println("Enter the MP's first name:");
		String first_name = sc.next();
		
		boolean Correct = isDeputyExists(PartyArray,second_name,first_name);
		
		if(Correct) {
			
			Iterator<Deputy> iterator = PartyArray.iterator();
			
			while (iterator.hasNext()) {
				
				Deputy nextDeputy = iterator.next();
				
				if(nextDeputy.getSecond_name().equalsIgnoreCase(second_name) && nextDeputy.getFirst_name().equalsIgnoreCase(first_name)) {
					iterator.remove();
					System.out.println("Deputy " + nextDeputy.toString() + " successfully removed from faction!");
				}
				
			}
			
		  }
		
		else {
			System.out.println("This deputy does not exist");
		}
		
	}
	
	public void getBribeTakers() {
		System.out.println("Deputies of the faction taking bribes:");
		for (Deputy deputy: PartyArray) {
			if(deputy.isBribe_taker()) {
				System.out.println(deputy.toString());
			}
		}
	}
	
	public void getLargestСorruptor() {
	 int bribeSize = 0;
	 int deputyIndex = -1;
	 
	 for(int i = 0; i <PartyArray.size(); i++) {
		 if (PartyArray.get(i).isBribe_taker()) {
			 if(PartyArray.get(i).getBribe_size()>bribeSize) {
				 bribeSize = PartyArray.get(i).getBribe_size();
				 deputyIndex = PartyArray.indexOf(PartyArray.get(i));
			 }
		 }
	 }
	 
	 if(deputyIndex >=0) {
		 System.out.println("Faction's Biggest Briber " + PartyArray.get(deputyIndex).toString());
	 }
	 
	 else {
		 System.out.println("There are no bribe takers in this party");
	 }
	 
	}
	
	public void getAllDeputies() {
		System.out.println("Members of this faction:");
		for(Deputy deputy : PartyArray) {
			System.out.println(deputy.toString());
		}
	}
	
	public void clearParty() {
		PartyArray.clear();
		System.out.println("All deputies have been successfully removed from the faction");
	}
	
	static boolean isDeputyExists(ArrayList<Deputy> PartyArray,String second_name,String first_name ) {
		boolean flag = false;
		
		for(Deputy deputy : PartyArray ) {
			if(deputy.getSecond_name().equalsIgnoreCase(second_name) && deputy.getFirst_name().equalsIgnoreCase(first_name)) {
				flag = true;
			}
		}
		return flag;
	}
	
	public String toString() {
    return "Faction \"" + PartyArray + "\"";
	}
	
	
}
