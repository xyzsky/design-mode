package template;

/**
 * @Author Xyz
 * @Date 2022/6/30
 */

/**
 * 定义一个抽象类，为模板方法类
 */
public abstract class LivePlay {

    //模板方法：final关键字用来约束步骤不可以进行轻易的修改
    public final void seeLivePlay() {
        login();
        openRoom();
        startAudioAndVideoStream();
        pushVideoStream();
        stopAudioAndVideoStream();
        closeRoom();
        exit();
    }

    //实体方法，这个方法实现通用的业务逻辑
    private void login() {
        System.out.println("用户登录");
    }

    private void exit() {
        System.out.println("用户退出");
    }


    /*抽象方法*/
    //打开房间
    public abstract void openRoom();
    //打开音视频流
    public abstract void startAudioAndVideoStream();
    //关闭音视频流
    public abstract void stopAudioAndVideoStream();
    //关闭房间
    public abstract void closeRoom();

    /*钩子方法，可以被需要的子类overwrite*/
    //旁路推流，可以通过视频链接在浏览器中查看视频
    public void pushVideoStream() {
    }
}
