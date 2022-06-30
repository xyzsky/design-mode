package template;

/**
 * @Author Xyz
 * @Date 2022/6/30
 */
public class AiQiYiLivePlay extends LivePlay{

    @Override
    public void openRoom() {
        System.out.println("爱奇艺打开房间");
    }

    @Override
    public void startAudioAndVideoStream() {
        System.out.println("爱奇艺打开音视频");
    }

    @Override
    public void stopAudioAndVideoStream() {
        System.out.println("爱奇艺关闭音视频");
    }

    @Override
    public void closeRoom() {
        System.out.println("爱奇艺关闭房间");
    }
}
