package com.stub.stub_Rest_gRPC.stubService.stubServiceSearchByF_Fio;


import com.stub.stub_Rest_gRPC.serviceGRPC.serviceSearchByF_Fio.*;
import com.stub.stub_Rest_gRPC.utilit.Cfg;
import io.grpc.ManagedChannel;
import io.grpc.Status;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import io.grpc.netty.shaded.io.netty.channel.ChannelOption;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.lang.Error;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

@GrpcService

//extends AbcPrivateBankingChatxSearchGatewayServiceGrpc.AbcPrivateBankingChatxSearchGatewayServiceImplBase

public class AbcPrivateBankingChatxSearchGatewayService extends AbcPrivateBankingChatxSearchGatewayServiceGrpc.AbcPrivateBankingChatxSearchGatewayServiceImplBase
{



    public void sleep(long sek) throws InterruptedException {
     Thread.sleep(sek);
    }

    public String generator(int id){
        AtomicInteger idCounter =  new AtomicInteger(id);
        long timestamp = System.currentTimeMillis();
        long nextLong = idCounter.incrementAndGet();
        String randomId = String.valueOf(timestamp)+String.valueOf(nextLong);
        return randomId;
    }

    @Override
    public void searchByF(IndividualByFRequest request, StreamObserver<IndividualByFResponse> responseObserver) {
       ArrayList individualsByF = new ArrayList<>();

        Name name6 = Name.newBuilder()
                .setId("0")
                .setName("Миконид")
                .setSurname("Опасный")
                .setPatronymic("Маркович")
                .build();

        BirthDateStamp birthDatesStamp6 = BirthDateStamp.newBuilder()
                .setDay(1)
                .setMonth(2)
                .setYear(1999)
                .build();

        BirthDate birthDate6 = BirthDate.newBuilder()
                .setBirthDatestamp(birthDatesStamp6)
                .build();

        IndividualByF individual6 = IndividualByF.newBuilder()
                .setId(generator(110))
                .setVersion(0)
                .setIndividualName(name6)
                .setBirthDate(birthDate6)
                .build();

        individualsByF.add(individual6);

        Name name5 = Name.newBuilder()
                .setId("0")
                .setName("Гнигорий")
                .setSurname("Гнигорьевич")
                .setPatronymic("Гнут")
                .build();

        BirthDateStamp birthDatesStamp5 = BirthDateStamp.newBuilder()
                .setDay(11)
                .setMonth(6)
                .setYear(1970)
                .build();

        BirthDate birthDate5 = BirthDate.newBuilder()
                .setBirthDatestamp(birthDatesStamp5)
                .build();

        IndividualByF individual5 = IndividualByF.newBuilder()
                .setId(generator(12))
                .setVersion(0)
                .setIndividualName(name5)
                .setBirthDate(birthDate5)
                .build();

        individualsByF.add(individual5);

        Name name4 = Name.newBuilder()
                .setId("0")
                .setName("Миконид")
                .setSurname("Опасный")
                .setPatronymic("Маркович")
                .build();

        BirthDateStamp birthDatesStamp4 = BirthDateStamp.newBuilder()
                .setDay(1)
                .setMonth(2)
                .setYear(1999)
                .build();

        BirthDate birthDate4 = BirthDate.newBuilder()
                .setBirthDatestamp(birthDatesStamp4)
                .build();

        IndividualByF individual4 = IndividualByF.newBuilder()
                .setId(generator(12))
                .setVersion(0)
                .setIndividualName(name4)
                .setBirthDate(birthDate4)
                .build();

        individualsByF.add(individual4);

        Name name3 = Name.newBuilder()
                .setId("0")
                .setName("Тест")
                .setSurname("Тестов")
                .setPatronymic("Тестович")
                .build();

        BirthDateStamp birthDatesStamp3 = BirthDateStamp.newBuilder()
                .setDay(1)
                .setMonth(2)
                .setYear(1999)
                .build();

        BirthDate birthDate3 = BirthDate.newBuilder()
                .setBirthDatestamp(birthDatesStamp3)
                .build();

        IndividualByF individual3 = IndividualByF.newBuilder()
                .setId(generator(12))
                .setVersion(0)
                .setIndividualName(name3)
                .setBirthDate(birthDate3)
                .build();

        individualsByF.add(individual3);

        Name name2 = Name.newBuilder()
                .setId("0")
                .setName("Миконид")
                .setSurname("Опасный")
                .setPatronymic("Маркович")
                .build();

        BirthDateStamp birthDatesStamp2 = BirthDateStamp.newBuilder()
                .setDay(1)
                .setMonth(2)
                .setYear(1999)
                .build();

        BirthDate birthDate2 = BirthDate.newBuilder()
                .setBirthDatestamp(birthDatesStamp2)
                .build();

        IndividualByF individual2 = IndividualByF.newBuilder()
                .setId(generator(12))
                .setVersion(0)
                .setIndividualName(name2)
                .setBirthDate(birthDate2)
                .build();

        individualsByF.add(individual2);

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

        PartyGroup partyGroup = PartyGroup.newBuilder()
                .setPartyGroupDictCode("10")
                .build();
        PartyGroup partyGroup2 = PartyGroup.newBuilder()
                .setPartyGroupDictCode("261")
                .build();
        PartyGroup partyGroup3 = PartyGroup.newBuilder()
                .setPartyGroupDictCode("123454567")
                .build();

        PartyGroups partyGroups = PartyGroups.newBuilder()
                .addToPartyGroups(partyGroup)
                .addToPartyGroups(partyGroup2)
                .addToPartyGroups(partyGroup3)
                .setAccessibilityGroups("[]")
                .setHighRiskGroups("[]")
                .setIncreasedInterestGroups("[]")
                .setInsiderInfoGroups("[]")
                .setInvestorInfoGroups("[]")
                .setPfrGroups("[]")
                .setProductGroups("[]")
                .setVipClientCategoryGroups("[]")
                .setVisionGroup("[]")
                .build();

        IndividualByF individual1 = IndividualByF.newBuilder()
                .setId(generator(12))
                .setVersion(0)
                .setIndividualName(name1)
                .setBirthDate(birthDate1)
                .setPartyGroups(partyGroups)
                .build();

        individualsByF.add(individual1);

        try {
            IndividualByFResponse response = IndividualByFResponse.newBuilder()
                    .addAllIndividual(individualsByF)
                    .build();
            if (!Cfg.mapEnable.get(this.getClass().getSimpleName())) {
                responseObserver.onError(new Exception("No individuals found"));
            } else {
                Thread.sleep(Cfg.mapResponse.get(this.getClass().getSimpleName()));
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        }
        catch (Exception e){
            Status status = Status.INTERNAL.withDescription(e.getMessage());
            responseObserver.onError(status.asRuntimeException());
        }
    }

    @Override
    public void searchByFio(IndividualByFioRequest request, StreamObserver<IndividualByFioResponse> responseObserver) {

        ArrayList individualsByFio = new ArrayList<>();

        Name name6 = Name.newBuilder()
                .setId("0")
                .setName("Миконид")
                .setSurname("Опасный")
                .setPatronymic("Маркович")
                .build();

        BirthDateStamp birthDatesStamp6 = BirthDateStamp.newBuilder()
                .setDay(1)
                .setMonth(2)
                .setYear(1999)
                .build();

        BirthDate birthDate6 = BirthDate.newBuilder()
                .setBirthDatestamp(birthDatesStamp6)
                .build();

        IndividualByF individual6 = IndividualByF.newBuilder()
                .setId(generator(110))
                .setVersion(0)
                .setIndividualName(name6)
                .setBirthDate(birthDate6)
                .build();

        individualsByFio.add(individual6);

        Name name5 = Name.newBuilder()
                .setId("0")
                .setName("Гнигорий")
                .setSurname("Гнигорьевич")
                .setPatronymic("Гнут")
                .build();

        BirthDateStamp birthDatesStamp5 = BirthDateStamp.newBuilder()
                .setDay(11)
                .setMonth(6)
                .setYear(1970)
                .build();

        BirthDate birthDate5 = BirthDate.newBuilder()
                .setBirthDatestamp(birthDatesStamp5)
                .build();

        IndividualByF individual5 = IndividualByF.newBuilder()
                .setId(generator(12))
                .setVersion(0)
                .setIndividualName(name5)
                .setBirthDate(birthDate5)
                .build();

        individualsByFio.add(individual5);

        Name name4 = Name.newBuilder()
                .setId("0")
                .setName("Миконид")
                .setSurname("Опасный")
                .setPatronymic("Маркович")
                .build();

        BirthDateStamp birthDatesStamp4 = BirthDateStamp.newBuilder()
                .setDay(1)
                .setMonth(2)
                .setYear(1999)
                .build();

        BirthDate birthDate4 = BirthDate.newBuilder()
                .setBirthDatestamp(birthDatesStamp4)
                .build();

        IndividualByF individual4 = IndividualByF.newBuilder()
                .setId(generator(12))
                .setVersion(0)
                .setIndividualName(name4)
                .setBirthDate(birthDate4)
                .build();

        individualsByFio.add(individual4);

        Name name3 = Name.newBuilder()
                .setId("0")
                .setName("Тест")
                .setSurname("Тестов")
                .setPatronymic("Тестович")
                .build();

        BirthDateStamp birthDatesStamp3 = BirthDateStamp.newBuilder()
                .setDay(1)
                .setMonth(2)
                .setYear(1999)
                .build();

        BirthDate birthDate3 = BirthDate.newBuilder()
                .setBirthDatestamp(birthDatesStamp3)
                .build();

        IndividualByF individual3 = IndividualByF.newBuilder()
                .setId(generator(12))
                .setVersion(0)
                .setIndividualName(name3)
                .setBirthDate(birthDate3)
                .build();

        individualsByFio.add(individual3);

        Name name2 = Name.newBuilder()
                .setId("0")
                .setName("Миконид")
                .setSurname("Опасный")
                .setPatronymic("Маркович")
                .build();

        BirthDateStamp birthDatesStamp2 = BirthDateStamp.newBuilder()
                .setDay(1)
                .setMonth(2)
                .setYear(1999)
                .build();

        BirthDate birthDate2 = BirthDate.newBuilder()
                .setBirthDatestamp(birthDatesStamp2)
                .build();

        IndividualByF individual2 = IndividualByF.newBuilder()
                .setId(generator(12))
                .setVersion(0)
                .setIndividualName(name2)
                .setBirthDate(birthDate2)
                .build();

        individualsByFio.add(individual2);

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

        PartyGroup partyGroup = PartyGroup.newBuilder()
                .setPartyGroupDictCode("10")
                .build();
        PartyGroup partyGroup2 = PartyGroup.newBuilder()
                .setPartyGroupDictCode("261")
                .build();
        PartyGroup partyGroup3 = PartyGroup.newBuilder()
                .setPartyGroupDictCode("123454567")
                .build();

        PartyGroups partyGroups = PartyGroups.newBuilder()
                .addToPartyGroups(partyGroup)
                .addToPartyGroups(partyGroup2)
                .addToPartyGroups(partyGroup3)
                .setAccessibilityGroups("[]")
                .setHighRiskGroups("[]")
                .setIncreasedInterestGroups("[]")
                .setInsiderInfoGroups("[]")
                .setInvestorInfoGroups("[]")
                .setPfrGroups("[]")
                .setProductGroups("[]")
                .setVipClientCategoryGroups("[]")
                .setVisionGroup("[]")
                .build();

        IndividualByFio individual1 = IndividualByFio.newBuilder()
                .setId(generator(12))
                .setVersion(0)
                .setIndividualName(name1)
                .setBirthDate(birthDate1)
                .setPartyGroups(partyGroups)
                .build();

        individualsByFio.add(individual1);

        Name name7 = Name.newBuilder()
                .setId("0")
                .setName("Гнигорий")
                .setSurname("Гнигорьевич")
                .setPatronymic("Гнут")
                .build();

        BirthDateStamp birthDateStamp7 = BirthDateStamp.newBuilder()
                .setDay(11)
                .setMonth(6)
                .setYear(1970)
                .build();

        BirthDate birthDate7 = BirthDate.newBuilder()
                .setBirthDatestamp(birthDateStamp7)
                .build();

        IndividualByFio individual7 = IndividualByFio.newBuilder()
                .setId(generator(10))
                .setVersion(0)
                .setIndividualName(name7)
                .setBirthDate(birthDate7)
                .build();

        individualsByFio.add(individual7);


        try {
            IndividualByFioResponse response = IndividualByFioResponse.newBuilder()
                    .addAllIndividual(individualsByFio)
                    .build();
            if(!Cfg.mapEnable.get(this.getClass().getSimpleName())){
                responseObserver.onError(new Exception("No individuals found"));
            }
        else{
                Thread.sleep(Cfg.mapResponse.get(this.getClass().getSimpleName()));
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        }
        catch (Exception e){
            Status status = Status.INTERNAL.withDescription(e.getMessage());
            responseObserver.onError(status.asRuntimeException());
        }
    }
}
