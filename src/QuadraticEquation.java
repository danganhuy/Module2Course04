public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
        return b*b - 4*a*c;
    }
    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        else {
            return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
        }
    }
    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        else {
            return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
        }
    }
    public String getEquation() {
        return a + "x^2 + " + b + "x + " + c + " = 0";
    }
}
