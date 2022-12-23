package com.usebutton.sdk.internal.commands;

import com.usebutton.sdk.internal.api.ButtonApi;
import com.usebutton.sdk.internal.core.FailableReceiver;
import com.usebutton.sdk.internal.core.Storage;
import org.json.JSONObject;
import p001a0.C0016g;

public class AutofillMappingsCommand extends AuthenticatedCommand {
    public static final String KEY_FILL_ID = "fill_id";
    private final JSONObject autofillJson;

    public AutofillMappingsCommand(ButtonApi buttonApi, Storage storage, JSONObject jSONObject, FailableReceiver failableReceiver) {
        super(buttonApi, storage, failableReceiver);
        this.autofillJson = jSONObject;
    }

    public Object execute() throws Exception {
        super.execute();
        return this.mApi.getAutofillMappings(this.autofillJson).getJSONObject("object").getJSONObject("autofill");
    }

    public String key() {
        StringBuilder t = C0016g.m36t("AutofillMappingsCommand", "+");
        t.append(this.autofillJson.optString(KEY_FILL_ID));
        return t.toString();
    }
}
