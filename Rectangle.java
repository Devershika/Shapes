class Rectangle extends Shape {
    public Rectangle(double length, double width) {
        super(length, width, 4);
    }

    @Override
    public double calculateArea() {
        return dim_one * dim_two;
    }
