class EquilateralTriangle implements Triangle {
    private double a;

    public EquilateralTriangle(double a) {
        this.a = a;
    }

    public double P() {
        return 3.0 * this.a;
    }

    public double S() {
        return Math.sqrt(3.0) / 4.0 * this.a * this.a;
    }
}
