public class Gerente extends Empleado {
    private double bono;
    public Gerente(String nombre, double salario) {
        super(nombre, salario);
        this.bono = bono;

    }
    @Override
    public double calcularSalario() {
        return Salario + bono;
}
}