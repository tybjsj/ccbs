package com.ccbs.bs.domain;

public class BsSerMenInfoKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bs_ser_men_rln.num_userid
     *
     * @mbggenerated
     */
    private String numUserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bs_ser_men_rln.num_ser
     *
     * @mbggenerated
     */
    private String numSer;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bs_ser_men_rln.num_userid
     *
     * @return the value of t_bs_ser_men_rln.num_userid
     *
     * @mbggenerated
     */
    public String getNumUserid() {
        return numUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bs_ser_men_rln.num_userid
     *
     * @param numUserid the value for t_bs_ser_men_rln.num_userid
     *
     * @mbggenerated
     */
    public void setNumUserid(String numUserid) {
        this.numUserid = numUserid == null ? null : numUserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bs_ser_men_rln.num_ser
     *
     * @return the value of t_bs_ser_men_rln.num_ser
     *
     * @mbggenerated
     */
    public String getNumSer() {
        return numSer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bs_ser_men_rln.num_ser
     *
     * @param numSer the value for t_bs_ser_men_rln.num_ser
     *
     * @mbggenerated
     */
    public void setNumSer(String numSer) {
        this.numSer = numSer == null ? null : numSer.trim();
    }
}