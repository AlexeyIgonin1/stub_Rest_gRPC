package com.stub.stub_Rest_gRPC.serviceREST;

public class FirstStubRestTwo {

    public FirstStubRestTwo() {
    }

    private String response;

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
