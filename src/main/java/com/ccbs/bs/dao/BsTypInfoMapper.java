package com.ccbs.bs.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ccbs.bs.domain.BsTypInfo;
@Mapper
public interface BsTypInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_bustyp
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String numBustyp);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_bustyp
     *
     * @mbggenerated
     */
    int insert(BsTypInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_bustyp
     *
     * @mbggenerated
     */
    int insertSelective(BsTypInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_bustyp
     *
     * @mbggenerated
     */
    BsTypInfo selectByPrimaryKey(String numBustyp);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_bustyp
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BsTypInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_bustyp
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BsTypInfo record);
}