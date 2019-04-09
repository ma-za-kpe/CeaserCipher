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



        String decryptMessage = "";
        for(int i=0; i < this.word.length();i++)
        {
            // Shift one character at a time
            char alphabet = this.word.charAt(i);
            // if alphabet lies between a and z
            if((alphabet >= 'a' && alphabet <= 'z') ||
                    (alphabet >= 'A' && alphabet <= 'Z'))
            {
                // shift alphabet
                alphabet = (char) (alphabet - this.key);

                // shift alphabet lesser than 'A'
                if(alphabet < 'A') {
                    //reshift to starting position
                    alphabet = (char) (alphabet-'A'+'Z'+1);
                }
                // shift alphabet lesser than 'a'
                else if(alphabet < 'a' && alphabet > 'Z') {
                    // reshift to starting position
                    alphabet = (char) (alphabet-'a'+'z'+1);
                }
            }
            decryptMessage = decryptMessage + alphabet;
        }
        return decryptMessage;
    }
}


//COURTESY OF https://javahungry.blogspot.com/2019/02/caesar-cipher-program-in-java.html