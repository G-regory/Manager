import java.util.ArrayList;
import java.util.List;

public class DisplayInfo {

    Club real = new Club();

    private List<String> questionManager = new ArrayList<>();
    private List<String> reponseClub = new ArrayList<>();
    
    /**
     * Affiche le palmares du club
     */
    public String palmares(int nbInfoPalmares, Club real) {
        String displayPalmares,championsLeague="Champions League",championsShips="Championships" ;

        questionManager.add(real.getNamePalmares());
        questionManager.add(championsLeague);
        questionManager.add(championsShips);
        reponseClub.add("****************");
        reponseClub.add(real.getChampionsLeague());
        reponseClub.add(real.getChampionShips());

       return displayPalmares=this.displaySentence(nbInfoPalmares,questionManager,reponseClub);
    }


    public String displaySentence(int nbInfo,List<String> askManager, List<String> answerClub ){
        String displayPalmares = "";

        for (int i = 0; i <= nbInfo; i++) {
            if (i == 0) {
                displayPalmares += answerClub.get(i) + "\n";
                displayPalmares += askManager.get(i) + "\n";
                displayPalmares += answerClub.get(i) + "\n";
            } else {
                displayPalmares += askManager.get(i)+" :";
                displayPalmares += answerClub.get(i) + "\n";
            }
        }
        return displayPalmares;
    }
}





