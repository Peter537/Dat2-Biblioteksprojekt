import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String name = getString("Hvad hedder du?: ");
        System.out.println("Hej " + name);
    }

    public static String getString(String s) {
        System.out.print(s);
        return scanner.nextLine();
    }
}