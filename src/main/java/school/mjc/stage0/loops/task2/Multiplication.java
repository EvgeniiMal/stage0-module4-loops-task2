package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        int count = Math.abs(multiplyByAndToInclusive);

        if(multiplyByAndToInclusive == 0) {
            return;
        }

        while (i <= count) {
            System.out.println(i * multiplyByAndToInclusive);
            i++;
        }
    }
}
