package com.souleyman.carriel.Model.Effectif;

public class GoalKeepers extends Joueur{

    private String position;
    private boolean titulaire;

    public boolean isTitulaire() {
        return titulaire;
    }

    public void setTitulaire(boolean titulaire) {
        this.titulaire = titulaire;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
