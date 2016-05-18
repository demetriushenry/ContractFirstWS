package br.com.contractfirstws.orders;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;

public class OrderServiceSoapHeaderInInterceptor extends AbstractSoapInterceptor {

	public OrderServiceSoapHeaderInInterceptor() {
		super(Phase.USER_PROTOCOL);
	}

	@Override
	public void handleMessage(SoapMessage message) throws Fault {
		QName qName = new QName("http://www.site.com/service/Orders/", "apikey");
		SoapHeader header = (SoapHeader) message.getHeader(qName);
		String apikey = ((Element) header.getObject()).getTextContent();
		System.err.println("API Key = " + apikey);
	}

}
