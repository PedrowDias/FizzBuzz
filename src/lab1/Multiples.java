package lab1;

public class Multiples {
    public static void main(String[] args) {

        int counter1 = 0;
        for (int i = 1; i < 10; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
                counter1++;
            }
        }
        int counter = counter1;
        System.out.println(counter);
    }

    public static int multiples() {
        int counter = 0;
        for (int i = 1; i < 1000; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
                counter++;
            }
        }
        return counter;
    }
}
