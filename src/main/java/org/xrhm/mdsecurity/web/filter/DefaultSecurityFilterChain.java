package org.xrhm.mdsecurity.web.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xrhm.mdsecurity.web.util.http.RequestMatcher;

import javax.servlet.Filter;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * @author xinruhuamu
 * @description
 * @date 2020/7/17 00:07
 */
public class DefaultSecurityFilterChain implements SecurityFilterChain {
    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultSecurityFilterChain.class);
    private final RequestMatcher requestMatcher;
    private final List<Filter> filters;

    public DefaultSecurityFilterChain(RequestMatcher requestMatcher, Filter... filters) {
        this(requestMatcher, Arrays.asList(filters));
    }

    public DefaultSecurityFilterChain(RequestMatcher requestMatcher, List<Filter> filters) {
        this.requestMatcher = requestMatcher;
        this.filters = filters;
    }

    @Override
    public boolean matches(HttpServletRequest request) {
        return requestMatcher.matches(request);
    }

    @Override
    public List<Filter> getFilters() {
        return filters;
    }
}
