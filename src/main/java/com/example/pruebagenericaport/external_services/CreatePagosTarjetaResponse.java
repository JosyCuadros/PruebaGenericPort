package com.example.pruebagenericaport.external_services;

public class CreatePagosTarjetaResponse extends PagoResponse {
    private String idPago;
    private String nroTarjeta;
    private String importe;

    public String getIdPago() {
        return idPago;
    }

    public String getNroTarjeta() {
        return nroTarjeta;
    }

    public String getImporte() {
        return importe;
    }
}
