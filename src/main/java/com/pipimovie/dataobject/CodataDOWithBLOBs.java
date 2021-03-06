package com.pipimovie.dataobject;

public class CodataDOWithBLOBs extends CodataDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_co_data.v_des
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String vDes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_co_data.v_playdata
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String vPlaydata;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_co_data.v_downdata
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String vDowndata;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_co_data
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public CodataDOWithBLOBs(Integer vId, Short tid, String tname, String vName, Integer vState, String vPic, String vSpic, String vGpic, Integer vHit, Short vMoney, Short vRank, Short vDigg, Short vTread, Short vCommend, Short vWrong, String vDirector, String vEnname, String vLang, String vActor, String vColor, String vPublishyear, String vPublisharea, Integer vAddtime, Integer vTopic, String vNote, String vTags, String vLetter, String vFrom, String vInbase, String vDes, String vPlaydata, String vDowndata) {
        super(vId, tid, tname, vName, vState, vPic, vSpic, vGpic, vHit, vMoney, vRank, vDigg, vTread, vCommend, vWrong, vDirector, vEnname, vLang, vActor, vColor, vPublishyear, vPublisharea, vAddtime, vTopic, vNote, vTags, vLetter, vFrom, vInbase);
        this.vDes = vDes;
        this.vPlaydata = vPlaydata;
        this.vDowndata = vDowndata;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_co_data
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public CodataDOWithBLOBs() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_co_data.v_des
     *
     * @return the value of sea_co_data.v_des
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getvDes() {
        return vDes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_co_data.v_des
     *
     * @param vDes the value for sea_co_data.v_des
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setvDes(String vDes) {
        this.vDes = vDes == null ? null : vDes.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_co_data.v_playdata
     *
     * @return the value of sea_co_data.v_playdata
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getvPlaydata() {
        return vPlaydata;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_co_data.v_playdata
     *
     * @param vPlaydata the value for sea_co_data.v_playdata
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setvPlaydata(String vPlaydata) {
        this.vPlaydata = vPlaydata == null ? null : vPlaydata.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_co_data.v_downdata
     *
     * @return the value of sea_co_data.v_downdata
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getvDowndata() {
        return vDowndata;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_co_data.v_downdata
     *
     * @param vDowndata the value for sea_co_data.v_downdata
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setvDowndata(String vDowndata) {
        this.vDowndata = vDowndata == null ? null : vDowndata.trim();
    }
}