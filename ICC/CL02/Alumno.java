public class Alumno {
    private String nombre;
    private String numeroCuenta;
    private Direccion direccion;

    public Alumno (String nombre, String numeroCuenta, Direccion direccion) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.direccion = direccion;
    }

    @Override 
    public String toString() {
        return "Datos del alumno: \n" 
                + "Nombre: " + this.nombre + "\n"
                + "Número de cuenta: " + this.numeroCuenta + "\n"
                + direccion.toString();
    }

    public static void main(String[] args) {
        Direccion direccion = new Direccion("Roma Sur", "06760");
        Alumno alumno = new Alumno("Raúl Eduardo Martínez Dámaso",
                                    "316155063",
                                    direccion);
        System.out.println(alumno);

        alumno.nombre = "Saúl Hernandez";
    }
}