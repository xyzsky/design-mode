package simple_factory;

/**
 * @Author Xyz
 * @Date 2022/1/18
 */
public class SimpleFactory {
    public static Computer makeComputer(String name) {
        Computer computer = null;
        switch (name){
            case "apple":
                computer = new MacComputer();
                break;
            case "xiaomi":
                computer = new MiComputer();
                break;
            default:
                break;
        }

        return computer;
    }
}
