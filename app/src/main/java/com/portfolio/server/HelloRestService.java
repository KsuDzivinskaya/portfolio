package com.portfolio.server;

import com.portfolio.api.HelloApi;

public class HelloRestService implements HelloApi {

    @Override
    public String hello() {
        return "Hello World";
    }
}
