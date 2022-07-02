package command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Xyz
 * @Date 2022/7/2
 */
public class RobotInvoker {

    private final List<Command> setRobotCommands = new ArrayList<>();

    public void clearCommand() {
        setRobotCommands.clear();
    }

    //设置命令，但不知具体执行者是谁
    public void addCommand(Command command) {
        setRobotCommands.add(command);
    }

    //执行一系列命令
    public void executeCommand() {
        for (Command command : setRobotCommands) {
            command.execute();
        }
    }
}
