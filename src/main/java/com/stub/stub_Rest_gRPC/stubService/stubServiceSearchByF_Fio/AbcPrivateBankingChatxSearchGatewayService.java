package com.stub.stub_Rest_gRPC.stubService.stubServiceSearchByF_Fio;


import com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@GrpcService

//extends AbcPrivateBankingChatxSearchGatewayServiceGrpc.AbcPrivateBankingChatxSearchGatewayServiceImplBase

public class AbcPrivateBankingChatxSearchGatewayService extends AbcPrivateBankingChatxSearchGatewayServiceGrpc.AbcPrivateBankingChatxSearchGatewayServiceImplBase {

    public String generator(int id){
        AtomicInteger idCounter =  new AtomicInteger(id);
        long timestamp = System.currentTimeMillis();
        long nextLong = idCounter.incrementAndGet();
        String randomId = String.valueOf(timestamp)+String.valueOf(nextLong);
        return randomId;
    }

    @Override
    public void searchByF(IndividualByFRequest request, StreamObserver<IndividualByFResponse> responseObserver) {
        // Add your logic here to retrieve the individual based on the request parameters
        List<IndividualByF> individualsByF = new ArrayList<>();
//        String uniqueID = UUID.randomUUID().toString();
//        Random ran = new Random();
//        String random = ran.ints(6).sorted().toString();
//        System.out.println(random);

        // Dummy data for response
        Name name1 = Name.newBuilder()
                .setId("0")
                .setName("Миконид")
                .setSurname("Опасный")
                .setPatronymic("Маркович")
                .build();

        BirthDateStamp birthDatesStamp1 = BirthDateStamp.newBuilder()
                .setDay(1)
                .setMonth(2)
                .setYear(1999)
                .build();
        BirthDate birthDate1 = BirthDate.newBuilder()
                .setBirthDatestamp(birthDatesStamp1)
                .build();

        IndividualByF individual1 = IndividualByF.newBuilder()
                .setId(generator(12))
                .setVersion(0)
                .setIndividualName(name1)
                .setBirthDate(birthDate1)
                .build();

        individualsByF.add(individual1);

        Name name2 = Name.newBuilder()
                .setId("0")
                .setName("Гнигорий")
                .setSurname("Гнигорьевич")
                .setPatronymic("Гнут")
                .build();

        BirthDateStamp birthDateStamp2 = BirthDateStamp.newBuilder()
                .setDay(11)
                .setMonth(6)
                .setYear(1970)
                .build();

        BirthDate birthDate2 = BirthDate.newBuilder()
                .setBirthDatestamp(birthDateStamp2)
                .build();

        IndividualByF individual2 = IndividualByF.newBuilder()
                .setId(generator(10))
                .setVersion(0)
                .setIndividualName(name2)
                .setBirthDate(birthDate2)
                .build();

        individualsByF.add(individual2);

        IndividualByFResponse response = IndividualByFResponse.newBuilder()
                .addAllIndividual(individualsByF)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }



    @Override
    public void searchByFio(IndividualByFioRequest request, StreamObserver<IndividualByFioResponse> responseObserver) {
        // Add your logic here to retrieve the individual based on the request parameters
        List<IndividualByFio> individualsByFio = new ArrayList<>();
//        String uniqueID = UUID.randomUUID().toString();
//        Random ran = new Random();
//        String random = ran.ints(6).sorted().toString();
//        System.out.println(random);
//
//
//
//

        // Dummy data for response
        Name name1 = Name.newBuilder()
                .setId("0")
                .setName("Миконид")
                .setSurname("Опасный")
                .setPatronymic("Маркович")
                .build();

        BirthDateStamp birthDateStamp1 = BirthDateStamp.newBuilder()
                .setDay(1)
                .setMonth(2)
                .setYear(1999)
                .build();

        BirthDate birthDate1 = BirthDate.newBuilder()
                .setBirthDatestamp(birthDateStamp1)
                .build();

        IndividualByFio individual1 = IndividualByFio.newBuilder()
                .setId(generator(12))
                .setVersion(0)
                .setIndividualName(name1)
                .setBirthDate(birthDate1)
                .build();

        individualsByFio.add(individual1);

        Name name2 = Name.newBuilder()
                .setId("0")
                .setName("Гнигорий")
                .setSurname("Гнигорьевич")
                .setPatronymic("Гнут")
                .build();

        BirthDateStamp birthDateStamp2 = BirthDateStamp.newBuilder()
                .setDay(11)
                .setMonth(6)
                .setYear(1970)
                .build();

        BirthDate birthDate2 = BirthDate.newBuilder()
                .setBirthDatestamp(birthDateStamp2)
                .build();

        IndividualByFio individual2 = IndividualByFio.newBuilder()
                .setId(generator(10))
                .setVersion(0)
                .setIndividualName(name2)
                .setBirthDate(birthDate2)
                .build();

        individualsByFio.add(individual2);

        IndividualByFioResponse response = IndividualByFioResponse.newBuilder()
                .addAllIndividual(individualsByFio)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
