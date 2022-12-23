package com.appboy.p044ui.inappmessage.listeners;

import android.net.Uri;
import android.os.Bundle;
import com.appboy.enums.Channel;
import com.appboy.enums.inappmessage.MessageType;
import com.appboy.models.IInAppMessage;
import com.appboy.models.IInAppMessageHtml;
import com.appboy.models.outgoing.AppboyProperties;
import com.appboy.p044ui.AppboyNavigator;
import com.appboy.p044ui.actions.ActionFactory;
import com.appboy.p044ui.actions.NewsfeedAction;
import com.appboy.p044ui.actions.UriAction;
import com.appboy.p044ui.inappmessage.AppboyInAppMessageManager;
import com.appboy.support.AppboyFileUtils;
import com.appboy.support.AppboyLogger;
import com.appboy.support.BundleUtils;
import com.appboy.support.StringUtils;
import com.braze.Braze;

/* renamed from: com.appboy.ui.inappmessage.listeners.AppboyInAppMessageWebViewClientListener */
public class AppboyInAppMessageWebViewClientListener implements IInAppMessageWebViewClientListener {
    private static final String TAG = AppboyLogger.getBrazeLogTag(AppboyInAppMessageWebViewClientListener.class);

    private AppboyInAppMessageManager getInAppMessageManager() {
        return AppboyInAppMessageManager.getInstance();
    }

    public static void logHtmlInAppMessageClick(IInAppMessage iInAppMessage, Bundle bundle) {
        if (bundle != null && bundle.containsKey("abButtonId")) {
            ((IInAppMessageHtml) iInAppMessage).logButtonClick(bundle.getString("abButtonId"));
        } else if (iInAppMessage.getMessageType() == MessageType.HTML_FULL) {
            iInAppMessage.logClick();
        }
    }

    public static String parseCustomEventNameFromQueryBundle(Bundle bundle) {
        return bundle.getString("name");
    }

    public static AppboyProperties parsePropertiesFromQueryBundle(Bundle bundle) {
        AppboyProperties appboyProperties = new AppboyProperties();
        for (String next : bundle.keySet()) {
            if (!next.equals("name")) {
                String string = bundle.getString(next, (String) null);
                if (!StringUtils.isNullOrBlank(string)) {
                    appboyProperties.addProperty(next, string);
                }
            }
        }
        return appboyProperties;
    }

    public static boolean parseUseWebViewFromQueryBundle(IInAppMessage iInAppMessage, Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (bundle.containsKey("abDeepLink")) {
            z2 = Boolean.parseBoolean(bundle.getString("abDeepLink"));
            z = true;
        } else {
            z2 = false;
            z = false;
        }
        if (bundle.containsKey("abExternalOpen")) {
            z3 = Boolean.parseBoolean(bundle.getString("abExternalOpen"));
            z = true;
        } else {
            z3 = false;
        }
        boolean openUriInWebView = iInAppMessage.getOpenUriInWebView();
        if (!z) {
            return openUriInWebView;
        }
        if (z2 || z3) {
            z4 = false;
        }
        return z4;
    }

    public void onCloseAction(IInAppMessage iInAppMessage, String str, Bundle bundle) {
        AppboyLogger.m5448d(TAG, "IInAppMessageWebViewClientListener.onCloseAction called.");
        logHtmlInAppMessageClick(iInAppMessage, bundle);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(true);
        getInAppMessageManager().getHtmlInAppMessageActionListener().onCloseClicked(iInAppMessage, str, bundle);
    }

    public void onCustomEventAction(IInAppMessage iInAppMessage, String str, Bundle bundle) {
        String str2 = TAG;
        AppboyLogger.m5448d(str2, "IInAppMessageWebViewClientListener.onCustomEventAction called.");
        if (getInAppMessageManager().getActivity() == null) {
            AppboyLogger.m5459w(str2, "Can't perform custom event action because the activity is null.");
        } else if (!getInAppMessageManager().getHtmlInAppMessageActionListener().onCustomEventFired(iInAppMessage, str, bundle)) {
            String parseCustomEventNameFromQueryBundle = parseCustomEventNameFromQueryBundle(bundle);
            if (!StringUtils.isNullOrBlank(parseCustomEventNameFromQueryBundle)) {
                Braze.getInstance(getInAppMessageManager().getActivity()).logCustomEvent(parseCustomEventNameFromQueryBundle, parsePropertiesFromQueryBundle(bundle));
            }
        }
    }

    public void onNewsfeedAction(IInAppMessage iInAppMessage, String str, Bundle bundle) {
        String str2 = TAG;
        AppboyLogger.m5448d(str2, "IInAppMessageWebViewClientListener.onNewsfeedAction called.");
        if (getInAppMessageManager().getActivity() == null) {
            AppboyLogger.m5459w(str2, "Can't perform news feed action because the cached activity is null.");
            return;
        }
        logHtmlInAppMessageClick(iInAppMessage, bundle);
        if (!getInAppMessageManager().getHtmlInAppMessageActionListener().onNewsfeedClicked(iInAppMessage, str, bundle)) {
            iInAppMessage.setAnimateOut(false);
            getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
            AppboyNavigator.getAppboyNavigator().gotoNewsFeed(getInAppMessageManager().getActivity(), new NewsfeedAction(BundleUtils.mapToBundle(iInAppMessage.getExtras()), Channel.INAPP_MESSAGE));
        }
    }

    public void onOtherUrlAction(IInAppMessage iInAppMessage, String str, Bundle bundle) {
        String str2 = TAG;
        AppboyLogger.m5448d(str2, "IInAppMessageWebViewClientListener.onOtherUrlAction called.");
        if (getInAppMessageManager().getActivity() == null) {
            AppboyLogger.m5459w(str2, "Can't perform other url action because the cached activity is null. Url: " + str);
            return;
        }
        logHtmlInAppMessageClick(iInAppMessage, bundle);
        if (getInAppMessageManager().getHtmlInAppMessageActionListener().onOtherUrlAction(iInAppMessage, str, bundle)) {
            AppboyLogger.m5457v(str2, "HTML message action listener handled url in onOtherUrlAction. Doing nothing further. Url: " + str);
            return;
        }
        boolean parseUseWebViewFromQueryBundle = parseUseWebViewFromQueryBundle(iInAppMessage, bundle);
        Bundle mapToBundle = BundleUtils.mapToBundle(iInAppMessage.getExtras());
        mapToBundle.putAll(bundle);
        UriAction createUriActionFromUrlString = ActionFactory.createUriActionFromUrlString(str, mapToBundle, parseUseWebViewFromQueryBundle, Channel.INAPP_MESSAGE);
        if (createUriActionFromUrlString == null) {
            AppboyLogger.m5459w(str2, "UriAction is null. Not passing any URI to AppboyNavigator. Url: " + str);
            return;
        }
        Uri uri = createUriActionFromUrlString.getUri();
        if (AppboyFileUtils.isLocalUri(uri)) {
            AppboyLogger.m5459w(str2, "Not passing local uri to AppboyNavigator. Got local uri: " + uri + " for url: " + str);
            return;
        }
        iInAppMessage.setAnimateOut(false);
        getInAppMessageManager().hideCurrentlyDisplayingInAppMessage(false);
        AppboyNavigator.getAppboyNavigator().gotoUri(getInAppMessageManager().getActivity(), createUriActionFromUrlString);
    }
}
