import java.util.List;

public class Club {
    private String nameClub;
    //team
    private String nameTeam ;
    private String season;
    private String coach;
    private String assistant;
    private String captain;


    private List<String> goalKeepers;
    private List<String> midFielders;
    private List<String> Strickers;

    //real
    private String nameReal ;
    private String country;
    private String city;
    private int creation;
    private String stade;
    private int capaciteStade;
    private String couleurHome;
    private String couleurAway;
    private String president;
    //palmares
    private String namePalmares ;
    private String championsLeague ;
    private String championShips ;


    //méthode
    public void buildTeam(List<String> listTeam,String pUn, String pDeux) {
        String[] tabBuild = {pUn,pDeux};
        for(int i = 0; i < tabBuild.length;i++){
            listTeam.add(tabBuild[i]);
        }
    }



    //getter & setters


    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }
    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getAssistant() {
        return assistant;
    }

    public void setAssistant(String assistant) {
        this.assistant = assistant;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public String getNameReal() {
        return nameReal;
    }

    public void setNameReal(String nameReal) {
        this.nameReal = nameReal;
    }
    public String getNameClub() {
        return nameClub;
    }

    public void setNameClub(String nameClub) {
        this.nameClub = nameClub;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public String getStade() {
        return stade;
    }

    public void setStade(String stade) {
        this.stade = stade;
    }

    public int getCapaciteStade() {
        return capaciteStade;
    }

    public void setCapaciteStade(int capaciteStade) {
        this.capaciteStade = capaciteStade;
    }

    public String getCouleurHome() {
        return couleurHome;
    }

    public void setCouleurHome(String couleurHome) {
        this.couleurHome = couleurHome;
    }

    public String getCouleurAway() {
        return couleurAway;
    }

    public void setCouleurAway(String couleurAway) {
        this.couleurAway = couleurAway;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

    public String getNamePalmares() {
        return namePalmares;
    }

    public void setNamePalmares(String namePalmares) {
        this.namePalmares = namePalmares;
    }

    public String getChampionsLeague() {
        return championsLeague;
    }

    public void setChampionsLeague(String championsLeague) {
        this.championsLeague = championsLeague;
    }

    public String getChampionShips() {
        return championShips;
    }

    public void setChampionShips(String championShips) {
        this.championShips = championShips;
    }


}
