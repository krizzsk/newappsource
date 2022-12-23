package com.usebutton.sdk.internal.commands;

import com.usebutton.sdk.internal.api.ButtonApi;
import com.usebutton.sdk.internal.core.FailableReceiver;
import com.usebutton.sdk.internal.core.Storage;

public class CreateSessionCommand extends AuthenticatedCommand<Void> {
    public CreateSessionCommand(ButtonApi buttonApi, Storage storage, FailableReceiver<Void> failableReceiver) {
        super(buttonApi, storage, failableReceiver);
    }

    public String key() {
        return "create-session";
    }
}
