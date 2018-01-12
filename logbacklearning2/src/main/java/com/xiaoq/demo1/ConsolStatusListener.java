package com.xiaoq.demo1;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.status.OnConsoleStatusListener;
import ch.qos.logback.core.status.StatusManager;
import com.xiaoq.pojo.Foo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Johnney.chiu
 * create on 2018/1/12 14:47
 * @Description aha
 */
public class ConsolStatusListener {

    final static Logger logger = LoggerFactory.getLogger(ConsolStatusListener.class);

    public static void main(String... args) {
        ClassLoader classLoader = MyApp3.class.getClassLoader();
        URL resource = classLoader.getResource("onConsoleStatusListener.xml");
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
        //StatusPrinter.printInCaseOfErrorsOrWarnings(loggerContext);

        StatusManager statusManager = loggerContext.getStatusManager();
        OnConsoleStatusListener onConsoleStatusListener = new OnConsoleStatusListener();
        statusManager.add(onConsoleStatusListener);
        logger.info("Entering application.");

        Foo foo = new Foo();
        foo.doIt();
        logger.info("Exiting application");
    }
}
