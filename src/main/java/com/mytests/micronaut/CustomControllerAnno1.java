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
@Controller(consumes = {"application/json", "text/plain"}, produces = {"text/plain"})
public @interface CustomControllerAnno1 {
    @AliasFor(annotation = Controller.class, member = "value")
    String value() default UriMapping.DEFAULT_URI;

    @AliasFor(annotation = Controller.class, member = "value")
    String path() default UriMapping.DEFAULT_URI;
}
