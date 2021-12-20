package com.example.pruebagenericaport.ports;

import com.example.pruebagenericaport.external_services.CreatePagosTransferenciaRequest;
import com.example.pruebagenericaport.external_services.CreatePagosTransferenciaResponse;
import com.example.pruebagenericaport.external_services.ExternalClient;
import com.example.pruebagenericaport.ports.mappers.CreatePagosBoToExternalRequestMapper;

public class CreatePagosTransferenciaPort extends AbstractCreatePagosPortImpl<CreatePagosTransferenciaRequest, CreatePagosTransferenciaResponse>{


    public CreatePagosTransferenciaPort(CreatePagosBoToExternalRequestMapper<CreatePagosTransferenciaRequest> createPagosBoToExternalRequestMapper, ExternalClient externalClient) {
        super(createPagosBoToExternalRequestMapper, externalClient);
    }

    @Override
    protected Class<CreatePagosTransferenciaResponse> getResponseType() {
        return CreatePagosTransferenciaResponse.class;
    }
}
