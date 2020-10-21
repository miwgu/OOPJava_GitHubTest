import java.io.*;
import java.time.LocalDate;

/**
 * Created by Miwa Guhrés
 * Date: 2020-10-21
 * Time: 15:08
 * Project: OOPJava_GitHubTest
 * Copyright: MIT
 */
public class Output {

    public static void createFile(String memberName,String memberPersonNr)  {
        //"src\\sprint2\\inlämningar\\uppgift2\\try2_BufferedReader\\Training.text"
        String outFile = "src\\sprint2\\inlämningar\\uppgift2\\try2_BufferedReader\\" +
                memberPersonNr+".txt";

        try (PrintWriter ut = new PrintWriter(new BufferedWriter(new FileWriter(outFile, true)))) {

            ut.println(memberPersonNr+","+memberName+","+ LocalDate.now());
            System.out.println("Filen har skapats");
        }catch (FileNotFoundException e){
            System.out.println("Filen kunde inte hittas");
            e.printStackTrace();
            System.exit(0);
        } catch (IOException e) {
            System.out.println("Fel!: " + e.getMessage());
            e.printStackTrace();
            System.exit(0);
        }catch (Exception e){
            System.out.println("Något gick fel");
            e.printStackTrace();
            System.exit(0);
        }

    }

}
