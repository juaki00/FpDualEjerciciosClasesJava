package Ej1_2_3;

public class Orden {
    private Cliente cliente;
    private Empleado empleado;
    private int numero;
    private String tipo;
    private boolean ordenRealizada;
    private String descripcion;

    public Orden(Cliente cliente, Empleado empleado, int numero, String tipo, String descripcion) {
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.empleado = empleado;
        this.tipo = tipo;
        this.numero = numero;
        this.ordenRealizada = false;
    }

    public void realizarOrden(Empleado empleado, Cliente cliente, String tipo) {
        System.out.println("Orden realizada por " + empleado.getNombre());
        this.ordenRealizada = true;
    }

    public void llamarEmpleado() {
        this.empleado.llamar();
    }

    public void llamarCliente() {
        this.cliente.realizarLlamada();
    }

    public void verDatosCliente() {
        this.cliente.verDatos();
    }

    public void verDatosEmpleado() {
        this.empleado.verDatos();
    }
}
