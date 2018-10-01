import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * @ClassName: SkyTest
 * @Description:
 * @Auther: 49092
 * @CreateDate: 2018/10/1 10:42
 * @Version: 1.0
 * @UpdateDate:
 */
public class SkyTest {

    @Test
    public void test(){
        Logger logger = Logger.getLogger(SkyTest.class);
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        logger.fatal("fatal");
    }

}
