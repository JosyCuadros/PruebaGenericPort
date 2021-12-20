package com.example.pruebagenericaport.external_services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ExternalClient {

    ObjectMapper objectMapper =  new ObjectMapper();

    public <T, R extends PagoResponse> R call(ExternalRequest<T> externalRequest, Class<R> responseType) throws JsonProcessingException {
        String response = "";

        if (externalRequest.serviceName == "TARJETA") {
            response = " { \"nroComprobante\":\"1234\", \"idPago\": \"1\", \"nroTarjeta\": \"4242424242424242\", \"importe\": \"123\"}";
        } else if(externalRequest.serviceName == "TRANSFERENCIA") {
            response = "{ \"nroComprobante\": \"5678\", \"idPago\": \"1\", \"banco\": \"Banco Santapacienca\", \"importe\": \"123\"}";
        }

        return objectMapper.readValue(response, responseType);
    }
}
