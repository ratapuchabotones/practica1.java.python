public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String coordCartesianas() {
        return "(" + x + ", " + y + ")";
    }

    public String coordPolares() {
        double r = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);
        return "(" + r + ", " + theta + ")";
    }

    public static void main(String[] args) {
        Punto punto = new Punto(3, 4);
        System.out.println("Coordenadas cartesianas = " + punto.coordCartesianas());
        System.out.println("Coordenadas polares = " + punto.coordPolares());
    }
}

