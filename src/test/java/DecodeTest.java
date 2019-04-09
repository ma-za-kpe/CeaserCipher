import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DecodeTest {
    //test for an instance of encode
    @Test
    public void newDecode_instantiatesCorrectly() throws Exception {
        Decode testDecode = new Decode(2, "maku");
        assertEquals(true, testDecode instanceof Decode);
    }
    //test for getKey() method
    @Test
    public void newDecode_getKey_2() throws Exception {
        Decode testDecode = new Decode(2, "og");
        assertEquals(2, testDecode.getKey());

    }
    //test for getWord() method
    @Test
    public void newEncode_getWord_og() throws Exception {
        Decode testDecode = new Decode(2, "og");
        assertEquals("og", testDecode.getWord());
    }

    @Test
   public void exceptionTesting() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            Decode testDecode = new Decode(2, "2");
//            testEncode.encodeWord(2,"2");
        });
        assertEquals("please enter a string", exception.getMessage());
    }

    //get not string /////////////////////?????????????????????????/
    @Test
    public void newEncode_getCharater_a() throws Exception {
        Decode testDecode = new Decode(2, "C");
        assertEquals("a", testDecode.decodeWord(2, "a"));
    }

    @Test
    public void newEncode_getWordWithSpace_i_love() throws Exception {
        Decode testDecode = new Decode(2, "K NQXG");
        assertEquals("i love", testDecode.decodeWord(2, "i love"));
    }


}