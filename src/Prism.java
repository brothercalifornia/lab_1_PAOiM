public class Prism extends Figure implements Printable {
    private int n;
    private double h;
    private Figure figure;


    public Prism(double h, Figure figure){
        this.h = h;
        this.figure = figure;
    }



    double calculatePerimeter(){
        return figure.calculatePerimeter();
    }
    double calculateArea(){
        return figure.calculateArea();
    }

    double calculateVolume(){
        return calculateArea() * h;
    }
    double summaryArea(){
        return 2 * calculateArea() + calculatePerimeter() * h;
    }


    @Override
    public void print() {
        System.out.print("Objetość: ");
        System.out.printf("%.2f%n", calculateVolume());
        System.out.print("Pole całkowite: ");
        System.out.printf("%.2f%n", summaryArea());

    }
}
