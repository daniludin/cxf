
package com.kps_consulting;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import de.autinform.exchange.common.soap.server.notice.FaultDetail;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.kps_consulting package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Fault_QNAME = new QName("http://www.kps-consulting.com", "Fault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.kps_consulting
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.kps-consulting.com", name = "Fault")
    public JAXBElement<FaultDetail> createFault(FaultDetail value) {
        return new JAXBElement<FaultDetail>(_Fault_QNAME, FaultDetail.class, null, value);
    }

}
