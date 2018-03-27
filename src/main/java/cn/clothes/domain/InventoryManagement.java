package cn.clothes.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="inventory_management")
public class InventoryManagement {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inventory_management.id
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inventory_management.inventoryNum
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer inventorynum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inventory_management.stockNumber
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer stocknumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inventory_management.clothesNames
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String clothesnames;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inventory_management.size
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer size;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inventory_management.color
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String color;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inventory_management.unit
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String unit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inventory_management.price
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Long price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inventory_management.date
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Date date;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory_management.id
     *
     * @return the value of inventory_management.id
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
     * This method sets the value of the database column inventory_management.id
     *
     * @param id the value for inventory_management.id
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory_management.inventoryNum
     *
     * @return the value of inventory_management.inventoryNum
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Integer getInventorynum() {
        return inventorynum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory_management.inventoryNum
     *
     * @param inventorynum the value for inventory_management.inventoryNum
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setInventorynum(Integer inventorynum) {
        this.inventorynum = inventorynum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory_management.stockNumber
     *
     * @return the value of inventory_management.stockNumber
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Integer getStocknumber() {
        return stocknumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory_management.stockNumber
     *
     * @param stocknumber the value for inventory_management.stockNumber
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setStocknumber(Integer stocknumber) {
        this.stocknumber = stocknumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory_management.clothesNames
     *
     * @return the value of inventory_management.clothesNames
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getClothesnames() {
        return clothesnames;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory_management.clothesNames
     *
     * @param clothesnames the value for inventory_management.clothesNames
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setClothesnames(String clothesnames) {
        this.clothesnames = clothesnames;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory_management.size
     *
     * @return the value of inventory_management.size
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Integer getSize() {
        return size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory_management.size
     *
     * @param size the value for inventory_management.size
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory_management.color
     *
     * @return the value of inventory_management.color
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getColor() {
        return color;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory_management.color
     *
     * @param color the value for inventory_management.color
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory_management.unit
     *
     * @return the value of inventory_management.unit
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory_management.unit
     *
     * @param unit the value for inventory_management.unit
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory_management.price
     *
     * @return the value of inventory_management.price
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Long getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory_management.price
     *
     * @param price the value for inventory_management.price
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory_management.date
     *
     * @return the value of inventory_management.date
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory_management.date
     *
     * @param date the value for inventory_management.date
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setDate(Date date) {
        this.date = date;
    }
}