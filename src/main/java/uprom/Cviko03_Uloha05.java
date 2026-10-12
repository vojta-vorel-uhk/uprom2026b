package uprom;

import java.util.Scanner;

public class Cviko03_Uloha05
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int rok = scanner.nextInt();
        if(rok % 4 == 0) {
            if(rok % 100 == 0){
                if(rok % 400 == 0){
                    System.out.println("Je přestupný");
                }
                else {
                    System.out.println("Není přestupný");
                }
            }
            else {
                System.out.println("Je přestupný");
            }
        }
        else {
           System.out.println("Není přestupný");
        }
        // Vypiš, zda je zadaný rok přestupný
    }
}
