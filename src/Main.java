import entities.Bog;
import entities.Bruger;
import entities.Udlaan;
import lang.Dialog;
import lang.DialogDanish;
import lang.DialogEnglish;
import mappers.Facade;
import utils.Input;

import java.util.List;
import java.util.Scanner;

public class Main {

    private final Scanner scanner = new Scanner(System.in);
    private Dialog dialog;

    public static void main(String[] args) {
        System.out.println();
        System.out.println(" **********************************");
        System.out.println("  Brugerliste");
        System.out.println();
        List<Bruger> brugerList = Facade.getBrugerList();
        for (Bruger bruger : brugerList) {
            System.out.println(bruger);
        }

        System.out.println();
        System.out.println(" **********************************");
        System.out.println("  Bogliste");
        System.out.println();
        List<Bog> bogList = Facade.getBogList();
        for (Bog bog : bogList) {
            System.out.println(bog);
        }

        System.out.println();
        System.out.println(" **********************************");
        System.out.println("  Udlånliste");
        System.out.println();
        List<Udlaan> udlaanList = Facade.getUdlaanList();
        for (Udlaan udlaan : udlaanList) {
            System.out.println(udlaan);
        }

        Main main = new Main();
        main.run();
    }

    public void run() {
        while (true) {
            clearConsole();
            System.out.println(" **********************************");
            System.out.println("  Velkommen til Biblioteket");
            System.out.println();
            String choice = Input.getString("Vil du forlade programmet? (y/n): ");
            if (choice.equalsIgnoreCase("y")) {
                break;
            } else if (choice.equalsIgnoreCase("n")) {
                goToMainMenu();
            } else {
                System.out.println("Du skal indtaste y eller n");
                pressEnterToContinue();
            }
        }
    }

    // TODO: Nyt metode navn maybe?
    public void goToMainMenu() {
        while (true) {
            clearConsole();
            System.out.println(" **********************************");
            System.out.println("  Hovedmenu");
            System.out.println();
            System.out.println("Vælg en af følgende muligheder:");
            System.out.println("  0) Afslut programmet");
            System.out.println("  1) Brugerrelaterede funktioner");
            System.out.println("  2) Bogrelaterede funktioner");
            System.out.println("  3) Udlånsrelaterede funktioner");
            System.out.println("  4) Forfatterrelaterede funktioner");
            System.out.println("  5) Postnummerrelaterede funktioner");
            System.out.println("  6) Skift sprog");
            System.out.println();
            int choice = Input.getInt("Indtast dit valg: ");
            switch (choice) {
                case 0 -> {
                    return;
                }
                case 1 -> goToBrugerMenu();
                case 2 -> goToBogMenu();
                case 3 -> goToUdlaanMenu();
                case 4 -> goToForfatterMenu();
                case 5 -> goToPostnummerMenu();
                case 6 -> goToSprogMenu();
                default -> {
                    System.out.println("Du skal indtaste et tal mellem 0 og 6");
                    pressEnterToContinue();
                }
            }
        }
    }

    private void goToBrugerMenu() {
        while (true) {
            clearConsole();
            System.out.println(" **********************************");
            System.out.println("  Brugermenu");
            System.out.println();
            System.out.println("Vælg en af følgende muligheder:");
            System.out.println("  0) Tilbage til hovedmenu");
            System.out.println("  1) Opret bruger");
            System.out.println("  2) Se alle brugere");
            System.out.println("  3) Se bruger ud fra information");
            System.out.println();
            int choice = Input.getInt("Indtast dit valg: ");
            switch (choice) {
                case 0 -> {
                    return;
                }
                case 1 -> {
                    System.out.println("Opret bruger");
                    pressEnterToContinue();
                }
                case 2 -> {
                    System.out.println("Se alle brugere");
                    pressEnterToContinue();
                }
                case 3 -> {
                    System.out.println("Se bruger ud fra information");
                    pressEnterToContinue();
                }
                default -> {
                    System.out.println("Du skal indtaste et tal mellem 0 og 3");
                    pressEnterToContinue();
                }
            }
        }
    }

    private void goToBogMenu() {
        while (true) {
            clearConsole();
            System.out.println(" **********************************");
            System.out.println("  Bogmenu");
            System.out.println();
            System.out.println("Vælg en af følgende muligheder:");
            System.out.println("  0) Tilbage til hovedmenu");
            System.out.println("  1) Opret bog");
            System.out.println("  2) Se alle bøger");
            System.out.println("  3) Se bog ud fra information");
            System.out.println();
            int choice = Input.getInt("Indtast dit valg: ");
            switch (choice) {
                case 0 -> {
                    return;
                }
                case 1 -> {
                    System.out.println("Opret bog");
                    pressEnterToContinue();
                }
                case 2 -> {
                    System.out.println("Se alle bøger");
                    pressEnterToContinue();
                }
                case 3 -> {
                    System.out.println("Se bog ud fra information");
                    pressEnterToContinue();
                }
                default -> {
                    System.out.println("Du skal indtaste et tal mellem 0 og 3");
                    pressEnterToContinue();
                }
            }
        }
    }

