package com.tatsuya;


import org.fluentd.logger.FluentLogger;

/**
 * @author tatsuya
 */
public class MainApp {


    private static FluentLogger fluentLogger = FluentLogger.getLogger(
            ConfigInfo.LOGGING_TAG_PREFIX,
            ConfigInfo.FLUENTD_HOST,
            ConfigInfo.FLUENTD_PORT
    );

    /**
     * A main() so we can easily run these routing rules in our IDE <br>
     * in this sample, we will push 100 logs to fluentD and it will send to elasticsearch to persist
     */
    public static void main(String... args) throws Exception {
        for (int i = 0; i < 100; i++) {
            String logContent = new StringBuilder("[REQUEST_LOG]")
                    .append(" finish to process request ")
                    .append(i)
                    .append(" in ")
                    .append(i)
                    .append(" ms")
                    .toString();
            fluentLogger.log("tatsuya", "log-content", logContent, System.currentTimeMillis() / 1000);
        }
    }

}

