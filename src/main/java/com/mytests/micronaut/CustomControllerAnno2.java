package com.mytests.micronaut;

import io.micronaut.context.annotation.AliasFor;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.UriMapping;

/**
 * *
 * <p>Created by irina on 17.09.2022.</p>
 * <p>Project: micronaut-web-test-meta-annotations</p>
 * *
 */
@Controller(value = "/test4", consumes = {"application/json", "text/plain"}, produces = {"text/plain"})
public @interface CustomControllerAnno2 {
    
}
