package Traveloffice;

public class Test {

    public static void main(String[] args) {
        // utworz biuro podrozy
        TravelOffice to = new TravelOffice();

        // budujemy wycieczke
        Trip trip = new Trip(new Date(2017, 8, 1), new Date(2017, 8, 15), "Egipt");

        // budujemy pierwszego klienta
        Customer customer = new Customer("Jan Kowalski");
        customer.setAddress(new Address("Marszalkowska 10", "00-876", "Warszawa"));
        customer.setTrip(trip);
        to.addCustomer(customer); // dodajemy go do biura

        customer = new Customer("Jozef Nowak");
        customer.setAddress(new Address("Al. Jerozolimskie 120", "00-345", "Warszawa"));
        customer.setTrip(trip);
        to.addCustomer(customer); // dodajemy go do biura

        customer = new Customer("Jaroslaw Lis");
        customer.setAddress(new Address("Swietokrzyska 14", "00-666", "Warszawa"));
        customer.setTrip(trip);
        to.addCustomer(customer); // dodajemy go do biura

        System.out.println(to.getInfo());


    }
}
