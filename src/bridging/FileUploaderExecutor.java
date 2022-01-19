package bridging;

/**
 * @Author Xyz
 * @Date 2022/1/20
 */

/**
 * 抽象行为类
 */
public interface FileUploaderExecutor {
    Object uploadFile(String path);

    boolean checkFile(Object object);
}
