package com.example.pruebagenericaport;

public class PagosBo<T> {
    private String serviceName;
    private T body;

    public PagosBo(String serviceName, T body) {
        this.serviceName = serviceName;
        this.body = body;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
