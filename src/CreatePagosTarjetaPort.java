public class CreatePagosTarjetaPort extends  CreatePagosPortImpl<CreatePagosTarjetaPort, CreatePagosTarjetaPort>{

    private String idPago;
    private String NroTarjeta;
    private String importe;
    private String NroComprobante;

    public CreatePagosTarjetaPort(CreatePagosBoToExternalRequestMapper<CreatePagosTarjetaPort> createPagosBoToExternalRequestMapper, ExternalClient externalClient) {
        super(createPagosBoToExternalRequestMapper, externalClient);
    }

    @Override
    protected Class getResponseType() {
        return CreatePagosTarjetaPort.class;
    }

    public String getIdPago() {
        return idPago;
    }

    public String getNroComprobante() {
        return NroComprobante;
    }
}
