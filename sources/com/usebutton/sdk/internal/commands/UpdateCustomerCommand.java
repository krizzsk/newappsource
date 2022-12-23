package com.usebutton.sdk.internal.commands;

import com.usebutton.sdk.internal.api.ButtonApi;
import com.usebutton.sdk.internal.core.Storage;
import com.usebutton.sdk.internal.util.ButtonLog;
import java.util.concurrent.atomic.AtomicInteger;

public class UpdateCustomerCommand extends AuthenticatedCommand<Void> {
    private static final AtomicInteger INSTANCE_COUNT = new AtomicInteger();
    private static final String TAG = "UpdateCustomerCommand";
    private final String mKey;
    private final String mUserIdentifier;

    public UpdateCustomerCommand(ButtonApi buttonApi, Storage storage, String str) {
        super(buttonApi, storage);
        this.mUserIdentifier = str;
        StringBuilder k = C13555b.m33972k("UpdateCustomerCommandx");
        k.append(INSTANCE_COUNT.getAndIncrement());
        this.mKey = k.toString();
    }

    public String key() {
        return this.mKey;
    }

    public Void execute() throws Exception {
        String userIdentifier = this.mStorage.getUserIdentifier();
        if (userIdentifier == null) {
            if (this.mUserIdentifier == null) {
                return null;
            }
        } else if (userIdentifier.equals(this.mUserIdentifier)) {
            return null;
        }
        super.execute();
        this.mApi.setUserIdentifier(this.mUserIdentifier);
        this.mStorage.setUserIdentifier(this.mUserIdentifier);
        ButtonLog.visibleFormat("Changed user identifier (ID: %s)", this.mUserIdentifier);
        return null;
    }
}
