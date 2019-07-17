/**
 * 
 */
package com.java.stockengine;

import java.util.Comparator;

/**
 * @author 
 * 
 */
public class OrderAttributes {
	
	private final Integer orderID;
	private final OrderType type;
	private final Integer price;
	private final Integer quantity;
	private final Long timestamp;
	/**
	 * @param type
	 * @param price
	 * @param quantity
	 * @param timestamp
	 */
	public OrderAttributes(OrderType type, Integer price, Integer quantity, Long timestamp,Integer orderID) {
		super();
		this.type = type;
		this.price = price;
		this.quantity = quantity;
		this.timestamp = timestamp;
		this.orderID= orderID;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((orderID == null) ? 0 : orderID.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderAttributes other = (OrderAttributes) obj;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		if (type != other.type)
			return false;
		else if (!orderID.equals(other.orderID))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OrderAttributes [type=" + type + ", price=" + price + ", quantity=" + quantity + ", timestamp="
				+ timestamp + " orderID=" + orderID+"]";
	}
	
	class OrderComparator implements Comparator<OrderAttributes> {
		public int compare(OrderAttributes o1, OrderAttributes o2) {
			int result = Integer.compare(o1.price, o2.price);
			if (result != 0) {
				return result;
			}
			return Integer.compare(o1.orderID, o2.orderID);
		}

	}
}
