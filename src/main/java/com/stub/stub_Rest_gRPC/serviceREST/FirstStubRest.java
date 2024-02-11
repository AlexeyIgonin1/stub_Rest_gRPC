package com.stub.stub_Rest_gRPC.serviceREST;

import org.springframework.stereotype.Service;

@Service
public class FirstStubRest implements Services{

    private String response;

    public FirstStubRest() {
    }

    public String getResponse(){
        response = " {\n" +
                " \"messageStatuses\" : [\n" +
                " {\n" +
                "  \"originalOperationId\" : \"ABC123424253533212\", \n" +
                "  \"status\" : \"SUCCESS\"\n" +
                "  }\n" +
                "  ]\n" +
                "}";
        return response;
    }


}
