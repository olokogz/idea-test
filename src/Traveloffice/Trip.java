package Traveloffice;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Trip {

    private Date start;
    private Date end;
    private String destination;
    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }



    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Trip(Date start, Date end, String destination, BigDecimal price)
    {
        setDestination(destination);
        setEnd(end);
        setStart(start);
        setPrice(price);
    }

    @Override
    public String toString() {
        return " Start wycieczki: " + start +
                ", Koniec wycieczki: " + end +
                ", Cel podrozy: " + destination + '\'' +
                ", Koszt podróży: "+getPrice()+
                '}';
    }
}
