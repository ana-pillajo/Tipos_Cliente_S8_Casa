import java.util.ArrayList;

public class ProgramaFidelidad {
    private ArrayList<Cliente> clientes;

    public ProgramaFidelidad() {
        clientes = new ArrayList<>();
    }

    public boolean agregarCliente(Cliente cliente) {
        if (cliente == null || buscarCliente(cliente.getIdentificacion()) != null) {
            return false;
        }
        clientes.add(cliente);
        return true;
    }

    public Cliente buscarCliente(String identificacion) {
        for (Cliente cliente : clientes) {
            if (cliente.getIdentificacion().equals(identificacion)) {
                return cliente;
            }
        }
        return null;
    }

    public String listarClientes() {
        if (clientes.isEmpty()) {
            return "No hay clientes en el programa.";
        }
        String resultado = "";
        for (Cliente cliente : clientes) {
            resultado += cliente.mostrarInformacion() + "\n";
        }
        return resultado;
    }

    public String mostrarDescuentos(double compra) {
        String resultado = "";
        for (Cliente cliente : clientes) {
            resultado += cliente.getNombre() + ": $"
                    + String.format("%.2f", cliente.calcularDescuento(compra)) + "\n";
        }
        return resultado;
    }

    public int cantidadClientes() {
        return clientes.size();
    }

    public double calcularDescuentoTotal(double compra) {
        double total = 0;
        for (Cliente cliente : clientes) {
            total += cliente.calcularDescuento(compra);
        }
        return total;
    }
}