package com.example.pruebagenericaport.external_services.tarjeta;

import com.example.pruebagenericaport.external_services.PagoResponse;

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
