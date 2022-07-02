package command;

/**
 * @Author Xyz
 * @Date 2022/7/2
 */
public class PlayMusicCommand implements Command{

    private HuaweiRobotReceiver receiver;

    public PlayMusicCommand(HuaweiRobotReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.playMusic();
    }
}
