package com.ccbs.bs.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ccbs.bs.domain.BsInviteInfo;
@Mapper
public interface BsInviteInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_invite
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String numInvite);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_invite
     *
     * @mbggenerated
     */
    int insert(BsInviteInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_invite
     *
     * @mbggenerated
     */
    int insertSelective(BsInviteInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_invite
     *
     * @mbggenerated
     */
    BsInviteInfo selectByPrimaryKey(String numInvite);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_invite
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BsInviteInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_invite
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BsInviteInfo record);
}