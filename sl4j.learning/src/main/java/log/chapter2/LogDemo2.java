package log.chapter2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Johnney.chiu
 * create on 2018/1/11 15:18
 * @Description test logback2
 */
public class LogDemo2 {
    private static Logger logger = LoggerFactory.getLogger(LogDemo2.class);
    public static void main(String...args){
        logger.trace("========trace==========");
        logger.debug("========debug===========");
        logger.info("========info===========");
        logger.warn("========warn===========");
        logger.error("========error===========");
    }
}
