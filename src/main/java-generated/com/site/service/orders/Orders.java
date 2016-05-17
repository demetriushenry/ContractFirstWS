package com.site.service.orders;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-05-17T14:50:27.547-03:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://www.site.com/service/Orders/", name = "Orders")
@XmlSeeAlso({com.site.schema.order.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Orders {

    @WebMethod(operationName = "ProcessOrderPlacement", action = "http://www.site.com/service/Orders/ProcessOrderPlacement")
    @WebResult(name = "orderInquiryResponse", targetNamespace = "http://www.site.com/schema/Order", partName = "orderInquiryResponse")
    public com.site.schema.order.OrderInquiryResponseType processOrderPlacement(
        @WebParam(partName = "orderInquiry", name = "orderInquiry", targetNamespace = "http://www.site.com/schema/Order")
        com.site.schema.order.OrderInquiryType orderInquiry
    );
}
