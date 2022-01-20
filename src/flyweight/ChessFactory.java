package flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Xyz
 * @Date 2022/1/20
 */
public class ChessFactory {
    // 定义一个池容器
    private static final Map<Color, Chess> chessMap = new HashMap<>();

    public static Chess getChess(Color color) {
        Chess chess = chessMap.get(color);
        if (chess == null) {
            chess = color == Color.WHITE ? new WhiteChess() : new BlackChess();
            chessMap.put(color, chess);
        }
        return chess;
    }
}
