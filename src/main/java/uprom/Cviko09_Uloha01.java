package uprom;

import java.util.Scanner;

public class Cviko09_Uloha01
{
    public static void main(String[] args)
    {
        System.out.println("Zadej deset hodnot:");
        //TODO 1: Načtěte z konzole deset celých čísel
        Scanner scanner = new Scanner(System.in);

        int[] pole = new int[10];
        for (int i=0; i<pole.length; i++){
            pole[i] = scanner.nextInt();
        }
        System.out.println("Vaše hodnoty jsou:");
        for (int i=0; i<pole.length; i++){
            System.out.println(pole[i]);
        }
        //TODO 2: Vypiš čísla ve stejném pořadí
    }
}
