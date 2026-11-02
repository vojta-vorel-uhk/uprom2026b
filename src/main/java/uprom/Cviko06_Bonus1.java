package uprom;

import java.util.Scanner;

public class Cviko06_Bonus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();

        // Psaní rukou:
        if (s1.length() < s2.length() && s1.length() < s3.length()) {
            System.out.println(s1);
        } else {
            if (s2.length() < s3.length()) {
                System.out.println(s2);
            } else {
                System.out.println(s3);
            }
        }

    }
}
