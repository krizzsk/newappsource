package com.usebutton.sdk.internal.boost;

import com.usebutton.sdk.internal.api.ButtonApi;
import com.usebutton.sdk.internal.commands.AuthenticatedCommand;
import com.usebutton.sdk.internal.core.FailableReceiver;
import com.usebutton.sdk.internal.core.Storage;
import org.json.JSONObject;
import p001a0.C0016g;

public class PostBoostViewCommand extends AuthenticatedCommand<BoostResponsePrivate> {
    private final String boostViewId;
    private final ButtonApi buttonApi;

    public PostBoostViewCommand(ButtonApi buttonApi2, Storage storage, String str, FailableReceiver<BoostResponsePrivate> failableReceiver) {
        super(buttonApi2, storage, failableReceiver);
        this.buttonApi = buttonApi2;
        this.boostViewId = str;
    }

    public String key() {
        StringBuilder t = C0016g.m36t("PostBoostViewCommand", "+");
        t.append(this.boostViewId);
        return t.toString();
    }

    public BoostResponsePrivate execute() throws Exception {
        super.execute();
        JSONObject postBoostView = this.buttonApi.postBoostView(this.boostViewId);
        return BoostResponsePrivate.fromJson(postBoostView != null ? postBoostView.optJSONObject("object") : null);
    }
}
