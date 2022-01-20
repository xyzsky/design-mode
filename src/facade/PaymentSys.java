package facade;

import java.math.BigDecimal;

/**
 * @Author Xyz
 * @Date 2022/1/20
 */

/**
 * 支付系统
 */
public class PaymentSys {
    private OrderSys orderSys;
    public PaymentSys(OrderSys orderSys) {
        this.orderSys = orderSys;
    }
    public BigDecimal getOrderAccount(String orderNum){
        System.out.println(String.format("获取%s订单支付金额",orderNum));
        return BigDecimal.valueOf(500);
    }
}
