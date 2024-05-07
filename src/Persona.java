import java.sql.SQLOutput;

public class Persona{
    private String Nombre;
    private int Edad;
    private int FechaNacimiento;



    public Persona(String nombre, int edad, int fechaNacimiento) {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
     if (edad >0){
         System.out.println("Cada vez mas viejo");
         Edad = edad;
     }
     else {
         System.out.println("El numero ingresado no es valido");
     }
    }

    public int getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public void calcularFechaNacimiento(){
     FechaNacimiento = 2024 - Edad;
    }

}

