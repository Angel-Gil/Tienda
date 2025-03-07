public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Carrito");
        System.out.println(" ");

        Carrito carro1 = new Carrito();
        carro1.setIdCompra("C001");
        carro1.setIdProducto("1001");
        carro1.setNombreProducto("Harina");
        carro1.setCantidad(30);
        carro1.setValorProducto(2200);
        carro1.setDNI(253061202);
        carro1.mostrarInfo();

        System.out.println(" ");
        System.out.println("Productos");
        System.out.println(" ");

        Producto harina = new Producto();
        harina.setIdProducto(carro1.getIdProducto());
        harina.setNombre(carro1.getNombreProducto());
        harina.setPrecio(carro1.getValorProducto());
        harina.setStock(50);
        harina.mostrarInfo();

        System.out.println(" ");
        System.out.println("Clientes");
        System.out.println(" ");

        Cliente maria = new Cliente();
        maria.setDNI(carro1.getDNI());
        maria.setNombre("Maria");
        maria.setDireccion("Popayán, vía principal");
        maria.setCelular("3205012318");
        maria.setCorreo("maria84@gmail.com");
        maria.mostrarInfo();

        System.out.println(" ");
        System.out.println("Pago");
        System.out.println(" ");

        Pago pago1 = new Pago();
        pago1.setIdPago("P001");
        pago1.calcularPago(carro1);
        pago1.mostrarInfo();
    }
}
