public class Operador {

    public boolean esMultiploDeDosV1 (int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esMultiploDeDosV2 (int numero) {
        return numero % 2 == 0;
    }

    public String esMultiploDeDosV3 (int numero) {
        if (numero % 2 == 0) {
            return "El número " + numero + " es par";
        }
            return "El número " + numero + " no es par";
    }

    public static void main(String[] args) {
        boolean menorQue = 10 < 0;
        boolean mayorQue = 10 > 0;
        boolean menorIgual = 10 <= 0;
        boolean mayorIgual = 10 >= 0;
        boolean comparacion = 10 == 0;

        boolean and = 10 < 0 && 10 > 0;
        boolean or = 10 < 0 || 10 > 0;
        boolean not = ! (10 < 0);

        System.out.println(menorQue);
        System.out.println(mayorQue);
        System.out.println(menorIgual);
        System.out.println(comparacion);
        System.out.println();
        System.out.println(and);
        System.out.println(or);
        System.out.println(not);

    }
}