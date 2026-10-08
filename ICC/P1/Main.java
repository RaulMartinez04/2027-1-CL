public class Main {

    public static void main(String[] args) {
        
        System.out.println("PRUEBA DE MÉTODOS\n");

        // Pixeles de prueba:
        PixelRGB pixelNegro = new PixelRGB(0, 0, 0);
        PixelRGB pixelBlanco = new PixelRGB(255, 255, 255);
        PixelRGB pixelGris = new PixelRGB(100, 100, 100);
        PixelRGB pixelComplemento = new PixelRGB(2, 250, 100);

        System.out.println("¿El pixel " + pixelNegro.muestra() + " es negro? "
                            + (pixelNegro.esNegro() ? "Sí" : "No"));

        System.out.println("¿El pixel " + pixelBlanco.muestra() + " es blanco? "
                            + (pixelBlanco.esBlanco() ? "Sí" : "No"));
                            
        System.out.println("¿El pixel " + pixelGris.muestra() + " es gris? "
                            + (pixelGris.esGris() ? "Sí" : "No"));

        System.out.println("¿El pixel " + pixelBlanco.muestra() + " es gris? "
                            + (pixelBlanco.esGris() ? "Sí" : "No"));

        PixelRGB pixelNuevo = pixelComplemento.complemento();

        System.out.println("El complemento del pixel " + pixelComplemento.muestra() + " es "
                            + pixelNuevo.muestra());

        System.out.println("El complemento del pixel anterior " + pixelNuevo.muestra() + " es "
                            + pixelNuevo.complemento().muestra());
    }
}