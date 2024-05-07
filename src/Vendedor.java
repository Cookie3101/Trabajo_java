public class Vendedor extends Empleado{
 private double comision;

    public Vendedor(String nombre, double salario) {
        super(nombre, salario);
            this.comision = comision;
        }

        @Override
        public double calcularSalario() {
            return calcularSalario();
    }

        public double calcularSalario(double ventas) {
            return calcularSalario() + (comision * ventas);
        }
}
