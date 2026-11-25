public class Main {
    public static void main(String[] args) {
        Cliente c1 = new ClienteRegular("1711111111", "Ana Torres", 4);
        Cliente c2 = new ClienteRegular("1722222222", "Luis Mora", 10);
        Cliente c3 = new ClientePremium("1733333333", "María Paz", 1500);
        Cliente c4 = new ClientePremium("1744444444", "Diego Ruiz", 800);
        Cliente c5 = new ClienteCorporativo("1790012345001", "Carlos Vega", "Distribuidora Andina");

        ProgramaFidelidad programa = new ProgramaFidelidad();
        programa.agregarCliente(c1);
        programa.agregarCliente(c2);
        programa.agregarCliente(c3);
        programa.agregarCliente(c4);
        programa.agregarCliente(c5);

        System.out.println("=== CLIENTES DEL PROGRAMA ===");
        System.out.println(programa.listarClientes());

        double compra = 200.00;
        System.out.println("=== DESCUENTOS PARA UNA COMPRA DE $" + String.format("%.2f", compra) + " ===");
        System.out.println("Regular:     $" + String.format("%.2f", c1.calcularDescuento(compra)));
        System.out.println("Premium:     $" + String.format("%.2f", c3.calcularDescuento(compra)));
        System.out.println("Corporativo: $" + String.format("%.2f", c5.calcularDescuento(compra)));
        System.out.println("Corporativo con compra de $600: $" + String.format("%.2f", c5.calcularDescuento(600)));
        System.out.println();

        System.out.println("=== BÚSQUEDA ===");
        Cliente encontrado = programa.buscarCliente("1733333333");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado.mostrarInformacion());
        }
        Cliente noExiste = programa.buscarCliente("0000000000");
        if (noExiste == null) {
            System.out.println("Cliente 0000000000 no encontrado (retornó null)");
        }
        System.out.println();

        System.out.println("=== DESAFÍO ===");
        System.out.println("Descuento de cada cliente para $" + String.format("%.2f", compra) + ":");
        System.out.println(programa.mostrarDescuentos(compra));
        System.out.println("Descuento total otorgado: $" + String.format("%.2f", programa.calcularDescuentoTotal(compra)));
    }
}