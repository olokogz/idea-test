package Traveloffice;

public class Trip {

    Date start;
    Date end;
    String destination;

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

    public Trip(Date start, Date end, String destination)
    {
        setDestination(destination);
        setEnd(end);
        setStart(start);
    }

    public String getInfo()
    {
        return " Data startu wycieczki: "+start.getInfo()
                +" Data konca wycieczki: "+end.getInfo()
                +" Kierunek wycieczki: "+destination;
    }
}
