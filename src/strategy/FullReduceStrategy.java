package strategy;

/**
 * @Author Xyz
 * @Date 2022/6/30
 */
public class FullReduceStrategy implements PromotionStrategy{
    @Override
    public int recommend(String goodsId) {
        System.out.println("================物品:" + goodsId + " 参加满减活动====================");
        return 0;
    }
}
