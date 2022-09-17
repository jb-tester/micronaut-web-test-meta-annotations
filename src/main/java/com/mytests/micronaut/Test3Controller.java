package com.mytests.micronaut;

import io.micronaut.http.annotation.Get;

/**
 * *
 * <p>Created by irina on 17.09.2022.</p>
 * <p>Project: micronaut-web-test-meta-annotations</p>
 * *
 */
@CustomControllerAnno1(path="/test3")
public class Test3Controller {
    
    @Get("/get1")
    public String m31(){
        return "m31";
    }

    @Get(uris = {"/","/get2"})
    public String m32(){
        return "m32";
    }
}
