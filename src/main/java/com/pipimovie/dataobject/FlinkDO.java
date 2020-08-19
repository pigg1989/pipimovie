package com.pipimovie.dataobject;

public class FlinkDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_flink.id
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Short id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_flink.sortrank
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Short sortrank;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_flink.url
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_flink.webname
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String webname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_flink.msg
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String msg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_flink.email
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_flink.logo
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String logo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_flink.dtime
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Integer dtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_flink.ischeck
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Short ischeck;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_flink
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public FlinkDO(Short id, Short sortrank, String url, String webname, String msg, String email, String logo, Integer dtime, Short ischeck) {
        this.id = id;
        this.sortrank = sortrank;
        this.url = url;
        this.webname = webname;
        this.msg = msg;
        this.email = email;
        this.logo = logo;
        this.dtime = dtime;
        this.ischeck = ischeck;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_flink
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public FlinkDO() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_flink.id
     *
     * @return the value of sea_flink.id
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Short getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_flink.id
     *
     * @param id the value for sea_flink.id
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setId(Short id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_flink.sortrank
     *
     * @return the value of sea_flink.sortrank
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Short getSortrank() {
        return sortrank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_flink.sortrank
     *
     * @param sortrank the value for sea_flink.sortrank
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setSortrank(Short sortrank) {
        this.sortrank = sortrank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_flink.url
     *
     * @return the value of sea_flink.url
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_flink.url
     *
     * @param url the value for sea_flink.url
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_flink.webname
     *
     * @return the value of sea_flink.webname
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getWebname() {
        return webname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_flink.webname
     *
     * @param webname the value for sea_flink.webname
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setWebname(String webname) {
        this.webname = webname == null ? null : webname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_flink.msg
     *
     * @return the value of sea_flink.msg
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getMsg() {
        return msg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_flink.msg
     *
     * @param msg the value for sea_flink.msg
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_flink.email
     *
     * @return the value of sea_flink.email
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_flink.email
     *
     * @param email the value for sea_flink.email
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_flink.logo
     *
     * @return the value of sea_flink.logo
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getLogo() {
        return logo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_flink.logo
     *
     * @param logo the value for sea_flink.logo
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_flink.dtime
     *
     * @return the value of sea_flink.dtime
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Integer getDtime() {
        return dtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_flink.dtime
     *
     * @param dtime the value for sea_flink.dtime
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setDtime(Integer dtime) {
        this.dtime = dtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_flink.ischeck
     *
     * @return the value of sea_flink.ischeck
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Short getIscheck() {
        return ischeck;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_flink.ischeck
     *
     * @param ischeck the value for sea_flink.ischeck
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setIscheck(Short ischeck) {
        this.ischeck = ischeck;
    }
}