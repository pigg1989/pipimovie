package com.pipimovie.dao;

import com.pipimovie.dataobject.PlaydataDO;

public interface PlaydataDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_playdata
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int deleteByPrimaryKey(Integer vId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_playdata
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int insert(PlaydataDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_playdata
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int insertSelective(PlaydataDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_playdata
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    PlaydataDO selectByPrimaryKey(Integer vId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_playdata
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int updateByPrimaryKeySelective(PlaydataDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_playdata
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int updateByPrimaryKey(PlaydataDO record);
}