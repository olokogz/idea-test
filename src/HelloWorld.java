public class HelloWorld {

    public static void main(String[] args) {

        int bin,hex,oct;

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
    }
}
