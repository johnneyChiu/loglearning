package log.chapter9;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Johnney.chiu
 * create on 2018/1/11 18:01
 * @Description 等级过滤
 */
public class LogDemo9 {

    private static Logger logger = LoggerFactory.getLogger(LogDemo9.class);

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
