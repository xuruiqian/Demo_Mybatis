package com.astor.model;

import java.util.Date;

public class User {
    private String id;

    private String username;

    private String password;

    private String fullname;

    private String description;

    private Integer accountstatus;

    private Date accountdisabledate;

    private Boolean isbuildin;

    private Boolean isvisbile;

    private Date createtime;

    private Date updatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname == null ? null : fullname.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getAccountstatus() {
        return accountstatus;
    }

    public void setAccountstatus(Integer accountstatus) {
        this.accountstatus = accountstatus;
    }

    public Date getAccountdisabledate() {
        return accountdisabledate;
    }

    public void setAccountdisabledate(Date accountdisabledate) {
        this.accountdisabledate = accountdisabledate;
    }

    public Boolean getIsbuildin() {
        return isbuildin;
    }

    public void setIsbuildin(Boolean isbuildin) {
        this.isbuildin = isbuildin;
    }

    public Boolean getIsvisbile() {
        return isvisbile;
    }

    public void setIsvisbile(Boolean isvisbile) {
        this.isvisbile = isvisbile;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}