package com.example.pruebagenericaport.ports;

import com.example.pruebagenericaport.external_services.transferencia.CreatePagosTransferenciaRequest;
import com.example.pruebagenericaport.external_services.transferencia.CreatePagosTransferenciaResponse;
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
