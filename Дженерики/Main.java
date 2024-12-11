public class Main {
    public static void main(String[] args) {
        Shape<Triangle> triangle1 = new Triangle("T1", 10, 5);
        Shape<Triangle> triangle2 = new Triangle("T2", 10, 5);
        Shape<Rectangle> rectangle1 = new Rectangle("R1", 10, 5);
        Shape<Rectangle> rectangle2 = new Rectangle("R2", 5, 10);

        System.out.println("Пересечение 2 треугольников " + triangle1.isIntersect((Triangle) triangle2));
        System.out.println("Пересечение треугольника и прямоугольника " + ((Triangle) triangle1).isIntersect((Rectangle) rectangle1));
        System.out.println("Пересечение 2 прямогульников " + ((Rectangle) rectangle1).isIntersect((Rectangle) rectangle2));
    }
}
