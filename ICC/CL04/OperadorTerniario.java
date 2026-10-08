public class OperadorTerniario {

    public String esMultiploDe2 (int valor) {
        return valor % 2 == 0 ? "Es múltiplo de 2" : "No es múltiplo";
    }

    public String esMultiploDe2V2 (int valor) {
        if (valor % 2 == 0) {
            return "Es múltiplo de 2";
        } else {
            return "No es múltiplo";
        }
    }   

    public int establecerValor (int valor) {
        return Math.max(0, Math.min(255, valor));
    }

    public static void main(String[] args) {
        OperadorTerniario prueba = new OperadorTerniario();
        System.out.println ( "x= " + prueba.establecerValor(100));
    }
}