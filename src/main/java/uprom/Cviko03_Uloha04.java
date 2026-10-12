package uprom;

import java.util.Scanner;

public class Cviko03_Uloha04
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uveďte daň z příjmu po slevách: ");
        double dan = scanner.nextDouble();

        // Doplň program tak, aby z daně po slevách odečetl ještě zvýhodnění na děti
        // Pokud vyjde záporné číslo, zachová se tato částka jako daňový bonus.
        // - 1. dítě: 1267 Kč měsíčně
        // - 2. dítě: 1.860 Kč měsíčně
        // - další dítě: 2.320 Kč měsíčně

        // Daňový bonus se upraví podle následujících pravidel:
        // - Daňový bonus vzniká jen pokud HM dosahuje alespoň poloviny minimální mzdy (minimální mzda je  20.800 Kč měsíčně)
        // - Hodnota měsíčního daňového bonusu musí převyšovat 100 Kč
        System.out.println("Počet dětí:");
        int deti = scanner.nextInt();
        if(deti == 1){
            dan = dan - 1267;
        }
        if(deti >= 2){
            dan = dan - 1267 - 1860 - (deti-2)*2320;
        }
        if((dan < 0) && (dan > -100)) {
            dan = 0;
        }
        System.out.println("Prosím, zaplaťte následující finální daň z příjmu: ");
        System.out.println(dan);
    }
}
