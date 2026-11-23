package uprom;

public class Cviko09_Uloha02
{
    public static void main(String[] args)
    {
        int[] pole = getInterval(50);
        for(int i=0; i < pole.length; i++)
            System.out.println(pole[i]);
    }

    // TODO:
    //  Doplň medotu, která vygeneruje pole
    //  po sobě jdoucích celých čísel, počínaje nulou
    public static int[] getInterval(int count)
    {
        int[] result = new int[count];
        for (int i=0; i < result.length; i++){
            result[i] = i;
        }
        return result;
    }

}
