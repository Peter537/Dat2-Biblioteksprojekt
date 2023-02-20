import entities.Bruger;
import mapper.BrugerMapper;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        String name = getString("Hvad hedder du?: ");
        System.out.println("Hej " + name);
        int age = getInt("Hvor gammel er du?: ");
        System.out.println("Du er " + age + " år gammel");
        */
        /*
        while (true) {
            String valg = getString("Hvad vil du gøre?: ");
            switch (valg) {
                case "lån" -> System.out.println("Du ønsker at låne en bog");
                case "stop" -> {
                    System.out.println("Programmet stopper");
                    return;
                }
            }
        }
         */

        List<Bruger> brugerList = BrugerMapper.getBrugerList();

        for (Bruger bruger : brugerList) {
            System.out.println(bruger);
        }
    }
}