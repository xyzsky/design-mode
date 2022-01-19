package bridging;

/**
 * 抽象实体类
 */
public interface FileUploader {

    Object upload(String path);

    boolean check(Object object);
}
