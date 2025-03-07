class Square extends Shape {
    public Square(double side) {
        super(side, side, 4);
    }

    @Override
    public double calculateArea() {
        return dim_one * dim_one;
    }

