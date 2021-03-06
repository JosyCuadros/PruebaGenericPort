package com.example.pruebagenericaport.external_services.transferencia;

import com.example.pruebagenericaport.external_services.PagoResponse;

public class CreatePagosTransferenciaResponse extends PagoResponse {
    private String idPago;
    private String banco;
    private String importe;

    public String getIdPago() {
        return idPago;
    }

    public String getBanco() {
        return banco;
    }

    public String getImporte() {
        return importe;
    }
}
