package firstPractice;

public class Ball {
    private String color;
    private int weight;

    public Ball(){
        this.color = "No color";
        this.weight = 0;
    }

    public Ball(String color) {
        this.color = color;
        this.weight = 0;
    }

    public Ball(int weight) {
        this.weight = weight;
        this.color = "No color";
    }

    public Ball(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Ball color is " + color + ", weight is " + weight;
    }
}
