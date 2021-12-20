package com.example.pruebagenericaport.ports;

import com.example.pruebagenericaport.PagosBo;
import com.example.pruebagenericaport.external_services.ExternalClient;
import com.example.pruebagenericaport.external_services.ExternalRequest;
import com.example.pruebagenericaport.external_services.PagoResponse;
import com.example.pruebagenericaport.ports.mappers.CreatePagosBoToExternalRequestMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

public abstract class AbstractCreatePagosPortImpl<T, R extends PagoResponse> implements CreatePagosPort<R> {

    private CreatePagosBoToExternalRequestMapper<T> createPagosBoToExternalRequestMapper;
    private ExternalClient externalClient;

    protected abstract Class<R> getResponseType();

    public AbstractCreatePagosPortImpl(CreatePagosBoToExternalRequestMapper<T> createPagosBoToExternalRequestMapper, ExternalClient externalClient) {
        this.createPagosBoToExternalRequestMapper = createPagosBoToExternalRequestMapper;
        this.externalClient = externalClient;
    }

    @Override
    public String execute(PagosBo pagosBo) throws RuntimeException, JsonProcessingException {
        ExternalRequest<T> externalRequest = createPagosBoToExternalRequestMapper.map(pagosBo);
        R response = externalClient.call(externalRequest, getResponseType());
        return response.getNroComprobante();
    }

}
