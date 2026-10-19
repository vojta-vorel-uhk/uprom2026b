package uprom;

import java.util.Scanner;

public class Cviko04_Uloha05
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String s = scanner.nextLine();
            if( (s.length() == 11) && (s.charAt(6) == '/')){
                System.out.println("OK");
            }
        }
        //	Opakuj do nekonečna: přečíst řetězec (String) z konzole
        //  a vypsat "OK" pokud má 11 znaků a sedmým znakem je lomítko.

    }
}
