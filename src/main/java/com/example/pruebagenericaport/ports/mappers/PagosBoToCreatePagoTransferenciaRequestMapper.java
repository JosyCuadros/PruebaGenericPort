package com.example.pruebagenericaport.ports.mappers;

import com.example.pruebagenericaport.PagosBo;
import com.example.pruebagenericaport.external_services.transferencia.CreatePagosTransferenciaRequest;
import com.example.pruebagenericaport.external_services.ExternalRequest;

public class PagosBoToCreatePagoTransferenciaRequestMapper implements CreatePagosBoToExternalRequestMapper<CreatePagosTransferenciaRequest> {
    @Override
    public ExternalRequest<CreatePagosTransferenciaRequest> map(PagosBo pagosBo) {
        CreatePagosTransferenciaRequest createPagosTransferenciaRequest = (CreatePagosTransferenciaRequest) pagosBo.getBody();
        ExternalRequest<CreatePagosTransferenciaRequest> externalRequest = new ExternalRequest<CreatePagosTransferenciaRequest>(pagosBo.getServiceName(), createPagosTransferenciaRequest);

        return externalRequest;
    }
}
