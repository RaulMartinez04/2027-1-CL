public class Videojuego {
    // ATRIBUTOS (Características de los objetos)
    String modalidad;
    String nombre;
    float precio;
    String plataforma;

    /**
     * Método constructor: Método especial que se manda llamar automáticamente 
     * cuando se crea un objeto y que inicializa los atributos del objeto de
     * la clase Videojuego.
     * inicializar 
     */
    public Videojuego(String modalidad, String nombre, float precio, String plataforma) {
            /**
             * Generalmente los parámetros de la función se llaman igual que los atributos
             * de los objetos, para diferenciarlos, se usa la palabra reservada this, que 
             * referencia en este caso el atributo del objeto que mande a llamar el método
             * constructor.
             */
            this.modalidad = modalidad; 
            this.nombre = nombre;
            this.precio = precio;
            this.plataforma = plataforma;
    }

    // MÉTODOS (Comportamientos de los objetos)

    /**
     * Método toString: Método que devuelve una cadena de texto (String) que representa
     * la información del objeto que mande a llamar al método.
     */
    @Override 
    public String toString() {
        String cadena = "Datos del videojuego: " + "\n"
                        + this.modalidad + "\n"
                        + this.nombre + "\n"
                        + this.precio + "\n"
                        + this.plataforma;
        return cadena;
    }

    // MÉTODO MAIN: Método especial que se manda a llamar cuando ejecutamos el programa (con el comando en terminal java).
    public static void main(String[] args) {
        Videojuego theLastOfUs = new Videojuego("Online", "The Last of Us", 499.99f, "PlayStation");
        Videojuego residentEvil4 = new Videojuego("Offline", "Resident Evil 4", 699.99f, "PlayStation");

        System.out.println(theLastOfUs);
        System.out.println(residentEvil4);
    }
}