package org.xrhm.mdsecurity.web.util.http;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xinruhuamu
 * @description
 * @date 2020/7/16 23:19
 */
public interface RequestMatcher {
    /**
     * @param request
     * @return
     */
    boolean matches(HttpServletRequest request);
}
