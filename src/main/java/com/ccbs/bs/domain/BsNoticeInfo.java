package com.ccbs.bs.domain;

public class BsNoticeInfo extends BsNoticeInfoKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bs_notice.ind_msk_sts
     *
     * @mbggenerated
     */
    private String indMskSts;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bs_notice.date_upd_last
     *
     * @mbggenerated
     */
    private String dateUpdLast;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bs_notice.ind_msk_sts
     *
     * @return the value of t_bs_notice.ind_msk_sts
     *
     * @mbggenerated
     */
    public String getIndMskSts() {
        return indMskSts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bs_notice.ind_msk_sts
     *
     * @param indMskSts the value for t_bs_notice.ind_msk_sts
     *
     * @mbggenerated
     */
    public void setIndMskSts(String indMskSts) {
        this.indMskSts = indMskSts == null ? null : indMskSts.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bs_notice.date_upd_last
     *
     * @return the value of t_bs_notice.date_upd_last
     *
     * @mbggenerated
     */
    public String getDateUpdLast() {
        return dateUpdLast;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bs_notice.date_upd_last
     *
     * @param dateUpdLast the value for t_bs_notice.date_upd_last
     *
     * @mbggenerated
     */
    public void setDateUpdLast(String dateUpdLast) {
        this.dateUpdLast = dateUpdLast == null ? null : dateUpdLast.trim();
    }
}