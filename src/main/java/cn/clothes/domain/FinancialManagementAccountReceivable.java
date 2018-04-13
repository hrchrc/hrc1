package cn.clothes.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.domain.Page;
@Entity
@Table(name="financial_management_account_receivable")
public class FinancialManagementAccountReceivable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financial_management_account_receivable.id
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financial_management_account_receivable.financialManagementAccountReceivableID
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer financialmanagementaccountreceivableid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financial_management_account_receivable.OrderID
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String orderid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financial_management_account_receivable.orderDate
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Date orderdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financial_management_account_receivable.billType
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String billtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financial_management_account_receivable.client
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String client;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financial_management_account_receivable.shipmentTrackingNumber
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer shipmenttrackingnumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financial_management_account_receivable.receivableAmount
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Double receivableamount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financial_management_account_receivable.discountAmount
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Double discountamount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column financial_management_account_receivable.actualAmount
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Double actualamount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column financial_management_account_receivable.id
     *
     * @return the value of financial_management_account_receivable.id
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
     * This method sets the value of the database column financial_management_account_receivable.id
     *
     * @param id the value for financial_management_account_receivable.id
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column financial_management_account_receivable.financialManagementAccountReceivableID
     *
     * @return the value of financial_management_account_receivable.financialManagementAccountReceivableID
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Integer getFinancialmanagementaccountreceivableid() {
        return financialmanagementaccountreceivableid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column financial_management_account_receivable.financialManagementAccountReceivableID
     *
     * @param financialmanagementaccountreceivableid the value for financial_management_account_receivable.financialManagementAccountReceivableID
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setFinancialmanagementaccountreceivableid(Integer financialmanagementaccountreceivableid) {
        this.financialmanagementaccountreceivableid = financialmanagementaccountreceivableid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column financial_management_account_receivable.OrderID
     *
     * @return the value of financial_management_account_receivable.OrderID
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column financial_management_account_receivable.OrderID
     *
     * @param orderid the value for financial_management_account_receivable.OrderID
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column financial_management_account_receivable.orderDate
     *
     * @return the value of financial_management_account_receivable.orderDate
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Date getOrderdate() {
        return orderdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column financial_management_account_receivable.orderDate
     *
     * @param orderdate the value for financial_management_account_receivable.orderDate
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column financial_management_account_receivable.billType
     *
     * @return the value of financial_management_account_receivable.billType
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getBilltype() {
        return billtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column financial_management_account_receivable.billType
     *
     * @param billtype the value for financial_management_account_receivable.billType
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setBilltype(String billtype) {
        this.billtype = billtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column financial_management_account_receivable.client
     *
     * @return the value of financial_management_account_receivable.client
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getClient() {
        return client;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column financial_management_account_receivable.client
     *
     * @param client the value for financial_management_account_receivable.client
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setClient(String client) {
        this.client = client;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column financial_management_account_receivable.shipmentTrackingNumber
     *
     * @return the value of financial_management_account_receivable.shipmentTrackingNumber
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Integer getShipmenttrackingnumber() {
        return shipmenttrackingnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column financial_management_account_receivable.shipmentTrackingNumber
     *
     * @param shipmenttrackingnumber the value for financial_management_account_receivable.shipmentTrackingNumber
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setShipmenttrackingnumber(Integer shipmenttrackingnumber) {
        this.shipmenttrackingnumber = shipmenttrackingnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column financial_management_account_receivable.receivableAmount
     *
     * @return the value of financial_management_account_receivable.receivableAmount
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Double getReceivableamount() {
        return receivableamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column financial_management_account_receivable.receivableAmount
     *
     * @param receivableamount the value for financial_management_account_receivable.receivableAmount
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setReceivableamount(Double receivableamount) {
        this.receivableamount = receivableamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column financial_management_account_receivable.discountAmount
     *
     * @return the value of financial_management_account_receivable.discountAmount
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Double getDiscountamount() {
        return discountamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column financial_management_account_receivable.discountAmount
     *
     * @param discountamount the value for financial_management_account_receivable.discountAmount
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setDiscountamount(Double discountamount) {
        this.discountamount = discountamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column financial_management_account_receivable.actualAmount
     *
     * @return the value of financial_management_account_receivable.actualAmount
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Double getActualamount() {
        return actualamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column financial_management_account_receivable.actualAmount
     *
     * @param actualamount the value for financial_management_account_receivable.actualAmount
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setActualamount(Double actualamount) {
        this.actualamount = actualamount;
    }

}