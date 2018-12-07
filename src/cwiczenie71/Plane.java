package cwiczenie71;

public class Plane extends Vehicle
                implements Flying {


    public Plane(String name) {
        super(name);
    }

    @Override
    public void takeOff() {
        System.out.println("Taked off");
    }

    @Override
    public void land() {
        System.out.println("Landed");
    }

    @Override
    public void callAirControl() {
        System.out.println("Called air control");
    }

    @Override
    public double getFuelNeeds() {
        return 1000;
    }

    @Override
    public double getDistsance() {
        return 100;
    }
    public void go()
    {
        super.go();
        takeOff();
    }
    public void stop()
    {
        super.stop();
        land();
    }
}
