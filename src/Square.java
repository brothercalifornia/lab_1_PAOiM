public class Square extends Figure implements Printable {
    private double a = 1.0;

    public Square(double a) {
        this.a = a;
    }

    double calculatePerimeter(){
        return 4 * a;
    }
    double calculateArea(){
        return a * a;
    }

    @Override
    public void print() {
        System.out.print("Obwód kwadratu: ");
        System.out.printf("%.2f%n", calculatePerimeter());
        System.out.print("Pole kwadratu: ");
        System.out.printf("%.2f%n", calculateArea());
    }
}