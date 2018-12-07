package jakiescwiczenia;

public class Main {

    public static void main(String[] args) {
        Vehicle v = new Vehicle() {
            @Override
            public void start() {
                System.out.println("lecimy tutaj");
            }
        };

        v.start();
    }

    interface Vehicle{
        void start();
    }

}
