public class Direccion {
    private String colonia;
    private String codigoPostal;

    public Direccion (String colonia, String codigoPostal) {
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
    }

    @Override 
    public String toString() {
        return "Dirección: \n"
                + "Colonia: " 
                + this.colonia 
                + ", CP: " 
                + this.codigoPostal;
    }

    public static void main(String [] args) {
        Direccion direccion = new Direccion("Roma Sur", "06760");
        Alumno alumno = new Alumno("Raúl Eduardo Martínez Dámaso",
                                    "316155063",
                                    direccion);
    }
}