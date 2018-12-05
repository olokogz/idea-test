package Traveloffice;

public class Customer {

    String name;
    Address address;
    Trip trip;

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

    public String getiInfo()
    {
        return "Imie klienta: "+name
                +address.getInfo()
                +trip.getInfo();
    }


}
