package com.stub.stub_Rest_gRPC.controllers;


import com.stub.stub_Rest_gRPC.serviceREST.FirstStubRest;
import com.stub.stub_Rest_gRPC.serviceREST.StubXml_One;
import com.stub.stub_Rest_gRPC.utilit.Cfg;
import com.stub.stub_Rest_gRPC.utilit.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/xml")
public class RestXmlController {


    @RequestMapping(value = "/individual/bulkGet", method = POST, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity restBodyFirst() throws InterruptedException {
        StubXml_One responses = new StubXml_One();

            return ResponseEntity.status(HttpStatus.OK).body(responses.getResponse());

    }

    @RequestMapping(path = "/srvsearchuddkdocument",
            method = RequestMethod.POST, produces = MediaType.APPLICATION_XML_VALUE,
            consumes = MediaType.APPLICATION_XML_VALUE)

    public ResponseEntity<Customer> xml(@RequestBody Customer c) {
        System.out.println("Received "+c);
       // c.setLastName("changed");
        return new ResponseEntity<>(c, HttpStatus.OK);
    }



}
