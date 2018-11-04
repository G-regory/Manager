package module;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class Equipe {
	String coach;
	String captain;
	String nomClub= "Real Madrid";
	protected Equipe() {
		coach = "xxx";
		List<String> goalKeepers = new ArrayList();
		List<String> midFielders = new ArrayList();
		List<String> strikers = new ArrayList();
	}
	
	protected Equipe(int nCoach, int nGoalKeepers, int nMidFielders, int nStrikers) {
		int coach=nCoach;
		int goalKeepers= nGoalKeepers;
		int midFielders= nMidFielders;
		int strikers= nStrikers;
		
	}
	
//	Année actuelle 
	Calendar calendar = Calendar.getInstance();

	//affiche les personnes principales de l'équipe
	public void getPrincipalPersonne() {
		System.out.println("Head Coach: "+ coach);
		System.out.println("Assistant Coach: David Bettoni");
		System.out.println("Captain: "+captain);
	}
	
	public void getGoalKeeper() {
		
	}
	
	public String toString() {
		System.out.println("*********************************************\n"+nomClub+"\n*********************************************");
		System.out.println();
		return nomClub;
	}
	
//	private 
	public void showTeam() {
		System.out.println("season : "+calendar.get(Calendar.YEAR)+" - "+(calendar.get(Calendar.YEAR)+1) );
//		System.out.printf("%s\n"this.getPrincipalPersonne());
	}

}
