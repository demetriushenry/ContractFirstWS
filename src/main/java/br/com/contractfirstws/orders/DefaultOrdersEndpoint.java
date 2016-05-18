package br.com.contractfirstws.orders;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.site.schema.order.OrderInquiryResponseType;
import com.site.schema.order.OrderInquiryType;
import com.site.service.orders.Orders;

@WebService(portName = "OrdersSOAP", serviceName = "Orders",
		endpointInterface = "com.site.service.orders.Orders",
		targetNamespace = "http://www.site.com/service/Orders/")
public class DefaultOrdersEndpoint implements Orders {
	
	@Autowired
	private OrderService orderService;

	@Override
	public OrderInquiryResponseType processOrderPlacement(OrderInquiryType orderInquiry) {
		
		OrderInquiryResponseType response = orderService.processOrder(orderInquiry.getUniqueOrderId(),
				orderInquiry.getOrderQuantity(), orderInquiry.getAccountId(), orderInquiry.getEan13());
		
		return response;
	}

}
