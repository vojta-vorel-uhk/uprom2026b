package uprom;

import java.util.Scanner;

public class Cviko05_Uloha04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String s;
        do {
            s = scanner.nextLine();
            System.out.println(s.length());
        } while (!s.equals("KONEC"));

        System.out.println("Program běží dál");
        //	Opakuj do nekonečna: přečíst řetězec (String) z konzole
        //  a vypsat na konzoli délku tohoto řetězce.
        //  Pokud bylo zadáno "KONEC", ukončit program.
        //  Zvolte způsob bez použití "break"
    }
}
