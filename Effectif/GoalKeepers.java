package com.souleyman.carriel.Model.Effectif;

public class GoalKeepers extends Joueur{
    private static int count;
    public GoalKeepers(){

    }
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

    @Override
    public String toString() {
        count++;
        return count+". "+ getName();
    }
}
