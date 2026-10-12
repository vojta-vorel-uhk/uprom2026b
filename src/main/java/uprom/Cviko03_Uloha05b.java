package uprom;

import java.util.Scanner;

public class Cviko03_Uloha05b
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int rok = scanner.nextInt();
        if(rok % 4 != 0){
            System.out.println("Není přestupný");
            return;
        }
        if(rok % 100 != 0){
            System.out.println("Je přestupný");
            return;
        }
        if(rok % 400 != 0){
            System.out.println("Není přestupný");
            return;
        }
        System.out.println("Je přestupný");
        // Vypiš, zda je zadaný rok přestupný
    }
}
