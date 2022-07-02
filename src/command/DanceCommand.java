package command;

/**
 * @Author Xyz
 * @Date 2022/7/2
 */
public class DanceCommand implements Command{

    private HuaweiRobotReceiver receiver;

    public DanceCommand(HuaweiRobotReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.dance();
    }
}
