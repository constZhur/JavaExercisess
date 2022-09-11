package thirdPractice;

class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){
        super();
    }
    public Rectangle(double width, double length){
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return length * width;
    }
    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }
    @Override
    public String toString() {
        return "the width of the rectangle is " + width + "and length of the rectangle is " + length + ", the color is " + color + ", state of filled is " + filled;
    }
}
