abstract class Shape<T> {
    protected String id;

    public Shape(String id, double x, double y) {
        this.id = id;
    }

    public abstract void move(double dx, double dy);

    public String getId() {
        return id;
    }

    public abstract boolean isIntersect(Shape<?> other);
}
