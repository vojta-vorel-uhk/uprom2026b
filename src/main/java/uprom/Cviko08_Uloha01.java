package uprom;

import java.util.Scanner;

public class Cviko08_Uloha01
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej hmotnost (kg) a výšku (cm):");
        float bmiResult = bmi(scanner.nextFloat(), scanner.nextFloat());
        System.out.println("Vaše BMI je:");
        System.out.println(bmiResult);
    }

    //Doplň metodu na výpočet Body mass indexu
    public static float bmi(float hmotnostKg, float vyskaCm)
    {
        float vyskaM = vyskaCm / 100;
        return hmotnostKg / (vyskaM * vyskaM);
    }
}
