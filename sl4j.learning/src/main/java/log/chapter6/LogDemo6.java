package log.chapter6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Johnney.chiu
 * create on 2018/1/11 16:05
 * @Description 异步的按大小划分
 */
public class LogDemo6 {
    private static Logger logger = LoggerFactory.getLogger(LogDemo6.class);

    public static void main(String... args)throws InterruptedException {
        long l = System.currentTimeMillis();
        for(int i=0;i<30000;i++){
            logger.debug("hello {} ", "world" +i);
            logger.info("hello {}  ", "world"+i);
            logger.warn("hello {} ", "world"+i);
            logger.error("hello {} ", "world"+i);
            if(i%1000 == 0){
                Thread.currentThread().sleep(50);
            }
        }
        System.out.println(System.currentTimeMillis() - l);
        Thread.currentThread().sleep(1000);
    }
}
