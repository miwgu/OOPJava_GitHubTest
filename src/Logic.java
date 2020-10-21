import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Miwa Guhrés
 * Date: 2020-10-21
 * Time: 15:07
 * Project: OOPJava_GitHubTest
 * Copyright: MIT
 */


public class Logic {
    public static List<Person> getAllMembersPersons(List<Person> allPersons) {

        List<Person> onlyMembersPersons = new ArrayList<>();
        for (Person p : allPersons) {
            LocalDate date_anuallFee = LocalDate.parse(p.getDate());
            LocalDate today = LocalDate.now();
            var diff = ChronoUnit.DAYS.between(date_anuallFee, today);
            if (diff< 365) {
                onlyMembersPersons.add(p);
            }
        }
        return onlyMembersPersons;
    }
}

