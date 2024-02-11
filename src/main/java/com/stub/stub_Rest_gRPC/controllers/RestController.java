package com.stub.stub_Rest_gRPC.controllers;


import com.stub.stub_Rest_gRPC.serviceREST.FirstStubRest;
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

//    @GetMapping("/stub")
    @RequestMapping(value = "/stub1", method = POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity restBodyFirst(){
        FirstStubRest response = new FirstStubRest();

        return ResponseEntity.status(HttpStatus.OK).body(response.getResponse());
    }



}
