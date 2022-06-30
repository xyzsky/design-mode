package strategy;

/**
 * @Author Xyz
 * @Date 2022/6/30
 */

/**
 * 策略模式，制定策略接口
 */
public interface PromotionStrategy {

    /**
     * @param goodsId 代表物品ID
     * @return 整型（1 代表满减促销； 2 代表折扣促销； 3 代表秒杀促销）
     */
    int recommend(String goodsId);
}
