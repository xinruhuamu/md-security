package org.xrhm.mdsecurity.core.acct;

import java.io.Serializable;

/**
 * @author xinruhuamu
 * @description Account账户，Bean类，关联数据库
 * @date 2020/7/17 03:02
 */
public class Account implements Serializable {
    private String uid;
    private String username;
    private String password;
    private String phone;
    private String email;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
