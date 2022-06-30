package template;

/**
 * @Author Xyz
 * @Date 2022/6/30
 */
public class TencentLivePlay extends LivePlay{

    @Override
    public void openRoom() {
        System.out.println("Tencent 进入房间");
    }

    @Override
    public void startAudioAndVideoStream() {
        System.out.println("Tencent 打开音视频流");
    }

    @Override
    public void stopAudioAndVideoStream() {
        System.out.println("Tencent 关闭音视频流");
    }

    @Override
    public void closeRoom() {
        System.out.println("Tencent 关闭房间");
    }

    @Override
    public void pushVideoStream() {
        System.out.println("Tencent 推送视频流");
    }
}
