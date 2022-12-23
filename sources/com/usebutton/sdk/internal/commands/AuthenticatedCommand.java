package com.usebutton.sdk.internal.commands;

import android.text.TextUtils;
import com.usebutton.sdk.internal.api.ButtonApi;
import com.usebutton.sdk.internal.core.Command;
import com.usebutton.sdk.internal.core.FailableReceiver;
import com.usebutton.sdk.internal.core.Storage;
import com.usebutton.sdk.internal.util.ButtonLog;

public abstract class AuthenticatedCommand<T> extends Command<T> {
    private static final String TAG = "AuthenticatedCommand";
    public final ButtonApi mApi;
    public final Storage mStorage;

    public AuthenticatedCommand(ButtonApi buttonApi, Storage storage) {
        this.mApi = buttonApi;
        this.mStorage = storage;
    }

    public T execute() throws Exception {
        if (TextUtils.isEmpty(this.mStorage.getSessionId())) {
            ButtonLog.info(TAG, "Fetching session ID.");
            String createSession = this.mApi.createSession();
            this.mStorage.setSessionId(createSession);
            ButtonLog.infoFormat(TAG, "Logged in with sessionId ", createSession);
            ButtonLog.visibleFormat("Created session (Session ID: %s)", createSession);
            return null;
        }
        this.mApi.setSessionInfo(this.mStorage);
        return null;
    }

    public AuthenticatedCommand(ButtonApi buttonApi, Storage storage, FailableReceiver failableReceiver) {
        super(failableReceiver);
        this.mApi = buttonApi;
        this.mStorage = storage;
    }
}
