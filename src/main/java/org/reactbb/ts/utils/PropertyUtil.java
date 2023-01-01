package org.reactbb.ts.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class PropertyUtil {
    public static Properties getProperties () throws IOException {
        Properties properties = new Properties();
        ClassLoader classLoader = PropertyUtil.class.getClassLoader();
        InputStream applicationPropertiesStream = classLoader.getResourceAsStream("application.properties");
        properties.load(applicationPropertiesStream);
        return properties;
    }
}
