public class ClienteCorporativo extends Cliente {
    private String empresa;

    public ClienteCorporativo(String identificacion, String nombre, String empresa) {
        super(identificacion, nombre);
        this.empresa = empresa;
    }

    @Override
    public double calcularDescuento(double compra) {
        if (compra > 500) {
            return compra * 0.15;
        }
        return compra * 0.10;
    }

    @Override
    public String mostrarInformacion() {
        return "[Corporativo] " + super.mostrarInformacion()
                + " - Empresa: " + empresa + " - Descuento: 10% (15% en compras > $500)";
    }
}