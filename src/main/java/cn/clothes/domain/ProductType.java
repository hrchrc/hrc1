package cn.clothes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_type")
public class ProductType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_type.productNo
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Long productno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_type.productType
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String producttype;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_type.productNo
     *
     * @return the value of product_type.productNo
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getProductno() {
        return productno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_type.productNo
     *
     * @param productno the value for product_type.productNo
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setProductno(Long productno) {
        this.productno = productno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_type.productType
     *
     * @return the value of product_type.productType
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getProducttype() {
        return producttype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_type.productType
     *
     * @param producttype the value for product_type.productType
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }
}