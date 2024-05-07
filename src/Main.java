public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Persona persona1 = new Persona();
        persona1.setNombre("Dahiana");
        persona1.setEdad(20);
        persona1.calcularFechaNacimiento();
        System.out.println(persona1.toString());
    }
}