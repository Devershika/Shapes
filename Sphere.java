class Sphere extends Shape {
    public Sphere(double radius) {
        super(radius, 0, 0);
    }

    @Override
    public double calculateArea() {
        return 4 * Math.PI * dim_one * dim_one;
    }

    @Override
    public double calculatePerimeter() {
        return 0; // No perimeter for a sphere
    }

    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(dim_one, 3);
    }
}
