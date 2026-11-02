package uprom;

import java.util.Scanner;

public class Cviko06_Bonus2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Psaní rukou:
        int h = scanner.nextInt();
        int m = 1;
        while (m * m <= h) {
            m = m + 1;
        }
        System.out.println(m);
    }
}
