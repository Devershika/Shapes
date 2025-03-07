abstract class Shape {
    protected double dim_one, dim_two;
    protected int num_sides;

    // Default constructor
    public Shape() {
        this.dim_one = this.dim_two = 0;
        this.num_sides = 0;
    }


    // Parameterized Constructor for 2D Shapes
    public Shape(double dim_one, double dim_two, int num_sides) {
        this.dim_one = dim_one;
        this.dim_two = dim_two;
        this.num_sides = num_sides;
    }

    // Abstract methods
    abstract double calculateArea();
    abstract double calculatePerimeter();


    // Default method for volume (returns 0 for 2D shapes)
    public double calculateVolume() {
        return 0.0;
    }

    public int getNumSides() {
        return num_sides;
    }
}
