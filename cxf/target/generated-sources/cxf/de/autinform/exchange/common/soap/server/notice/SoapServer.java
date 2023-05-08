package de.autinform.exchange.common.soap.server.notice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;

/**
 * This class was generated by Apache CXF 3.5.5
 * 2023-05-08T09:56:38.701+02:00
 * Generated source version: 3.5.5
 *
 */
@WebService(targetNamespace = "http://notice.server.soap.common.exchange.autinform.de/", name = "SoapServer")
@XmlSeeAlso({com.kps_consulting.ObjectFactory.class, net.java.dev.jaxb.array.ObjectFactory.class, ObjectFactory.class})
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface SoapServer {

    @WebMethod
    @Action(input = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getSearchNoticeCountRequest", output = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getSearchNoticeCountResponse", fault = {@FaultAction(className = Fault.class, value = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getSearchNoticeCount/Fault/Fault")})
    @WebResult(name = "noticeList", targetNamespace = "http://notice.server.soap.common.exchange.autinform.de/", partName = "noticeList")
    public java.lang.String getSearchNoticeCount(

        @WebParam(partName = "searchXml", name = "searchXml")
        java.lang.String searchXml
    ) throws Fault;

    @WebMethod
    @Action(input = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticeListForSubscriberDateRangeRequest", output = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticeListForSubscriberDateRangeResponse", fault = {@FaultAction(className = Fault.class, value = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticeListForSubscriberDateRange/Fault/Fault")})
    @WebResult(name = "noticeList", targetNamespace = "http://notice.server.soap.common.exchange.autinform.de/", partName = "noticeList")
    public net.java.dev.jaxb.array.LongArray getNoticeListForSubscriberDateRange(

        @WebParam(partName = "publishDateFrom", name = "publishDateFrom")
        javax.xml.datatype.XMLGregorianCalendar publishDateFrom,
        @WebParam(partName = "publishDateTo", name = "publishDateTo")
        javax.xml.datatype.XMLGregorianCalendar publishDateTo,
        @WebParam(partName = "subscriptionId", name = "subscriptionId")
        int subscriptionId
    ) throws Fault;

    @WebMethod
    @Action(input = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getAttachmentRequest", output = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getAttachmentResponse", fault = {@FaultAction(className = Fault.class, value = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getAttachment/Fault/Fault")})
    @WebResult(name = "file", targetNamespace = "http://notice.server.soap.common.exchange.autinform.de/", partName = "file")
    public byte[] getAttachment(

        @WebParam(partName = "docId", name = "docId")
        long docId
    ) throws Fault;

    @WebMethod
    @Action(input = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getSearchNoticeListRequest", output = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getSearchNoticeListResponse", fault = {@FaultAction(className = Fault.class, value = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getSearchNoticeList/Fault/Fault")})
    @WebResult(name = "noticeList", targetNamespace = "http://notice.server.soap.common.exchange.autinform.de/", partName = "noticeList")
    public net.java.dev.jaxb.array.LongArray getSearchNoticeList(

        @WebParam(partName = "searchXml", name = "searchXml")
        java.lang.String searchXml
    ) throws Fault;

    @WebMethod
    @Action(input = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getProviderFromNoticeRequest", output = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getProviderFromNoticeResponse", fault = {@FaultAction(className = Fault.class, value = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getProviderFromNotice/Fault/Fault")})
    @WebResult(name = "provider", targetNamespace = "http://notice.server.soap.common.exchange.autinform.de/", partName = "provider")
    public Provider getProviderFromNotice(

        @WebParam(partName = "docId", name = "docId")
        long docId
    ) throws Fault;

    @WebMethod
    @Action(input = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getPublishedNoticeListRequest", output = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getPublishedNoticeListResponse", fault = {@FaultAction(className = Fault.class, value = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getPublishedNoticeList/Fault/Fault")})
    @WebResult(name = "noticeList", targetNamespace = "http://notice.server.soap.common.exchange.autinform.de/", partName = "noticeList")
    public net.java.dev.jaxb.array.LongArray getPublishedNoticeList(

        @WebParam(partName = "publishDate", name = "publishDate")
        javax.xml.datatype.XMLGregorianCalendar publishDate
    ) throws Fault;

    @WebMethod
    @Action(input = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticeHtmlRequest", output = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticeHtmlResponse", fault = {@FaultAction(className = Fault.class, value = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticeHtml/Fault/Fault")})
    @WebResult(name = "noticeHtml", targetNamespace = "http://notice.server.soap.common.exchange.autinform.de/", partName = "noticeHtml")
    public java.lang.String getNoticeHtml(

        @WebParam(partName = "docId", name = "docId")
        long docId
    ) throws Fault;

    @WebMethod
    @Action(input = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getActualCantonNoticeListRequest", output = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getActualCantonNoticeListResponse", fault = {@FaultAction(className = Fault.class, value = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getActualCantonNoticeList/Fault/Fault")})
    @WebResult(name = "noticeList", targetNamespace = "http://notice.server.soap.common.exchange.autinform.de/", partName = "noticeList")
    public net.java.dev.jaxb.array.LongArray getActualCantonNoticeList()
 throws Fault;

    @WebMethod
    @Action(input = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getAuthenticationRequest", output = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getAuthenticationResponse", fault = {@FaultAction(className = Fault.class, value = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getAuthentication/Fault/Fault")})
    @WebResult(name = "success", targetNamespace = "http://notice.server.soap.common.exchange.autinform.de/", partName = "success")
    public boolean getAuthentication()
 throws Fault;

    @WebMethod
    @Action(input = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticeXmlRequest", output = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticeXmlResponse", fault = {@FaultAction(className = Fault.class, value = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticeXml/Fault/Fault")})
    @WebResult(name = "noticeXml", targetNamespace = "http://notice.server.soap.common.exchange.autinform.de/", partName = "noticeXml")
    public java.lang.String getNoticeXml(

        @WebParam(partName = "docId", name = "docId")
        long docId
    ) throws Fault;

    @WebMethod
    @Action(input = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getActualCantonNoticeListForCategoryRequest", output = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getActualCantonNoticeListForCategoryResponse", fault = {@FaultAction(className = Fault.class, value = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getActualCantonNoticeListForCategory/Fault/Fault")})
    @WebResult(name = "noticeList", targetNamespace = "http://notice.server.soap.common.exchange.autinform.de/", partName = "noticeList")
    public net.java.dev.jaxb.array.LongArray getActualCantonNoticeListForCategory(

        @WebParam(partName = "category", name = "category")
        java.lang.String category
    ) throws Fault;

    @WebMethod
    @Action(input = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticeXmlsRequest", output = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticeXmlsResponse", fault = {@FaultAction(className = Fault.class, value = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticeXmls/Fault/Fault")})
    @WebResult(name = "noticeXmls", targetNamespace = "http://notice.server.soap.common.exchange.autinform.de/", partName = "noticeXmls")
    public java.lang.String getNoticeXmls(

        @WebParam(partName = "publishDate", name = "publishDate")
        javax.xml.datatype.XMLGregorianCalendar publishDate
    ) throws Fault;

    @WebMethod
    @Action(input = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticeListForSubscriberRequest", output = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticeListForSubscriberResponse", fault = {@FaultAction(className = Fault.class, value = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticeListForSubscriber/Fault/Fault")})
    @WebResult(name = "noticeList", targetNamespace = "http://notice.server.soap.common.exchange.autinform.de/", partName = "noticeList")
    public net.java.dev.jaxb.array.LongArray getNoticeListForSubscriber(

        @WebParam(partName = "publishDate", name = "publishDate")
        javax.xml.datatype.XMLGregorianCalendar publishDate,
        @WebParam(partName = "subscriptionId", name = "subscriptionId")
        int subscriptionId
    ) throws Fault;

    @WebMethod
    @Action(input = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticeListRequest", output = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticeListResponse", fault = {@FaultAction(className = Fault.class, value = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticeList/Fault/Fault")})
    @WebResult(name = "noticeList", targetNamespace = "http://notice.server.soap.common.exchange.autinform.de/", partName = "noticeList")
    public net.java.dev.jaxb.array.LongArray getNoticeList(

        @WebParam(partName = "publishDate", name = "publishDate")
        javax.xml.datatype.XMLGregorianCalendar publishDate
    ) throws Fault;

    @WebMethod
    @Action(input = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getSearchNoticeXmlRequest", output = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getSearchNoticeXmlResponse", fault = {@FaultAction(className = Fault.class, value = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getSearchNoticeXml/Fault/Fault")})
    @WebResult(name = "noticeList", targetNamespace = "http://notice.server.soap.common.exchange.autinform.de/", partName = "noticeList")
    public java.lang.String getSearchNoticeXml(

        @WebParam(partName = "searchXml", name = "searchXml")
        java.lang.String searchXml,
        @WebParam(partName = "arg1", name = "arg1")
        java.lang.String arg1
    ) throws Fault;

    @WebMethod
    @Action(input = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getActualCantonNoticeListForCategoryWithStatusRequest", output = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getActualCantonNoticeListForCategoryWithStatusResponse", fault = {@FaultAction(className = Fault.class, value = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getActualCantonNoticeListForCategoryWithStatus/Fault/Fault")})
    @WebResult(name = "noticeList", targetNamespace = "http://notice.server.soap.common.exchange.autinform.de/", partName = "noticeList")
    public net.java.dev.jaxb.array.LongArray getActualCantonNoticeListForCategoryWithStatus(

        @WebParam(partName = "category", name = "category")
        java.lang.String category,
        @WebParam(partName = "status", name = "status")
        java.lang.String status
    ) throws Fault;

    @WebMethod
    @Action(input = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticeListForCategoryRequest", output = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticeListForCategoryResponse", fault = {@FaultAction(className = Fault.class, value = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticeListForCategory/Fault/Fault")})
    @WebResult(name = "noticeList", targetNamespace = "http://notice.server.soap.common.exchange.autinform.de/", partName = "noticeList")
    public net.java.dev.jaxb.array.LongArray getNoticeListForCategory(

        @WebParam(partName = "category", name = "category")
        java.lang.String category,
        @WebParam(partName = "publishDate", name = "publishDate")
        javax.xml.datatype.XMLGregorianCalendar publishDate
    ) throws Fault;

    @WebMethod
    @Action(input = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticePdfRequest", output = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticePdfResponse", fault = {@FaultAction(className = Fault.class, value = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticePdf/Fault/Fault")})
    @WebResult(name = "pdf", targetNamespace = "http://notice.server.soap.common.exchange.autinform.de/", partName = "pdf")
    public byte[] getNoticePdf(

        @WebParam(partName = "docId", name = "docId")
        long docId
    ) throws Fault;

    @WebMethod
    @Action(input = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticeListForCategoryWithStatusRequest", output = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticeListForCategoryWithStatusResponse", fault = {@FaultAction(className = Fault.class, value = "http://notice.server.soap.common.exchange.autinform.de/SoapServer/getNoticeListForCategoryWithStatus/Fault/Fault")})
    @WebResult(name = "noticeList", targetNamespace = "http://notice.server.soap.common.exchange.autinform.de/", partName = "noticeList")
    public net.java.dev.jaxb.array.LongArray getNoticeListForCategoryWithStatus(

        @WebParam(partName = "category", name = "category")
        java.lang.String category,
        @WebParam(partName = "status", name = "status")
        java.lang.String status,
        @WebParam(partName = "publishDate", name = "publishDate")
        javax.xml.datatype.XMLGregorianCalendar publishDate
    ) throws Fault;
}
