package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < chars.length; i++){
            stringBuilder.append(chars[i]);
        }

        System.out.println(stringBuilder.toString());
    }
}
