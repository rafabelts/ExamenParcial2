
public class ClienteNormal extends Cliente {

    public ClienteNormal(String name, String identificador, String numeroTelefonico) {
        super(name, identificador, numeroTelefonico);
    }

    @Override
    void emitirFactura(double minutosConsumidos) {
        double total = minutosConsumidos * 0.25;
        if (minutosConsumidos > 100) {
            super.facturaMensual = total + (10 * total) / 100;
        } else {
            super.facturaMensual = total;
        }
    }

}
