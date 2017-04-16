package tp.pr1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by miguel on 16/04/2017.
 */
public class TableroTest {

    Tablero tester;

    @Before
    public void setUp() throws Exception {
        tester = new Tablero();
    }

    @After
    public void tearDown() throws Exception {

    }

    public void rellenarTablero () {
        for (int i = 0; i < tester.getAlto(); i++) {
            for (int j = 0; j < tester.getAncho(); j++) {
                tester.setPosicion(i, j, ((i + j) % 2 == 0) ? Ficha.BLANCA : Ficha.NEGRA);
            }
        }
    }

    public void vaciarTablero () {
        for (int i = 0; i < tester.getAlto(); i++) {
            for (int j = 0; j < tester.getAncho(); j++) {
                tester.setPosicion(i, j, Ficha.VACIA);
            }
        }
    }

    @Test
    public void testSetPosicionAndGetPosition() throws Exception {

        this.rellenarTablero();

        for (int i = 0; i < tester.getAlto(); i++) {
            for (int j = 0; j < tester.getAncho(); j++) {
                assertEquals("Result getPosition de i = " + i + " y j = " + j,
                                ((i + j) % 2 == 0) ? Ficha.BLANCA : Ficha.NEGRA,
                                tester.getPosicion(i, j));
            }
        }

    }

    @Test
    public void testIsFull () throws Exception {

        this.vaciarTablero();

        assertEquals("Result TestisFull when is not full", false, tester.isFull());

        this.rellenarTablero();

        assertEquals("Result TestisFull when is full", true, tester.isFull());
    }

    @Test
    public void testToString() throws Exception {

        this.vaciarTablero();

        assertEquals("Result testToString when is empty",
                "|       |\n" +
                        "|       |\n" +
                        "|       |\n" +
                        "|       |\n" +
                        "|       |\n" +
                        "|       |\n" +
                        "+-------+\n" +
                        " 1234567 \n"
                , tester.toString());

        this.rellenarTablero();

        assertEquals("Result testToString when is empty",
                "|OXOXOXO|\n" +
                        "|XOXOXOX|\n" +
                        "|OXOXOXO|\n" +
                        "|XOXOXOX|\n" +
                        "|OXOXOXO|\n" +
                        "|XOXOXOX|\n" +
                        "+-------+\n" +
                        " 1234567 \n"
                , tester.toString());
    }

    @Test
    public void testReset() throws Exception {
        this.rellenarTablero();

        Tablero aux = new Tablero();

        tester.reset();

        assertEquals("Result testReset", aux, tester);
    }
}