package com.example.pruebagenericaport.ports.mappers;

import com.example.pruebagenericaport.PagosBo;
import com.example.pruebagenericaport.external_services.CreatePagosTarjetaRequest;
import com.example.pruebagenericaport.external_services.ExternalRequest;

public class PagosBoToCreatePagoTarjetaRequestMapper implements CreatePagosBoToExternalRequestMapper<CreatePagosTarjetaRequest> {
    @Override
    public ExternalRequest<CreatePagosTarjetaRequest> map(PagosBo pagosBo) {
        return null;
    }
}
