public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(10, 10);
        Triangolo trinagolo = new Triangolo(5, 10);

        double risultatoTriangolo = trinagolo.calcolaArea();
        double risultatoRettangolo = rettangolo.calcolaArea();

        System.out.println("L'area del triangolo è : " + risultatoTriangolo);
        System.out.println("L'area del rettangolo è " + risultatoRettangolo);
    }
}




//Scrivere un programma che contenga una interfaccia Forma ed un metodo chiamato calcolaArea().
//Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma ed implementano il metodo per il calcolo dell'area.