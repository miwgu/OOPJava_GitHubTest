import java.util.List;
import java.util.Scanner;

/**
 * Created by Miwa Guhrés
 * Date: 2020-10-21
 * Time: 15:08
 * Project: OOPJava_GitHubTest
 * Copyright: MIT
 */
public class Main {

    public Main() {
        Person person = new Person();
        String filePath = "src\\" + "customers.txt";
        //String outFile = "src\\sprint2\\inlämningar\\uppgift2\\try2_BufferedReader\\" +
        //        "Training.text";

        List<Person> personList = Database.readDataFromFile(filePath);
        List<Person> onlyMembersPersons = Logic.getAllMembersPersons(personList);


        Scanner sc = new Scanner(System.in);
        System.out.println("Söka med personnummer-->1 eller namn-->2\nAnge nummer 1 eller 2");
        int nummer = sc.nextInt();

        //---Swich---
        boolean exist;
        switch (nummer) {
            case 1:
                System.out.println("Ange personnummer");
                //String s1 = JOptionPane.showInputDialog("Ange personnummer");
                sc = new Scanner(System.in);
                String searchPersonNr = sc.next();

                for (Person p : onlyMembersPersons) {
                    if (p.getPersonNr().equalsIgnoreCase(searchPersonNr)) {
                        System.out.println(p.getMessage());
                        Output.createFile(p.getName(),p.getPersonNr());
                        exist=true;
                        break;
                    }else
                        exist=false;
                }
                if(exist=false)
                    System.out.println(person.getMessage2());// Det måste bara boolean...null eller det finnas
                    System.out.println(person.getName());//----I changed same rad as B
                break;
            case 2:
                System.out.println("Ange namn (Förnamn Eftername)");
                // String s2 = JOptionPane.showInputDialog("Ange namn");
                sc = new Scanner(System.in);
                String searchName = sc.nextLine();

                for (Person p : onlyMembersPersons) {
                    if (p.getName().equalsIgnoreCase(searchName)) {
                        p.getMessage();
                        Output.createFile(p.getName(),p.getPersonNr());
                        exist=true;
                        break;
                    }else
                        exist=false;
                }
                if(exist=false)
                    System.out.println("Det finns inte namn: " + searchName + " som meddlem.");
                break;
        }
    }
    public static void main (String[]args){
        Main main = new Main();

    }
}
