package facade;

/**
 * @Author Xyz
 * @Date 2022/1/20
 */

/**
 * 外观模式，将多个子系统接口统一到一个对外接口中
 */
public class ReportFacade {
    public void generateReport() {
        OrderSys orderSys = new OrderSys();
        PaymentSys paymentSys = new PaymentSys(orderSys);
        DeliverySys deliverySys = new DeliverySys();
        String orderNum = orderSys.getOrderNum();
        System.out.println(String.format("\n报表\n--------------------------------------------\n" +
                        "订单号：%s | 金额：%s元 | 配送耗时：%s分钟",
                orderNum,
                paymentSys.getOrderAccount(orderNum).toPlainString(),
                String.valueOf(deliverySys.getDeliveryTime() / 60))
        );
    }
}
