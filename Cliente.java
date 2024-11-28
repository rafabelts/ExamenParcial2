
public abstract class Cliente {

    private String name;
    private String identificador;
    private String numeroTelefonico;

    public static int nClientes;
    public double facturaMensual;

    public Cliente(String name, String identificador, String numeroTelefonico) {
        this.name = name;
        this.identificador = identificador;
        this.numeroTelefonico = numeroTelefonico;

        nClientes++;
    }

    public String getName() {
        return this.name;
    }

    abstract void emitirFactura(double minutosConsumidos);

}
