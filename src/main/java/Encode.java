public class Encode {
    private int key;
    private String word;

    public Encode(int key, String word) {
        this.key = key;
        this.word = word;
        if ((this.word == null)) {
            throw new IllegalArgumentException("please enter a string");
        }
    }

    public int getKey() {
        return this.key;
    }

    public String getWord() {
        return this.word;
    }

    public String encodeWord(int key, String word) {

        String ciphertext = "";
        for (int i = 0; i < word.length(); i++) {
            // Shift one character at a time
            char alphabet = word.charAt(i);
            // if alphabet lies between a and z
            if ((alphabet >= 'a' && alphabet <= 'z') ||
                    (alphabet >= 'A' && alphabet <= 'Z')) {
                // shift alphabet
                alphabet = (char) (alphabet + key);
            }
            // if shift alphabet greater than 'z'
            if (alphabet > 'z') {
                // reshift to starting position
                alphabet = (char) (alphabet + 'a' - 'z' - 1);
            }
            // if shift alphabet greater than 'Z'
            else if (alphabet > 'Z' && alphabet < 'a') {
                //reshift to starting position
                alphabet = (char) (alphabet + 'A' - 'Z' - 1);
            }
            ciphertext = ciphertext + alphabet;
        }
        return ciphertext;
    }

}

//COURTESY OF https://javahungry.blogspot.com/2019/02/caesar-cipher-program-in-java.html