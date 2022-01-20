package facade;

import org.junit.jupiter.api.Test;

/**
 * @Author Xyz
 * @Date 2022/1/20
 */
public class Client {

    @Test
    public void printReport() {
        new ReportFacade().generateReport();
    }
}
