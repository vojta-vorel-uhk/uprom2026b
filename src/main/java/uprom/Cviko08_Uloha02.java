package uprom;

public class Cviko08_Uloha02
{
    public static void main(String[] args)
    {
        // Vypiš výsledek z metody pocetDni pro každý ze 12 měsíců (1 až 12)
        System.out.println("Leden: "+pocetDni(1));
        System.out.println("Únor: "+pocetDni(2));
        System.out.println("Březen: "+pocetDni(3));
        System.out.println("Duben: "+pocetDni(4));
        for(int i=1; i <= 12; i++){
            System.out.println(pocetDni(i));
        }
    }

    public static int pocetDni(int mesic)
    {
        if(mesic==1 || mesic==3 || mesic==5 || mesic==7 || mesic==8 || mesic==10 || mesic==12)
            return 31;
        else if(mesic == 2)
            return 28;
        else
            return 30;
    }
}
