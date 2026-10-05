package uprom;

import java.util.Scanner;

// TODO: Zkopíruj z prezentace kód na výpočet kořenů kvadratické rovnice
// Je potřeba přidat scanner:
// Scanner input = new Scanner(System.in);
public class Cviko02_Uloha01
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a; double b; double c;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        if (a == 0) {
            System.out.println("Není kvadratická rovnice");
        } else {
            double d;
            d = b * b - 4 * a * c;
            if (d < 0) {
                System.out.println("Nemá reálné řešení");
            } else {
                double x1; double x2;
                x1 = (-b - Math.sqrt(d)) / (2 * a);
                x2 = (-b + Math.sqrt(d)) / (2 * a);
                System.out.println(x1 + ", " + x2);
            }
        }
    }
}
