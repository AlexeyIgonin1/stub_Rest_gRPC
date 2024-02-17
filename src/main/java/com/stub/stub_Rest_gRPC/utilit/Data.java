package com.stub.stub_Rest_gRPC.utilit;

import lombok.Getter;
import lombok.Setter;

public class Data {
    @Setter
    @Getter
    private String epkId;

    public Data(String epkId) {
        this.epkId = epkId;
    }

    public Data() {
    }
}
