package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int i = 0;
        int number_of_chars = chars.length - 1;
        StringBuilder s = new StringBuilder();

        while (i <= number_of_chars) {
            s.append(chars[i]);
            i++;
        }
        System.out.print(s);
    }
}
