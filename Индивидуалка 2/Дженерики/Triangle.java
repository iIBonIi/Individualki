class Triangle extends Shape<Triangle> {
    Point p1, p2, p3;

    // Конструктор
    public Triangle(String id, double x, double y, Point p1, Point p2, Point p3) {
        super(id, x, y);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public void move(double dx, double dy) {
        Point d = new Point(dx, dy);
        p1 = p1.plus(d);
        p2 = p2.plus(d);
        p3 = p3.plus(d);
    }

    @Override
    public boolean isIntersect(Shape<?> other) {
        if (other instanceof Rectangle) {
            Rectangle rect = (Rectangle) other;
            return isIntersect(rect);
        }
        return false;
    }

    public boolean isIntersect(Rectangle rect) {
        return rect.contains(p1) || rect.contains(p2) || rect.contains(p3);
    }
}
