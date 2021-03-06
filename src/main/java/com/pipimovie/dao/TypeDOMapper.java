package com.pipimovie.dao;

import com.pipimovie.dataobject.TypeDO;

import java.util.List;

public interface TypeDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_type
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int deleteByPrimaryKey(Short tid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_type
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int insert(TypeDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_type
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int insertSelective(TypeDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_type
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    TypeDO selectByPrimaryKey(Short tid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_type
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int updateByPrimaryKeySelective(TypeDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_type
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int updateByPrimaryKey(TypeDO record);

    List<TypeDO> listAll();

    List<TypeDO> listByPid(Byte pid);

}