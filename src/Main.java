public class Main {
    public static void main(String[] args) {

        System.out.println(suma(2,3,6));
        Coche miCoche = new Coche();
        miCoche.masPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int numUno, int numDos, int numTres) {
        return numUno + numDos + numTres;
    }
}

class Coche{
    public int puertas;

    public int masPuertas(){
        return puertas++;
    }
}