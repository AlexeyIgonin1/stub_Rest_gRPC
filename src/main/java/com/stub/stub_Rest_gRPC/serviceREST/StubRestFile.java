package com.stub.stub_Rest_gRPC.serviceREST;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StubRestFile implements Services{

    public String getJsonString() {
        String json = "";
        try {
            JSONParser parser = new JSONParser();
            JSONObject data = (JSONObject) parser.parse(new FileReader("src/main/resources/fileJson/fileJson.json"));
            json = data.toJSONString();
        }
        catch(IOException | ParseException e){
            e.printStackTrace();
        }
        return json;
    }

}
