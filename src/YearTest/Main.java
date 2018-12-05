package YearTest;

public class Main {

    public static void main(String[] args) {
        int year = 2020;
        LeapYear ly = new LeapYear();
        if (ly.isLeapYear(year))
            System.out.println("Rok :"+year+" jest przestepny.");


    }


}
