public class PixelRGB implements ServiciosPixelRGB{
    private int rojo;
    private int verde;
    private int azul;

    public PixelRGB (int rojo, int verde, int azul) {
        this.rojo = this.establecerValor(rojo);
        this.verde = verde;
        this.azul = azul;
    }

    public boolean esNegro() {
        return this.sonIgualesA(0);
    }

    public boolean esBlanco() {
        return this.sonIgualesA(255);
    }

    public boolean esGris() {
        return !this.esNegro() && !this.esBlanco() && this.sonIgualesA(this.rojo);
    }

    public int valorMaximo () {
        int maximo = (rojo > verde) ? rojo : verde;
        return (maximo > azul) ? maximo : azul;
    }

    public int valorMinimo () {
        int minimo = (rojo < verde) ? rojo : verde;
        return (minimo < azul) ? minimo : azul;
    }

    public PixelRGB complemento () {
        return new PixelRGB(255 - this.rojo, 255 - this.verde, 255 - this.azul);
    }

    public void aEscalaDeGrises () {
        int promedio = (this.valorMaximo() + this.valorMinimo()) / 2;
        this.rojo = promedio;
        this.verde = promedio;
        this.azul = promedio;
    }

    public void rotaValores () {
        int rojo = this.rojo;
        int verde = this.verde;
        int azul = this.azul;

        this.rojo = azul;
        this.verde = rojo;
        this.azul = verde;
    }

    public void combina (PixelRGB otro ) {
        this.rojo = this.calcularPromedio(this.rojo, otro.rojo);
        this.verde = this.calcularPromedio(this.verde, otro.verde);
        this.azul = this.calcularPromedio(this.azul, otro.azul);
    }

    public void aclara () {
        this.combina(new PixelRGB(255, 255, 255));
    }

    public void oscurece () {
        this.combina(new PixelRGB(0, 0, 0));
    }

    public String muestra () {
        return "(Rojo: " + this.rojo 
                + ", Verde: " + this.verde
                + ", Azul: " + this.azul + ")";
    }

    ////////// MÉTODOS AUXILIARES //////////
    
    private boolean sonIgualesA (int valor) {
        return this.rojo == valor && this.verde == valor && this.azul == valor;
    }

    private int calcularPromedio (int valor1, int valor2) {
        return (valor1 + valor2) / 2;
    }

    private int establecerValor (int valor) {
        return Math.max(0, Math.min(255, valor));
    }
}