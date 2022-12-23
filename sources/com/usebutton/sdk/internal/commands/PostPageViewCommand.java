package com.usebutton.sdk.internal.commands;

import com.usebutton.sdk.internal.api.ButtonApi;
import com.usebutton.sdk.internal.core.FailableReceiver;
import com.usebutton.sdk.internal.core.Storage;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;
import p001a0.C0016g;

public class PostPageViewCommand extends AuthenticatedCommand<JSONObject> {
    private final ButtonApi api;
    private final String campaignId;
    private final List<String> flags;
    private final String sourceToken;
    private final String url;

    public PostPageViewCommand(ButtonApi buttonApi, Storage storage, String str, String str2, String str3, List<String> list, FailableReceiver<JSONObject> failableReceiver) {
        super(buttonApi, storage, failableReceiver);
        this.api = buttonApi;
        this.url = str;
        this.sourceToken = str2;
        this.campaignId = str3;
        this.flags = list;
    }

    public String key() {
        StringBuilder t = C0016g.m36t("PostPageViewCommand", "+");
        t.append(UUID.randomUUID());
        return t.toString();
    }

    public JSONObject execute() throws Exception {
        super.execute();
        return this.api.postPageView(this.url, this.sourceToken, this.campaignId, this.flags);
    }
}
