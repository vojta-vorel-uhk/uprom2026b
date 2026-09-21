package uprom;
import java.util.Scanner;

public class Cviko01_Uloha01
{
    public static void main(String[] args)
    {
        // Uprav kód tak, aby vypsal součet tří čísel,
        // která uživatel zadá

        Scanner scanner = new Scanner(System.in);
        float x1 = scanner.nextFloat();
        float x2 = scanner.nextFloat();
        float x3 = scanner.nextFloat();

        System.out.println(x1 + x2 + x3);
    }
}
