package module;

import java.util.Calendar;

public class Club {
	
    private String name;
    private String country;
    private String city;
    private int creation;
    private String stade;
    private int capaciteStade;
    private String couleurHome;
    private String couleurAway;
    private String president;
    
	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     public String geCountry() {
    	return "Country: "+country;
     }
     
     public void setCountry(String pCountry) {
    	 country=pCountry;
     }
     
     
    /**
	 * @return the city
	 */
	public String getCity() {
		return city;
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
	public int getCreation() {
		return creation;
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
		return stade;
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
	public int getCapaciteStade() {
		return capaciteStade;
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
		return couleurHome;
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
		return couleurAway;
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
		return president;
	}

	/**
	 * @param president the president to set
	 */
	public void setPresident(String president) {
		this.president = president;
	}
	
//	Année actuelle 
	Calendar calendar = Calendar.getInstance();
	
	public String showSaison() {
		return "season : "+calendar.get(Calendar.YEAR)+" - "+(calendar.get(Calendar.YEAR)+1) ;
	}
	public String toString(String equipe) {
		System.out.println("*********************************************\n"+name+"\n*********************************************\n"+showSaison());
	
		return ".";
	}

}
