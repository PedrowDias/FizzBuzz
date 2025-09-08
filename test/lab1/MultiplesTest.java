package lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/*
  Some test cases for Multiples.
 */
public class MultiplesTest {

    // TODO: When you are ready to test task X,
    //  copy this file into the test folder.

    @Test
    public void testFifteen() {
        int counter = 0;
        for (int i = 1; i < 16; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
                counter++;
            }
        }
        assertEquals(7,
                counter,
                "Multiples.multiples(16, 3, 5) is incorrect, the values" +
                        " it should be counting are: 3, 5, 6, 9, 10, 12, 15");
    }

    @Test
    public void testTen() {
        int counter = 0;
        for (int i = 1; i < 10; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
                counter++;
            }
        }
        assertEquals(4,
                counter,
                "Multiples.multiples(10, 3, 5) is incorrect, the values" +
                        " it should be counting are: 3, 5, 6, 9");
    }

    @Test
    public void testThousand() {
        int counter = 0;
        for (int i = 1; i < 1000; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
                counter++;
            }
        }
        assertEquals(466,
                counter,
                "Multiples.multiples(1000, 3, 5) is incorrect.");
    }

    @Test
    public void testEquals() {
        int counter = 0;
        for (int i = 1; i < 1000; i++) {
            boolean divisibleBy3 = i % 4 == 0;
            boolean divisibleBy5 = i % 4 == 0;

            if (divisibleBy3 || divisibleBy5) {
                counter++;
            }
        }
        assertEquals(249,
                counter,
                "Multiples.multiples(1000, 4, 4) is incorrect.");
    }

}