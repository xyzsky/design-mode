package facade;

/**
 * @Author Xyz
 * @Date 2022/1/20
 */

/**
 * 物流系统
 */
public class DeliverySys {
    public int getDeliveryTime(){
        System.out.println("获取配送耗时");
        return 30*60;//30分钟
    }
}