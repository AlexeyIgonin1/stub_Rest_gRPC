package com.stub.stub_Rest_gRPC.utilit;

import com.stub.stub_Rest_gRPC.serviceREST.FirstStubRest;
import com.stub.stub_Rest_gRPC.stubService.stubServiceSearchByF_Fio.AbcPrivateBankingChatxSearchGatewayService;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Cfg {
public static Map<String, Integer> mapResponse = new HashMap<>();

public static Map<String, Boolean> mapEnable = new HashMap<>();

static {
    Arrays.asList(
            FirstStubRest.class,
            AbcPrivateBankingChatxSearchGatewayService.class
    ).forEach(aClass ->{
        mapResponse.put(aClass.getSimpleName(), 0);
        mapEnable.put(aClass.getSimpleName(), true);
    });
}
@Setter
@Getter
public Map<String, Integer> editMapResponse = new HashMap<>();
    @Setter
    @Getter
public Map<String, Boolean> editMapEnable = new HashMap<>();



    public Cfg() {
    setEditMapEnable(mapEnable);
    setEditMapResponse(mapResponse);

}


}
