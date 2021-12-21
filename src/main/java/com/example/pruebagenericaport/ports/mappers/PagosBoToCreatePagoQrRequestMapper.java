package com.example.pruebagenericaport.ports.mappers;

import com.example.pruebagenericaport.PagosBo;
import com.example.pruebagenericaport.external_services.ExternalRequest;
import com.example.pruebagenericaport.external_services.qr.CreatePagosQrRequest;

public class PagosBoToCreatePagoQrRequestMapper implements CreatePagosBoToExternalRequestMapper<CreatePagosQrRequest> {

    @Override
    public ExternalRequest<CreatePagosQrRequest> map(PagosBo pagosBo) {
        CreatePagosQrRequest createPagosQrRequest = (CreatePagosQrRequest) pagosBo.getBody();
        ExternalRequest<CreatePagosQrRequest> externalRequest = new ExternalRequest<CreatePagosQrRequest>(pagosBo.getServiceName(), createPagosQrRequest);

        return externalRequest;



    }
}
