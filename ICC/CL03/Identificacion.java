public class Identificacion {
    private Persona persona;
    private String nombreCompleto;
    private String direccionCompleta;

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
        System.out.println("Edad: " + personaFicticia.getEdad());
        personaFicticia.setEdad(-10);
        System.out.println("Edad: " + personaFicticia.getEdad());
    }

    
}