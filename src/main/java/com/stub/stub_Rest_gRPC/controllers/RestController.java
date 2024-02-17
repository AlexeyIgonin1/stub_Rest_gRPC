package com.stub.stub_Rest_gRPC.controllers;


import com.stub.stub_Rest_gRPC.serviceREST.FirstStubRest;
import com.stub.stub_Rest_gRPC.utilit.Cfg;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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




}
