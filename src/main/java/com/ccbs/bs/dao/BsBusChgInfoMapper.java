package com.ccbs.bs.dao;

import org.apache.ibatis.annotations.Mapper;

import com.ccbs.bs.domain.BsBusChgInfo;
@Mapper
public interface BsBusChgInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_bus_chg
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String numBusId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_bus_chg
     *
     * @mbggenerated
     */
    int insert(BsBusChgInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_bus_chg
     *
     * @mbggenerated
     */
    int insertSelective(BsBusChgInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_bus_chg
     *
     * @mbggenerated
     */
    BsBusChgInfo selectByPrimaryKey(String numBusId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_bus_chg
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BsBusChgInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_bs_bus_chg
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BsBusChgInfo record);
}