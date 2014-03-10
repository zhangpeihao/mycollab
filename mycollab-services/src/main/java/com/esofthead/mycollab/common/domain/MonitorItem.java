/*Domain class of table m_monitor_item*/
package com.esofthead.mycollab.common.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;
import java.util.Date;

@com.esofthead.mycollab.core.db.metadata.Table("m_monitor_item")
public class MonitorItem extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_monitor_item.id
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_monitor_item.user
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("user")
    private String user;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_monitor_item.monitor_date
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("monitor_date")
    private Date monitorDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_monitor_item.type
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("type")
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_monitor_item.typeid
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("typeid")
    private Integer typeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_monitor_item.extraTypeId
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("extraTypeId")
    private Integer extratypeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_monitor_item.sAccountId
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("sAccountId")
    private Integer saccountid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_monitor_item.id
     *
     * @return the value of m_monitor_item.id
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_monitor_item.id
     *
     * @param id the value for m_monitor_item.id
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_monitor_item.user
     *
     * @return the value of m_monitor_item.user
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_monitor_item.user
     *
     * @param user the value for m_monitor_item.user
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_monitor_item.monitor_date
     *
     * @return the value of m_monitor_item.monitor_date
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public Date getMonitorDate() {
        return monitorDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_monitor_item.monitor_date
     *
     * @param monitorDate the value for m_monitor_item.monitor_date
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public void setMonitorDate(Date monitorDate) {
        this.monitorDate = monitorDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_monitor_item.type
     *
     * @return the value of m_monitor_item.type
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_monitor_item.type
     *
     * @param type the value for m_monitor_item.type
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_monitor_item.typeid
     *
     * @return the value of m_monitor_item.typeid
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_monitor_item.typeid
     *
     * @param typeid the value for m_monitor_item.typeid
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_monitor_item.extraTypeId
     *
     * @return the value of m_monitor_item.extraTypeId
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public Integer getExtratypeid() {
        return extratypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_monitor_item.extraTypeId
     *
     * @param extratypeid the value for m_monitor_item.extraTypeId
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public void setExtratypeid(Integer extratypeid) {
        this.extratypeid = extratypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_monitor_item.sAccountId
     *
     * @return the value of m_monitor_item.sAccountId
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_monitor_item.sAccountId
     *
     * @param saccountid the value for m_monitor_item.sAccountId
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }
}