/**
 * Created by Miwa Guhrés
 * Date: 2020-10-21
 * Time: 15:07
 * Project: OOPJava_GitHubTest
 * Copyright: MIT
 */
public class Person {
    protected String personNr;
    protected String name;
    protected String date;

    Person(){}

    public Person(String personNr, String name, String date) {
        this.personNr = personNr;
        this.name = name;
        this.date = date;
    }

    public String getPersonNr() {
        return personNr;
    }


    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getMessage() {
        return String.format("%s är medlemmer.",getName());
    }
}

