package com.ccbs.am.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ccbs.am.domain.AmRoleUserInfo;
import com.ccbs.am.domain.AmRoleUserInfoKey;
@Mapper
public interface AmRoleUserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_am_role_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(AmRoleUserInfoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_am_role_user
     *
     * @mbggenerated
     */
    int insert(AmRoleUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_am_role_user
     *
     * @mbggenerated
     */
    int insertSelective(AmRoleUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_am_role_user
     *
     * @mbggenerated
     */
    AmRoleUserInfo selectByPrimaryKey(AmRoleUserInfoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_am_role_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AmRoleUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_am_role_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AmRoleUserInfo record);
}