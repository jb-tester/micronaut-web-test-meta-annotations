package com.mytests.micronaut;

import io.micronaut.http.annotation.Controller;

/**
 * *
 * <p>Created by irina on 17.09.2022.</p>
 * <p>Project: micronaut-web-test-meta-annotations</p>
 * *
 */
@Controller(value = "/test4", consumes = {"application/json", "text/plain"}, produces = {"text/plain"})
public @interface CustomControllerAnnoWithFixedUrl {
    
}
