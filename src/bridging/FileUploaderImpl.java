package bridging;

/**
 * @Author Xyz
 * @Date 2022/1/20
 */

/**
 * 具体实体类
 */
public class FileUploaderImpl implements FileUploader{

    private FileUploaderExecutor executor = null;

    public FileUploaderImpl(FileUploaderExecutor executor) {
        this.executor = executor;
    }
    @Override
    public Object upload(String path) {
        return executor.uploadFile(path);
    }

    @Override
    public boolean check(Object object) {
        return executor.checkFile(object);
    }
}
