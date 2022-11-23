
package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int x = 2;
        while (x <= printToInclusive) {
            int j = 2;
            while (j <= x) {
                if (x == j) {
                    System.out.println(x);
                }
                if (x % j == 0) {
                    break;
                }
                j++;
            }
            x++;
        }
    }
}
