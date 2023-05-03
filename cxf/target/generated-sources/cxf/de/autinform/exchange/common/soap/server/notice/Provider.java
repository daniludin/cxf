
package de.autinform.exchange.common.soap.server.notice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für provider complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="provider"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authentificationProfile" type="{http://notice.server.soap.common.exchange.autinform.de/}authentificationProfile" minOccurs="0"/&gt;
 *         &lt;element name="contactProfile" type="{http://notice.server.soap.common.exchange.autinform.de/}contactProfile" minOccurs="0"/&gt;
 *         &lt;element name="creation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lastupdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lastupdatedFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="providerComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="userProfile" type="{http://notice.server.soap.common.exchange.autinform.de/}userProfile" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provider", propOrder = {
    "authentificationProfile",
    "contactProfile",
    "creation",
    "id",
    "lastupdated",
    "lastupdatedFrom",
    "providerComment",
    "userProfile"
})
public class Provider {

    protected AuthentificationProfile authentificationProfile;
    protected ContactProfile contactProfile;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creation;
    protected int id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastupdated;
    protected String lastupdatedFrom;
    protected String providerComment;
    protected UserProfile userProfile;

    /**
     * Ruft den Wert der authentificationProfile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AuthentificationProfile }
     *     
     */
    public AuthentificationProfile getAuthentificationProfile() {
        return authentificationProfile;
    }

    /**
     * Legt den Wert der authentificationProfile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthentificationProfile }
     *     
     */
    public void setAuthentificationProfile(AuthentificationProfile value) {
        this.authentificationProfile = value;
    }

    /**
     * Ruft den Wert der contactProfile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContactProfile }
     *     
     */
    public ContactProfile getContactProfile() {
        return contactProfile;
    }

    /**
     * Legt den Wert der contactProfile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactProfile }
     *     
     */
    public void setContactProfile(ContactProfile value) {
        this.contactProfile = value;
    }

    /**
     * Ruft den Wert der creation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreation() {
        return creation;
    }

    /**
     * Legt den Wert der creation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreation(XMLGregorianCalendar value) {
        this.creation = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der lastupdated-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastupdated() {
        return lastupdated;
    }

    /**
     * Legt den Wert der lastupdated-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastupdated(XMLGregorianCalendar value) {
        this.lastupdated = value;
    }

    /**
     * Ruft den Wert der lastupdatedFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastupdatedFrom() {
        return lastupdatedFrom;
    }

    /**
     * Legt den Wert der lastupdatedFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastupdatedFrom(String value) {
        this.lastupdatedFrom = value;
    }

    /**
     * Ruft den Wert der providerComment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderComment() {
        return providerComment;
    }

    /**
     * Legt den Wert der providerComment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderComment(String value) {
        this.providerComment = value;
    }

    /**
     * Ruft den Wert der userProfile-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UserProfile }
     *     
     */
    public UserProfile getUserProfile() {
        return userProfile;
    }

    /**
     * Legt den Wert der userProfile-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UserProfile }
     *     
     */
    public void setUserProfile(UserProfile value) {
        this.userProfile = value;
    }

}
