public class Encode {
    private int key;
    private String word;

    public Encode(int key, String word){
        this.key = key;
        this.word = word;
        if ((this.word == null)) {
            throw new IllegalArgumentException("please enter a string");
        }
    }

    public int getKey(){
        return this.key;
    }

    public String getWord() {
        return this.word;
    }

    public String encodeWord(int key, String word) {


        StringBuilder sb = new StringBuilder();
        String upperCase = word.toUpperCase();
        String noSpace = upperCase.replace("\\s", "");

        for (char c : upperCase.toCharArray()) {
            sb.append((char) (c + key));
        }
        return sb.toString().replace('"', ' ');

    }
}
