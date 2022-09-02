package com.xiaoleee.log;

import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * JUL使用演示Demo
 *
 * @author xiaolee
 * @version 1.0
 * @date 2022/9/2
 */
public class Demo {
    private static final Logger log = Logger.getLogger(Demo.class.getName());

    static {
        init();
    }

    public static void main(String[] args) {
        log.info("JUL输入日志");
    }

    private static void init() {
        try {
            LogManager logManager = LogManager.getLogManager();
            logManager.readConfiguration(Demo.class.getResourceAsStream("/logging.properties"));
        } catch (Exception e) {
            log.severe("JUL日志配置文件未找到！");
        }
    }
}
