package thirdPractice;

class Square extends Rectangle {
    public Square(){
        super();
    }
    public Square(double side){
        super();
        this.width = side;
        this.length = side;
    }
    public Square(double side, String color, boolean filled){
        this.color = color;
        this.filled = filled;
        this.width = side;
        this.length = side;
    }
    public double getSide() {
        return width;
    }
    public void setSide(double side) {
        this.width = side;
        this.length = side;
    }
    @Override
    public void setWidth(double side) {
        width = side;
    }
    @Override
    public void setLength(double side) {
        length = side;
    }
    @Override
    public String toString() {
        return "the width and length of the square is " + width + ", the color is " + color + ", state of filled is " + filled;
    }
}
