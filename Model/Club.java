package com.souleyman.carriel.Model;

public class Club {

    private String name;
    private String country;
    private String city;
    private int creation;
    private String president;
    private String season;
    private String colorJerseyHome;
    private String colorShortsHome;
    private String colorSocksHome;
    private String colorJerseyAway;
    private String colorShortsAway;
    private String colorSocksAway;
    private String colorJerseyThird;
    private String colorShortsThird;
    private String colorSocksThird;

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
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

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }

}
