public class Ejercicio4 {

    public static void main(String[] args) {

        mainWhile (1);
        mainDoWhile (10);
        mainFor (0);

        mainSwitch ("Otoño");

        int numeroIf = -2;

        if (numeroIf < 0) {
            System.out.println("Ejercicio If: \nEs negativo");
        } else if (numeroIf > 0) {
            System.out.println("Ejercicio If: \nEs positivo");
        } else {
        System.out.println("Ejercicio If: \nEs cero"); }

}

    public static void mainWhile (int a) {

        System.out.println("Ejercicio While:");
        while (a < 3) {
            System.out.println(a);
            a++;
        }
    }

        public static void mainDoWhile (int a) {

            System.out.println("Ejercicio DoWhile:");
            do {
                System.out.println(a);
                a++;
            }while (a == 5);

        }

    public static void mainFor (int a) {

        System.out.println("Ejercicio For:");

        for (a = 0; a <= 3; a++) {

            System.out.println(a);
        }
}
    public static void mainSwitch (String a) {

        System.out.println("Ejercicio Switch:");

        switch (a){

            case "Verano": System.out.println("Es verano"); break;
            case "Otoño": System.out.println("Es otoño"); break;
            case "Invierno": System.out.println("Es invierno"); break;
            case "Primavera": System.out.println("Es primavera"); break;
        }
    }

}