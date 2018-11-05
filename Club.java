package module;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Club {

//	Création d'un calendar 
	static Calendar calendar = Calendar.getInstance();

	// initialisation des Etats du Club
	private String nameClub;
	private String country;
	private String city;
	private int creation;
	private String stade;
	private int capaciteStade;
	private String couleurHome;
	private String couleurAway;
	private String president;

	//initialisation des Etats palmares
	private String namePalmares="Palmares";
	private int championsLeague;
	private String championShips;
	
	//// initialisation des Etats de l'Equipe

	// Affiche l'année de la saison actuelle
	private String showSaison() {
		return "season : " + calendar.get(Calendar.YEAR) + " - " + (calendar.get(Calendar.YEAR) + 1);
	}

	// affiche les étoiles avec le titre à mettre en paramètre
	private void etoileTitre(String titre) {
		System.out.println("*********************************************\n" + titre
				+ "\n*********************************************");
	}
	
	//Boucle qui parcours les lists renseigné en paramètre
	private void parcoursList(List<String>list) {
		for(String val: list) {
			System.out.println(val);
		}
		System.out.println();
	}

	// Création d'une liste avec info Club
	private List<String> creationClub() {
		List<String> listInfoClub = new ArrayList<>();
		listInfoClub.add(getCountry());
		listInfoClub.add(getCity());
		listInfoClub.add(getCreation());
		listInfoClub.add(getStade());
		listInfoClub.add(getCapaciteStade());
		listInfoClub.add(getCouleurHome());
		listInfoClub.add(getCouleurAway());
		listInfoClub.add(getPresident());

		return listInfoClub;
	}

	//Affiche les information sur le club
	public void showInfoClub() {
		List<String> afficheClub = creationClub();
		System.out.println("Info sur le Club ");
		etoileTitre(nameClub);

		parcoursList(afficheClub);
	}
	
	//Création List palmares CLub
	private List<String> listPalmares(){
		List<String> listInfoPalmares = new ArrayList<>();
		listInfoPalmares.add(getChampionsLeague());
		listInfoPalmares.add(getChampionShips());
		
		return listInfoPalmares;
	}
	
	//affiche le palmares du club
	public void showPalmares() {
		List<String> affichePalmares = listPalmares();
		System.out.println("Info sur le palmares du club");
		etoileTitre(namePalmares);
		
		parcoursList(affichePalmares);
	}
	
	//Affiche l'année actuelle
	public void showTeam() {
		System.out.println("season : " + calendar.get(Calendar.YEAR) + " - " + (calendar.get(Calendar.YEAR) + 1));
	}

	// ******************SETTER & GETTER************************************

	public String getName() {
		return nameClub;
	}

	public void setName(String name) {
		nameClub = name;
	}

	public String getCountry() {
		return "Country: " + country;
	}

	public void setCountry(String pCountry) {
		country = pCountry;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return "city :" + city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the creation
	 */
	public String getCreation() {
		return "creation :" + creation;
	}

	/**
	 * @param creation the creation to set
	 */
	public void setCreation(int creation) {
		this.creation = creation;
	}

	/**
	 * @return the stade
	 */
	public String getStade() {
		return "stade :" + stade;
	}

	/**
	 * @param stade the stade to set
	 */
	public void setStade(String stade) {
		this.stade = stade;
	}

	/**
	 * @return the capaciteStade
	 */
	public String getCapaciteStade() {
		return "Capacite Stade :" + capaciteStade;
	}

	/**
	 * @param capaciteStade the capaciteStade to set
	 */
	public void setCapaciteStade(int capaciteStade) {
		this.capaciteStade = capaciteStade;
	}

	/**
	 * @return the couleurHome
	 */
	public String getCouleurHome() {
		return "Couleur Home :" + couleurHome;
	}

	/**
	 * @param couleurHome the couleurHome to set
	 */
	public void setCouleurHome(String couleurHome) {
		this.couleurHome = couleurHome;
	}

	/**
	 * @return the couleurAway
	 */
	public String getCouleurAway() {
		return "Couleur Away :" + couleurAway;
	}

	/**
	 * @param couleurAway the couleurAway to set
	 */
	public void setCouleurAway(String couleurAway) {
		this.couleurAway = couleurAway;
	}

	/**
	 * @return the president
	 */
	public String getPresident() {
		return "President :" + president;
	}

	/**
	 * @param president the president to set
	 */
	public void setPresident(String president) {
		this.president = president;
	}

	/**
	 * 
	 * @param Champions League to set
	 */
	public void setChampionsLeague(int pChampionsLeague) {
		championsLeague=pChampionsLeague;
	}
	
	/**
	 * 
	 * @return Champions League 
	 */
	public String getChampionsLeague() {
		return "Champions League :"+championsLeague;
	}
	
	/**
	 * 
	 * @param Champion Ships to set
	 */
	public void setChampionShips(String pChampionShips) {
		championShips=pChampionShips;
	}
	
	public String getChampionShips() {
		return "Champion Ships :"+championShips;
	}

	// ******************Fin SETTER & GETTER************************************

}
