package com.pipimovie.dao;

import com.pipimovie.dataobject.CronsDO;

public interface CronsDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_crons
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int deleteByPrimaryKey(Short cronid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_crons
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int insert(CronsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_crons
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int insertSelective(CronsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_crons
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    CronsDO selectByPrimaryKey(Short cronid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_crons
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int updateByPrimaryKeySelective(CronsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_crons
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int updateByPrimaryKey(CronsDO record);
}