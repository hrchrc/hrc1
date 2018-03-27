package cn.clothes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clothing_product_information")
public class ClothingProductInformation {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clothing_product_information.id
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clothing_product_information.breed
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String breed;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clothing_product_information.style
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String style;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clothing_product_information.color
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String color;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clothing_product_information.fabric
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String fabric;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clothing_product_information.accessories
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String accessories;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clothing_product_information.brand
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String brand;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clothing_product_information.size
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer size;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column clothing_product_information.id
     *
     * @return the value of clothing_product_information.id
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
     * This method sets the value of the database column clothing_product_information.id
     *
     * @param id the value for clothing_product_information.id
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column clothing_product_information.breed
     *
     * @return the value of clothing_product_information.breed
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    
    public String getBreed() {
        return breed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column clothing_product_information.breed
     *
     * @param breed the value for clothing_product_information.breed
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column clothing_product_information.style
     *
     * @return the value of clothing_product_information.style
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getStyle() {
        return style;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column clothing_product_information.style
     *
     * @param style the value for clothing_product_information.style
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column clothing_product_information.color
     *
     * @return the value of clothing_product_information.color
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getColor() {
        return color;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column clothing_product_information.color
     *
     * @param color the value for clothing_product_information.color
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column clothing_product_information.fabric
     *
     * @return the value of clothing_product_information.fabric
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getFabric() {
        return fabric;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column clothing_product_information.fabric
     *
     * @param fabric the value for clothing_product_information.fabric
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column clothing_product_information.accessories
     *
     * @return the value of clothing_product_information.accessories
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getAccessories() {
        return accessories;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column clothing_product_information.accessories
     *
     * @param accessories the value for clothing_product_information.accessories
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setAccessories(String accessories) {
        this.accessories = accessories;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column clothing_product_information.brand
     *
     * @return the value of clothing_product_information.brand
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getBrand() {
        return brand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column clothing_product_information.brand
     *
     * @param brand the value for clothing_product_information.brand
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column clothing_product_information.size
     *
     * @return the value of clothing_product_information.size
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Integer getSize() {
        return size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column clothing_product_information.size
     *
     * @param size the value for clothing_product_information.size
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setSize(Integer size) {
        this.size = size;
    }
}