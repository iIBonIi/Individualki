interface Shape<T> {
    String getId();
    boolean isIntersect(T other);
}