package Traveloffice;

public class Customer {

    private String name;
    private Address address;
    private Trip trip;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Customer(String name)
    {
        setName(name);
    }

    /*public String getiInfo()
    {
        return "Imie klienta: "+name
                +address.getInfo()
                +trip.getInfo();
    }*/

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Imie klienta: ");
        sb.append(name);
        sb.append(address.toString());
        sb.append(trip.toString());
        return sb.toString();
    }
}
