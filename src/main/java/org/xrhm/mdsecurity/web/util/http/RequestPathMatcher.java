package org.xrhm.mdsecurity.web.util.http;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.AntPathMatcher;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * @author xinruhuamu
 * @description
 * @date 2020/7/16 23:20
 */
public class RequestPathMatcher implements RequestMatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(RequestPathMatcher.class);
    private final AntPathMatcher antPathMatcher;
    private final HttpPattern httpPattern;

    public RequestPathMatcher(AntPathMatcher antPathMatcher, HttpPattern httpPattern) {
        this.antPathMatcher = antPathMatcher;
        this.httpPattern = httpPattern;
    }

    @Override
    public boolean matches(HttpServletRequest request) {
        Objects.requireNonNull(request);
        return antPathMatcher.match(httpPattern.getValue(),request.getRequestURI());
    }
}
