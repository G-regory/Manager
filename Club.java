package com.souleyman.carriel.Model;

import java.util.ArrayList;
import java.util.List;

public class Club {
    

    //info Club
    private String name;
    private String country;
    private String city;
    private int creation;
    private String stade;
    private int capaciteStade;
    private String couleurHome;
    private String couleurAway;
    private String president;
    
    //info palmares
    private int championsLeague;
    private String championShips;
    
    //info effectif
    private int season;
    private String headCoach;
    private String assistanceCoach;
    private String captain;
    private int nbGoalKeepers;
    private int nbMidFielders;
    private int nbStrickers;
    private List<String> goalKeepers= new ArrayList<>();
    private List<String> midFielders= new ArrayList<>();
    private List<String> strickers= new ArrayList<>();
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getChampionsLeague() {
        return championsLeague;
    }

    public void setChampionsLeague(int championsLeague) {
        this.championsLeague = championsLeague;
    }

    public String getChampionShips() {
        return championShips;
    }

    public void setChampionShips(String championShips) {
        this.championShips = championShips;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public String getHeadCoach() {
        return headCoach;
    }

    public void setHeadCoach(String headCoach) {
        this.headCoach = headCoach;
    }

    public String getAssistanceCoach() {
        return assistanceCoach;
    }

    public void setAssistanceCoach(String assistanceCoach) {
        this.assistanceCoach = assistanceCoach;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public int getNbGoalKeepers() {
        return nbGoalKeepers;
    }

    public void setNbGoalKeepers(int nbGoalKeepers) {
        this.nbGoalKeepers = nbGoalKeepers;
    }

    public int getNbMidFielders() {
        return nbMidFielders;
    }

    public void setNbMidFielders(int nbMidFielders) {
        this.nbMidFielders = nbMidFielders;
    }

    public int getNbStrickers() {
        return nbStrickers;
    }

    public void setNbStrickers(int nbStrickers) {
        this.nbStrickers = nbStrickers;
    }

    public List<String> getGoalKeepers() {
        return goalKeepers;
    }

    public void setGoalKeepers(List<String> goalKeepers) {
        this.goalKeepers = goalKeepers;
    }

    public List<String> getMidFielders() {
        return midFielders;
    }

    public void setMidFielders(List<String> midFielders) {
        this.midFielders = midFielders;
    }

    public List<String> getStrickers() {
        return strickers;
    }

    public void setStrickers(List<String> strickers) {
        this.strickers = strickers;
    }




}
