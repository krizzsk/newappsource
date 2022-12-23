package com.appboy.p044ui.inappmessage.factories;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.appboy.models.IInAppMessage;
import com.appboy.models.InAppMessageHtmlFull;
import com.appboy.p044ui.R$layout;
import com.appboy.p044ui.inappmessage.IInAppMessageViewFactory;
import com.appboy.p044ui.inappmessage.InAppMessageWebViewClient;
import com.appboy.p044ui.inappmessage.jsinterface.AppboyInAppMessageHtmlJavascriptInterface;
import com.appboy.p044ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.appboy.p044ui.inappmessage.views.AppboyInAppMessageHtmlFullView;
import com.appboy.p044ui.support.ViewUtils;
import com.appboy.support.AppboyLogger;
import com.braze.configuration.BrazeConfigurationProvider;

/* renamed from: com.appboy.ui.inappmessage.factories.AppboyHtmlFullViewFactory */
public class AppboyHtmlFullViewFactory implements IInAppMessageViewFactory {
    private static final String TAG = AppboyLogger.getBrazeLogTag(AppboyHtmlFullViewFactory.class);
    private final IInAppMessageWebViewClientListener mInAppMessageWebViewClientListener;

    public AppboyHtmlFullViewFactory(IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener) {
        this.mInAppMessageWebViewClientListener = iInAppMessageWebViewClientListener;
    }

    @SuppressLint({"AddJavascriptInterface"})
    public AppboyInAppMessageHtmlFullView createInAppMessageView(Activity activity, IInAppMessage iInAppMessage) {
        AppboyInAppMessageHtmlFullView appboyInAppMessageHtmlFullView = (AppboyInAppMessageHtmlFullView) activity.getLayoutInflater().inflate(R$layout.com_appboy_inappmessage_html_full, (ViewGroup) null);
        if (!new BrazeConfigurationProvider(activity.getApplicationContext()).getIsTouchModeRequiredForHtmlInAppMessages() || !ViewUtils.isDeviceNotInTouchMode(appboyInAppMessageHtmlFullView)) {
            Context applicationContext = activity.getApplicationContext();
            InAppMessageHtmlFull inAppMessageHtmlFull = (InAppMessageHtmlFull) iInAppMessage;
            AppboyInAppMessageHtmlJavascriptInterface appboyInAppMessageHtmlJavascriptInterface = new AppboyInAppMessageHtmlJavascriptInterface(applicationContext, inAppMessageHtmlFull);
            appboyInAppMessageHtmlFullView.setWebViewContent(iInAppMessage.getMessage(), inAppMessageHtmlFull.getLocalAssetsDirectoryUrl());
            appboyInAppMessageHtmlFullView.setInAppMessageWebViewClient(new InAppMessageWebViewClient(applicationContext, iInAppMessage, this.mInAppMessageWebViewClientListener));
            appboyInAppMessageHtmlFullView.getMessageWebView().addJavascriptInterface(appboyInAppMessageHtmlJavascriptInterface, "brazeInternalBridge");
            return appboyInAppMessageHtmlFullView;
        }
        AppboyLogger.m5459w(TAG, "The device is not currently in touch mode. This message requires user touch interaction to display properly.");
        return null;
    }
}
