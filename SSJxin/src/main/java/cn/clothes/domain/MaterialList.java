package cn.clothes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="material_list")
public class MaterialList {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_list.id
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_list.nameOfMaterial
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String nameofmaterial;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_list.materialSpecification
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String materialspecification;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_list.materialColor
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String materialcolor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_list.materialAmount
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer materialamount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_list.quantityOfMaterial
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer quantityofmaterial;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column material_list.materialUnit
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String materialunit;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_list.id
     *
     * @return the value of material_list.id
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
     * This method sets the value of the database column material_list.id
     *
     * @param id the value for material_list.id
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_list.nameOfMaterial
     *
     * @return the value of material_list.nameOfMaterial
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getNameofmaterial() {
        return nameofmaterial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_list.nameOfMaterial
     *
     * @param nameofmaterial the value for material_list.nameOfMaterial
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setNameofmaterial(String nameofmaterial) {
        this.nameofmaterial = nameofmaterial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_list.materialSpecification
     *
     * @return the value of material_list.materialSpecification
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getMaterialspecification() {
        return materialspecification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_list.materialSpecification
     *
     * @param materialspecification the value for material_list.materialSpecification
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setMaterialspecification(String materialspecification) {
        this.materialspecification = materialspecification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_list.materialColor
     *
     * @return the value of material_list.materialColor
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getMaterialcolor() {
        return materialcolor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_list.materialColor
     *
     * @param materialcolor the value for material_list.materialColor
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setMaterialcolor(String materialcolor) {
        this.materialcolor = materialcolor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_list.materialAmount
     *
     * @return the value of material_list.materialAmount
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Integer getMaterialamount() {
        return materialamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_list.materialAmount
     *
     * @param materialamount the value for material_list.materialAmount
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setMaterialamount(Integer materialamount) {
        this.materialamount = materialamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_list.quantityOfMaterial
     *
     * @return the value of material_list.quantityOfMaterial
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Integer getQuantityofmaterial() {
        return quantityofmaterial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_list.quantityOfMaterial
     *
     * @param quantityofmaterial the value for material_list.quantityOfMaterial
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setQuantityofmaterial(Integer quantityofmaterial) {
        this.quantityofmaterial = quantityofmaterial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column material_list.materialUnit
     *
     * @return the value of material_list.materialUnit
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getMaterialunit() {
        return materialunit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column material_list.materialUnit
     *
     * @param materialunit the value for material_list.materialUnit
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setMaterialunit(String materialunit) {
        this.materialunit = materialunit;
    }
}