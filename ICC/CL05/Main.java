public class Main {
    public static void main(String[] args) {

        // Se crea un objeto de la clase Persona.
        Persona personaRaul = new Persona ("Raúl Eduardo Martínez Dámaso", -26);

        /**
         * El atributo edad de cualquier objeto de tipo Persona no se puede acceder desde otras clases 
         * con el operador punto (.) por lo que no podemos hacer cambios que alteren de manera abrupta
         * la interpretación de los objetos.
         */
        // personaRaul.edad = -26;

        /**
         *  ¿Cómo podemos modificar el atributo de un objeto? Por medio del método setter asociado al 
         * atributo del objeto que queramos modificar, ya que es el permiso que te da el objeto de
         * interactuar con su atributo.
        */
        personaRaul.setEdad(-28);
        personaRaul.setNombre("");
        personaRaul.setNombre(" ");
        System.out.println(personaRaul.toString());
    }
}