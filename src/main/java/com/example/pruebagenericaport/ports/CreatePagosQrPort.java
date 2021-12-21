package com.example.pruebagenericaport.ports;

import com.example.pruebagenericaport.external_services.ExternalClient;
import com.example.pruebagenericaport.external_services.qr.CreatePagosQrRequest;
import com.example.pruebagenericaport.external_services.qr.CreatePagosQrResponse;
import com.example.pruebagenericaport.ports.mappers.CreatePagosBoToExternalRequestMapper;

public class CreatePagosQrPort extends AbstractCreatePagosPortImpl<CreatePagosQrRequest, CreatePagosQrResponse>{

    public CreatePagosQrPort(CreatePagosBoToExternalRequestMapper<CreatePagosQrRequest> createPagosBoToExternalRequestMapper, ExternalClient externalClient) {
        super(createPagosBoToExternalRequestMapper, externalClient);
    }

    @Override
    protected Class<CreatePagosQrResponse> getResponseType() {
        return CreatePagosQrResponse.class;
    }
}
