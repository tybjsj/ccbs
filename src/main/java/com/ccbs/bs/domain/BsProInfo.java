package com.ccbs.bs.domain;

public class BsProInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bs_pro.cod_pro
     *
     * @mbggenerated
     */
    private String codPro;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bs_pro.txt_pro_name
     *
     * @mbggenerated
     */
    private String txtProName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bs_pro.ind_msk_sts
     *
     * @mbggenerated
     */
    private String indMskSts;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_bs_pro.date_upd_last
     *
     * @mbggenerated
     */
    private String dateUpdLast;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bs_pro.cod_pro
     *
     * @return the value of t_bs_pro.cod_pro
     *
     * @mbggenerated
     */
    public String getCodPro() {
        return codPro;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bs_pro.cod_pro
     *
     * @param codPro the value for t_bs_pro.cod_pro
     *
     * @mbggenerated
     */
    public void setCodPro(String codPro) {
        this.codPro = codPro == null ? null : codPro.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bs_pro.txt_pro_name
     *
     * @return the value of t_bs_pro.txt_pro_name
     *
     * @mbggenerated
     */
    public String getTxtProName() {
        return txtProName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bs_pro.txt_pro_name
     *
     * @param txtProName the value for t_bs_pro.txt_pro_name
     *
     * @mbggenerated
     */
    public void setTxtProName(String txtProName) {
        this.txtProName = txtProName == null ? null : txtProName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bs_pro.ind_msk_sts
     *
     * @return the value of t_bs_pro.ind_msk_sts
     *
     * @mbggenerated
     */
    public String getIndMskSts() {
        return indMskSts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bs_pro.ind_msk_sts
     *
     * @param indMskSts the value for t_bs_pro.ind_msk_sts
     *
     * @mbggenerated
     */
    public void setIndMskSts(String indMskSts) {
        this.indMskSts = indMskSts == null ? null : indMskSts.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_bs_pro.date_upd_last
     *
     * @return the value of t_bs_pro.date_upd_last
     *
     * @mbggenerated
     */
    public String getDateUpdLast() {
        return dateUpdLast;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_bs_pro.date_upd_last
     *
     * @param dateUpdLast the value for t_bs_pro.date_upd_last
     *
     * @mbggenerated
     */
    public void setDateUpdLast(String dateUpdLast) {
        this.dateUpdLast = dateUpdLast == null ? null : dateUpdLast.trim();
    }
}