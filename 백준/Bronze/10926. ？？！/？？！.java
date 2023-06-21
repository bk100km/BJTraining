import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String a = scanner.next();
            System.out.println(a + "??!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}