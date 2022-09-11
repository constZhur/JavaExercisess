package secondPractice;

public class TestBall {
    public static void main(String[] args) {
        Ball a = new Ball();
        Ball b = new Ball(1.0, 2.9);
        Ball c = new Ball(2.4, 11.2);
        Ball d = new Ball(7.4, 5.7);

        System.out.println(a.getX());
        System.out.println(c.getY());
        System.out.println(b.toString());
        a.setXY(12.2, 5.8);
        d.setX(22.3);
        c.setY(4.9);
        b.move(2.2, 2.2);
        System.out.println(b.toString());
        System.out.println(d.toString());
    }
}
