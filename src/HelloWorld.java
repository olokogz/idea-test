public class HelloWorld {

    public void changeVal(Liczba val)
    {
        val.a=10;

    }


    public static void main(String[] args) {

        HelloWorld h = new HelloWorld();
        Liczba l = new Liczba(5);
        h.changeVal(l);
        System.out.println(l.a);

    }
}
