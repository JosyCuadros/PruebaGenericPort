package com.example.pruebagenericaport.external_services.qr;

import com.example.pruebagenericaport.external_services.PagoResponse;

public class CreatePagosQrResponse extends PagoResponse {

    private String idPago;
    private String codQr;
    public String getIdPago() {
        return idPago;
    }

    public String getCodQr() {
        return codQr;
    }

    public String getImporte() {
        return importe;
    }

    private String importe;
}
