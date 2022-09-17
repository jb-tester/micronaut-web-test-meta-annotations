package com.mytests.micronaut;

import io.micronaut.http.annotation.Get;

/**
 * *
 * <p>Created by irina on 17.09.2022.</p>
 * <p>Project: micronaut-web-test-meta-annotations</p>
 * *
 */
@CustomControllerAnno2
public class Test4Controller {
    
    @Get("/get1")
    public String m31(){
        return "m31";
    }

    @Get(uris = {"/","/get2"})
    public String m32(){
        return "m32";
    }
}
