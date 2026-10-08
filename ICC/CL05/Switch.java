public class Switch {
    
    public String obtenerMesV1(int mes) {
        if (mes == 1) return "Enero";
        else if (mes == 2) return "Febrero";
        else if (mes == 3) return "Marzo";
        else if (mes == 4) return "Abril";
        else if (mes == 5) return "Mayo";
        else if (mes == 6) return "Junio";
        else if (mes == 7) return "Julio";
        else if (mes == 8) return "Agosto";
        else if (mes == 9) return "Septiembre";
        else if (mes == 10) return "Octubre";
        else if (mes == 11) return "Noviembre";
        else if (mes == 12) return "Diciembre";
        else return "Mes inválido";
    }

    public String obtenerMesV2(int mes) {
        switch (mes) {
            case 1:  return "Enero";
            case 2:  return "Febrero";
            case 3:  return "Marzo";
            case 4:  return "Abril";
            case 5:  return "Mayo";
            case 6:  return "Junio";
            case 7:  return "Julio";
            case 8:  return "Agosto";
            case 9:  return "Septiembre";
            case 10: return "Octubre";
            case 11: return "Noviembre";
            case 12: return "Diciembre";
            default: return "Mes inválido";
        }
    }

    public static void main(String[] args) {
        int numero = 2;
        switch (numero) {
            case 1:
                System.out.println("Uno.");
            case 2:
                System.out.println("Dos.");
            case 3:
                System.out.println("Tres.");
            default:
                System.out.println("Otro caso.");
        }
    }
}