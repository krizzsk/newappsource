package com.usebutton.sdk.internal.commands;

import com.usebutton.sdk.internal.api.ButtonApi;
import com.usebutton.sdk.internal.core.FailableReceiver;
import com.usebutton.sdk.internal.core.Storage;
import org.json.JSONObject;

public class PostTapCommand extends AuthenticatedCommand<JSONObject> {
    private final ButtonApi api;
    private final String campaignId;
    private final String sourceToken;

    public PostTapCommand(ButtonApi buttonApi, Storage storage, String str, String str2, FailableReceiver<JSONObject> failableReceiver) {
        super(buttonApi, storage, failableReceiver);
        this.api = buttonApi;
        this.sourceToken = str;
        this.campaignId = str2;
    }

    public String key() {
        return "PostTapCommand";
    }

    public JSONObject execute() throws Exception {
        super.execute();
        return this.api.postTap(this.sourceToken, this.campaignId);
    }
}
