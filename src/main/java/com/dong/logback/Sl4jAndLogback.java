package com.dong.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sl4jAndLogback {

    private static  Logger  logger  = LoggerFactory.getLogger(Sl4jAndLogback.class);

    public static void main(String[] args) {
        System.out.println("sssssssss");
         logger.info("正在使用logback打印日志");
         if(true){
             logger.debug("打印debug日志");
         }
         logger.warn("打印警告提示日志");
         logger.error("打印错误日志");
    }
}
