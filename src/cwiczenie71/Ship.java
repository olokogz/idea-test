package cwiczenie71;

public class Ship extends Vehicle
                    implements Sailing{
    public Ship(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 400;
    }

    @Override
    public double getDistsance() {
        return 1000;
    }

    @Override
    public void dock() {
        System.out.println("Przybicie do portu");
    }
    @Override
    public void go()
    {
        dock();
    }
}
