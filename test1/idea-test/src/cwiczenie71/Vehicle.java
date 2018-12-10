package cwiczenie71;

import java.util.Objects;

public abstract class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle(String name)
    {
        setName(name);
    }

    public abstract double getFuelNeeds();

    public abstract double getDistsance();

    public double calculateFuelConsumption()
    {
        return getDistsance()/getFuelNeeds();
    }
    public void go()
    {
        System.out.println("Typ pojazdu uruchomionego: " + this.getClass().getSimpleName() + ", "+ this.name);
    }
    public void stop()
    {
        System.out.println("Typ pojazdu zatrzymanego: " + this.getClass().getSimpleName() + ", "+ this.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(name, vehicle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
