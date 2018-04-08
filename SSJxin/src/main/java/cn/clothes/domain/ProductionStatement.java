package cn.clothes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="production_statement")
public class ProductionStatement {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_statement.id
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_statement.productionStatementID
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer productionstatementid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_statement.clothesNames
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String clothesnames;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_statement.sum
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String sum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_statement.totalPrice
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Long totalprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_statement.specification
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String specification;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_statement.color
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String color;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_statement.unit
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String unit;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_statement.fabric
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String fabric;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_statement.ingredients
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String ingredients;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_statement.scheduledProduction
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer scheduledproduction;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_statement.actualOutput
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer actualoutput;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column production_statement.beenSold
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer beensold;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_statement.id
     *
     * @return the value of production_statement.id
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
     * This method sets the value of the database column production_statement.id
     *
     * @param id the value for production_statement.id
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_statement.productionStatementID
     *
     * @return the value of production_statement.productionStatementID
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Integer getProductionstatementid() {
        return productionstatementid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_statement.productionStatementID
     *
     * @param productionstatementid the value for production_statement.productionStatementID
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setProductionstatementid(Integer productionstatementid) {
        this.productionstatementid = productionstatementid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_statement.clothesNames
     *
     * @return the value of production_statement.clothesNames
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getClothesnames() {
        return clothesnames;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_statement.clothesNames
     *
     * @param clothesnames the value for production_statement.clothesNames
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setClothesnames(String clothesnames) {
        this.clothesnames = clothesnames;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_statement.sum
     *
     * @return the value of production_statement.sum
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getSum() {
        return sum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_statement.sum
     *
     * @param sum the value for production_statement.sum
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setSum(String sum) {
        this.sum = sum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_statement.totalPrice
     *
     * @return the value of production_statement.totalPrice
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Long getTotalprice() {
        return totalprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_statement.totalPrice
     *
     * @param totalprice the value for production_statement.totalPrice
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setTotalprice(Long totalprice) {
        this.totalprice = totalprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_statement.specification
     *
     * @return the value of production_statement.specification
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_statement.specification
     *
     * @param specification the value for production_statement.specification
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setSpecification(String specification) {
        this.specification = specification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_statement.color
     *
     * @return the value of production_statement.color
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getColor() {
        return color;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_statement.color
     *
     * @param color the value for production_statement.color
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_statement.unit
     *
     * @return the value of production_statement.unit
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_statement.unit
     *
     * @param unit the value for production_statement.unit
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_statement.fabric
     *
     * @return the value of production_statement.fabric
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getFabric() {
        return fabric;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_statement.fabric
     *
     * @param fabric the value for production_statement.fabric
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_statement.ingredients
     *
     * @return the value of production_statement.ingredients
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getIngredients() {
        return ingredients;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_statement.ingredients
     *
     * @param ingredients the value for production_statement.ingredients
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_statement.scheduledProduction
     *
     * @return the value of production_statement.scheduledProduction
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Integer getScheduledproduction() {
        return scheduledproduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_statement.scheduledProduction
     *
     * @param scheduledproduction the value for production_statement.scheduledProduction
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setScheduledproduction(Integer scheduledproduction) {
        this.scheduledproduction = scheduledproduction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_statement.actualOutput
     *
     * @return the value of production_statement.actualOutput
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Integer getActualoutput() {
        return actualoutput;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_statement.actualOutput
     *
     * @param actualoutput the value for production_statement.actualOutput
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setActualoutput(Integer actualoutput) {
        this.actualoutput = actualoutput;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column production_statement.beenSold
     *
     * @return the value of production_statement.beenSold
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Integer getBeensold() {
        return beensold;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column production_statement.beenSold
     *
     * @param beensold the value for production_statement.beenSold
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setBeensold(Integer beensold) {
        this.beensold = beensold;
    }
}