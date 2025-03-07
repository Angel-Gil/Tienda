public class Producto {
    private String IdProducto;
    private String Nombre;
    private int Precio;
    private int Stock;

    public Producto() {}

    public void setIdProducto(String IdProducto) { this.IdProducto = IdProducto; }
    public void setNombre(String Nombre) { this.Nombre = Nombre; }
    public void setPrecio(int Precio) { this.Precio = Precio; }
    public void setStock(int Stock) { this.Stock = Stock; }

    public String getIdProducto() { return IdProducto; }
    public String getNombre() { return Nombre; }
    public int getPrecio() { return Precio; }
    public int getStock() { return Stock; }

    public void mostrarInfo() {
        String border = "--------------------------------------------------------------";
        System.out.println(border);
        System.out.printf("| %-15s: %-30s |\n", "ID PRODUCTO", IdProducto);
        System.out.printf("| %-15s: %-30s |\n", "NOMBRE", Nombre);
        System.out.printf("| %-15s: %-30d |\n", "PRECIO", Precio);
        System.out.printf("| %-15s: %-30d |\n", "STOCK", Stock);
        System.out.println(border);
    }

}
