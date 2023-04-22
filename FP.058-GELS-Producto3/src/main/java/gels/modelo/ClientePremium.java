package gels.modelo;
/**
 *
 * @author gels
 */
public class ClientePremium extends Clientes {
    public ClientePremium(String nombre, String domicilio, String nif, String email) {
        super(nombre, domicilio, nif, email, TipoCliente.PREMIUM);
    }

    @Override
    public String tipoCliente() {
        return TipoCliente.PREMIUM.toString();
    }

    @Override
    public float calcAnual() {
        return 0;
    }

    @Override
    public float descuentoEnv() {
        return 0;
    }
}
