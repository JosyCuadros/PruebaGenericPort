package com.example.pruebagenericaport.ports;

import com.example.pruebagenericaport.ports.mappers.CreatePagosBoToExternalRequestMapper;
import com.example.pruebagenericaport.external_services.ExternalClient;
import com.example.pruebagenericaport.external_services.CreatePagosTarjetaRequest;
import com.example.pruebagenericaport.external_services.CreatePagosTarjetaResponse;

public class CreatePagosTarjetaPort extends AbstractCreatePagosPortImpl<CreatePagosTarjetaRequest, CreatePagosTarjetaResponse> {

    public CreatePagosTarjetaPort(CreatePagosBoToExternalRequestMapper<CreatePagosTarjetaRequest> createPagosBoToExternalRequestMapper, ExternalClient externalClient) {
        super(createPagosBoToExternalRequestMapper, externalClient);
    }

    @Override
    protected Class<CreatePagosTarjetaResponse> getResponseType() {
        return CreatePagosTarjetaResponse.class;
    }

}
