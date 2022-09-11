package secondPractice;

public class TestAuthor {
    public static void main(String[] args) {
        Author first = new Author("Alex", "push@mail.ru", 'm');
        Author second = new Author("Mikhail", "lermontov@gmail.com", 'm');
        Author third = new Author("Anna", "akhmatova@mail.ru", 'w');

        System.out.println(first.getName());
        System.out.println(third.getGender());
        System.out.println(second.toString());
        second.setEmail("ler_mikh@mail.ru");
        System.out.println(second.getEmail());
    }
}
