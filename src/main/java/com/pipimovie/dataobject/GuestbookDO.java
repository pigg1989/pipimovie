package com.pipimovie.dataobject;

public class GuestbookDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_guestbook.id
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_guestbook.uid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_guestbook.title
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_guestbook.mid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Integer mid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_guestbook.posttime
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Integer posttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_guestbook.uname
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String uname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_guestbook.ip
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_guestbook.dtime
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Integer dtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_guestbook.ischeck
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Short ischeck;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_guestbook.msg
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String msg;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_guestbook
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public GuestbookDO(Integer id, Integer uid, String title, Integer mid, Integer posttime, String uname, String ip, Integer dtime, Short ischeck, String msg) {
        this.id = id;
        this.uid = uid;
        this.title = title;
        this.mid = mid;
        this.posttime = posttime;
        this.uname = uname;
        this.ip = ip;
        this.dtime = dtime;
        this.ischeck = ischeck;
        this.msg = msg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_guestbook
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public GuestbookDO() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_guestbook.id
     *
     * @return the value of sea_guestbook.id
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_guestbook.id
     *
     * @param id the value for sea_guestbook.id
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_guestbook.uid
     *
     * @return the value of sea_guestbook.uid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_guestbook.uid
     *
     * @param uid the value for sea_guestbook.uid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_guestbook.title
     *
     * @return the value of sea_guestbook.title
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_guestbook.title
     *
     * @param title the value for sea_guestbook.title
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_guestbook.mid
     *
     * @return the value of sea_guestbook.mid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_guestbook.mid
     *
     * @param mid the value for sea_guestbook.mid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_guestbook.posttime
     *
     * @return the value of sea_guestbook.posttime
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Integer getPosttime() {
        return posttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_guestbook.posttime
     *
     * @param posttime the value for sea_guestbook.posttime
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setPosttime(Integer posttime) {
        this.posttime = posttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_guestbook.uname
     *
     * @return the value of sea_guestbook.uname
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getUname() {
        return uname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_guestbook.uname
     *
     * @param uname the value for sea_guestbook.uname
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_guestbook.ip
     *
     * @return the value of sea_guestbook.ip
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_guestbook.ip
     *
     * @param ip the value for sea_guestbook.ip
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_guestbook.dtime
     *
     * @return the value of sea_guestbook.dtime
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Integer getDtime() {
        return dtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_guestbook.dtime
     *
     * @param dtime the value for sea_guestbook.dtime
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setDtime(Integer dtime) {
        this.dtime = dtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_guestbook.ischeck
     *
     * @return the value of sea_guestbook.ischeck
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Short getIscheck() {
        return ischeck;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_guestbook.ischeck
     *
     * @param ischeck the value for sea_guestbook.ischeck
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setIscheck(Short ischeck) {
        this.ischeck = ischeck;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_guestbook.msg
     *
     * @return the value of sea_guestbook.msg
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getMsg() {
        return msg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_guestbook.msg
     *
     * @param msg the value for sea_guestbook.msg
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }
}