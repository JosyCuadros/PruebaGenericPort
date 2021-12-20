package com.example.pruebagenericaport;

import com.example.pruebagenericaport.external_services.CreatePagosTarjetaRequest;
import com.example.pruebagenericaport.external_services.CreatePagosTransferenciaRequest;
import com.example.pruebagenericaport.external_services.ExternalClient;
import com.example.pruebagenericaport.ports.CreatePagosTarjetaPort;
import com.example.pruebagenericaport.ports.CreatePagosTransferenciaPort;
import com.example.pruebagenericaport.ports.mappers.CreatePagosBoToExternalRequestMapper;
import com.example.pruebagenericaport.ports.mappers.PagosBoToCreatePagoTarjetaRequestMapper;
import com.example.pruebagenericaport.ports.mappers.PagosBoToCreatePagoTransferenciaRquestMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PruebaGenericaPortApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void TestDePagoTarjeta() throws JsonProcessingException {
        CreatePagosTarjetaRequest createPagosTarjetaRequest = new CreatePagosTarjetaRequest();
        PagosBo pago = new PagosBo("TARJETA", createPagosTarjetaRequest);
        CreatePagosBoToExternalRequestMapper<CreatePagosTarjetaRequest> createPagosBoToExternalRequestMapper = new PagosBoToCreatePagoTarjetaRequestMapper();
        ExternalClient externalClient = new ExternalClient();
        CreatePagosTarjetaPort createPagosTarjetaPort = new CreatePagosTarjetaPort(createPagosBoToExternalRequestMapper, externalClient);

        String response = createPagosTarjetaPort.execute(pago);
        System.out.println(response);

    }

    @Test
    void TestDePagoTransferencia() throws JsonProcessingException {
        CreatePagosTransferenciaRequest createPagosTransferenciaRequest = new CreatePagosTransferenciaRequest();
        PagosBo pago = new PagosBo("TRANSFERENCIA", createPagosTransferenciaRequest);
        CreatePagosBoToExternalRequestMapper<CreatePagosTransferenciaRequest> createPagosBoToExternalRequestMapper = new PagosBoToCreatePagoTransferenciaRquestMapper();
        ExternalClient externalClient = new ExternalClient();
        CreatePagosTransferenciaPort createPagosTransferenciaPort = new CreatePagosTransferenciaPort(createPagosBoToExternalRequestMapper, externalClient);

        String response = createPagosTransferenciaPort.execute(pago);
        System.out.println(response);

    }



}
