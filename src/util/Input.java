package util;

import java.util.Scanner;

public class Input {

    private static final Scanner scanner = new Scanner(System.in);

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