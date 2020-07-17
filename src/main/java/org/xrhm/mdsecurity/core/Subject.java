package org.xrhm.mdsecurity.core;

/**
 * @author xinruhuamu
 * @description 主体，所有访问者的统称，不管访问者是否被认证成功、是否拥有权限。
 * @date 2020/7/17 02:56
 */
public interface Subject {
    /**
     * 获取访问者的信息
     *
     * @return Principal
     */
    Principal getPrincipal();

    /**
     * 主体是否通过认证
     *
     * @return boolen
     */
    boolean isAuthenticated();
}
