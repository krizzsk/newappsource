package com.masabi.justride.sdk.exception.config;

public class SdkConfigurationException extends Exception {
    public SdkConfigurationException(String str) {
        super(str);
    }

    public SdkConfigurationException(String str, Exception exc) {
        super(str, exc);
    }
}
