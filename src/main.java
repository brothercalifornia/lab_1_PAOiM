import java.util.InputMismatchException;
import java.util.Scanner;


public class main{
    static Scanner scanner = new Scanner(System.in);

    public static int inputInt(){
        try{
            return scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Niepoprawny typ danych!");
            scanner.next();
            return 5;
        }
    }
    public static double inputDouble(){
        try{
            return scanner.nextDouble();
        }
        catch (InputMismatchException e){
            System.out.println("Niepoprawny typ danych!");
            scanner.next();
            return 0;
        }
    }




    public static void main(String[] args) {
        while (true) {
            System.out.println("Kalkulator figur:");
            System.out.println("1. Wybór figury");
            System.out.println("2. Wyjście");
            int ch = inputInt();
            int choice;

            switch (ch) {
                case 1 -> {
                    System.out.println("Wybór figury");
                    System.out.println("1. Trójkąt");
                    System.out.println("2. Okrąg");
                    System.out.println("3. Kwadrat");
                    System.out.println("4. Graniastosłup prawidłowy");
                    choice = inputInt();
                    switch (choice) {
                        case 1 -> {
                            System.out.println("Trójkąt");
                            double a, b, c;
                            System.out.print("Podaj długości boków trójkata: ");
                            a = inputDouble();
                            b = inputDouble();
                            c = inputDouble();
                            Triangle triangle = new Triangle(a, b, c);
                            triangle.print();
                        }
                        case 2 -> {
                            System.out.println("Okrąg");
                            double r;
                            System.out.print("Podaj długość promienia: ");
                            r = inputDouble();
                            Circle circle = new Circle(r);
                            circle.print();
                        }
                        case 3 -> {
                            System.out.println("Kwadrat");
                            double x;
                            System.out.print("Podaj długość boku kwadratu: ");
                            x = inputDouble();
                            Square square = new Square(x);
                            square.print();
                        }
                        case 4 -> {
                            System.out.println("Graniastosłup prawidłowy");
                            System.out.println("Wybierz podstawę:");
                            System.out.println("1: Trójkąt");
                            System.out.println("2: Koło");
                            System.out.println("3: Kwadrat");
                            int p;
                            p = inputInt();
                            switch (p) {
                                case 1:
                                    System.out.println("Trójkąt");
                                    System.out.print("Podaj długość boków trójkata: ");
                                    double a = inputDouble();
                                    Triangle t = new Triangle(a, a, a);
                                    t.print();
                                    System.out.print("Podaj wysokość bryły: ");
                                    double h = inputDouble();
                                    Prism prism = new Prism(h, t);
                                    prism.print();
                                    break;
                                case 2:
                                    System.out.println("Okrąg");
                                    System.out.print("Podaj długość promienia: ");
                                    double r = inputDouble();
                                    Circle cir = new Circle(r);
                                    cir.print();
                                    System.out.print("Podaj wysokość bryły: ");
                                    h = inputDouble();
                                    prism = new Prism(h, cir);
                                    prism.print();
                                    break;
                                case 3:
                                    System.out.println("Kwadrat");
                                    System.out.print("Podaj długość boku kwadratu: ");
                                    double x = inputDouble();
                                    Square sq = new Square(x);
                                    sq.print();
                                    System.out.print("Podaj wysokość bryły: ");
                                    h = inputDouble();
                                    prism = new Prism(h, sq);
                                    prism.print();
                                    break;
                                default:
                                    break;

                            }
                        }
                    }
                }
                case 2 -> System.out.println("Bywaj");

            }
            if (ch == 2)
                break;

        }
    }
}
