package com.example.pruebagenericaport.external_services;

public class ExternalRequest<T> {

    String serviceName;
    T body;

    public ExternalRequest(String serviceName, T body) {
        this.serviceName = serviceName;
        this.body = body;
    }

    public T getBody() {
        return body;
    }
}
