import com.sun.javaws.exceptions.InvalidArgumentException;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EncodeTest {

//test for an instance of encode
    @Test
    public void newEncode_instantiatesCorrectly() throws Exception {
        Encode testEncode = new Encode(2, "maku");
        assertEquals(true, testEncode instanceof Encode);
    }
    //test for getKey() method
    @Test
    public void newEncode_getKey_2() throws Exception {
        Encode testEncode = new Encode(2, "maku");
        assertEquals(2, testEncode.getKey());

    }
    //test for getWord() method
    @Test
    public void newEncode_getWord_maku() throws Exception {
        Encode testEncode = new Encode(2, "maku");
        assertEquals("maku", testEncode.getWord());
    }

    //get not string /////////////////////?????????????????????????/
    @Test
    public void newEncode_getNotWord_2() throws Exception {
        assertThrows(
                NullPointerException.class,
                () -> { throw new NullPointerException(); }
        );

    }



    @Test(expected = IllegalArgumentException.class)

    public void exceptionTesting() {
            Encode testEncode = new Encode(2, "");
    }

    //get not string /////////////////////?????????????????????????/
    @Test
    public void newEncode_getCharater_a() throws Exception {
        Encode testEncode = new Encode(2, "a");
        assertEquals("C", testEncode.encodeWord(2, "a"));
    }

    @Test
    public void newEncode_getWordWithSpace_i_love() throws Exception {
        Encode testEncode = new Encode(2, "i love");
        assertEquals("K NQXG", testEncode.encodeWord(2, "i love"));
    }
}