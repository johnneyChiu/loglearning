package log.chapter9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Johnney.chiu
 * create on 2018/1/11 18:04
 * @Description
 */
public class Logdemo11 {
    private static Logger logger = LoggerFactory.getLogger(Logdemo11.class);

    public static void main(String... args){
        new Thread(()->test(),"threadname").start();
    }

    public static void test(){

        logger.trace("====$====trace= ===========");
        logger.debug("========debug========s====");
        logger.info("========info============");
        logger.warn("========warn============");
        logger.error("========error============");
    }
}
