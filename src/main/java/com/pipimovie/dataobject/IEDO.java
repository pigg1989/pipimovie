package com.pipimovie.dataobject;

import java.util.Date;

public class IEDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_ie.id
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_ie.ip
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_ie.addtime
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Date addtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_ie
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public IEDO(Integer id, String ip, Date addtime) {
        this.id = id;
        this.ip = ip;
        this.addtime = addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_ie
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public IEDO() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_ie.id
     *
     * @return the value of sea_ie.id
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_ie.id
     *
     * @param id the value for sea_ie.id
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_ie.ip
     *
     * @return the value of sea_ie.ip
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_ie.ip
     *
     * @param ip the value for sea_ie.ip
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_ie.addtime
     *
     * @return the value of sea_ie.addtime
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_ie.addtime
     *
     * @param addtime the value for sea_ie.addtime
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
}