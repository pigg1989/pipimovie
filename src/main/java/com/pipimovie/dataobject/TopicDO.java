package com.pipimovie.dataobject;

public class TopicDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_topic.id
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Short id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_topic.name
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_topic.enname
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String enname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_topic.sort
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Integer sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_topic.template
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String template;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_topic.pic
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String pic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_topic.des
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String des;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_topic.vod
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String vod;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_topic.keyword
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String keyword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_topic.addtime
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Integer addtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_topic
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public TopicDO(Short id, String name, String enname, Integer sort, String template, String pic, String des, String vod, String keyword, Integer addtime) {
        this.id = id;
        this.name = name;
        this.enname = enname;
        this.sort = sort;
        this.template = template;
        this.pic = pic;
        this.des = des;
        this.vod = vod;
        this.keyword = keyword;
        this.addtime = addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_topic
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public TopicDO() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_topic.id
     *
     * @return the value of sea_topic.id
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Short getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_topic.id
     *
     * @param id the value for sea_topic.id
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setId(Short id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_topic.name
     *
     * @return the value of sea_topic.name
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_topic.name
     *
     * @param name the value for sea_topic.name
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_topic.enname
     *
     * @return the value of sea_topic.enname
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getEnname() {
        return enname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_topic.enname
     *
     * @param enname the value for sea_topic.enname
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setEnname(String enname) {
        this.enname = enname == null ? null : enname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_topic.sort
     *
     * @return the value of sea_topic.sort
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_topic.sort
     *
     * @param sort the value for sea_topic.sort
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_topic.template
     *
     * @return the value of sea_topic.template
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getTemplate() {
        return template;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_topic.template
     *
     * @param template the value for sea_topic.template
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setTemplate(String template) {
        this.template = template == null ? null : template.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_topic.pic
     *
     * @return the value of sea_topic.pic
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_topic.pic
     *
     * @param pic the value for sea_topic.pic
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_topic.des
     *
     * @return the value of sea_topic.des
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getDes() {
        return des;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_topic.des
     *
     * @param des the value for sea_topic.des
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_topic.vod
     *
     * @return the value of sea_topic.vod
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getVod() {
        return vod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_topic.vod
     *
     * @param vod the value for sea_topic.vod
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setVod(String vod) {
        this.vod = vod == null ? null : vod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_topic.keyword
     *
     * @return the value of sea_topic.keyword
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_topic.keyword
     *
     * @param keyword the value for sea_topic.keyword
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_topic.addtime
     *
     * @return the value of sea_topic.addtime
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Integer getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_topic.addtime
     *
     * @param addtime the value for sea_topic.addtime
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }
}