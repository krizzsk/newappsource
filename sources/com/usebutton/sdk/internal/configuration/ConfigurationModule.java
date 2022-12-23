package com.usebutton.sdk.internal.configuration;

import com.usebutton.sdk.configuration.Configuration;

public class ConfigurationModule implements Configuration {
    private static ConfigurationModule configurationModule;
    private boolean isAutofillEnabled = true;

    public static ConfigurationModule getInstance() {
        if (configurationModule == null) {
            configurationModule = new ConfigurationModule();
        }
        return configurationModule;
    }

    public boolean isAutofillEnabled() {
        return this.isAutofillEnabled;
    }

    public void setAutofillEnabled(boolean z) {
        this.isAutofillEnabled = z;
    }
}
