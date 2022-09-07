package firstPractice;

public class Tester {
    public static void main(String[] args) {
        Ball firstBall = new Ball();
        Ball secondBall = new Ball("red");
        Ball thirdBall = new Ball(50);
        Ball fourthBall = new Ball("white", 70);
        secondBall.setWeight(90);
        thirdBall.setColor("blue");
        System.out.println(firstBall);

        Book firstBook = new Book();
        Book secondBook = new Book("Ruslan and Ludmila");
        Book thirdBook = new Book(300);
        Book fourthBook = new Book("Evgeniy Onegin", 500);
        secondBook.setCost(400);
        thirdBook.setName("Capitan's daughter");
        System.out.println(firstBook);

        Dog firstDog = new Dog();
        Dog secondDog = new Dog("Rex");
        Dog thirdDog = new Dog(4);
        Dog fourthDog = new Dog("Tim", 5);
        secondDog.setAge(8);
        thirdDog.setName("Sarah");
        System.out.println(firstDog);
        fourthDog.intoHumanAge();
    }
}
