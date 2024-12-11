class Rectangle implements Shape<Rectangle> {
    private String id;
    private double width;
    private double height;

    public Rectangle(String id, double width, double height) {
        this.id = id;
        this.width = width;
        this.height = height;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public boolean isIntersect(Rectangle other) {
        return this.width == other.width && this.height == other.height;
    }

    public boolean isIntersect(Triangle triangle) {
        return triangle.isIntersect(this);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}