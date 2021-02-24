package lesson11.Test04;

public class Order {
    private int OrderId;
    private String orderName;

    public Order(int orderId, String orderName) {
        OrderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return OrderId;
    }

    public void setOrderId(int orderId) {
        OrderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (OrderId != order.OrderId) return false;
        return orderName != null ? orderName.equals(order.orderName) : order.orderName == null;
    }
}
