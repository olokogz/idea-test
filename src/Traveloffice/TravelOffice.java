package Traveloffice;

public class TravelOffice {

    public static void main(String[] args) {

        Address address = new Address("Bazylijska","95-100", "Zgierz");
        Trip trip = new Trip(new Date(2018,12,05),
                new Date(2018,12,06),"Warszwa");
        Customer customer = new Customer("Szymon");

        customer.setTrip(trip);
        customer.setAddress(address);
        System.out.println(customer.getiInfo());

    }
}
