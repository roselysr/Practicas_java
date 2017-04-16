package tp.pr1;

/**
 * Created by miguel on 15/04/2017.
 */
public enum Ficha {
    VACIA (" "),
    BLANCA ("O"),
    NEGRA ("X");

    private final String name;

    private Ficha(String s) {
        name = s;
    }

    public String toString() {
        return this.name;
    }
}
