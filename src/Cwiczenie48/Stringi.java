package Cwiczenie48;

public class Stringi {
    char[] tab;
    String string;
    public static void main(String[] args) {
        Stringi s = new Stringi();
        s.string = "ala ma kota";
        s.editString(s.string);
        //System.out.println(s.string);

    }

    private void editString(String string)
    {
        String newString="";
        StringBuilder sb = new StringBuilder();
        tab = new char[string.length()];
        for(int i=0;i<string.length();i++)
        {
            tab[i]=string.charAt(i);
        }
        char[] temp = new char[string.length()];
         for(int i=string.length()-1;i>=0;i--)
         {
             sb.append(tab[i]);
         }
        System.out.println(sb.toString());
         /*for(Character c : tab)
         {
             System.out.println(c);
         }*/

    }

}
