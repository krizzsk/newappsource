package com.usebutton.sdk.internal.commands;

import com.usebutton.sdk.internal.ConfigurationUpdatePolicy;
import com.usebutton.sdk.internal.api.ButtonApi;
import com.usebutton.sdk.internal.core.FailableReceiver;
import com.usebutton.sdk.internal.core.Storage;
import com.usebutton.sdk.internal.models.Configuration;

public class GetConfigurationCommand extends AuthenticatedCommand<Configuration> {
    private final Storage storage;
    private final ConfigurationUpdatePolicy updatePolicy;

    public GetConfigurationCommand(ButtonApi buttonApi, Storage storage2, ConfigurationUpdatePolicy configurationUpdatePolicy, FailableReceiver<Configuration> failableReceiver) {
        super(buttonApi, storage2, failableReceiver);
        this.updatePolicy = configurationUpdatePolicy;
        this.storage = storage2;
    }

    public String key() {
        return "GetConfigurationCommand";
    }

    public Configuration execute() throws Exception {
        if (!this.updatePolicy.shouldUpdate()) {
            return null;
        }
        super.execute();
        Configuration configuration = this.mApi.getConfiguration();
        this.storage.setConfiguration(configuration);
        this.updatePolicy.setState();
        this.storage.setConfigState(this.updatePolicy.getState());
        return configuration;
    }
}
