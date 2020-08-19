package com.pipimovie.dataobject;

public class ContentDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_content.v_id
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Integer vId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_content.tid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Short tid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_content.body
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String body;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_content
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public ContentDO(Integer vId, Short tid, String body) {
        this.vId = vId;
        this.tid = tid;
        this.body = body;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_content
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public ContentDO() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_content.v_id
     *
     * @return the value of sea_content.v_id
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Integer getvId() {
        return vId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_content.v_id
     *
     * @param vId the value for sea_content.v_id
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setvId(Integer vId) {
        this.vId = vId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_content.tid
     *
     * @return the value of sea_content.tid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Short getTid() {
        return tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_content.tid
     *
     * @param tid the value for sea_content.tid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setTid(Short tid) {
        this.tid = tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_content.body
     *
     * @return the value of sea_content.body
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getBody() {
        return body;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_content.body
     *
     * @param body the value for sea_content.body
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }
}