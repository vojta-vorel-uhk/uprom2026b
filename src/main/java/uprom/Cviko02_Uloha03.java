package uprom;

// TODO: Proč se nevypisuje správně 0 ani 0.3?
public class Cviko02_Uloha03
{
    public static void main(String[] args)
    {
        float d = 3;
        float t = 1 / d;
        float u = t * t * t * t * t * t * t * t * t * t * t * t * t * t * t * t * 43046721;
        float z = (u - 1) * 1000000;
        System.out.println("Výsledek: " + z);

        double a = 0.1;
        double b = 0.2;
        double c = a + b;

        System.out.println("Výsledek: " + c);
    }
}
