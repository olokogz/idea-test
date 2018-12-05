import Traveloffice.Date;
import static java.lang.Math.PI;
import static java.lang.Math.sin;
public class HelloWorld {

    public void changeVal(Liczba val)
    {
        val.a=10;

    }


    public static void main(String[] args) {


        /*int bin,hex,oct;

        bin=0b101;
        oct=073;
        hex=0x3F;
        System.out.println(bin+" "+oct+" "+hex);
        int liczba =8;

        short s='A';
        char c = 65;

        System.out.println(s+' '+c);

        byte b1=100;
        byte b2=2;
        byte b3=(byte)(b1+b2);
        new Task();

        Date d = new Date(2018,06,2);
        java.util.Date date = new java.util.Date();
        System.out.println(Math.sin(Math.PI*10/180));
        System.out.println(sin(PI*10/180));



        HelloWorld h = new HelloWorld();
        Liczba l = new Liczba(5);
        h.changeVal(l);
        System.out.println(l.a);
        int x=-8;
        int sum=x+3;

        x=-x;
        System.out.println();
        try {
            double iloraz1 = x / 4;
            double iloraz2 = x / 4.0;
            //double iloraz3 = x / 0;
            double iloraz4 = x / 0.0;
            double iloraz5 = x / 0.0;
        }catch(ArithmeticException ex)
        {
            System.out.println("Nie dzielimy przez 0");
        }

        int mod1=x%4;
        int mod2=-x%4;
        int mod3=-x&-4;*/
        int[][] tab = new int[2][3];
        for(int i=0;i<tab.length;i++)
            for(int j=0;j<tab[i].length;j++)
            {
                System.out.println(tab[i][j]);
            }

        for(int[] z : tab) {
            System.out.println(z);
        }

    }
}
