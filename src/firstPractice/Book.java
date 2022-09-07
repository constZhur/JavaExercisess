package firstPractice;

public class Book {
    private String name;
    private int cost;

    public Book (){
        this.name = "No name";
        this.cost = 0;
    }

    public Book(String name) {
        this.name = name;
    }

    public Book(int cost) {
        this.cost = cost;
    }

    public Book(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    @Override
    public String toString() {
        return "Name of this book is " + name + ", cost is " + cost;
    }
}
