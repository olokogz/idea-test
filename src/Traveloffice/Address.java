package Traveloffice;

public class Address {

    String street;
    String zip;
    String city;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address(String street, String zip, String city)
    {
        setStreet(street);
        setCity(city);
        setZip(zip);
    }
    public String getInfo()
    {
       return " Miasto: "+city
               +" Ulica: "+street
               +" Kod pocztowy: "+zip;
    }
}