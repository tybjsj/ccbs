package com.ccbs.bs.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ccbs.bs.domain.BsProInfo;
@Mapper
public interface BsProInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_pro
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String codPro);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_pro
     *
     * @mbggenerated
     */
    int insert(BsProInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_pro
     *
     * @mbggenerated
     */
    int insertSelective(BsProInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_pro
     *
     * @mbggenerated
     */
    BsProInfo selectByPrimaryKey(String codPro);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_pro
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BsProInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_pro
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BsProInfo record);
}