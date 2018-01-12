package log.chapter3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Johnney.chiu
 * create on 2018/1/11 15:44
 * @Description demo3
 */
public class LogDemo3 {

    private static Logger logger = LoggerFactory.getLogger(LogDemo3.class);

    public static void main(String... args)throws InterruptedException {
        long l = System.currentTimeMillis();
        for(int i=0;i<30000;i++){
            logger.debug("hello {} ", "world" +i);
            logger.info("hello {} ", "world"+i);
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
