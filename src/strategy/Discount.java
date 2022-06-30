package strategy;

/**
 * @Author Xyz
 * @Date 2022/6/30
 */
public class Discount implements PromotionStrategy{
    @Override
    public int recommend(String goodsId) {
        System.out.println("================物品:" + goodsId + " 参加折扣活动====================");
        return 1;
    }
}
