package com.mytests.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

/**
 * *
 * <p>Created by irina on 17.09.2022.</p>
 * <p>Project: micronaut-web-test-meta-annotations</p>
 * *
 */
@CustomControllerAnno1("/test2")
public class Test2Controller {
    
    @Get("/get1")
    public String m21(){
        return "m21";
    }

    @Get(uris = {"/","/get2"})
    public String m22(){
        return "m22";
    }
}
