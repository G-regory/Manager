package com.souleyman.carriel.Model.Effectif;

public class MidFielders extends Joueur{
    private static int count;
    private String position;


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        count++;
        return count+". "+ getName();
    }
}
