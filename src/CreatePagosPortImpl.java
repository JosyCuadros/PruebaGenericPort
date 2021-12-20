public abstract class CreatePagosPortImpl<T,R> implements CreatePagosPort<R>{

   private CreatePagosBoToExternalRequestMapper<T> createPagosBoToExternalRequestMapper;
   private ExternalClient externalClient;

   protected abstract Class<R> getResponseType();

    public CreatePagosPortImpl(CreatePagosBoToExternalRequestMapper<T> createPagosBoToExternalRequestMapper, ExternalClient externalClient) {
        this.createPagosBoToExternalRequestMapper = createPagosBoToExternalRequestMapper;
        this.externalClient = externalClient;
    }

    @Override
    public String execute(PagosBo pagosBo) {
        ExternalRequest externalRequest = createPagosBoToExternalRequestMapper.map(pagosBo);
        R response = externalClient.call(externalRequest, getResponseType());
        return response.getNroComprobante();
    }

}
