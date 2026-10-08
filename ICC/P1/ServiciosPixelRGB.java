/**
* Los servicios que debe ofrecer un PixelRGB.
*/
public interface ServiciosPixelRGB {

    /**
    * Indica si los tres valores asociados al pixel son 0.
    * @return true si es negro, false en otro caso.
    */
    public boolean esNegro ();

    /**
    * Indica si los tres valores asociados al pixel son 255.
    * @return true si es blanco, false en otro caso.
    */
    public boolean esBlanco ();

    /**
    * Indica si los tres valores asociados al pixel tienen
    * exactamente el mismo valor, pero el pixel no es blanco
    * ni negro.
    * @return true si es gris, false en otro caso .
    */
    public boolean esGris();

    /**
    * Devuelve el valor máximo de entre los tres valores RGB.
    * @return El valor máximo de entre sus valores RGB.
    */
    public int valorMaximo ();

    /**
    * Devuelve el valor mínimo de entre los tres valores RGB.
    * @return El valor mínimo de entre sus valores RGB.
    */
    public int valorMinimo ();

    /**
    * Devuelve el pixel con los valores complementarios para
    * lograr el color blanco.
    * Por ejemplo, si un pixel tiene los valores (2, 250, 100),
    * entonces su complemento tendrá los valores (253, 5, 155).
    * @return Un nuevo pixel RGB con los valores complementarios .
    */
    public PixelRGB complemento ();

    /**
    * Calcula el valor máximo y el mínimo entre los valores RGB
    * almacenados y asigna a cada una de las entradas el promedio
    * de los valores máximo y mínimo redondeando hacia abajo.
    *
    * Por ejemplo , si un pixel tiene los valores (20, 89, 151),
    * entonces su versión en escala de grises tendrá los valores
    * (85, 85, 85).
    */
    public void aEscalaDeGrises ();

    /**
    * Si un pixel RGB tiene asociados los valores (r, g, b), al
    * rotar sus valores ahora corresponderá con (b, r, g), pues
    * los valores se rotan a la derecha.
    */
    public void rotaValores ();

    /**
    * Obtiene la combinación de dos pixeles RGB a partir del
    * promedio de valores entre el pixel actual y otro. El redondeo
    * de valores se hará hacia abajo .
    * Por ejemplo, si un pixel tiene los valores (10, 100, 250)
    * y otro pixel tiene los valores (5, 100, 50) , entonces la
    * combinación de ambos tendría los valores (7, 100, 150).
    * @param otro El pixel RGB con el que se hará la combinación.
    */
    public void combina (PixelRGB otro );

    /**
    * Combina el pixel actual con el blanco, es decir, el pixel
    * RGB de valores (255, 255, 255).
    */
    public void aclara ();

    /**
    * Combina el pixel actual con el negro, es decir, el pixel
    * RGB de valores (0, 0, 0).
    */
    public void oscurece ();

    /**
    * Devuelve una cadena que exhiba con buen formato los
    * valores RGB del pixel.
    * @return La cadena correspondiente al pixel RGB.
    */
    public String muestra ();

}