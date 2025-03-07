public class Pago {
    private String IdPago;
    private String IdCompra;
    private double IVA;
    private double Total;
    private int DNICliente;

    public Pago() {}

    public void setIdPago(String IdPago) {
        this.IdPago = IdPago;
    }

    public void calcularPago(Carrito carrito) {
        this.DNICliente = carrito.getDNI();
        this.IdCompra = carrito.getIdCompra();
        double valorTotal = carrito.getValorTotal();
        this.IVA = valorTotal * 0.19; 
        this.Total = valorTotal + IVA;
    }

    public String getIdPago() { return IdPago; }
    public String getIdCompra() { return IdCompra; }
    public double getIVA() { return IVA; }
    public double getTotal() { return Total; }
    public int getDNICliente() { return DNICliente; }

    public void mostrarInfo() {
        String border = "----------------------------------------------";
        System.out.println(border);
        System.out.printf("| %-15s: %-15s |\n", "ID PAGO", IdPago);
        System.out.printf("| %-15s: %-15s |\n", "ID COMPRA", IdCompra);
        System.out.printf("| %-15s: %-15.2f |\n", "IVA (19%)", IVA);
        System.out.printf("| %-15s: %-15.2f |\n", "TOTAL CON IVA", Total);
        System.out.printf("| %-15s: %-15s |\n", "CLIENTE DNI", DNICliente);
        System.out.println(border);
    }

}
