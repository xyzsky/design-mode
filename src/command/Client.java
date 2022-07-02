package command;

/**
 * @Author Xyz
 * @Date 2022/7/2
 */
public class Client {
    public static void main(String[] args) {
        RobotInvoker robotInvoker = new RobotInvoker();

        HuaweiRobotReceiver huaweiRobotReceiver = new HuaweiRobotReceiver();
        MiRobotReceiver miRobotReceiver = new MiRobotReceiver();
        PlayMusicCommand playMusicCommand = new PlayMusicCommand(huaweiRobotReceiver);
        DanceCommand danceCommand = new DanceCommand(huaweiRobotReceiver);

        robotInvoker.addCommand(playMusicCommand);
        robotInvoker.addCommand(danceCommand);

        //执行命令
        robotInvoker.executeCommand();

        RingUpCommand ringUpCommand = new RingUpCommand(miRobotReceiver);
        robotInvoker.clearCommand();
        robotInvoker.addCommand(ringUpCommand);

        robotInvoker.executeCommand();
    }
}
