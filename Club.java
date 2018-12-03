package com.souleyman.carriel.Model;

import java.util.ArrayList;
import java.util.List;

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

}
