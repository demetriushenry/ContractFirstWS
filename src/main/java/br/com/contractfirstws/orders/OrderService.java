package br.com.contractfirstws.orders;

import com.site.schema.order.OrderInquiryResponseType;

public interface OrderService {
	
	public OrderInquiryResponseType processOrder(int uniqueOrderId, int orderQuantity, int accountId, long ean13);

}
