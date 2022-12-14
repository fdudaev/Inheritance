public class Charge {

    private final double rx, ry;
    private final double q;

    public Charge(double x0, double y0, double q0) {
        rx = x0;
        ry = y0;
        q = q0;
    }

    public double potentialAT(double x, double y) {
        double k = 8.99e09;
        double dx = x - rx;
        double dy = y - ry;
        return k * q / Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return q + " at " + "(" + rx + "," + ry + ")";
    }

    public static void main(String[] args) {

        double x = Double.parseDouble("45");
        double y = Double.parseDouble("10");
        Charge c1 = new Charge(0.51, 0.63, 21.3);
        Charge c2 = new Charge(0.13, 0.94, 81.9);
        double v1 = c1.potentialAT(x, y);
        double v2 = c2.potentialAT(x, y);
        System.out.printf("%.2e\n", (v1 + v2));
    }

}
