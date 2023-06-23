import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int a = Integer.parseInt(scanner.next());
            int b = Integer.parseInt(scanner.next());
            int c = Integer.parseInt(scanner.next());
            System.out.println(((a + b) % c));
            System.out.println((((a % c) + (b % c)) % c));
            System.out.println(((a * b) % c));
            System.out.println((((a % c) * (b % c)) % c));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}