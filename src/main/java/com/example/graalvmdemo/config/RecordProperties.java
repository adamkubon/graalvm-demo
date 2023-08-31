package com.example.graalvmdemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;
import org.springframework.boot.context.properties.bind.DefaultValue;

@ConfigurationProperties("com.example.graalvmdemo.record-property")
public record RecordProperties(@DefaultValue("true") boolean enabled, boolean param1) {

    @ConstructorBinding
    public RecordProperties {

    }

    public RecordProperties(boolean enabled) {
        this(enabled, false);
    }

}