    private void goToUdlaanMenu() {
        while (true) {
            clearConsole();
            System.out.println(" **********************************");
            System.out.println("  Udlånsmenu");
            System.out.println();
            System.out.println("Vælg en af følgende muligheder:");
            System.out.println("  0) Tilbage til hovedmenu");
            System.out.println("  1) Opret udlån");
            System.out.println("  2) Se alle udlån");
            System.out.println("  3) Se udlån ud fra information");
            System.out.println();
            int choice = Input.getInt("Indtast dit valg: ");
            switch (choice) {
                case 0 -> {
                    return;
                }
                case 1 -> {
                    System.out.println("Opret udlån");
                    pressEnterToContinue();
                }
                case 2 -> {
                    System.out.println("Se alle udlån");
                    pressEnterToContinue();
                }
                case 3 -> {
                    System.out.println("Se udlån ud fra information");
                    pressEnterToContinue();
                }
                default -> {
                    System.out.println("Du skal indtaste et tal mellem 0 og 3");
                    pressEnterToContinue();
                }
            }
        }
    }

    private void goToForfatterMenu() {
        while (true) {
            clearConsole();
            System.out.println(" **********************************");
            System.out.println("  Forfattermenu");
            System.out.println();
            System.out.println("Vælg en af følgende muligheder:");
            System.out.println("  0) Tilbage til hovedmenu");
            System.out.println("  1) Opret forfatter");
            System.out.println("  2) Se alle forfattere");
            System.out.println("  3) Se forfatter ud fra information");
            System.out.println();
            int choice = Input.getInt("Indtast dit valg: ");
            switch (choice) {
                case 0 -> {
                    return;
                }
                case 1 -> {
                    System.out.println("Opret forfatter");
                    pressEnterToContinue();
                }
                case 2 -> {
                    System.out.println("Se alle forfattere");
                    pressEnterToContinue();
                }
                case 3 -> {
                    System.out.println("Se forfatter ud fra information");
                    pressEnterToContinue();
                }
                default -> {
                    System.out.println("Du skal indtaste et tal mellem 0 og 3");
                    pressEnterToContinue();
                }
            }
        }
    }

    private void goToPostnummerMenu() {
        while (true) {
            clearConsole();
            System.out.println(" **********************************");
            System.out.println("  Postnummermenu");
            System.out.println();
            System.out.println("Vælg en af følgende muligheder:");
            System.out.println("  0) Tilbage til hovedmenu");
            System.out.println("  1) Opret postnummer");
            System.out.println("  2) Se alle postnumre");
            System.out.println("  3) Se postnummer ud fra information");
            System.out.println();
            int choice = Input.getInt("Indtast dit valg: ");
            switch (choice) {
                case 0 -> {
                    return;
                }
                case 1 -> {
                    System.out.println("Opret postnummer");
                    pressEnterToContinue();
                }
                case 2 -> {
                    System.out.println("Se alle postnumre");
                    pressEnterToContinue();
                }
                case 3 -> {
                    System.out.println("Se postnummer ud fra information");
                    pressEnterToContinue();
                }
                default -> {
                    System.out.println("Du skal indtaste et tal mellem 0 og 3");
                    pressEnterToContinue();
                }
            }
        }
    }

    private void goToSprogMenu() {
        while (true) {
            clearConsole();
            System.out.println(" **********************************");
            System.out.println("  Nuværende sprog: " + dialog.getClass().getSimpleName());
            System.out.println();
            System.out.println("Vælg et sprog:");
            System.out.println("  0) Tilbage til hovedmenu");
            System.out.println("  1) Dansk");
            System.out.println("  2) Engelsk");
            System.out.println();
            int choice = Input.getInt("Indtast dit valg: ");
            switch (choice) {
                case 0 -> {
                    return;
                }
                case 1 -> {
                    dialog = new DialogDanish();
                    System.out.println("Sproget er nu sat til dansk");
                    pressEnterToContinue();
                }
                case 2 -> {
                    dialog = new DialogEnglish();
                    System.out.println("Sproget er nu sat til engelsk");
                    pressEnterToContinue();
                }
                default -> {
                    System.out.println("Du skal indtaste et tal mellem 1 og 2");
                    pressEnterToContinue();
                }
            }
        }
    }

    private void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public void pressEnterToContinue() {
        System.out.println("Tryk ENTER for at fortsætte");
        scanner.nextLine();
    }
}