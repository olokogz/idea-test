package cwiczenie71;

public class RaceCar extends Car {

    public RaceCar(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 100;
    }

    @Override
    public double getDistsance() {
        return 100;
    }
}
