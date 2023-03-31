package Ej1_2_3;

public class Empleado {
    private String nombre;
    private int numEmpleado;
    private String sector;
    private int telefono;

    public Empleado(String nombre, int numEmpleado, String sector, int telefono){
        this.numEmpleado = numEmpleado;
        this.sector = sector;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void verDatos(){
        System.out.println("Nombre del empleado: " + this.nombre +
                            "Numero de empleado: " + this.numEmpleado +
                            "Sector del empleado: " + this.sector +
                            "Telefono: " + this.telefono);
    }

    public void cambiarDeSector(String nuevoSector){

        sector = nuevoSector;
    }

    public void llamar(){
        System.out.println("Realizando llamada del empleado " + this.nombre + " desde el telefono " + this.telefono + "...");
    }

    public String getNombre() {
        return nombre;
    }
}
