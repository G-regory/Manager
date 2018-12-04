package com.souleyman.carriel.Model.Effectif;

public class Captain extends Joueur{

    private String position;
    private boolean estCaptain;


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isEstCaptain() {
        return estCaptain;
    }

    public void setEstCaptain(boolean estCaptain) {
        this.estCaptain = estCaptain;
    }
    @Override
    public String
    toString() {
        return "Captain: " +
                getName();
    }
}
