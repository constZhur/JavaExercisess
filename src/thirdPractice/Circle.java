package thirdPractice;

class Circle extends Shape {
    protected double radius;
    public Circle(){
        super();
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString() {
        return "the radius of the circle is " + radius + ", the color is " + color + ", state of filled is " + filled;
    }
}
