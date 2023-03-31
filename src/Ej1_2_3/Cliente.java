package Ej1_2_3;

public class Cliente {

    private String nombre;
    private String dni;
    private String telefono;
    private String direccion;
    private int edad;

    public Cliente(String nombre , String dni, String telefono, String direccion, int edad){
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.edad = edad;
    }

    public boolean esMayorDeEdad(){

        return this.edad >= 18;
    }

    public void cambiarNombre(String nuevoNombre){

        nombre = nuevoNombre;
    }

    public void cambiarDireccion(String nuevaDireccion){

        nombre = nuevaDireccion;
    }

    public void verDatos(){
        System.out.println( "Nombre: " + this.nombre +
                            "Telefono: " + this.telefono +
                            "Direccion: " + this.direccion +
                            "Edad: " + this.edad);
    }

    public void realizarLlamada(){
        System.out.println("Realizando llamada de " + this.nombre + " desde el telefono " + this.telefono + "...");
    }

}
