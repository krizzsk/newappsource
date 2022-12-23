package com.usebutton.sdk.internal.browser;

import com.usebutton.sdk.internal.ButtonRepository;
import com.usebutton.sdk.internal.core.FailableReceiver;
import com.usebutton.sdk.internal.purchasepath.PageView;
import java.util.List;
import org.json.JSONObject;

public class BrowserPageViewClient {
    private final ButtonRepository buttonRepository;
    private final String campaignId;
    private final List<String> flags;
    /* access modifiers changed from: private */
    public Listener listener;
    private final String sourceToken;

    public interface Listener {
        void onReceiveResult(String str, PageView pageView);
    }

    public class PageViewFailableReceiver implements FailableReceiver<JSONObject> {
        private final String url;

        public void onError() {
        }

        private PageViewFailableReceiver(String str) {
            this.url = str;
        }

        public void onResult(JSONObject jSONObject) {
            if (BrowserPageViewClient.this.listener != null && jSONObject != null) {
                BrowserPageViewClient.this.listener.onReceiveResult(this.url, PageView.fromJson(jSONObject));
            }
        }
    }

    public BrowserPageViewClient(ButtonRepository buttonRepository2, String str, String str2, List<String> list) {
        this.sourceToken = str;
        this.campaignId = str2;
        this.flags = list;
        this.buttonRepository = buttonRepository2;
    }

    public void executePageViewRequest(String str) {
        if (str != null) {
            this.buttonRepository.postPageView(str, this.sourceToken, this.campaignId, this.flags, new PageViewFailableReceiver(str));
        }
    }

    public void setListener(Listener listener2) {
        this.listener = listener2;
    }
}
