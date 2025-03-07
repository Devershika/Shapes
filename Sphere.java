class Square extends Shape {
    public Square(double side) {
        super(side, side, 4);
    }

    @Override
    public double calculateArea() {
        return dim_one * dim_one;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * dim_one;
    }
}
