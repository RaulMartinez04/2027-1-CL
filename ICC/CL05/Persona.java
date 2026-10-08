public class Persona {

    ////////// ATRIBUTOS DE LOS OBJETOS //////////
    private String nombreCompleto;
    private int edad;

    ////////// MÉTODO CONSTRUCTOR //////////
    
    public Persona (String nombreCompleto, int edad) {
        this.nombreCompleto = nombreCompleto;
        this.edad = this.verificarEdad(edad);
    }

    ////////// MÉTODOS DE ACCESO (GETTERS) //////////
    
    public String getNombre () {
        return this.nombreCompleto;
    }

    public int getEdad () {
        return this.edad;
    }
    
    ////////// MÉTODOS MUTANTES (SETTERS) //////////
    
    public void setNombre (String nuevoNombre) {
        this.nombreCompleto = nuevoNombre.equals("") || nuevoNombre.equals(" ") 
                              ? this.nombreCompleto
                              : nuevoNombre;
    }

    public void setEdad(int edad) {
        this.edad = this.verificarEdad(edad);
    }

    public int verificarEdad (int edad) {
        return edad < 0 ? -edad : edad;
    }

    ////////// MÉTODOS TOSTRING //////////
    @Override
    public String toString () {
        return "[Nombre: " + this.nombreCompleto + " ]" + "\n"
                + "[Edad: " + this.edad + " ]";
    }
}