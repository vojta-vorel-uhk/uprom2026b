package uprom;

import java.io.IOException;
import java.util.Scanner;

public class Cviko04_Uloha09
{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej nižší číslo:");
        int low = scanner.nextInt();
        System.out.println("Zadej vyší číslo:");
        int high = scanner.nextInt();

        // Doplň kód, který zkontroluje že nižší číslo je nižší
        // Pokud není, tak hodnoty opraví tím, že prohodí obsah obou proměnných

        System.out.println("Hodnoty po opravě:");
        System.out.println("Nižší číslo: "+low);
        System.out.println("Vyšší číslo: "+high);
    }
}
