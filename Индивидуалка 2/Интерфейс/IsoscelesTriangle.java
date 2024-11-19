class IsoscelesTriangle implements Triangle {
    private double a;
    private double b;
    private double angle;

    public IsoscelesTriangle(double a, double b, double angle) {
        this.a = a;
        this.b = b;
        this.angle = angle;
    }

    public double P() {
        return 2.0 * this.a + this.b;
    }

    public double S() {
        return 0.5 * this.b * this.a * Math.sin(this.angle);
    }
}
