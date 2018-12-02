import java.util.ArrayList;
import java.util.List;

public class DisplayInfo {


    /**
     * Renseigne information
     *
     * @param nbInfo nombre d'information à afficher pour le palmares
     * @return affiche l'écran souhaité
     */
    public String recupInfo(int nbInfo, List<String> infoList, List<String> questionInfoList) {
        List<String> questionManager = new ArrayList<>();
        List<String> reponseClub = new ArrayList<>();
        //récupère les questions renseigné dans la class Manager
        questionManager.add(infoList.get(0));
        for (int i = 0; i < questionInfoList.size(); i++) {
            questionManager.add(questionInfoList.get(i));
        }
        reponseClub.add("****************");
        for (int i = 1; i < nbInfo; i++) {
            reponseClub.add(infoList.get(i));
        }

        return  this.incrementSentence(nbInfo, questionManager, reponseClub);
    }


    /**
     * incrémente info pour faire une phrase
     *
     * @param nbInfo     nbre d'info a afficher
     * @param askManager question, type country :
     * @param answerClub réponse question
     * @return phrase incrémenter
     */
    public String incrementSentence(int nbInfo, List<String> askManager, List<String> answerClub) {
        String sentece = "";

        for (int i = 0; i < nbInfo; i++) {
            if (i == 0) {
                sentece += answerClub.get(i) + "\n";
                sentece += askManager.get(i) + "\n";
                sentece += answerClub.get(i) + "\n";
            } else {
                sentece += askManager.get(i) + " :";
                sentece += answerClub.get(i) + "\n";
            }
        }
        return sentece;
    }


}





