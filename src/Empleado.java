public class Empleado implements Trabajador{
    private String Nombre;
    public double Salario;

    public Empleado(String nombre, double salario) {
        this.Nombre = nombre;
        this.Salario = salario;
    }

    public double calcularSalario() {
        return Salario;
}

    @Override
    public void realizarTarea() {
        System.out.println("Realizando tarea laboral");
    }


}
