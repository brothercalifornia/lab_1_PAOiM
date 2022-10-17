import java.lang.Math;

public class
        Triangle extends Figure implements Printable{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    double calculatePerimeter(){
        return this.side1 + this.side2 + this.side3;
    }
    double calculateArea(){
        double p = calculatePerimeter()/2;
        return Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
    }

    @Override
    public void print() {
        System.out.print("Obwód trójkąta: ");
        System.out.printf("%.2f%n", calculatePerimeter());
        System.out.print("Pole trójkąta: ");
        System.out.printf("%.2f%n", calculateArea());
    }
}
