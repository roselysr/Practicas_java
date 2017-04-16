package tp.pr1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by miguel on 16/04/2017.
 */
public class FichaTest {

    Ficha tester;
    @Before
    public void setUp() throws Exception {
        tester = Ficha.BLANCA;
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testToString() throws Exception {
        assertEquals("Result Blanca", "O", Ficha.BLANCA.toString());
        assertEquals("Result Negra", "X", Ficha.NEGRA.toString());
        assertEquals("Result Vacia", " ", Ficha.VACIA.toString());
    }

}