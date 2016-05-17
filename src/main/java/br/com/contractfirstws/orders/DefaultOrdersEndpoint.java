package br.com.contractfirstws.orders;

import javax.jws.WebService;

import com.site.schema.order.AccountType;
import com.site.schema.order.ObjectFactory;
import com.site.schema.order.OrderInquiryResponseType;
import com.site.schema.order.OrderInquiryType;
import com.site.service.orders.Orders;

@WebService(portName = "OrdersSOAP", serviceName = "Orders",
		endpointInterface = "com.site.service.orders.Orders",
		targetNamespace = "http://www.site.com/service/Orders/")
public class DefaultOrdersEndpoint implements Orders {

	@Override
	public OrderInquiryResponseType processOrderPlacement(OrderInquiryType orderInquiry) {
		ObjectFactory factory = new ObjectFactory();
		OrderInquiryResponseType response = factory.createOrderInquiryResponseType();
		AccountType account = factory.createAccountType();
		account.setAccountId(1);
		response.setAccount(account);
		return null;
	}

}
