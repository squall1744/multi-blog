package com.squall1744.authenticationdemo.entity;

public class AuthStatus {
    private String status;
    private String msg;
    private boolean isLogin;
    private User user;


    private AuthStatus(String status, String msg, boolean isLogin) {
        this(status, msg, isLogin, null);
    }

    public static AuthStatus failStatus(String msg) {
        return new AuthStatus("fail", msg, false);
    }

    public static AuthStatus okStatus(String msg, User user) {
        return new AuthStatus("ok", msg, true, user);
    }

    public AuthStatus(String status, String msg, boolean isLogin, User user) {
        this.status = status;
        this.msg = msg;
        this.isLogin = isLogin;
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void setLogin(boolean login) {
        isLogin = login;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
