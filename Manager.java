package com.souleyman.carriel;

import com.souleyman.carriel.Model.Club;
import com.souleyman.carriel.Model.Color;


public class Manager {


    public static void main(String[] args) {

        Color.Type couleurCLub = Color.Type.HOME;
        switch (couleurCLub){
            case HOME:
                System.out.println("White, White, White");
                break;
            case AWAY:
                System.out.println("Black, Black, Black");
            break;
            case THIRD:
                System.out.println("Red, Red, Red");
                break;
        }

        /***
         * 1. Construire un club
         ***/

        Club real = new Club();


        /***
         * 2. Afficher les info du club suivant le format ci-après
         ***/

        // *********************************************
        // Real Madrid
        // *********************************************
        // Country: Spain
        // City: Madrid
        // Creation: 1902
        // Stadium: Santiago Bernabeu
        // Stadium capacity: 81044
        // Home Colors: White, White, White
        // Away Colors: Black, Black, Black
        // President: Florentino Perez

        // *********************************************
        // Palmares
        // *********************************************
        // Champions League: 11
        // Championships: xx

        /***
         * 3. Afficher l'effectif du club
         * Se limiter à :
         * 1 coach
         * 3 goalKeepers
         * 3 strikers (attaquants)
         * 4 midfielders (milieux)
         ****/
        // *********************************************
        // Team
        // *********************************************
        // Season: 2017-2018
        // Head Coach: Zinedine Zidane
        // Assistant Coach: xxx
        // Captain: Cristiano Ronaldo
        // ---------------------------------------------
        // Goal Keepers:
        // ---------------------------------------------
        // 1. Keylor Navas
        // 2. Dani Carvajal
        // ...
        // ---------------------------------------------
        // Mid Fielders:
        // ---------------------------------------------
        // 1. Luka Modrić
        // 2. Toni Kroos
        // ...
        // ---------------------------------------------
        // Strikers:
        // ---------------------------------------------
        // 1. Cristiano Ronaldo
        // 2. Karim Benzema
        // ...


    }

}
