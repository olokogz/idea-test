package cwiczenie71;

public class Truck extends Car {


    public Truck(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 200;
    }

    @Override
    public double getDistsance() {
        return 100;
    }

}
