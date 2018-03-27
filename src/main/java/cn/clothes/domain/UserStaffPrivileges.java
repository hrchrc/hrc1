package cn.clothes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_staff_privileges")
public class UserStaffPrivileges {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_staff_privileges.id
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_staff_privileges.login
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String login;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_staff_privileges.queryStatistics
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String querystatistics;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_staff_privileges.register
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String register;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_staff_privileges.changeInformation
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String changeinformation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_staff_privileges.changePassword
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    private String changepassword;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_staff_privileges.id
     *
     * @return the value of user_staff_privileges.id
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
     * This method sets the value of the database column user_staff_privileges.id
     *
     * @param id the value for user_staff_privileges.id
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_staff_privileges.login
     *
     * @return the value of user_staff_privileges.login
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getLogin() {
        return login;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_staff_privileges.login
     *
     * @param login the value for user_staff_privileges.login
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_staff_privileges.queryStatistics
     *
     * @return the value of user_staff_privileges.queryStatistics
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getQuerystatistics() {
        return querystatistics;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_staff_privileges.queryStatistics
     *
     * @param querystatistics the value for user_staff_privileges.queryStatistics
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setQuerystatistics(String querystatistics) {
        this.querystatistics = querystatistics;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_staff_privileges.register
     *
     * @return the value of user_staff_privileges.register
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getRegister() {
        return register;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_staff_privileges.register
     *
     * @param register the value for user_staff_privileges.register
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setRegister(String register) {
        this.register = register;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_staff_privileges.changeInformation
     *
     * @return the value of user_staff_privileges.changeInformation
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getChangeinformation() {
        return changeinformation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_staff_privileges.changeInformation
     *
     * @param changeinformation the value for user_staff_privileges.changeInformation
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setChangeinformation(String changeinformation) {
        this.changeinformation = changeinformation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_staff_privileges.changePassword
     *
     * @return the value of user_staff_privileges.changePassword
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public String getChangepassword() {
        return changepassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_staff_privileges.changePassword
     *
     * @param changepassword the value for user_staff_privileges.changePassword
     *
     * @mbg.generated Fri Mar 16 14:27:05 CST 2018
     */
    public void setChangepassword(String changepassword) {
        this.changepassword = changepassword;
    }
}