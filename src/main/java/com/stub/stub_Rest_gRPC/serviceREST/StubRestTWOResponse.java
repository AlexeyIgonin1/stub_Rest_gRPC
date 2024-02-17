package com.stub.stub_Rest_gRPC.serviceREST;


import lombok.Getter;
import lombok.Setter;

public class StubRestTWOResponse implements Services {




    public StubRestTWOResponse() {
    }


    @Setter
    @Getter
    private String response1 = " {\n" +
            " \"messageStatuses\" : [\n" +
            " {\n" +
            "  \"originalOperationId\" : \"ABC123424253533212\", \n" +
            "  \"status\" : \"SUCCESS\"\n" +
            "  }\n" +
            "  ]\n" +
            "}";;
    @Setter
    @Getter
    private String response2 = "{\"menu\": {\n" +
            "  \"id\": \"file\",\n" +
            "  \"value\": \"File\",\n" +
            "  \"popup\": {\n" +
            "    \"menuitem\": [\n" +
            "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"},\n" +
            "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"},\n" +
            "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}\n" +
            "    ]\n" +
            "  }\n" +
            "}}";

}
