package com.pipimovie.dao;

import com.pipimovie.dataobject.GuestbookDO;

public interface GuestbookDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_guestbook
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_guestbook
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int insert(GuestbookDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_guestbook
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int insertSelective(GuestbookDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_guestbook
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    GuestbookDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_guestbook
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int updateByPrimaryKeySelective(GuestbookDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_guestbook
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int updateByPrimaryKey(GuestbookDO record);
}