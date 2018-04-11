package cn.clothes.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee_table")
public class EmployeeTable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_table.employeeNumber
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
	
    private Integer employeenumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_table.name
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_table.department
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String department;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_table.position
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String position;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_table.sex
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_table.idCards
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String idcards;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_table.dateOnBoard
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Date dateonboard;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_table.bankAccount
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String bankaccount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee_table.address
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String address;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_table.employeeNumber
     *
     * @return the value of employee_table.employeeNumber
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    @Id
    public Integer getEmployeenumber() {
        return employeenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee_table.employeeNumber
     *
     * @param employeenumber the value for employee_table.employeeNumber
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setEmployeenumber(Integer employeenumber) {
        this.employeenumber = employeenumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_table.name
     *
     * @return the value of employee_table.name
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee_table.name
     *
     * @param name the value for employee_table.name
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_table.department
     *
     * @return the value of employee_table.department
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getDepartment() {
        return department;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee_table.department
     *
     * @param department the value for employee_table.department
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_table.position
     *
     * @return the value of employee_table.position
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getPosition() {
        return position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee_table.position
     *
     * @param position the value for employee_table.position
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_table.sex
     *
     * @return the value of employee_table.sex
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee_table.sex
     *
     * @param sex the value for employee_table.sex
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_table.idCards
     *
     * @return the value of employee_table.idCards
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getIdcards() {
        return idcards;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee_table.idCards
     *
     * @param idcards the value for employee_table.idCards
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setIdcards(String idcards) {
        this.idcards = idcards;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_table.dateOnBoard
     *
     * @return the value of employee_table.dateOnBoard
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public Date getDateonboard() {
        return dateonboard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee_table.dateOnBoard
     *
     * @param dateonboard the value for employee_table.dateOnBoard
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setDateonboard(Date dateonboard) {
        this.dateonboard = dateonboard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_table.bankAccount
     *
     * @return the value of employee_table.bankAccount
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getBankaccount() {
        return bankaccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee_table.bankAccount
     *
     * @param bankaccount the value for employee_table.bankAccount
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setBankaccount(String bankaccount) {
        this.bankaccount = bankaccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee_table.address
     *
     * @return the value of employee_table.address
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee_table.address
     *
     * @param address the value for employee_table.address
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setAddress(String address) {
        this.address = address;
    }
}