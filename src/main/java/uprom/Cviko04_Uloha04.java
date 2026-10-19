package uprom;

import java.util.Scanner;

public class Cviko04_Uloha04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String s = scanner.nextLine();
            System.out.println(s.length());
            if( s.equals("KONEC") ){
                break;
            }
        }
        System.out.println("Program běží dál");
        //	Opakuj do nekonečna: přečíst řetězec (String) z konzole
        //  a vypsat na konzoli délku tohoto řetězce.
        //  Pokud bylo zadáno "KONEC", ukončit program
    }
}
