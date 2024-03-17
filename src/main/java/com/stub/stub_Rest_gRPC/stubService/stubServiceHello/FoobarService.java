package com.stub.stub_Rest_gRPC.stubService.stubServiceHello;


import com.stub.stub_Rest_gRPC.serviceGRPC.serviceHello.HelloRequest;
import com.stub.stub_Rest_gRPC.serviceGRPC.serviceHello.MyServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class FoobarService {

    @GrpcClient("myService")
    private MyServiceGrpc.MyServiceBlockingStub myServiceStub;

    public String receiveGreeting(String name) {
        HelloRequest request = HelloRequest.newBuilder()
                .setName(name)
                .build();
        return myServiceStub.sayHello(request).getMessage();
    }
}
