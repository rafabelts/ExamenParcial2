
public class ClienteVip extends Cliente {

    public ClienteVip(String name, String identificador, String numeroTelefonico) {
        super(name, identificador, numeroTelefonico);
    }

    @Override
    void emitirFactura(double minutosConsumidos) {
        super.facturaMensual = 0.14 * minutosConsumidos;
    }

}
