public class Decode {

    private int key;
    private String word;

    public Decode(int key, String word){
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

    public String decodeWord(int key, String word) {


        StringBuilder sb = new StringBuilder();
        String upperCase = word.toUpperCase();
        Encode encode = new Encode(this.key, this.word);

        for (char c : this.word.toCharArray()) {
            sb.append((char) (c - key));
        }
        return sb.toString().toLowerCase().replace('\u001E', ' ');

    }
}
