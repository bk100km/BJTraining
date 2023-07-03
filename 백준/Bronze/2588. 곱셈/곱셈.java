import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String a = scanner.next();
            String b = scanner.next();
            int len = b.length();
            System.out.println(Integer.parseInt(a) * Integer.parseInt(b.substring(len-1)));
            System.out.println(Integer.parseInt(a) * Integer.parseInt(b.substring(len-2, len-1)));
            System.out.println(Integer.parseInt(a) * Integer.parseInt(b.substring(len-3, len-2)));
            System.out.println(Integer.parseInt(a) * Integer.parseInt(b));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}