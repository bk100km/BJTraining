import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            double a = Integer.parseInt(scanner.next());
            double b = Integer.parseInt(scanner.next());
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}