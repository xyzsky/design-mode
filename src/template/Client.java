package template;

/**
 * @Author Xyz
 * @Date 2022/6/30
 */
public class Client {
    public static void main(String[] args) {
        LivePlay tencentLivePlay = new TencentLivePlay();
        tencentLivePlay.seeLivePlay();
        System.out.println();
        LivePlay aiQiYiLivePlay = new AiQiYiLivePlay();
        aiQiYiLivePlay.seeLivePlay();
    }
}
