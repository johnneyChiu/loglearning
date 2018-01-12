package log.chapter8;

import log.chapter1.LogDemo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Johnney.chiu
 * create on 2018/1/11 17:15
 * @Description log8
 */
public class LogDemo8 {

    private static Logger logger = LoggerFactory.getLogger(LogDemo8.class);

    public static void main(String... args){
        new Thread(()->test(),"threadname").start();
    }

    public static void test() {

        logger.trace("========trace= ===========");
        logger.debug("========debug========s====");
        logger.info("========info============");
        logger.warn("========warn============");
        logger.error("========error============");
    }
}
