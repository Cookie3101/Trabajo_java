public class Estudiante extends Persona{
    private int Grado;

    @Override
    public String toString() {
        return "Estudiante{" + "Grado=" + Grado + '}';
    }

    public Estudiante(String nombre,int edad, int FechaNacimiento, int grado) {
    super(nombre,edad,FechaNacimiento);
    this.Grado = grado;

    }
}
