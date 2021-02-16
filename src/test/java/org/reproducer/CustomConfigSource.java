package org.reproducer;

import org.eclipse.microprofile.config.spi.ConfigSource;

import java.util.Map;
import java.util.Set;

public class CustomConfigSource implements ConfigSource {

    @Override
    public Set<String> getPropertyNames() {
        return null;
    }

    @Override
    public int getOrdinal() {
        return 1;
    }

    @Override
    public Map<String, String> getProperties() {
        return null;
    }

    @Override
    public String getValue(String s) {
        if("smallrye.config.locations".equals(s)){
            return "application.properties";
        }
        throw new RuntimeException(": /");
    }

    @Override
    public String getName() {
        return "CustomConfigSource";
    }
}
