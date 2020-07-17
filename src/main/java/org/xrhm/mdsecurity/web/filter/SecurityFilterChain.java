package org.xrhm.mdsecurity.web.filter;

import javax.servlet.Filter;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author xinruhuamu
 * @description
 * @date 2020/7/17 00:06
 */
public interface SecurityFilterChain {
    /**
     * @param request
     * @return true/false
     */
    boolean matches(HttpServletRequest request);

    /**
     * @return List
     */
    List<Filter> getFilters();
}
