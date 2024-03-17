package com.stub.stub_Rest_gRPC.stubService.stubServiceHello;

import com.stub.stub_Rest_gRPC.serviceGRPC.serviceHello.HelloReply;
import com.stub.stub_Rest_gRPC.serviceGRPC.serviceHello.HelloRequest;
import com.stub.stub_Rest_gRPC.serviceGRPC.serviceHello.MyServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

//extends MyServiceGrpc.MyServiceImplBase
@GrpcService
public class MyServiceImpl extends MyServiceGrpc.MyServiceImplBase{

    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        HelloReply reply = HelloReply.newBuilder()
                .setMessage("Hello ==> " + request.getName())
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }




}
