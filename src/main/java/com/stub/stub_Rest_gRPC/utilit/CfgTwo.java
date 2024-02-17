package com.stub.stub_Rest_gRPC.utilit;

import com.stub.stub_Rest_gRPC.serviceREST.FirstStubRest;
import com.stub.stub_Rest_gRPC.serviceREST.FirstStubRestOne;
import com.stub.stub_Rest_gRPC.serviceREST.FirstStubRestTwo;
import com.stub.stub_Rest_gRPC.stubService.stubServiceSearchByF_Fio.AbcPrivateBankingChatxSearchGatewayService;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CfgTwo {

    public static Map<String, Integer> mapResponseTwo = new HashMap<>();

    public static Map<String, Boolean> mapEnableTwo = new HashMap<>();

    static {
        Arrays.asList(
                FirstStubRestOne.class,
                FirstStubRestTwo.class,
                AbcPrivateBankingChatxSearchGatewayService.class
        ).forEach(aClass ->{
            mapResponseTwo.put(aClass.getSimpleName(), 0);
            mapEnableTwo.put(aClass.getSimpleName(), true);
        });
    }
    @Setter
    @Getter
    public Map<String, Integer> editMapResponseTwo = new HashMap<>();
    @Setter
    @Getter
    public Map<String, Boolean> editMapEnableTwo = new HashMap<>();



    public CfgTwo() {
        setEditMapEnableTwo(mapEnableTwo);
        setEditMapResponseTwo(mapResponseTwo);

    }
}
