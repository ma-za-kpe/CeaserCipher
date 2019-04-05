public class Encode {
    private int key;
    private String word;

    public Encode(int key, String word){
        this.key = key;
        this.word = word;
    }

    public int getKey(){
        return this.key;
    }

    public String getWord() {
        return this.word;
    }
}
