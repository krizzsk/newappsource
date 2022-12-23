package com.usebutton.sdk.internal.commands;

import com.usebutton.sdk.internal.api.ButtonApi;
import com.usebutton.sdk.internal.browser.BrowserSession;
import com.usebutton.sdk.internal.core.Command;
import com.usebutton.sdk.internal.core.FailableReceiver;
import com.usebutton.sdk.internal.core.Storage;
import com.usebutton.sdk.internal.models.MetaInfo;
import org.json.JSONObject;

public class GetBrowserSessionContextCommand extends Command<JSONObject> {
    public static final String KEY_CAMPAIGN_ID = "campaign_id";
    public static final String KEY_IFA = "ifa";
    public static final String KEY_SESSION_ID = "session_id";
    public static final String KEY_SOURCE_TOKEN = "source_token";
    public static final String KEY_THIRDPARTY_ID = "thirdparty_id";
    private final BrowserSession browserSession;
    private final ButtonApi buttonApi;
    private final MetaInfo metaInfo;
    private final Storage storage;

    public GetBrowserSessionContextCommand(BrowserSession browserSession2, MetaInfo metaInfo2, ButtonApi buttonApi2, Storage storage2, FailableReceiver<JSONObject> failableReceiver) {
        super(failableReceiver);
        this.browserSession = browserSession2;
        this.metaInfo = metaInfo2;
        this.buttonApi = buttonApi2;
        this.storage = storage2;
    }

    public String key() {
        return "GetBrowserSessionContextCommand";
    }

    public JSONObject execute() throws Exception {
        JSONObject jSONObject = new JSONObject(this.browserSession.toMap());
        jSONObject.put(KEY_SESSION_ID, this.storage.getSessionId());
        jSONObject.put(KEY_CAMPAIGN_ID, this.metaInfo.getCampaignId());
        jSONObject.put("source_token", this.metaInfo.getSourceToken());
        jSONObject.put("thirdparty_id", this.storage.getUserIdentifier());
        String ifa = this.buttonApi.getIfa();
        if (ifa == null) {
            ifa = "";
        }
        jSONObject.put(KEY_IFA, ifa);
        return jSONObject;
    }
}
