import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double angle = scanner.nextDouble();

        Calculate val = new Calculate(a, b, angle);
        System.out.print("Площадь треугольника: " + val.S() + " ");
        System.out.println("Периметр треугольника: " + val.P());

        RightTriangle R_val = new RightTriangle(a, b);
        System.out.print("Площадь Прямоугольного треугольника: " + R_val.S() + " ");
        System.out.println("Периметр Прямоугольного треугольника: " + R_val.P());

        EquilateralTriangle E_val = new EquilateralTriangle(a);
        System.out.print("Площадь Равностороннего треугольника: " + E_val.S() + " ");
        System.out.println("Периметр Равностороннего треугольника: " + E_val.P());

        IsoscelesTriangle I_val = new IsoscelesTriangle(a, b, angle);
        System.out.print("Площадь Равнобедренного треугольника: " + I_val.S() + " ");
        System.out.println("Периметр Равнобедренного треугольника: " + I_val.P());
    }
}