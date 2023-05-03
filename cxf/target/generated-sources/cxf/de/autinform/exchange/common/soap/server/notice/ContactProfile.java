
package de.autinform.exchange.common.soap.server.notice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für contactProfile complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="contactProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cantonLegal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cantonPrivateYN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceAddressSupplement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceCountry" type="{http://notice.server.soap.common.exchange.autinform.de/}country" minOccurs="0"/&gt;
 *         &lt;element name="invoiceCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceOrganisation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoicePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceSalutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="invoiceZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="newCantonMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oldCantonMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactProfile", propOrder = {
    "cantonLegal",
    "cantonPrivateYN",
    "firstName",
    "information",
    "invoiceAddress",
    "invoiceAddressSupplement",
    "invoiceCity",
    "invoiceCountry",
    "invoiceCountryCode",
    "invoiceFax",
    "invoiceFirstName",
    "invoiceLastName",
    "invoiceMail",
    "invoiceOrganisation",
    "invoicePhone",
    "invoiceSalutation",
    "invoiceZipCode",
    "lastName",
    "mail",
    "newCantonMode",
    "oldCantonMode",
    "phone",
    "salutation"
})
public class ContactProfile {

    protected String cantonLegal;
    protected String cantonPrivateYN;
    protected String firstName;
    protected String information;
    protected String invoiceAddress;
    protected String invoiceAddressSupplement;
    protected String invoiceCity;
    protected Country invoiceCountry;
    protected String invoiceCountryCode;
    protected String invoiceFax;
    protected String invoiceFirstName;
    protected String invoiceLastName;
    protected String invoiceMail;
    protected String invoiceOrganisation;
    protected String invoicePhone;
    protected String invoiceSalutation;
    protected String invoiceZipCode;
    protected String lastName;
    protected String mail;
    protected String newCantonMode;
    protected String oldCantonMode;
    protected String phone;
    protected String salutation;

    /**
     * Ruft den Wert der cantonLegal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantonLegal() {
        return cantonLegal;
    }

    /**
     * Legt den Wert der cantonLegal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantonLegal(String value) {
        this.cantonLegal = value;
    }

    /**
     * Ruft den Wert der cantonPrivateYN-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantonPrivateYN() {
        return cantonPrivateYN;
    }

    /**
     * Legt den Wert der cantonPrivateYN-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantonPrivateYN(String value) {
        this.cantonPrivateYN = value;
    }

    /**
     * Ruft den Wert der firstName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Legt den Wert der firstName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Ruft den Wert der information-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformation() {
        return information;
    }

    /**
     * Legt den Wert der information-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformation(String value) {
        this.information = value;
    }

    /**
     * Ruft den Wert der invoiceAddress-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceAddress() {
        return invoiceAddress;
    }

    /**
     * Legt den Wert der invoiceAddress-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceAddress(String value) {
        this.invoiceAddress = value;
    }

    /**
     * Ruft den Wert der invoiceAddressSupplement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceAddressSupplement() {
        return invoiceAddressSupplement;
    }

    /**
     * Legt den Wert der invoiceAddressSupplement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceAddressSupplement(String value) {
        this.invoiceAddressSupplement = value;
    }

    /**
     * Ruft den Wert der invoiceCity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceCity() {
        return invoiceCity;
    }

    /**
     * Legt den Wert der invoiceCity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceCity(String value) {
        this.invoiceCity = value;
    }

    /**
     * Ruft den Wert der invoiceCountry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getInvoiceCountry() {
        return invoiceCountry;
    }

    /**
     * Legt den Wert der invoiceCountry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setInvoiceCountry(Country value) {
        this.invoiceCountry = value;
    }

    /**
     * Ruft den Wert der invoiceCountryCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceCountryCode() {
        return invoiceCountryCode;
    }

    /**
     * Legt den Wert der invoiceCountryCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceCountryCode(String value) {
        this.invoiceCountryCode = value;
    }

    /**
     * Ruft den Wert der invoiceFax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceFax() {
        return invoiceFax;
    }

    /**
     * Legt den Wert der invoiceFax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceFax(String value) {
        this.invoiceFax = value;
    }

    /**
     * Ruft den Wert der invoiceFirstName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceFirstName() {
        return invoiceFirstName;
    }

    /**
     * Legt den Wert der invoiceFirstName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceFirstName(String value) {
        this.invoiceFirstName = value;
    }

    /**
     * Ruft den Wert der invoiceLastName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceLastName() {
        return invoiceLastName;
    }

    /**
     * Legt den Wert der invoiceLastName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceLastName(String value) {
        this.invoiceLastName = value;
    }

    /**
     * Ruft den Wert der invoiceMail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceMail() {
        return invoiceMail;
    }

    /**
     * Legt den Wert der invoiceMail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceMail(String value) {
        this.invoiceMail = value;
    }

    /**
     * Ruft den Wert der invoiceOrganisation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceOrganisation() {
        return invoiceOrganisation;
    }

    /**
     * Legt den Wert der invoiceOrganisation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceOrganisation(String value) {
        this.invoiceOrganisation = value;
    }

    /**
     * Ruft den Wert der invoicePhone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoicePhone() {
        return invoicePhone;
    }

    /**
     * Legt den Wert der invoicePhone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoicePhone(String value) {
        this.invoicePhone = value;
    }

    /**
     * Ruft den Wert der invoiceSalutation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceSalutation() {
        return invoiceSalutation;
    }

    /**
     * Legt den Wert der invoiceSalutation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceSalutation(String value) {
        this.invoiceSalutation = value;
    }

    /**
     * Ruft den Wert der invoiceZipCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceZipCode() {
        return invoiceZipCode;
    }

    /**
     * Legt den Wert der invoiceZipCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceZipCode(String value) {
        this.invoiceZipCode = value;
    }

    /**
     * Ruft den Wert der lastName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Legt den Wert der lastName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Ruft den Wert der mail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMail() {
        return mail;
    }

    /**
     * Legt den Wert der mail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMail(String value) {
        this.mail = value;
    }

    /**
     * Ruft den Wert der newCantonMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCantonMode() {
        return newCantonMode;
    }

    /**
     * Legt den Wert der newCantonMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCantonMode(String value) {
        this.newCantonMode = value;
    }

    /**
     * Ruft den Wert der oldCantonMode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldCantonMode() {
        return oldCantonMode;
    }

    /**
     * Legt den Wert der oldCantonMode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldCantonMode(String value) {
        this.oldCantonMode = value;
    }

    /**
     * Ruft den Wert der phone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Legt den Wert der phone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Ruft den Wert der salutation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * Legt den Wert der salutation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalutation(String value) {
        this.salutation = value;
    }

}
