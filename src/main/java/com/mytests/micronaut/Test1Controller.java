package com.mytests.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

/**
 * *
 * <p>Created by irina on 17.09.2022.</p>
 * <p>Project: micronaut-web-test-meta-annotations</p>
 * *
 */
//@Controller(value = "/test1", consumes = {"application/json", "text/plain"}, produces = {"text/plain"}, port = "${myserver.port.number}")
@Controller(value = "/test1", port = "8088")
public class Test1Controller {
    
    @Get(uri = "/get1")
    public String m11(){
        return "m11";
    }
    
    @Get(uris = {"/","/get2"})
    public String m12(){
        return "m12";
    }

    @Get(uri = "/get3/${myserver.mapping.path}")
    public String m13(){
        return "m13";
    }
}
