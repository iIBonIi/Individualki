class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Point plus(Point p) {
        Point q = new Point(x + p.x, y + p.y);
        return q;
    }
}
