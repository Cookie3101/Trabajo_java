public class Rectangulo extends FiguraGeometrica{
    private double Longitud;
    private double Ancho;

    public Rectangulo(String Color,String Nombre,double Longitud,double Ancho) {
        super(Nombre, Color);
        this.Longitud = Longitud;
        this.Ancho = Ancho;

    }
    public double calcularArea() {
        return Longitud * Ancho;
    }

    public double calcularPerimetro() {
        return 2 * (Longitud +  Ancho);
    }


}
