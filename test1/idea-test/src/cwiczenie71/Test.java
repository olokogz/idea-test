package cwiczenie71;

public class Test {
    static Vehicle[] vehicle;


    public static void main(String[] args) {
        Vehicle plane = new Plane("samolot");
        Vehicle raceCar = new RaceCar("samochod wyscigowy");
        Vehicle ship = new Ship("statek morski");
        Vehicle ciezarowka = new Truck("ciezarowka");
        Vehicle samochod = new Car("osobowka");
        vehicle = new Vehicle[5];
        vehicle[0]=plane;
        vehicle[1]=ship;
        vehicle[2]=raceCar;
        vehicle[3]=ciezarowka;
        vehicle[4]=samochod;
        for(Vehicle v : vehicle)
        {
            v.go();
            v.stop();
            System.out.println(v.calculateFuelConsumption());
            if(v instanceof Flying)
            {
                ((Flying)v).callAirControl();
            }


        }
    }


}
