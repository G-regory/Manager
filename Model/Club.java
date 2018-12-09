package com.souleyman.carriel.Model;

public class Club {

    private String name;
    private String country;
    private String city;
    private int creation;
    private String couleurHome;
    private String couleurAway;
    private String president;
    private String Season;

    public String getSeason() {
        return Season;
    }

    public void setSeason(String season) {
        Season = season;
    }

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
