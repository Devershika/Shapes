class Cylinder extends Shape {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius, 0, 0);
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * dim_one * (dim_one + height);
    }

