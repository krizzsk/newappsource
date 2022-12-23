package com.appboy.p044ui.inappmessage.views;

import android.content.Context;
import android.util.AttributeSet;
import com.appboy.p044ui.R$id;
import p242s1.C6396v0;

/* renamed from: com.appboy.ui.inappmessage.views.AppboyInAppMessageHtmlView */
public class AppboyInAppMessageHtmlView extends AppboyInAppMessageHtmlBaseView {
    public AppboyInAppMessageHtmlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void applyWindowInsets(C6396v0 v0Var) {
    }

    public int getWebViewViewId() {
        return R$id.com_appboy_inappmessage_html_webview;
    }

    public boolean hasAppliedWindowInsets() {
        return true;
    }
}
