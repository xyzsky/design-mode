package strategy;

/**
 * @Author Xyz
 * @Date 2022/6/30
 */
public class Promotional {

    public void recommend(PromotionStrategy strategy, String goodsId) {
        int recommend = strategy.recommend(goodsId);
        System.out.println(recommend);
    }
}
