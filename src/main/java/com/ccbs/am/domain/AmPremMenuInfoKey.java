package com.ccbs.am.domain;

public class AmPremMenuInfoKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_am_prem_menu.num_premid
     *
     * @mbggenerated
     */
    private String numPremid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_am_prem_menu.num_menuid
     *
     * @mbggenerated
     */
    private String numMenuid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_am_prem_menu.num_premid
     *
     * @return the value of t_am_prem_menu.num_premid
     *
     * @mbggenerated
     */
    public String getNumPremid() {
        return numPremid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_am_prem_menu.num_premid
     *
     * @param numPremid the value for t_am_prem_menu.num_premid
     *
     * @mbggenerated
     */
    public void setNumPremid(String numPremid) {
        this.numPremid = numPremid == null ? null : numPremid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_am_prem_menu.num_menuid
     *
     * @return the value of t_am_prem_menu.num_menuid
     *
     * @mbggenerated
     */
    public String getNumMenuid() {
        return numMenuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_am_prem_menu.num_menuid
     *
     * @param numMenuid the value for t_am_prem_menu.num_menuid
     *
     * @mbggenerated
     */
    public void setNumMenuid(String numMenuid) {
        this.numMenuid = numMenuid == null ? null : numMenuid.trim();
    }
}