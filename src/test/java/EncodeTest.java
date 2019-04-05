import org.junit.Test;

import static org.junit.Assert.*;

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

}