package com.pipimovie.dao;

import com.pipimovie.dataobject.BuyDO;

public interface BuyDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_buy
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_buy
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int insert(BuyDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_buy
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int insertSelective(BuyDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_buy
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    BuyDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_buy
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int updateByPrimaryKeySelective(BuyDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_buy
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int updateByPrimaryKey(BuyDO record);
}