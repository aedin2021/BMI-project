import java.util.Scanner;

public class BMI {
    public static void main (String[] args){

        Scanner key;
        key = new Scanner(System.in);
        int lbs;
        int ft;
        int in;
        int kg;
        int k;

        String f;
        String i;
        String l;


        f = "hight in ft";
        i = "hight in in";
        l = "weight in lbs";


        System.out.println(f);
        ft = key.nextByte();
        System.out.println(i);
        in = key.nextByte();
        System.out.println(l);
        lbs = key.nextShort();



        /*lbs*2.2=kg
        * in*2.54=cm
        * cm*100=m*/
        /*System.out.println((lbs/2.2)/((((ft*12)+(in))*2.54/(450-350))*(((ft*12)+(in))*2.54/(450-350))));*/

        System.out.println("Your BIM is " + (lbs/2.2)/((((ft*12)+(in))*2.54/(450-350))*(((ft*12)+(in))*2.54/(450-350))));






    }
}
