package uprom;

import java.util.Scanner;

public class Cviko01_Uloha02
{
    public static void main(String[] args)
    {
        // Doplň kód podle zadaného pseudokódu
        Scanner scanner = new Scanner(System.in);
        float sum = 0;
        int count = 0;
        float newValue = 0;
        float result = 0;
        System.out.println("Zadej čísla. Ukonči zadáním nuly.");
        while(true) {
            newValue = scanner.nextFloat();
            if(newValue == 0)
            {
                break;
            }
            sum = sum + newValue;
            count = count + 1;
        }
        result = sum / count;
        System.out.println("Výsledek je:");
        System.out.println(result);
    }
}
