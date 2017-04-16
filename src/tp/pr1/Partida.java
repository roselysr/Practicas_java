package tp.pr1;

/**
 * Created by miguel on 15/04/2017.
 */
public class Partida {
    private Tablero tablero;
    private Ficha turno;
    private boolean  terminada;
    private Ficha ganador;

    public Partida (int ancho, int alto) {
        this.tablero = new Tablero(ancho, alto);
        this.turno = Ficha.BLANCA;
        this.terminada = false;
        this.ganador = Ficha.VACIA;
    }

    private void canbiarTurno () {
        switch (this.turno) {
            case BLANCA: this.turno = Ficha.NEGRA;
                break;
            case NEGRA: this.turno = Ficha.BLANCA;
                break;
        }
    }

    public boolean ejecutaMovimiento(Ficha color, int col) throws ColumnaCompletaException {

        Ficha [][] tableroActual = this.tablero.getTablero ();
        for (int i = this.tablero.getAlto(); i >= 0; i--) {
            if (tableroActual [col][i] == Ficha.VACIA) {
                this.tablero.setPosicion(i, col, color);
                if (this.tablero.isFull()) {
                    terminada = true;
                }
                else {
                    this.canbiarTurno();
                }
                return true;
            }
        }
        throw new ColumnaCompletaException("La columna " + col + "está completa");
    }
}
