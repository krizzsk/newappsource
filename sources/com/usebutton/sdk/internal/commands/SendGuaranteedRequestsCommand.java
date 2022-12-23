package com.usebutton.sdk.internal.commands;

import com.usebutton.sdk.internal.api.ButtonApi;
import com.usebutton.sdk.internal.api.ButtonHttpStatusException;
import com.usebutton.sdk.internal.api.ButtonNetworkException;
import com.usebutton.sdk.internal.api.Http;
import com.usebutton.sdk.internal.api.Request;
import com.usebutton.sdk.internal.api.RequestShepherd;
import com.usebutton.sdk.internal.core.Command;

public class SendGuaranteedRequestsCommand extends Command {
    private final Http mHttp;
    private final RequestShepherd mShepherd;

    public SendGuaranteedRequestsCommand(ButtonApi buttonApi) {
        this.mHttp = buttonApi.getHttp();
        this.mShepherd = buttonApi.getShepherd();
    }

    public Object execute() throws Exception {
        if (!this.mShepherd.hasPendingRequests()) {
            return null;
        }
        while (true) {
            Request nextPendingRequest = this.mShepherd.nextPendingRequest();
            if (nextPendingRequest == null) {
                return null;
            }
            tryRequest(nextPendingRequest);
        }
    }

    public boolean isPermanentFailure(ButtonNetworkException buttonNetworkException) {
        if (!(buttonNetworkException instanceof ButtonHttpStatusException)) {
            return false;
        }
        ButtonHttpStatusException buttonHttpStatusException = (ButtonHttpStatusException) buttonNetworkException;
        if (!buttonHttpStatusException.wasBadRequest() && buttonHttpStatusException.wasServerError()) {
            return false;
        }
        return true;
    }

    public String key() {
        return "SendGuaranteedRequestsCommand";
    }

    public void tryRequest(Request request) {
        try {
            this.mHttp.executeRequest(request);
            this.mShepherd.markAsDone(request);
        } catch (ButtonNetworkException e) {
            if (isPermanentFailure(e)) {
                this.mShepherd.markAsDone(request);
            }
        }
    }
}
