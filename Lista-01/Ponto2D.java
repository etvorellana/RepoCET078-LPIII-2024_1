public class Ponto2D {
    private double x;
    private double y;
    private double rho;
    private double theta;

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
        this.rho = rho_car2pol(x, y);
        this.theta = theta_car2pol(x, y);
    }

    public Ponto2D(double rho, double theta, boolean polar) {
        if (polar == true) {
            this.rho = rho;
            this.theta = theta;
            this.x = x_pol2car(rho, theta);
            this.y = y_pol2car(rho, theta);
        } else {
            this.x = rho;
            this.y = theta;
            this.rho = rho_car2pol(x, y);
            this.theta = theta_car2pol(x, y);
        }
    }

    public Ponto2D(Ponto2D outroPonto) {
        this.x = outroPonto.x;
        this.y = outroPonto.y;
        this.rho = outroPonto.rho;
        this.theta = outroPonto.theta;
    }

    public static double rho_car2pol(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    public static double theta_car2pol(double x, double y) {
        return Math.atan2(y, x);
    }

    public static double x_pol2car(double rho, double theta) {
        return rho * Math.cos(theta);
    }

    public static double y_pol2car(double rho, double theta) {
        return rho * Math.sin(theta);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRho() {
        return rho;
    }

    public double getTheta() {
        return theta;
    }

    public void moveTo()
}
