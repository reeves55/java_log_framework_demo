# JUL
JUL（Java Util Logging），是JDK自带的日志框架，无需额外依赖。


优点：
* 依赖少
* 稳定，JDK团队支持，问题少，安全性高（反观log4j漏洞：https://new.qq.com/rain/a/20211210A01JXN00）


缺点
* **不支持占位符**，只支持简单字符串（如：log.info("打印占位符内容:{}", "占位符真正内容")）；


## 参考
* https://cloud.tencent.com/developer/article/1876048