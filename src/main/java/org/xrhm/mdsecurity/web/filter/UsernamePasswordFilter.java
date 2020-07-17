package org.xrhm.mdsecurity.web.filter;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xinruhuamu
 * @description
 * @date 2020/7/17 00:09
 */
public class UsernamePasswordFilter extends OncePerRequestFilter {
    private static final String DEFAULT_USERNAME_KEY = "username";
    private static final String DEFAULT_PASSWORD_KEY = "password";


    /**
     * @param httpServletRequest
     * @param httpServletResponse
     * @param filterChain
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {

    }
    public String getUsername(HttpServletRequest request){
        return request.getParameter(DEFAULT_USERNAME_KEY);
    }

    public String getPassword(HttpServletRequest request){
        return request.getParameter(DEFAULT_PASSWORD_KEY);
    }

}
