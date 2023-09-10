package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        StringBuilder stringBuilder = new StringBuilder();

        int i = 0;
        while (i < chars.length - 1) {
            stringBuilder.append(chars[i]);
            i++;
        }

        System.out.println(stringBuilder);
    }
}
