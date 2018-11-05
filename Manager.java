package module;

public class Manager {

	
	public static void main(String[] args) {
        /**
         * Construire une equipe avec :
         */
        // 1 coach
        // 3 goalKeepers
        // 3 strikers (attaquants)
        // 4 midfielders (milieux)
//		Equipe team = new Equipe(1, 3, 3, 4);

        Club real = new Club();

        real.setName("Real Madrid");
        real.setCountry("Spain");
        real.setCity("Madrid");
        real.setCreation(1902);
        real.setStade("Santiago Bernabeu");
        real.setCapaciteStade(81044);
        real.setCouleurHome("White, White, White");
        real.setCouleurAway("Black, Black, Black");
        real.setPresident("Florentino Perez");
        real.setChampionsLeague(11);
        real.setChampionShips("xx");
        
        
        
        /**
         * Afficher les info du club
         */
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
//        System.out.println(real.toString());
        real.showInfoClub();

        /**
         * Afficher le palmares du club
         */
        // *********************************************
        // Palmares
        // *********************************************
        // Champions League: 11
        // Championships: xx*
        real.showPalmares();

        /**
         * Afficher l'effectif
         */
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
        
//        System.out.println(real.toString(real));
//        team.showTeam();
		
	}
}
