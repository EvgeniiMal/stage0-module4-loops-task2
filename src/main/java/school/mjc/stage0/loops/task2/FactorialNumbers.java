package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int n = 1;
        int i = 0;

        while (i <= printToInclusive) {
            System.out.println(n *= i > 0 ? i : 1);
            i++;
        }
    }
}
