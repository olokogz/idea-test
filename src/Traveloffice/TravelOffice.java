package Traveloffice;

import java.util.Arrays;

public class TravelOffice {

    private Customer[] customers = new Customer[2];
    private int customerCount=0;


    public void addCustomer(Customer customer)
    {

        if (customerCount == customers.length) {
            Customer temp[] = new Customer[customers.length + 2];
            System.arraycopy(customers, 0, temp, 0, customers.length);
            customers = temp;
        }
        customers[customerCount++] = customer;

    }



    public int getCustomerCount()
    {
        return customerCount;
    }

    /*public String getInfo()
    {
        /*StringBuilder sb = new StringBuilder();
       for(int i=0;i<customerCout;i++)
       {

               sb.append(tab[i].getiInfo());
               sb.append("\n");

       }
        return sb.toString();

        String report = "";
        for (int i = 0; i < customerCount; i++) {
            report += customers[i].getiInfo() + "\n";
        }
        return report;

        }*/

    @Override
    public String toString() {
        /*return "TravelOffice{" +
                "customers=" + Arrays.toString(customers) +
                ", customerCount=" + customerCount +
                '}';

        StringBuilder sb = new StringBuilder();
        sb.append(" Klient: ");
        sb.append(Arrays.toString(customers));
        return sb.toString();*/
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<customers.length-1;i++)
        {
            sb.append(customers[i].toString()+"\n");
        }
            return sb.toString();



    }
}



