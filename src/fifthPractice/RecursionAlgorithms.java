package fifthPractice;

public class RecursionAlgorithms {
    public static void main(String[] args) {

    }
    /* Задание 7
Дано натуральное число n>1.
Выведите все простые множители этого числа в порядке не убывания с учетом кратности.
     */
    private int PrimeNumbers (int number){
        return 0;
    }
    /* Задание 8
Дано слово, состоящее только из строчных латинских букв. Проверьте,
является ли это слово палиндромом. Выведите YES или NO.
     */
    private void isPalindrome(String str){
        if(str.length() <= 1) {
            System.out.println("YES");
            return;
        }
        if (str.length()==2) {
            if (str.charAt(0) == str.charAt(1)){
                System.out.println("YES");
                return;
            }
            else {
                System.out.println("NO");
                return;
            }
        }
        if(str.charAt(0) != str.charAt(str.length()-1)){
            System.out.println("NO");
            return;
        }
        isPalindrome(str.substring(1, str.length()-1));
    }
    /* Задание 9
Даны числа a и b. Определите, сколько существует последовательностей
из a нулей и b единиц, в которых никакие два нуля не стоят рядом.
     */
    private int countSequences(int a, int b) {
        if (a == 0) return 1;
        if (a == 1) return b+1;
        if (a > 1 && b == 0) return 0;
        return countSequences(a-1, b-1) + countSequences(a, b-1);
    }
    /* Задание 10
Дано число n, десятичная запись которого не содержит нулей. Получите
число, записанное теми же цифрами, но в противоположном порядке.
     */
    private int reverseNumber(int startNumber, int finalNumber) {
        if (startNumber == 0) return finalNumber;
        return reverseNumber(startNumber/10, 10*finalNumber + startNumber%10);
    }
}
