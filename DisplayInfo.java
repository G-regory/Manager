import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.StandardOpenOption.APPEND;

public class DisplayInfo {

    Path managePath = Paths.get("manage.csv");





    public void palmares() {
        int nbInfoPalmares = 2;
        List<String> titrePalmares = new ArrayList<>();
        String []tabPalmares = new String [titrePalmares.size()];
        List<String> reponsePalmares = new ArrayList<>();
        reponsePalmares.add(": 11");
        reponsePalmares.add(": xx");
//        for(int i = 0;i < nbInfoPalmares;i++ ){
        try {
            Files.write(managePath, "Palmares,Champions League,Championships\n".getBytes(), APPEND);
        } catch (IOException e) {
            System.out.println("petit problème désolé pour écrire sur le fichier");
        }

        try{
            List<String> list = Files.readAllLines(managePath);
            titrePalmares=list;
        }catch(IOException e){
            System.out.println("Fichier indisponible");
        }

        tabPalmares = titrePalmares.get(1).split(",");
        for(int i = 0 ; i < tabPalmares.length;i++){
            if(tabPalmares[i].contains("Leag")){
                System.out.println(tabPalmares[i]+reponsePalmares.get(i-1));
            }else if(tabPalmares[i].contains("ships")){
                System.out.println(tabPalmares[i]+reponsePalmares.get(i-1));
            }else {
                System.out.println(tabPalmares[i]);
            }
        }

    }


    }





