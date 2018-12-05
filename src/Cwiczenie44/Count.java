package Cwiczenie44;

public class Count {

    public static void main(String[] args) {
        Count c = new Count();
        System.out.println(c.countThis(1234,2345,7,13,29,43));
    }

    public String countThis(int start, int end,int dzielnik, int dzielnik1,
                            int dzielnik2, int dzielnik3)
    {
        int divByd0=0;
        int divByd1=0;
        int divByd2=0;
        int divByd3=0;

        for(int i=start;i<=end;i++)
        {
            if(i%dzielnik==0)
                divByd0++;
            else if(i%dzielnik1==0)
                divByd1++;
            else if(i%dzielnik2==0)
                divByd2++;
            else if(i%dzielnik3==0)
                divByd3++;

        }
        return "Liczb podzielnych przez "+dzielnik+" jest: "+divByd0+"\n"
                +"Liczb podzielnych przez "+dzielnik1+" jest jest: "+divByd1+"\n"
                +"Liczb podzielnych przez "+dzielnik2+" jest jest: "+divByd2+"\n"
                +"Liczb podzielnych przez "+dzielnik3+" jest jest: "+divByd3+"\n";
    }
}
