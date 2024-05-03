class Circle {
    private int radius;

    public Circle(int r) {
        this.radius = r;
    }

    public double Area() {
        return Math.PI * this.radius * this.radius;
    }
}

class LPU {
    public static void main(String args[]) {
        Circle cr = new Circle(5);
        double area = cr.Area();
        System.out.printf("Area: %.2f", area);
    }
}
