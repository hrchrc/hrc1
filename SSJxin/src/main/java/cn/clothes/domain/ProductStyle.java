package cn.clothes.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_style")
public class ProductStyle {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_style.styleNo
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer styleno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_style.styleNames
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String stylenames;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_style.styleNo
     *
     * @return the value of product_style.styleNo
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    @Id
    public Integer getStyleno() {
        return styleno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_style.styleNo
     *
     * @param styleno the value for product_style.styleNo
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setStyleno(Integer styleno) {
        this.styleno = styleno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_style.styleNames
     *
     * @return the value of product_style.styleNames
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getStylenames() {
        return stylenames;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_style.styleNames
     *
     * @param stylenames the value for product_style.styleNames
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setStylenames(String stylenames) {
        this.stylenames = stylenames;
    }
}