public class Persona {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String calle;
    private String colonia;
    private String codigoPostal;
    private int edad;

    public Persona (String nombre, String apellidoPaterno, String apellidoMaterno, String calle,
                    String colonia, String codigoPostal, int edad) {
        this.nombre = nombre;
        this.apellidoMaterno = apellidoMaterno;
        this.apellidoPaterno = apellidoPaterno;
        this.calle = calle;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
        this.edad = this.asignarEdad(edad);
    }

    public int getEdad () {
        return this.edad;
    }

    public String getNombre () {
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = this.asignarEdad(edad);
    }

    private int asignarEdad(int edad) {
        if (edad < 0) {
            return 0;
        } else {
            return edad;
        }
    }

    public static void main(String[] args) {
        Persona personaFicticia = new Persona(
            "María",
            "González",
            "Ramírez",
            "Av. Universidad 123",
            "Del Valle",
            "03100",
            25
        );

        System.out.println("Persona ficticia creada:");
        System.out.println("Nombre: " + personaFicticia.nombre);
        System.out.println("Apellido Paterno: " + personaFicticia.apellidoPaterno);
        System.out.println("Apellido Materno: " + personaFicticia.apellidoMaterno);
        System.out.println("Calle: " + personaFicticia.calle);
        System.out.println("Colonia: " + personaFicticia.colonia);
        System.out.println("Código Postal: " + personaFicticia.codigoPostal);
        System.out.println("Edad: " + personaFicticia.edad);
    }
}