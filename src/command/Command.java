package command;

/**
 * @Author Xyz
 * @Date 2022/7/2
 */

/**
 * 命令接口，所有具体的命令都需要实现此接口，Invoker只能调用此接口
 */
public interface Command {
    void execute();
}
