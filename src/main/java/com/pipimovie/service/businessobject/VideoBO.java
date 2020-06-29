package com.pipimovie.service.businessobject;

import java.util.List;

public class VideoModel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_id
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private Integer vId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.tid
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private Short tid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_name
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private String vName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_state
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private Integer vState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_pic
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private String vPic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_hit
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private Integer vHit;


    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_rank
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private Short vRank;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_actor
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private String vActor;



    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_publishyear
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private Integer vPublishyear;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_publisharea
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private String vPublisharea;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_addtime
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private Integer vAddtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_topic
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private Integer vTopic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_note
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private String vNote;



    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_letter
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private String vLetter;



    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_recycled
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private Short vRecycled;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_director
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private String vDirector;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_enname
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private String vEnname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_lang
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private String vLang;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_score
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private Integer vScore;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_scorenum
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private Integer vScorenum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_nickname
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private String vNickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_reweek
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private String vReweek;



    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_mtime
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private Float vMtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_imdb
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private Float vImdb;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_dayhit
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private Integer vDayhit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_weekhit
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private Integer vWeekhit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_monthhit
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private Integer vMonthhit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_daytime
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private Integer vDaytime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_weektime
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private Integer vWeektime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_monthtime
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private Integer vMonthtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_len
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private String vLen;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_data.v_total
     *
     * @mbg.generated Mon Jun 22 15:33:34 CST 2020
     */
    private String vTotal;

    private String typeName;

    private List<PlayDataBo> listPlayData;
}
