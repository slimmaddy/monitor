package com.tatsuya;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

import java.io.File;

/**
 * @author tatsuya
 */
public class ConfigInfo {
    private static Config config = ConfigFactory.parseFile(new File("conf.properties"));
    public static final String LOGGING_TAG_PREFIX = config.getString("tag.prefix");
    public static final String FLUENTD_HOST = config.getString("fluentd.host");
    public static final int FLUENTD_PORT = config.getInt("fluentd.port");
}
