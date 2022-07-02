package command;

/**
 * @Author Xyz
 * @Date 2022/7/2
 */
public class RingUpCommand implements Command{

    private MiRobotReceiver receiver;

    public RingUpCommand(MiRobotReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.ringUp();
    }
}
