public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Persona persona1 = new Persona("Andrea", 20, 2003);
        persona1.setNombre("Dahiana");
        persona1.setEdad(20);
        persona1.calcularFechaNacimiento();
        System.out.println(persona1.toString());
        Trabajador empleado= () -> System.out.println("otra cosa");
        empleado.realizarTarea();
        Rectangulo rectangulo =  new Rectangulo("morado", "Rectangulo", 5, 7);
        Circulo circulo  = new Circulo("Rosado", "circulo", 10 );
        System.out.println("El area y perimetro del rectangulo es");
        System.out.println(rectangulo.calcularArea());
        System.out.println(rectangulo.calcularPerimetro());
        System.out.println("El area y perimetro del circulo es");
        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());

    }
}