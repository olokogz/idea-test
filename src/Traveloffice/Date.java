package Traveloffice;

public class Date {

    int year;
    int month;
    int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Date(int year, int month, int day)
    {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public String getInfo()
    {
       return "Rok: " + year + " Miesiac: " + month + " Dzien: ";

    }
}
