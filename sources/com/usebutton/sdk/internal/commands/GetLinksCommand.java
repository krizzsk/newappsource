package com.usebutton.sdk.internal.commands;

import com.usebutton.sdk.internal.api.ButtonApi;
import com.usebutton.sdk.internal.api.HttpResponse;
import com.usebutton.sdk.internal.api.models.AppActionDTO;
import com.usebutton.sdk.internal.core.FailableReceiver;
import com.usebutton.sdk.internal.core.Response;
import com.usebutton.sdk.internal.core.Storage;
import com.usebutton.sdk.internal.models.AppAction;
import com.usebutton.sdk.internal.util.ButtonLog;
import java.net.URL;
import org.json.JSONObject;

public class GetLinksCommand extends AuthenticatedCommand<Response<AppAction>> {
    private final String mKey;
    private final String mMerchantId;
    private final JSONObject mPassThrough;
    private final String mPlacementId;
    private final String mPubRef;
    private final URL mUrl;

    public GetLinksCommand(ButtonApi buttonApi, Storage storage, String str, String str2, JSONObject jSONObject, FailableReceiver<Response<AppAction>> failableReceiver) {
        super(buttonApi, storage, failableReceiver);
        this.mMerchantId = str;
        this.mUrl = null;
        this.mPubRef = str2;
        this.mPlacementId = null;
        this.mKey = String.format("get-links-%s-%s", new Object[]{str, str2});
        this.mPassThrough = jSONObject;
    }

    public String key() {
        return this.mKey;
    }

    public Response<AppAction> execute() throws Exception {
        Response<AppActionDTO> response;
        super.execute();
        URL url = this.mUrl;
        if (url != null) {
            response = this.mApi.getLinks(url, this.mPubRef, this.mPlacementId, this.mPassThrough);
        } else {
            response = this.mApi.getLinks(this.mMerchantId, this.mPubRef, this.mPassThrough);
        }
        HttpResponse httpResponse = null;
        AppActionDTO object = response != null ? response.object() : null;
        if (response != null) {
            httpResponse = response.httpResponse();
        }
        if (object != null) {
            ButtonLog.visibleFormat("Button action fetched (Merchant ID: %s, URL: %s Action ID: %s)", this.mMerchantId, this.mUrl, object.mMeta.f30925id);
        } else {
            ButtonLog.visibleFormat("Button has no action available (Merchant ID: %s, URL: %s)", this.mMerchantId, this.mUrl);
        }
        return Response.success(AppAction.fromDTO(object), httpResponse);
    }

    public GetLinksCommand(ButtonApi buttonApi, Storage storage, URL url, String str, String str2, JSONObject jSONObject, FailableReceiver<Response<AppAction>> failableReceiver) {
        super(buttonApi, storage, failableReceiver);
        this.mMerchantId = null;
        this.mUrl = url;
        this.mPubRef = str;
        this.mPlacementId = str2;
        this.mKey = String.format("get-links-%s-%s-%s", new Object[]{url, str, str2});
        this.mPassThrough = jSONObject;
    }
}
