public class Estudiante extends Persona implements Trabajador{
    private int Grado;

    @Override
    public void realizarTarea() {
        System.out.println("Realizando tarea escolar");
    }

    @Override
    public String toString() {
        return "Estudiante{" + "Grado=" + Grado + '}';
    }

    public Estudiante(String nombre,int edad, int FechaNacimiento, int grado) {
    super(nombre,edad,FechaNacimiento);
    this.Grado = grado;

    }
}
