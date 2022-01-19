package bridging;

/**
 * @Author Xyz
 * @Date 2022/1/20
 */
public class LinuxFileUploadExecutor implements FileUploaderExecutor{
    @Override
    public Object uploadFile(String path) {
        System.out.println("linux 系统上传文件");
        return null;
    }

    @Override
    public boolean checkFile(Object object) {
        System.out.println("linux 系统检测文件");
        return false;
    }
}
