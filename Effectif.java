package com.souleyman.carriel.Model;

import java.util.ArrayList;
import java.util.List;

public class Effectif {
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
