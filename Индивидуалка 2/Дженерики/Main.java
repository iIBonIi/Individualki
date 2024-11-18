public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 0);
        Point p3 = new Point(0, 1);

        Triangle triangle = new Triangle("T1", 0, 0, p1, p2, p3);

        Point rectBL = new Point(-1, -1);
        Point rectTR = new Point(2, 2);
        Rectangle rectangle = new Rectangle("R1", 0, 0, rectBL, rectTR);

        triangle.move(1, 1);
        rectangle.move(-1, -1);

        if (triangle.isIntersect(rectangle)) {
            System.out.println("Треугольник и прямоугольник пересекаются");
        }
        else {
            System.out.println("Треугольник и прямоугольник не пересекаются");
        }

        System.out.println("Треугольник перемещен в точку " + triangle.p1.x + ", " + triangle.p1.y);
        System.out.println("Прямоугольник перемещен в точку " + rectangle.bottomLeft.x + ", " + rectangle.bottomLeft.y);
    }
}
