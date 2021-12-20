package com.example.pruebagenericaport.ports;

import com.example.pruebagenericaport.PagosBo;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface CreatePagosPort<R> {

    String execute(PagosBo pagosBo) throws RuntimeException, JsonProcessingException;

}
