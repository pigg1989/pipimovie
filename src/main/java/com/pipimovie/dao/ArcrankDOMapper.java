package com.pipimovie.dao;

import com.pipimovie.dataobject.ArcrankDO;

public interface ArcrankDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_arcrank
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int deleteByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_arcrank
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int insert(ArcrankDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_arcrank
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int insertSelective(ArcrankDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_arcrank
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    ArcrankDO selectByPrimaryKey(Short id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_arcrank
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int updateByPrimaryKeySelective(ArcrankDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_arcrank
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int updateByPrimaryKey(ArcrankDO record);
}