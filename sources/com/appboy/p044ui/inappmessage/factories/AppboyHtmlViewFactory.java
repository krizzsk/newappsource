package com.appboy.p044ui.inappmessage.factories;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.appboy.models.IInAppMessage;
import com.appboy.models.InAppMessageHtml;
import com.appboy.p044ui.R$layout;
import com.appboy.p044ui.inappmessage.IInAppMessageViewFactory;
import com.appboy.p044ui.inappmessage.InAppMessageWebViewClient;
import com.appboy.p044ui.inappmessage.jsinterface.AppboyInAppMessageHtmlJavascriptInterface;
import com.appboy.p044ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.appboy.p044ui.inappmessage.views.AppboyInAppMessageHtmlView;
import com.appboy.p044ui.support.ViewUtils;
import com.appboy.support.AppboyLogger;
import com.braze.configuration.BrazeConfigurationProvider;

/* renamed from: com.appboy.ui.inappmessage.factories.AppboyHtmlViewFactory */
public class AppboyHtmlViewFactory implements IInAppMessageViewFactory {
    private static final String TAG = "com.appboy.ui.inappmessage.factories.AppboyHtmlViewFactory";
    private final IInAppMessageWebViewClientListener mInAppMessageWebViewClientListener;

    public AppboyHtmlViewFactory(IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener) {
        this.mInAppMessageWebViewClientListener = iInAppMessageWebViewClientListener;
    }

    @SuppressLint({"AddJavascriptInterface"})
    public AppboyInAppMessageHtmlView createInAppMessageView(Activity activity, IInAppMessage iInAppMessage) {
        Context applicationContext = activity.getApplicationContext();
        AppboyInAppMessageHtmlView appboyInAppMessageHtmlView = (AppboyInAppMessageHtmlView) activity.getLayoutInflater().inflate(R$layout.com_appboy_inappmessage_html, (ViewGroup) null);
        if (!new BrazeConfigurationProvider(applicationContext).getIsTouchModeRequiredForHtmlInAppMessages() || !ViewUtils.isDeviceNotInTouchMode(appboyInAppMessageHtmlView)) {
            InAppMessageHtml inAppMessageHtml = (InAppMessageHtml) iInAppMessage;
            AppboyInAppMessageHtmlJavascriptInterface appboyInAppMessageHtmlJavascriptInterface = new AppboyInAppMessageHtmlJavascriptInterface(applicationContext, inAppMessageHtml);
            appboyInAppMessageHtmlView.setWebViewContent(inAppMessageHtml.getMessage());
            appboyInAppMessageHtmlView.setInAppMessageWebViewClient(new InAppMessageWebViewClient(activity.getApplicationContext(), inAppMessageHtml, this.mInAppMessageWebViewClientListener));
            appboyInAppMessageHtmlView.getMessageWebView().addJavascriptInterface(appboyInAppMessageHtmlJavascriptInterface, "brazeInternalBridge");
            return appboyInAppMessageHtmlView;
        }
        AppboyLogger.m5459w(TAG, "The device is not currently in touch mode. This message requires user touch interaction to display properly.");
        return null;
    }
}
