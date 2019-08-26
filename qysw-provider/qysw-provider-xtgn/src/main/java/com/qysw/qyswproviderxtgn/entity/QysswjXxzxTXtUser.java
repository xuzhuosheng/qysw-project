package com.qysw.qyswproviderxtgn.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (QysswjXxzxTXtUser)实体类
 *
 * @author makejava
 * @since 2019-08-26 10:03:29
 */
public class QysswjXxzxTXtUser implements Serializable {
    private static final long serialVersionUID = -65688116167274389L;

    private Integer id;
    //用户名
    private String username;
    //密码
    private String password;
    //手机
    private String cellphone;
    //真实姓名
    private String truename;
    //创建时间
    private Date createtime;
    //创建者
    private String creator;
    //状态
    private String zt;
    //备注
    private String bz;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getZt() {
        return zt;
    }

    public void setZt(String zt) {
        this.zt = zt;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

}