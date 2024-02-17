package com.stub.stub_Rest_gRPC.controllers;


import com.stub.stub_Rest_gRPC.serviceREST.FirstStubRest;
import com.stub.stub_Rest_gRPC.serviceREST.StubRestFile;
import com.stub.stub_Rest_gRPC.serviceREST.StubRestTWOResponse;
import com.stub.stub_Rest_gRPC.utilit.Cfg;
import com.stub.stub_Rest_gRPC.utilit.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.POST;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {


    @GetMapping("/stub")
    public String restController(){
        return "Hello stub";
    }


    @RequestMapping(value = "/stub1", method = POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity restBodyFirst() throws InterruptedException {
        FirstStubRest responses = new FirstStubRest();
        if (!Cfg.mapEnable.get(responses.getClass().getSimpleName())) {
            return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body("Error - Service\n");
        } else {
                Thread.sleep(Cfg.mapResponse.get(responses.getClass().getSimpleName()));
        return ResponseEntity.status(HttpStatus.OK).body(responses.getResponse());
    }
    }

    @RequestMapping(value = "/stubFile", method = POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity restBodyFile() throws InterruptedException {
        StubRestFile responses = new StubRestFile();
        if (!Cfg.mapEnable.get(responses.getClass().getSimpleName())) {
            return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body("Error - Service\n");
        } else {
            Thread.sleep(Cfg.mapResponse.get(responses.getClass().getSimpleName()));
            return ResponseEntity.status(HttpStatus.OK).body(responses.getJsonString());
        }
    }


    @PostMapping(value = "/stubFile/clients/get", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity clientsGet(@RequestBody Data reqBody) throws InterruptedException {

        String epkId = "191126337595270934";
        Data req = new Data(epkId);

        StubRestTWOResponse stubRestTWOResponse = new StubRestTWOResponse();
        if(reqBody.getEpkId().equals(req.getEpkId())) {
            if (!Cfg.mapEnable.get(stubRestTWOResponse.getClass().getSimpleName())) {
                return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body("Error - Service\n");
            } else {
                Thread.sleep(Cfg.mapResponse.get(stubRestTWOResponse.getClass().getSimpleName()));
                return ResponseEntity.status(HttpStatus.OK).body(stubRestTWOResponse.getResponse1());
            }
        }
        else {
            if (!Cfg.mapEnable.get(stubRestTWOResponse.getClass().getSimpleName())) {
                return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body("Error - Service\n");
            } else {
                Thread.sleep(Cfg.mapResponse.get(stubRestTWOResponse.getClass().getSimpleName()));
                return ResponseEntity.status(HttpStatus.OK).body(stubRestTWOResponse.getResponse2());
            }
        }

    }

}
