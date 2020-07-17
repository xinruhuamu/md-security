package org.xrhm.mdsecurity.web.util.http;

/**
 * @author xinruhuamu
 * @description
 * @date 2020/7/16 23:15
 */
public class HttpPattern {
    private String name;
    private String value;
    private final String DEFAULT_SEPARATOR = "/";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
