public class Circulo extends FiguraGeometrica{
    private double Radio;
    public Circulo(String Color,String Nombre,double radio) {
        super(Nombre, Color);
        this.Radio = radio;
    }
    public double calcularArea() {
        return Math.PI * Radio * Radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * Radio;
    }

}
