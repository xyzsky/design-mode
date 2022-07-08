package memorandum;

/**
 * @Author Xyz
 * @Date 2022/7/8
 */
public class GameOriginator {
    private int currentScore;

    //将需要保存的状态分装在Memento里对外提供
    public GameProgressMemento saveProcess() {
        return new GameProgressMemento(currentScore);
    }

    //通过从外部接收的Memento恢复状态
    public void restoreProcess(GameProgressMemento memento) {
        currentScore = memento.getScore();
    }

    //对内部状态的使用
    public void playGame() {
        System.out.println("------------------开始游戏------------------");
        System.out.println("当前分数为："+ currentScore);
        System.out.println("杀死一个小怪物得1分");
        currentScore++;
        System.out.println(String.format("总分为：%d", currentScore));
    }

    public void exitGame(){
        System.out.println("退出游戏");
        currentScore=0;
        System.out.println("-----------------退出游戏-------------------");
    }
}
