package log.chapter1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Johnney.chiu
 * create on 2018/1/9 10:51
 * @Description demo1
 */
public class LogDemo {

    private static Logger logger = LoggerFactory.getLogger(LogDemo.class);

    public static void main(String... args){


        logger.trace("========trace===========");
        logger.debug("========debug===========");
        logger.info("========info===========");
        logger.warn("========warn===========");
        logger.error("========error===========");
    }

}
