package com.pipimovie.dataobject;

public class CourlDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_co_url.uid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Integer uid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_co_url.cid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Short cid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_co_url.tid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Short tid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_co_url.url
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_co_url.pic
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String pic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_co_url.succ
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String succ;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_co_url.err
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Integer err;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_co_url.cotype
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Byte cotype;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_co_url
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public CourlDO(Integer uid, Short cid, Short tid, String url, String pic, String succ, Integer err, Byte cotype) {
        this.uid = uid;
        this.cid = cid;
        this.tid = tid;
        this.url = url;
        this.pic = pic;
        this.succ = succ;
        this.err = err;
        this.cotype = cotype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_co_url
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public CourlDO() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_co_url.uid
     *
     * @return the value of sea_co_url.uid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_co_url.uid
     *
     * @param uid the value for sea_co_url.uid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_co_url.cid
     *
     * @return the value of sea_co_url.cid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Short getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_co_url.cid
     *
     * @param cid the value for sea_co_url.cid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setCid(Short cid) {
        this.cid = cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_co_url.tid
     *
     * @return the value of sea_co_url.tid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Short getTid() {
        return tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_co_url.tid
     *
     * @param tid the value for sea_co_url.tid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setTid(Short tid) {
        this.tid = tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_co_url.url
     *
     * @return the value of sea_co_url.url
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_co_url.url
     *
     * @param url the value for sea_co_url.url
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_co_url.pic
     *
     * @return the value of sea_co_url.pic
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_co_url.pic
     *
     * @param pic the value for sea_co_url.pic
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_co_url.succ
     *
     * @return the value of sea_co_url.succ
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getSucc() {
        return succ;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_co_url.succ
     *
     * @param succ the value for sea_co_url.succ
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setSucc(String succ) {
        this.succ = succ == null ? null : succ.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_co_url.err
     *
     * @return the value of sea_co_url.err
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Integer getErr() {
        return err;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_co_url.err
     *
     * @param err the value for sea_co_url.err
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setErr(Integer err) {
        this.err = err;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_co_url.cotype
     *
     * @return the value of sea_co_url.cotype
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Byte getCotype() {
        return cotype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_co_url.cotype
     *
     * @param cotype the value for sea_co_url.cotype
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setCotype(Byte cotype) {
        this.cotype = cotype;
    }
}