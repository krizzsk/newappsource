package com.usebutton.sdk.internal.commands;

import android.text.TextUtils;
import com.usebutton.sdk.internal.api.ButtonApi;
import com.usebutton.sdk.internal.core.Command;
import com.usebutton.sdk.internal.core.FailableReceiver;
import com.usebutton.sdk.internal.core.Storage;

public class CheckLoggedInCommand extends Command<Boolean> {
    private final ButtonApi mApi;
    private final Storage mStorage;

    public CheckLoggedInCommand(FailableReceiver<Boolean> failableReceiver, Storage storage, ButtonApi buttonApi) {
        super(failableReceiver);
        this.mStorage = storage;
        this.mApi = buttonApi;
    }

    public String key() {
        return "CheckLoggedInCommand";
    }

    public Boolean execute() throws Exception {
        String sessionId = this.mStorage.getSessionId();
        this.mApi.setSessionInfo(this.mStorage);
        return Boolean.valueOf(!TextUtils.isEmpty(sessionId));
    }
}
