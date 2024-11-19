class RightTriangle implements Triangle {
    private double a;
    private double b;

    public RightTriangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double P() {
        double c = Math.sqrt(this.a * this.a + this.b * this.b);
        return this.a + this.b + c;
    }

    public double S() {
        return 0.5 * this.a * this.b;
    }
}