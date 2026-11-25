public class ClienteRegular extends Cliente {
    private int comprasRealizadas;

    public ClienteRegular(String identificacion, String nombre, int comprasRealizadas) {
        super(identificacion, nombre);
        this.comprasRealizadas = comprasRealizadas;
    }

    @Override
    public double calcularDescuento(double compra) {
        return compra * 0.05;
    }

    @Override
    public String mostrarInformacion() {
        return "[Regular] " + super.mostrarInformacion()
                + " - Compras realizadas: " + comprasRealizadas + " - Descuento: 5%";
    }
}