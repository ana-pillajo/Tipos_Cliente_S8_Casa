public class Cliente {
    protected String identificacion;
    protected String nombre;

    public Cliente(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularDescuento(double compra) {
        return 0;
    }

    public String mostrarInformacion() {
        return identificacion + " - " + nombre;
    }
}