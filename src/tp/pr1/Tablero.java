package tp.pr1;

import java.util.Arrays;

/**
 * Created by miguel on 15/04/2017.
 */
public class Tablero {
    private Ficha [][] tablero;
    private int ancho;
    private int alto;

    public Tablero () {
        this.ancho = 7;
        this.alto = 6;
        this.tablero = new Ficha [this.alto][this.ancho];

        for (int i = 0; i < this.alto; i++) {
            for (int j = 0; j < this.ancho; j++) {
                this.tablero [i][j] = Ficha.VACIA;
            }
        }
    }

    public Tablero (int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        this.tablero = new Ficha [this.ancho][this.alto];
        Arrays.fill(this.tablero, Ficha.VACIA);
    }

    public Ficha[][] getTablero() {
        return tablero;
    }

    public int getAncho () {
        return this.ancho;
    }

    public int getAlto() {
        return alto;
    }

    public Ficha getPosicion(int fila, int columna) {
        return this.tablero [fila][columna];
    }

    public void setPosicion(int fila, int columna, Ficha ficha) {
        this.tablero [fila][columna] = ficha;
    }

    public void reset() {
        for (int i = 0; i < this.alto; i++) {
            for (int j = 0; j < this.ancho; j++) {
                this.tablero [i][j] = Ficha.VACIA;
            }
        }
    }

    public boolean isFull() {
        for (int i = 0; i < this.alto; i++) {
            for (int j = 0; j < this.ancho; j++) {
                if (this.tablero [i][j] == Ficha.VACIA) {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() {

        String str = new String("");

        for (int i = 0; i < this.alto; i++) {
            str = str + "|";
            for (int j = 0; j < this.ancho; j++) {
                str = str + tablero [i][j].toString();
            }
            str = str + "|\n";
        }

        str = str + "+";
        for (int i = 0; i < this.ancho; i++) {
            str = str + "-";
        }
        str = str + "+\n";

        str = str + " ";
        for (int i = 0; i < this.ancho; i++) {
            str = str + Integer.toString(i + 1);
        }
        str = str + " \n";

        return str;

    }
}
