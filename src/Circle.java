import java.lang.Math;

public class Circle extends Figure implements Printable{
    private double r = 1.0;
    public Circle(double r) {
        this.r = r;
    }

    double calculatePerimeter(){
        return 2*this.r*Math.PI;
    }
    double calculateArea(){
        return Math.PI * r * r;
    }

    @Override
    public void print() {
        System.out.print("Obwód okręgu: ");
        System.out.printf("%.2f%n", calculatePerimeter());
        System.out.print("Pole koła: ");
        System.out.printf("%.2f%n", calculateArea());
    }
}
