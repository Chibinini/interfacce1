public class Rettangolo implements Forma {

    //dichiarazione di due variabili
    private double altezza;
    private double larghezza;

    //Costruttore generale
    public Rettangolo(double altezza, double larghezza){
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    //metodo calcolaArea che viene implementato
    @Override
    public double calcolaArea() {
        return altezza * larghezza;
    }
}