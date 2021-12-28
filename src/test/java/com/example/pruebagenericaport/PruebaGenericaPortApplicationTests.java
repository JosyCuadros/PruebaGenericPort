package com.example.pruebagenericaport;

import com.example.pruebagenericaport.config.MyClass;
import com.example.pruebagenericaport.config.MyValues;
import com.example.pruebagenericaport.external_services.qr.CreatePagosQrRequest;
import com.example.pruebagenericaport.external_services.tarjeta.CreatePagosTarjetaRequest;
import com.example.pruebagenericaport.external_services.transferencia.CreatePagosTransferenciaRequest;
import com.example.pruebagenericaport.external_services.ExternalClient;
import com.example.pruebagenericaport.ports.CreatePagosQrPort;
import com.example.pruebagenericaport.ports.CreatePagosTarjetaPort;
import com.example.pruebagenericaport.ports.CreatePagosTransferenciaPort;
import com.example.pruebagenericaport.ports.mappers.CreatePagosBoToExternalRequestMapper;
import com.example.pruebagenericaport.ports.mappers.PagosBoToCreatePagoQrRequestMapper;
import com.example.pruebagenericaport.ports.mappers.PagosBoToCreatePagoTarjetaRequestMapper;
import com.example.pruebagenericaport.ports.mappers.PagosBoToCreatePagoTransferenciaRequestMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
class PruebaGenericaPortApplicationTests {
    @Autowired
    MyClass myClass; // hacerlo asi anda bien
    @Autowired
    Map<String, MyValues> myMap; // hacerlo asi MyValues queda null
    @Test
    void contextLoads() {
    }
    @Test
    void mapIsNotEmpty(){
        assert (myClass != null);
        assert (myMap != null);
    }
    @Test
    void mapContainsCorrectValues(){
        Map<String, MyValues> myFoo = myClass.getFoo();
        MyValues myValues = myFoo.get("value1");

        assert (myFoo != null);
        assert (myValues.getUsername().equals("hola"));
        assert (myValues.getPassword().equals("chau"));

    }
    //@Test
    void testDePagoTarjeta() throws JsonProcessingException {
        CreatePagosTarjetaRequest createPagosTarjetaRequest = new CreatePagosTarjetaRequest();
        PagosBo pago = new PagosBo("TARJETA", createPagosTarjetaRequest);
        CreatePagosBoToExternalRequestMapper<CreatePagosTarjetaRequest> createPagosBoToExternalRequestMapper = new PagosBoToCreatePagoTarjetaRequestMapper();
        ExternalClient externalClient = new ExternalClient();
        CreatePagosTarjetaPort createPagosTarjetaPort = new CreatePagosTarjetaPort(createPagosBoToExternalRequestMapper, externalClient);

        String response = createPagosTarjetaPort.execute(pago);
        System.out.println(response);
    }

   // @Test
    void testDePagoTransferencia() throws JsonProcessingException {
        CreatePagosTransferenciaRequest createPagosTransferenciaRequest = new CreatePagosTransferenciaRequest();
        PagosBo pago = new PagosBo("TRANSFERENCIA", createPagosTransferenciaRequest);
        CreatePagosBoToExternalRequestMapper<CreatePagosTransferenciaRequest> createPagosBoToExternalRequestMapper = new PagosBoToCreatePagoTransferenciaRequestMapper();
        ExternalClient externalClient = new ExternalClient();
        CreatePagosTransferenciaPort createPagosTransferenciaPort = new CreatePagosTransferenciaPort(createPagosBoToExternalRequestMapper, externalClient);

        String response = createPagosTransferenciaPort.execute(pago);
        System.out.println(response);
    }

   // @Test
    void testDePagoQr() throws JsonProcessingException {
        CreatePagosQrRequest createPagosQrRequest = new CreatePagosQrRequest();
        PagosBo pago = new PagosBo("QR", createPagosQrRequest);
        CreatePagosBoToExternalRequestMapper<CreatePagosQrRequest> createPagosBoToExternalRequestMapper = new PagosBoToCreatePagoQrRequestMapper();
        ExternalClient externalClient = new ExternalClient();
        CreatePagosQrPort createPagosQrPort = new CreatePagosQrPort(createPagosBoToExternalRequestMapper, externalClient);

        String response = createPagosQrPort.execute(pago);
        System.out.println(response);
    }


}
