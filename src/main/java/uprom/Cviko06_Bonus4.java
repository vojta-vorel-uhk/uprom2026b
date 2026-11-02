package uprom;

import java.util.Scanner;

public class Cviko06_Bonus4
{
    public static void main(String[] args)
    {
       int vek = 22;
       int vaha = 77;
       if((vek >= 18 && vaha > 50) || vek < 18){
           System.out.println("OK");
        } else {
            System.out.println("NOT OK");
        }
       // NEBO:
        if(vek >= 18 && vaha <= 50){
            System.out.println("NOT OK");
        } else {
            System.out.println("OK");
        }
    }
}
