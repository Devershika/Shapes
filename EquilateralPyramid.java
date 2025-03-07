
class EquilateralPyramid extends Shape {
    private double height;

    public EquilateralPyramid(double side, double height) {
        super(side, side, 4);
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double baseArea = dim_one * dim_one;
        double lateralArea = 2 * dim_one * Math.sqrt((dim_one / 2) * (dim_one / 2) + height * height);
        return baseArea + lateralArea;
    }
