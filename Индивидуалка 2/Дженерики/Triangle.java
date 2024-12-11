class Triangle implements Shape<Triangle> {
    private String id;
    private double base;
    private double height;

    public Triangle(String id, double base, double height) {
        this.id = id;
        this.base = base;
        this.height = height;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public boolean isIntersect(Triangle other) {
        return this.base == other.base && this.height == other.height;
    }

    public boolean isIntersect(Rectangle rect) {
        return rect.getWidth() == this.base && rect.getHeight() == this.height;
    }
}