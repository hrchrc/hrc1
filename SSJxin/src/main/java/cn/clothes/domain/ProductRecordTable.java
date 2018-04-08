package cn.clothes.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="product_record_table")
public class ProductRecordTable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_record_table.id
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_record_table.productRecordTableID
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer productrecordtableid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_record_table.productStateID
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer productstateid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_record_table.productNum
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer productnum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_record_table.inspectionTime
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Date inspectiontime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_record_table.deliveryTime
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Date deliverytime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_record_table.productQuality
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String productquality;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_record_table.responsiblePerson
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String responsibleperson;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_record_table.typeID
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer typeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_record_table.styleID
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer styleid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_record_table.id
     *
     * @return the value of product_record_table.id
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    @Id
	@GeneratedValue
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_record_table.id
     *
     * @param id the value for product_record_table.id
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_record_table.productRecordTableID
     *
     * @return the value of product_record_table.productRecordTableID
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Integer getProductrecordtableid() {
        return productrecordtableid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_record_table.productRecordTableID
     *
     * @param productrecordtableid the value for product_record_table.productRecordTableID
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setProductrecordtableid(Integer productrecordtableid) {
        this.productrecordtableid = productrecordtableid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_record_table.productStateID
     *
     * @return the value of product_record_table.productStateID
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Integer getProductstateid() {
        return productstateid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_record_table.productStateID
     *
     * @param productstateid the value for product_record_table.productStateID
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setProductstateid(Integer productstateid) {
        this.productstateid = productstateid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_record_table.productNum
     *
     * @return the value of product_record_table.productNum
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Integer getProductnum() {
        return productnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_record_table.productNum
     *
     * @param productnum the value for product_record_table.productNum
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setProductnum(Integer productnum) {
        this.productnum = productnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_record_table.inspectionTime
     *
     * @return the value of product_record_table.inspectionTime
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Date getInspectiontime() {
        return inspectiontime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_record_table.inspectionTime
     *
     * @param inspectiontime the value for product_record_table.inspectionTime
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setInspectiontime(Date inspectiontime) {
        this.inspectiontime = inspectiontime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_record_table.deliveryTime
     *
     * @return the value of product_record_table.deliveryTime
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Date getDeliverytime() {
        return deliverytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_record_table.deliveryTime
     *
     * @param deliverytime the value for product_record_table.deliveryTime
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setDeliverytime(Date deliverytime) {
        this.deliverytime = deliverytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_record_table.productQuality
     *
     * @return the value of product_record_table.productQuality
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getProductquality() {
        return productquality;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_record_table.productQuality
     *
     * @param productquality the value for product_record_table.productQuality
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setProductquality(String productquality) {
        this.productquality = productquality;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_record_table.responsiblePerson
     *
     * @return the value of product_record_table.responsiblePerson
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getResponsibleperson() {
        return responsibleperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_record_table.responsiblePerson
     *
     * @param responsibleperson the value for product_record_table.responsiblePerson
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setResponsibleperson(String responsibleperson) {
        this.responsibleperson = responsibleperson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_record_table.typeID
     *
     * @return the value of product_record_table.typeID
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_record_table.typeID
     *
     * @param typeid the value for product_record_table.typeID
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_record_table.styleID
     *
     * @return the value of product_record_table.styleID
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Integer getStyleid() {
        return styleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_record_table.styleID
     *
     * @param styleid the value for product_record_table.styleID
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setStyleid(Integer styleid) {
        this.styleid = styleid;
    }
}