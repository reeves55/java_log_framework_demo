package com.xiaoleee.log.logger;

import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

/**
 * 自定义JUL Handler
 *
 * @author xiaolee
 * @version 1.0
 * @date 2022/9/2
 */
public class MyLoggerHandler extends StreamHandler {
    @Override
    public void publish(LogRecord record) {
        System.out.println("MyLoggerHandler：" + record.getMessage());

        super.publish(record);
        flush();
    }
}
