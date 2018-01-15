package com.xiaoq.demo1;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.util.StatusPrinter;
import com.xiaoq.pojo.Foo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;

/**
 * @author Johnney.chiu
 * create on 2018/1/12 11:40
 * @Description myappforlogback
 */
public class MyApp3 {

    final static Logger logger = LoggerFactory.getLogger(MyApp3.class);

    //args add -Dlogback.configurationFile=scan1.xml
    public static void main(String... args) {
        System.setProperty("log.path", "/logs");
        ClassLoader classLoader = MyApp3.class.getClassLoader();
        URL resource = classLoader.getResource("scan1.xml");
        System.out.println(resource.getPath());
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        try {
            JoranConfigurator configurator = new JoranConfigurator();
            configurator.setContext(loggerContext);
            // the context was probably already configured by default
            // configuration rules
            loggerContext.reset();

            configurator.doConfigure(resource);
        } catch (JoranException je) {
            // StatusPrinter will handle this
        }
        StatusPrinter.printInCaseOfErrorsOrWarnings(loggerContext);
        logger.info("Entering application.");

        Foo foo = new Foo();
        foo.doIt();
        logger.info("Exiting application");
    }

}
