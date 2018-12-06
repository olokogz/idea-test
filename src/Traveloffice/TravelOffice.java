package Traveloffice;

public class TravelOffice {

    private Customer[] customers = new Customer[2];
    private int customerCount=0;
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

    private void addCustomer(Customer customer)
    {

        if (customerCount == customers.length) {
            Customer temp[] = new Customer[customers.length + 2];
            System.arraycopy(customers, 0, temp, 0, customers.length);
            customers = temp;
        }
        customers[customerCount++] = customer;

    }



    private int getCustomerCount()
    {
        return customerCount;
    }

    private String getInfo()
    {
        /*StringBuilder sb = new StringBuilder();
       for(int i=0;i<customerCout;i++)
       {

               sb.append(tab[i].getiInfo());
               sb.append("\n");

       }
        return sb.toString();*/

        String report = "";
        for (int i = 0; i < customerCount; i++) {
            report += customers[i].getiInfo() + "\n";
        }
        return report;

        }
    }



