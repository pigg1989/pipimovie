package com.pipimovie.dao;

import com.pipimovie.dataobject.CoconfigDO;

public interface CoconfigDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_co_config
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int deleteByPrimaryKey(Integer cid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_co_config
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int insert(CoconfigDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_co_config
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int insertSelective(CoconfigDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_co_config
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    CoconfigDO selectByPrimaryKey(Integer cid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_co_config
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int updateByPrimaryKeySelective(CoconfigDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_co_config
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int updateByPrimaryKey(CoconfigDO record);
}