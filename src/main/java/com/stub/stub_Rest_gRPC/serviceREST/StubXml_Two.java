package com.stub.stub_Rest_gRPC.serviceREST;

public class StubXml_Two implements Services{

    private String response;

    public StubXml_Two() {
    }

    public String getResponse(){
        return response = "<Item>\n" +
                "    <id>1</id>\n" +
                "    <name>temp-item</name>\n" +
                "</Item>";
    }


}
