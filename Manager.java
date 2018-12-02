import java.util.ArrayList;
import java.util.List;


public class Manager {
    static DisplayInfo info = new DisplayInfo();

    public static void main(String[] args) {


        /**
         * Construire une equipe avec :
         */
        // 1 coach
        // 3 goalKeepers
        // 3 strikers (attaquants)
        // 4 midfielders (milieux)

        Manager greg = new Manager();
        Club real = new Club();
        greg.showPalmares(real);
        greg.showReal(real);
        greg.showTeam(real);


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

        /**
         * Afficher le palmares du club
         */
        // *********************************************
        // Palmares
        // *********************************************
        // Champions League: 11
        // Championships: xx*

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

    }

    public void showPalmares(Club pReal) {
        List<String> answerListInfo = new ArrayList<>();
        List<String> questionListInfo = new ArrayList<>();

        String tabQuestion[] = {"Champions League","Championships"};

        pReal.setNamePalmares("Palmares");
        pReal.setChampionsLeague("11");
        pReal.setChampionShips("xx");

        String tabReponse[] ={pReal.getNamePalmares(),pReal.getChampionsLeague(),pReal.getChampionShips()};

        this.incrementeTab(answerListInfo,questionListInfo,tabReponse,  tabQuestion);
    }

    public void showReal(Club pReal) {
        List<String> listInfo = new ArrayList<>();
        List<String> questionListInfo = new ArrayList<>();

        String tabQuestion[] = {"Country", "City", "Creation", "Stadium", "Stadium capacity", "Home Colors", "Away Colors", "President"};

        pReal.setNameReal("Real Madrid");
        pReal.setCountry("Spain");
        pReal.setCity("Madrid");
        pReal.setCreation(1902);
        pReal.setStade("Santiago Bernabeu");
        pReal.setCapaciteStade(81044);
        pReal.setCouleurHome("White, White, White");
        pReal.setCouleurAway("Black, Black, Black");
        pReal.setPresident("Florentino Perez");

        String tabReponse[] = {pReal.getNameReal(), pReal.getCountry(), pReal.getCity(),String.valueOf(pReal.getCreation()),pReal.getStade(),String.valueOf(pReal.getCapaciteStade()),pReal.getCouleurHome(),pReal.getCouleurAway(),pReal.getPresident()};

        this.incrementeTab(listInfo,questionListInfo,tabReponse,  tabQuestion);
    }

    public void showTeam(Club pReal) {
        List<String> answerListInfo = new ArrayList<>();
        List<String> questionListInfo = new ArrayList<>();

        String tabQuestion[] = {"Season","Head Coach","Assistant Coach","Captain",};

        pReal.setNameTeam("Team");
        pReal.setSeason("2017-2018");
        pReal.setCoach("Zinedine Zidane");
        pReal.setAssistant("xxx");
        pReal.setCaptain("Cristiano Ronaldo");


        String tabReponse[] ={pReal.getNameTeam(),pReal.getSeason(),pReal.getCoach(),pReal.getAssistant(),pReal.getCaptain()};

        this.incrementeTab(answerListInfo,questionListInfo,tabReponse,  tabQuestion);

       

    }

    public void incrementeTab(List<String>reponse, List<String>question, String [] tabAnswer,String []tabAsk  ){
        for (int i = 0; i < tabAnswer.length; i++) {
            reponse.add(tabAnswer[i]);
        }

        for (int i = 0; i < tabAsk.length; i++) {
            question.add(tabAsk[i]);
        }
        System.out.println(info.recupInfo(reponse.size(), reponse, question));

    }

    public void constructionEquipe(){
        String trait="---------------------------------------------";

    }
}
