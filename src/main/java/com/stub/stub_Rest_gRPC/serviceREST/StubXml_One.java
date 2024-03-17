package com.stub.stub_Rest_gRPC.serviceREST;

public class StubXml_One implements Services{


    private String response;

    public StubXml_One() {
    }

    public String getResponse(){
       return response = "<Item>\n" +
                "    <id>1</id>\n" +
                "    <name>temp-item</name>\n" +
                "</Item>";
    }

}
