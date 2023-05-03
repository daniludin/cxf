
package de.autinform.exchange.common.soap.server.notice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für authentication complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="authentication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addNewFields" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="asUserID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="asUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="asUserRedirect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="canton" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="contractorEnabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractorRoleId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="enableYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="highlightedTopNavigation" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="loggedIn" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="loginError" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="loginTries" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mailAdress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mustGTCaccepted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="natureUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="navigationPage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="selectedLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="step2Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="userID" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userRedirect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authentication", propOrder = {
    "addNewFields",
    "asUserID",
    "asUserName",
    "asUserRedirect",
    "canton",
    "category",
    "companyEnabled",
    "companyId",
    "contractorEnabled",
    "contractorRoleId",
    "enableYN",
    "highlightedTopNavigation",
    "language",
    "loggedIn",
    "loginError",
    "loginTries",
    "mailAdress",
    "mobileNumber",
    "mustGTCaccepted",
    "natureUser",
    "navigationPage",
    "selectedLanguage",
    "step2Password",
    "type",
    "userID",
    "userName",
    "userPassword",
    "userRedirect"
})
public class Authentication {

    protected boolean addNewFields;
    protected long asUserID;
    protected String asUserName;
    protected String asUserRedirect;
    protected String canton;
    protected String category;
    protected String companyEnabled;
    protected long companyId;
    protected String contractorEnabled;
    protected int contractorRoleId;
    protected String enableYN;
    protected int highlightedTopNavigation;
    protected String language;
    protected boolean loggedIn;
    protected boolean loginError;
    protected int loginTries;
    protected String mailAdress;
    protected String mobileNumber;
    protected boolean mustGTCaccepted;
    protected String natureUser;
    protected String navigationPage;
    protected String selectedLanguage;
    protected String step2Password;
    protected int type;
    protected long userID;
    protected String userName;
    protected String userPassword;
    protected String userRedirect;

    /**
     * Ruft den Wert der addNewFields-Eigenschaft ab.
     * 
     */
    public boolean isAddNewFields() {
        return addNewFields;
    }

    /**
     * Legt den Wert der addNewFields-Eigenschaft fest.
     * 
     */
    public void setAddNewFields(boolean value) {
        this.addNewFields = value;
    }

    /**
     * Ruft den Wert der asUserID-Eigenschaft ab.
     * 
     */
    public long getAsUserID() {
        return asUserID;
    }

    /**
     * Legt den Wert der asUserID-Eigenschaft fest.
     * 
     */
    public void setAsUserID(long value) {
        this.asUserID = value;
    }

    /**
     * Ruft den Wert der asUserName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsUserName() {
        return asUserName;
    }

    /**
     * Legt den Wert der asUserName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsUserName(String value) {
        this.asUserName = value;
    }

    /**
     * Ruft den Wert der asUserRedirect-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsUserRedirect() {
        return asUserRedirect;
    }

    /**
     * Legt den Wert der asUserRedirect-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsUserRedirect(String value) {
        this.asUserRedirect = value;
    }

    /**
     * Ruft den Wert der canton-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanton() {
        return canton;
    }

    /**
     * Legt den Wert der canton-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanton(String value) {
        this.canton = value;
    }

    /**
     * Ruft den Wert der category-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Legt den Wert der category-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Ruft den Wert der companyEnabled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyEnabled() {
        return companyEnabled;
    }

    /**
     * Legt den Wert der companyEnabled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyEnabled(String value) {
        this.companyEnabled = value;
    }

    /**
     * Ruft den Wert der companyId-Eigenschaft ab.
     * 
     */
    public long getCompanyId() {
        return companyId;
    }

    /**
     * Legt den Wert der companyId-Eigenschaft fest.
     * 
     */
    public void setCompanyId(long value) {
        this.companyId = value;
    }

    /**
     * Ruft den Wert der contractorEnabled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractorEnabled() {
        return contractorEnabled;
    }

    /**
     * Legt den Wert der contractorEnabled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractorEnabled(String value) {
        this.contractorEnabled = value;
    }

    /**
     * Ruft den Wert der contractorRoleId-Eigenschaft ab.
     * 
     */
    public int getContractorRoleId() {
        return contractorRoleId;
    }

