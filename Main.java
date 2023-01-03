public class Main {

    public static void main(String[] args) {
        miVariable(5, 10, 20);

        coche miCoche = new coche();
        miCoche.sumarPuertas();

        System.out.println(miCoche.puertas);
    }


    public static void miVariable(int a, int b, int c) {
        int resultado = a + b + c;

        System.out.println(resultado);

    }
}

class coche {

    public int puertas = 4;

    public void sumarPuertas() {
        this.puertas++;
    }

}