package com.ccbs.bs.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ccbs.bs.domain.BsIndusInfo;
@Mapper
public interface BsIndusInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_industry
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String numIndustry);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_industry
     *
     * @mbggenerated
     */
    int insert(BsIndusInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_industry
     *
     * @mbggenerated
     */
    int insertSelective(BsIndusInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_industry
     *
     * @mbggenerated
     */
    BsIndusInfo selectByPrimaryKey(String numIndustry);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_industry
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BsIndusInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_industry
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BsIndusInfo record);
}