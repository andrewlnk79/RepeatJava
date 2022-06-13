import java.util.Scanner;

public class Lesson1 {

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    static void checkSumSign() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter two number");

        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println((a + b) >= 0 ? "summ positive" : "sun negative");


    }

    static void printColor() {
        System.out.println("enter the number");
        Scanner scanner = new Scanner(System.in);
        int valeu = scanner.nextInt();
        if (valeu <= 0) {
            System.out.println("Red");
        } else if (valeu >= 100) {

            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }

    }

    static void compareNumbers() {
        System.out.println("enter 2 numbers");
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println(a >= b ? "a>=b" : "a<b");


    }

    public static void main(String[] args) {
        checkSumSign();
        printThreeWords();
        printColor();
        compareNumbers();
    }
}


