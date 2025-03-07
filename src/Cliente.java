public class Cliente {
    private int DNI;
    private String Nombre;
    private String Direccion;
    private String Celular;
    private String Correo;

    public Cliente() {}

    public void setDNI(int dni) { this.DNI = dni; }
    public void setNombre(String nombre) { this.Nombre = nombre; }
    public void setDireccion(String direccion) { this.Direccion = direccion; }
    public void setCelular(String celular) { this.Celular = celular; }
    public void setCorreo(String correo) { this.Correo = correo; }

    public int getDNI() { return DNI; }
    public String getNombre() { return Nombre; }
    public String getDireccion() { return Direccion; }
    public String getCelular() { return Celular; }
    public String getCorreo() { return Correo; }

    public void mostrarInfo() {
        String border = "--------------------------------------------------------------";
        System.out.println(border);
        System.out.printf("| %-12s: %-30s |\n", "DNI", DNI);
        System.out.printf("| %-12s: %-30s |\n", "NOMBRE", Nombre);
        System.out.printf("| %-12s: %-30s |\n", "DIRECCIÓN", Direccion);
        System.out.printf("| %-12s: %-30s |\n", "CELULAR", Celular);
        System.out.printf("| %-12s: %-30s |\n", "CORREO", Correo);
        System.out.println(border);
    }

}
