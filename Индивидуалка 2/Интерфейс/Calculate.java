public class Calculate implements Triangle {
    private double a;
    private double b;
    private double angle;

    public Calculate(double a, double b, double angle) {
        this.a = a;
        this.b = b;
        this.angle = angle;
    }

    public double P() {
        return Math.sqrt(Math.pow(this.b, 2.0) + Math.pow(this.a, 2.0) - 2.0 * this.a * this.b * Math.cos(this.angle * Math.PI / 180.0)) + this.b + this.a;
    }

    public double S() {
        return 0.5 * this.a * this.b * Math.sin(this.angle * Math.PI / 180.0);
    }
}
