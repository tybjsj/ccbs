package com.ccbs.bs.domain;

public class BsNoticeInfoKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bs_notice.num_userid
     *
     * @mbggenerated
     */
    private String numUserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bs_notice.cod_pro
     *
     * @mbggenerated
     */
    private String codPro;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bs_notice.num_industry
     *
     * @mbggenerated
     */
    private String numIndustry;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bs_notice.num_userid
     *
     * @return the value of t_bs_notice.num_userid
     *
     * @mbggenerated
     */
    public String getNumUserid() {
        return numUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bs_notice.num_userid
     *
     * @param numUserid the value for t_bs_notice.num_userid
     *
     * @mbggenerated
     */
    public void setNumUserid(String numUserid) {
        this.numUserid = numUserid == null ? null : numUserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bs_notice.cod_pro
     *
     * @return the value of t_bs_notice.cod_pro
     *
     * @mbggenerated
     */
    public String getCodPro() {
        return codPro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bs_notice.cod_pro
     *
     * @param codPro the value for t_bs_notice.cod_pro
     *
     * @mbggenerated
     */
    public void setCodPro(String codPro) {
        this.codPro = codPro == null ? null : codPro.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bs_notice.num_industry
     *
     * @return the value of t_bs_notice.num_industry
     *
     * @mbggenerated
     */
    public String getNumIndustry() {
        return numIndustry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bs_notice.num_industry
     *
     * @param numIndustry the value for t_bs_notice.num_industry
     *
     * @mbggenerated
     */
    public void setNumIndustry(String numIndustry) {
        this.numIndustry = numIndustry == null ? null : numIndustry.trim();
    }
}