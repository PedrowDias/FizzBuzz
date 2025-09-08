package lab1;

public class Multiples {
    public static void main(String[] args) {

        int counter = multiples(10, 3, 5);
        System.out.println(counter);
    }

    public static int multiples(int n, int a, int b) {
        int counter = 0;
        for (int i = 1; i < n; i++) {
            boolean divisibleBy3 = i % a == 0;
            boolean divisibleBy5 = i % b == 0;

            if (divisibleBy3 || divisibleBy5) {
                counter++;
            }
        }
        return counter;
    }

    public static int multiples() {
        return multiples(1000, 3, 5);
    }
}
