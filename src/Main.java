import database.ConnectionConfiguration;
import entities.Bruger;
import mapper.BrugerMapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

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

    public static String getString(String s) {
        System.out.print(s);
        return scanner.nextLine();
    }

    public static int getInt(String s) {
        int res;
        while (true) {
            try {
                res = Integer.parseInt(getString(s));
                return res;
            } catch (NumberFormatException e) {
                System.out.println("Du skal indtaste et tal");
            }
        }
    }
}