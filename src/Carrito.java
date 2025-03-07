public class Carrito {
    private String IdCompra;
    private String IdProducto;
    private String NombreProducto;
    private int Cantidad;
    private int ValorProducto;
    private int DNI;

    public Carrito() {}

    public void setIdCompra(String IdCompra) { this.IdCompra = IdCompra; }
    public void setIdProducto(String IdProducto) { this.IdProducto = IdProducto; }
    public void setNombreProducto(String NombreProducto) { this.NombreProducto = NombreProducto; }
    public void setCantidad(int Cantidad) { this.Cantidad = Cantidad; }
    public void setValorProducto(int ValorProducto) { this.ValorProducto = ValorProducto; }
    public void setDNI(int DNI) { this.DNI = DNI; }

    public String getIdCompra() { return IdCompra; }
    public String getIdProducto() { return IdProducto; }
    public String getNombreProducto() { return NombreProducto; }
    public int getCantidad() { return Cantidad; }
    public int getValorProducto() { return ValorProducto; }
    public int getDNI() { return DNI; }

    public double getValorTotal() {
        return ValorProducto * Cantidad;
    }

    public void mostrarInfo() {
        String border = "---------------------------------------------------------------";
        System.out.println(border);
        System.out.printf("| %-18s: %-25s |\n", "ID COMPRA", IdCompra);
        System.out.printf("| %-18s: %-25s |\n", "ID PRODUCTO", IdProducto);
        System.out.printf("| %-18s: %-25s |\n", "NOMBRE", NombreProducto);
        System.out.printf("| %-18s: %-25d |\n", "CANTIDAD", Cantidad);
        System.out.printf("| %-18s: %-25d |\n", "VALOR UNITARIO", ValorProducto);
        System.out.printf("| %-18s: %-25.2f |\n", "TOTAL", getValorTotal());
        System.out.printf("| %-18s: %-25s |\n", "COMPRADOR DNI", DNI);
        System.out.println(border);
    }

}
