class Rectangle extends Shape<Rectangle> {
    Point bottomLeft, topRight;
    public Rectangle(String id, double x, double y, Point bottomLeft, Point topRight) {
        super(id, x, y);
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    @Override
    public void move(double dx, double dy) {
        Point d = new Point(dx, dy);
        bottomLeft = bottomLeft.plus(d);
        topRight = topRight.plus(d);
    }

    @Override
    public boolean isIntersect(Shape<?> other) {
        if (other instanceof Triangle) {
            Triangle triangle = (Triangle) other;
            return isIntersect(triangle);
        }
        return false;
    }

    public boolean isIntersect(Triangle triangle) {
        return contains(triangle.p1) || contains(triangle.p2) || contains(triangle.p3);
    }

    public boolean contains(Point p) {
        return p.x >= bottomLeft.x && p.x <= topRight.x &&
                p.y >= bottomLeft.y && p.y <= topRight.y;
    }
}
