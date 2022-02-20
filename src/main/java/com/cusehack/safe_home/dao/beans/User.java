package com.cusehack.safe_home.dao.beans;

public class User {
    private long uid;
    private String userName;
    private String password;
    private String phone;
    private String email;
    private boolean isAuthenticated;
    private long honestyId;
    private int roleId;

    public User(long uid, String userName, String password, String phone, String email, boolean isAuthenticated, long honestyId, int roleId) {
        this.uid = uid;
        this.userName = userName;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.isAuthenticated = isAuthenticated;
        this.honestyId = honestyId;
        this.roleId = roleId;
    }

    public User(long uid, String userName, String password, long honestyId) {
        this.uid = uid;
        this.userName = userName;
        this.password = password;
        this.honestyId = honestyId;
        this.isAuthenticated = true;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        isAuthenticated = authenticated;
    }

    public long getHonestyId() {
        return honestyId;
    }

    public void setHonestyId(long honestyId) {
        this.honestyId = honestyId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
