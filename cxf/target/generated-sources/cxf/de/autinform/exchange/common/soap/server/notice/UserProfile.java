
package de.autinform.exchange.common.soap.server.notice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für userProfile complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="userProfile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressSupplement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authDemand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authorityTed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authorityTedOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authorityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="canton" type="{http://notice.server.soap.common.exchange.autinform.de/}canton" minOccurs="0"/&gt;
 *         &lt;element name="cantonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cantonExport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{http://notice.server.soap.common.exchange.autinform.de/}country" minOccurs="0"/&gt;
 *         &lt;element name="countryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="federalInstitution" type="{http://notice.server.soap.common.exchange.autinform.de/}federalInstitution" minOccurs="0"/&gt;
 *         &lt;element name="federalInstitutionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="municipality" type="{http://notice.server.soap.common.exchange.autinform.de/}municipality" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://notice.server.soap.common.exchange.autinform.de/}authorityType" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userProfile", propOrder = {
    "address",
    "addressSupplement",
    "authDemand",
    "authorityTed",
    "authorityTedOther",
    "authorityType",
    "canton",
    "cantonCode",
    "cantonExport",
    "city",
    "cityCode",
    "country",
    "countryCode",
    "fax",
    "federalInstitution",
    "federalInstitutionId",
    "mail",
    "municipality",
    "name",
    "phone",
    "type",
    "url",
    "zipCode"
})
public class UserProfile {

    protected String address;
    protected String addressSupplement;
    protected String authDemand;
    protected String authorityTed;
    protected String authorityTedOther;
    protected String authorityType;
    protected Canton canton;
    protected String cantonCode;
    protected String cantonExport;
    protected String city;
    protected String cityCode;
    protected Country country;
    protected String countryCode;
    protected String fax;
    protected FederalInstitution federalInstitution;
    protected String federalInstitutionId;
    protected String mail;
    protected Municipality municipality;
    protected String name;
    protected String phone;
    protected AuthorityType type;
    protected String url;
    protected String zipCode;

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Ruft den Wert der addressSupplement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressSupplement() {
        return addressSupplement;
    }

    /**
     * Legt den Wert der addressSupplement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressSupplement(String value) {
        this.addressSupplement = value;
    }

    /**
     * Ruft den Wert der authDemand-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthDemand() {
        return authDemand;
    }

    /**
     * Legt den Wert der authDemand-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthDemand(String value) {
        this.authDemand = value;
    }

    /**
     * Ruft den Wert der authorityTed-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityTed() {
        return authorityTed;
    }

    /**
     * Legt den Wert der authorityTed-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityTed(String value) {
        this.authorityTed = value;
    }

    /**
     * Ruft den Wert der authorityTedOther-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityTedOther() {
        return authorityTedOther;
    }

    /**
     * Legt den Wert der authorityTedOther-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityTedOther(String value) {
        this.authorityTedOther = value;
    }

    /**
     * Ruft den Wert der authorityType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityType() {
        return authorityType;
    }

    /**
     * Legt den Wert der authorityType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityType(String value) {
        this.authorityType = value;
    }

    /**
     * Ruft den Wert der canton-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Canton }
     *     
     */
    public Canton getCanton() {
        return canton;
    }

    /**
     * Legt den Wert der canton-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Canton }
     *     
     */
    public void setCanton(Canton value) {
        this.canton = value;
    }

    /**
     * Ruft den Wert der cantonCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantonCode() {
        return cantonCode;
    }

    /**
     * Legt den Wert der cantonCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantonCode(String value) {
        this.cantonCode = value;
    }

    /**
     * Ruft den Wert der cantonExport-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantonExport() {
        return cantonExport;
    }

    /**
     * Legt den Wert der cantonExport-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantonExport(String value) {
        this.cantonExport = value;
    }

    /**
     * Ruft den Wert der city-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Legt den Wert der city-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Ruft den Wert der cityCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Legt den Wert der cityCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * Ruft den Wert der country-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Legt den Wert der country-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Ruft den Wert der countryCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Legt den Wert der countryCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Ruft den Wert der fax-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Legt den Wert der fax-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Ruft den Wert der federalInstitution-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FederalInstitution }
     *     
     */
    public FederalInstitution getFederalInstitution() {
        return federalInstitution;
    }

    /**
     * Legt den Wert der federalInstitution-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FederalInstitution }
     *     
     */
    public void setFederalInstitution(FederalInstitution value) {
        this.federalInstitution = value;
    }

    /**
     * Ruft den Wert der federalInstitutionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederalInstitutionId() {
        return federalInstitutionId;
    }

    /**
     * Legt den Wert der federalInstitutionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederalInstitutionId(String value) {
        this.federalInstitutionId = value;
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
     * Ruft den Wert der municipality-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Municipality }
     *     
     */
    public Municipality getMunicipality() {
        return municipality;
    }

    /**
     * Legt den Wert der municipality-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Municipality }
     *     
     */
    public void setMunicipality(Municipality value) {
        this.municipality = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityType }
     *     
     */
    public AuthorityType getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityType }
     *     
     */
    public void setType(AuthorityType value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der url-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Legt den Wert der url-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Ruft den Wert der zipCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Legt den Wert der zipCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

}
