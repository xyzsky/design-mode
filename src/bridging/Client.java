package bridging;

import org.junit.jupiter.api.Test;

/**
 * @Author Xyz
 * @Date 2022/1/20
 */
public class Client {

    @Test
    public void test() {
        FileUploader fileUploader = new FileUploaderImpl(new LinuxFileUploadExecutor());
        fileUploader.upload("sda");
        fileUploader.check("ni");
    }
}
