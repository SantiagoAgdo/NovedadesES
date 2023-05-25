package com.mibanco.novedadesES.gprc;


import com.mibanco.novedadClienteCDT.Creado;
import com.mibanco.novedadClienteCDT.NovedadCDTDigitalGrpc;
import com.mibanco.novedadesES.dao.entity.NovedadesEntity;
import com.mibanco.novedadesES.gen.type.NovedadCDTDigitalType;
import com.mibanco.novedadesES.services.impl.NovedadesClienteCDTImpl;
import com.mibanco.novedadesES.utils.NovedadesCDTDigitalMapperGrpc;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import static org.mockito.ArgumentMatchers.any;

public class NovedadesClienteCDTGrpcTest {

    @Mock
    private NovedadesClienteCDTImpl novedadesClienteCDTImlp;

    @Mock
    private NovedadesCDTDigitalMapperGrpc novedadesCDTDigitalMapperGrpc;

    @InjectMocks
    private NovedadesGrpcController novedadesGrpcController;

    @BeforeEach
    void setup(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCrearNovedad(){
        NovedadCDTDigitalGrpc requestMock = NovedadCDTDigitalGrpc.newBuilder().build();
        NovedadCDTDigitalType novedadCDTDigitalTypeMock = new NovedadCDTDigitalType();
        Creado rptMock = Creado.newBuilder().setNovedadCDTDigital(requestMock).build();
        StreamObserver<Creado> responseObsMock = Mockito.mock(StreamObserver.class);

        Mockito.when(novedadesCDTDigitalMapperGrpc.novedadGrpcToEntity(requestMock)).thenReturn(new NovedadesEntity());
        Mockito.when(novedadesCDTDigitalMapperGrpc.novedadGrpcToGrpc(novedadCDTDigitalTypeMock)).thenReturn(requestMock);
        Mockito.when(novedadesClienteCDTImlp.crearNovedadCdtDigitalType(any(NovedadesEntity.class))).thenReturn(novedadCDTDigitalTypeMock);

        novedadesGrpcController.crearNovedadCDT(requestMock, responseObsMock);

        Mockito.verify(responseObsMock, Mockito.times(1)).onNext(rptMock);
        Mockito.verify(responseObsMock, Mockito.times(1)).onCompleted();
    }

}
