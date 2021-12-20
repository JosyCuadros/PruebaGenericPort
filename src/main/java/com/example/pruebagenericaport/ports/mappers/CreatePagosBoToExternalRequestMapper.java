package com.example.pruebagenericaport.ports.mappers;

import com.example.pruebagenericaport.PagosBo;
import com.example.pruebagenericaport.external_services.ExternalRequest;

public interface CreatePagosBoToExternalRequestMapper<T> {
    ExternalRequest<T> map(PagosBo pagosBo);
}
