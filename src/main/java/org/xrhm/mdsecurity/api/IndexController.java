package org.xrhm.mdsecurity.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xinruhuamu
 * @description
 * @date 2020/7/16 23:15
 */
@RestController
@RequestMapping(value = "/")
public class IndexController {
    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String indexApi() {

        return "Hello Java 11~";
    }
}
