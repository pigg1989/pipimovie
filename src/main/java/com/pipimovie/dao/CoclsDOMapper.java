package com.pipimovie.dao;

import com.pipimovie.dataobject.CoclsDO;

public interface CoclsDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_co_cls
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_co_cls
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int insert(CoclsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_co_cls
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int insertSelective(CoclsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_co_cls
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    CoclsDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_co_cls
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int updateByPrimaryKeySelective(CoclsDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_co_cls
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int updateByPrimaryKey(CoclsDO record);
}