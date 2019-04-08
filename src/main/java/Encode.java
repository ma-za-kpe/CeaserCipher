public class Encode {
    private int key;
    private String word;

    public Encode(int key, String word){
        this.key = key;
        this.word = word;
        if (!(this.word instanceof String)) {
//            throw new IllegalArgumentException("please enter a string", this.encodeWord(2,""));
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

        for (char c : upperCase.toCharArray()) {
            sb.append((char) (c + key));
        }
        return sb.toString();

    }
}
