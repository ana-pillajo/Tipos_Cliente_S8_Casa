public class ClientePremium extends Cliente {
    private int puntos;

    public ClientePremium(String identificacion, String nombre, int puntos) {
        super(identificacion, nombre);
        this.puntos = puntos;
    }

    @Override
    public double calcularDescuento(double compra) {
        return compra * 0.15;
    }

    @Override
    public String mostrarInformacion() {
        return "[Premium] " + super.mostrarInformacion()
                + " - Puntos: " + puntos + " - Descuento: 15%";
    }
}