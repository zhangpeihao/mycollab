/*Domain class of table m_comment*/
package com.esofthead.mycollab.common.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;
import java.util.Date;

@com.esofthead.mycollab.core.db.metadata.Table("m_comment")
public class Comment extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_comment.id
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_comment.createdUser
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("createdUser")
    private String createduser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_comment.createdTime
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("createdTime")
    private Date createdtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_comment.type
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("type")
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_comment.typeId
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("typeId")
    private Integer typeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_comment.sAccountId
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("sAccountId")
    private Integer saccountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_comment.extraTypeId
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    @com.esofthead.mycollab.core.db.metadata.Column("extraTypeId")
    private Integer extratypeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_comment.comment
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    @org.hibernate.validator.constraints.Length(max=65535, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("comment")
    private String comment;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_comment.id
     *
     * @return the value of m_comment.id
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_comment.id
     *
     * @param id the value for m_comment.id
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_comment.createdUser
     *
     * @return the value of m_comment.createdUser
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public String getCreateduser() {
        return createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_comment.createdUser
     *
     * @param createduser the value for m_comment.createdUser
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public void setCreateduser(String createduser) {
        this.createduser = createduser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_comment.createdTime
     *
     * @return the value of m_comment.createdTime
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_comment.createdTime
     *
     * @param createdtime the value for m_comment.createdTime
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_comment.type
     *
     * @return the value of m_comment.type
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_comment.type
     *
     * @param type the value for m_comment.type
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_comment.typeId
     *
     * @return the value of m_comment.typeId
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_comment.typeId
     *
     * @param typeid the value for m_comment.typeId
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_comment.sAccountId
     *
     * @return the value of m_comment.sAccountId
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_comment.sAccountId
     *
     * @param saccountid the value for m_comment.sAccountId
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_comment.extraTypeId
     *
     * @return the value of m_comment.extraTypeId
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public Integer getExtratypeid() {
        return extratypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_comment.extraTypeId
     *
     * @param extratypeid the value for m_comment.extraTypeId
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public void setExtratypeid(Integer extratypeid) {
        this.extratypeid = extratypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_comment.comment
     *
     * @return the value of m_comment.comment
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_comment.comment
     *
     * @param comment the value for m_comment.comment
     *
     * @mbggenerated Sat Mar 08 17:38:10 ICT 2014
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
}