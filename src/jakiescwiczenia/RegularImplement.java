package jakiescwiczenia;

import javafx.scene.shape.Circle;

public class RegularImplement {

    public static void main(String[] args) {

        RegularShape[] shape = new RegularShape[3];
        shape[0]=new Triangle(1);
        //shape[1] = new Square(2);
       // shape[2] = new Circle(3);

        RegularShape.printInfo(shape);
    }

    static class Triangle implements RegularShape{
        private double x;
        private double y;

        public Triangle(double liczba)
        {
            this.x=liczba;
            this.y=liczba;
        }
        @Override
        public double getArea()
        {
            return x*y;
        }

        @Override
        public double getCircumference() {
            return 0;
        }
    }

}
