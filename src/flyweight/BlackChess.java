package flyweight;


import java.awt.*;

/**
 * @Author Xyz
 * @Date 2022/1/20
 */
public class BlackChess implements Chess{

    // 内部状态，共享
    private final Color color = Color.BLACK;

    private final String sharp = "圆形";

    public Color getColor() {
        return color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println(String.format("%s%s棋子置于（%d，%d）处", sharp, color, x, y));
    }
}
