package uprom;

import java.util.Scanner;

public class Cviko09_Uloha06
{
    public static void main(String[] args)
    {
        double[] correctValues = {5.77, 98.596, 87.8, 8.05, 7.882, 70.15};
        double tolerance = 0.001;
        Scanner scanner = new Scanner(System.in);
        double guess = scanner.nextDouble();
        System.out.println(isHit(correctValues,tolerance,guess));
    }

    public static boolean isHit(
            double[] values,
            double tolerance,
            double guess ){
        for(int i=0; i<values.length; i++){
            double min = values[i] - tolerance;
            double max = values[i] + tolerance;
            if(guess >= min && guess <= max){
                return true;
            }
        }
        return false;
    }

    public static boolean isHit2(
            double[] values,
            double tolerance,
            double guess ){
        for(int i=0; i<values.length; i++){
            double diff = guess - values[i];
            if(diff < tolerance && diff > -tolerance){
                return true;
            }
        }
        return false;
    }

    public static boolean isHit3(
            double[] values,
            double tolerance,
            double guess ){
        for(int i=0; i<values.length; i++){
            if(Math.abs(guess - values[i]) <= tolerance){
                return true;
            }
        }
        return false;
    }
    // TODO 1:
    //  Doplň metodu isHit, která zjistí, zda se uživatel trefil do některé
    //  správné hodnoty (s danou maximální odchylkou)
}