    /**
     * Legt den Wert der contractorRoleId-Eigenschaft fest.
     * 
     */
    public void setContractorRoleId(int value) {
        this.contractorRoleId = value;
    }

    /**
     * Ruft den Wert der enableYN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnableYN() {
        return enableYN;
    }

    /**
     * Legt den Wert der enableYN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnableYN(String value) {
        this.enableYN = value;
    }

    /**
     * Ruft den Wert der highlightedTopNavigation-Eigenschaft ab.
     * 
     */
    public int getHighlightedTopNavigation() {
        return highlightedTopNavigation;
    }

    /**
     * Legt den Wert der highlightedTopNavigation-Eigenschaft fest.
     * 
     */
    public void setHighlightedTopNavigation(int value) {
        this.highlightedTopNavigation = value;
    }

    /**
     * Ruft den Wert der language-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Legt den Wert der language-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Ruft den Wert der loggedIn-Eigenschaft ab.
     * 
     */
    public boolean isLoggedIn() {
        return loggedIn;
    }

    /**
     * Legt den Wert der loggedIn-Eigenschaft fest.
     * 
     */
    public void setLoggedIn(boolean value) {
        this.loggedIn = value;
    }

    /**
     * Ruft den Wert der loginError-Eigenschaft ab.
     * 
     */
    public boolean isLoginError() {
        return loginError;
    }

    /**
     * Legt den Wert der loginError-Eigenschaft fest.
     * 
     */
    public void setLoginError(boolean value) {
        this.loginError = value;
    }

    /**
     * Ruft den Wert der loginTries-Eigenschaft ab.
     * 
     */
    public int getLoginTries() {
        return loginTries;
    }

    /**
     * Legt den Wert der loginTries-Eigenschaft fest.
     * 
     */
    public void setLoginTries(int value) {
        this.loginTries = value;
    }

    /**
     * Ruft den Wert der mailAdress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailAdress() {
        return mailAdress;
    }

    /**
     * Legt den Wert der mailAdress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailAdress(String value) {
        this.mailAdress = value;
    }

    /**
     * Ruft den Wert der mobileNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Legt den Wert der mobileNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

    /**
     * Ruft den Wert der mustGTCaccepted-Eigenschaft ab.
     * 
     */
    public boolean isMustGTCaccepted() {
        return mustGTCaccepted;
    }

    /**
     * Legt den Wert der mustGTCaccepted-Eigenschaft fest.
     * 
     */
    public void setMustGTCaccepted(boolean value) {
        this.mustGTCaccepted = value;
    }

    /**
     * Ruft den Wert der natureUser-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatureUser() {
        return natureUser;
    }

    /**
     * Legt den Wert der natureUser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatureUser(String value) {
        this.natureUser = value;
    }

    /**
     * Ruft den Wert der navigationPage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavigationPage() {
        return navigationPage;
    }

    /**
     * Legt den Wert der navigationPage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavigationPage(String value) {
        this.navigationPage = value;
    }

    /**
     * Ruft den Wert der selectedLanguage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedLanguage() {
        return selectedLanguage;
    }

    /**
     * Legt den Wert der selectedLanguage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedLanguage(String value) {
        this.selectedLanguage = value;
    }

    /**
     * Ruft den Wert der step2Password-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStep2Password() {
        return step2Password;
    }

    /**
     * Legt den Wert der step2Password-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStep2Password(String value) {
        this.step2Password = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der userID-Eigenschaft ab.
     * 
     */
    public long getUserID() {
        return userID;
    }

    /**
     * Legt den Wert der userID-Eigenschaft fest.
     * 
     */
    public void setUserID(long value) {
        this.userID = value;
    }

    /**
     * Ruft den Wert der userName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Legt den Wert der userName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Ruft den Wert der userPassword-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * Legt den Wert der userPassword-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPassword(String value) {
        this.userPassword = value;
    }

    /**
     * Ruft den Wert der userRedirect-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRedirect() {
        return userRedirect;
    }

    /**
     * Legt den Wert der userRedirect-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRedirect(String value) {
        this.userRedirect = value;
    }

}
