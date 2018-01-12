package com.xiaoq.pojo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Johnney.chiu
 * create on 2018/1/12 11:48
 * @Description
 */
public class Foo {
    static final Logger logger = LoggerFactory.getLogger(Foo.class);
    public void doIt() {
        logger.debug("Did it again!");
    }
}
