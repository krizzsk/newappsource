package com.appboy.p044ui.inappmessage.listeners;

import android.view.View;
import com.appboy.models.IInAppMessage;
import com.appboy.models.IInAppMessageThemeable;
import com.appboy.models.MessageButton;
import com.appboy.p044ui.inappmessage.AppboyInAppMessageManager;
import com.appboy.p044ui.inappmessage.InAppMessageCloser;
import com.appboy.p044ui.inappmessage.InAppMessageOperation;
import com.appboy.p044ui.support.ViewUtils;

/* renamed from: com.appboy.ui.inappmessage.listeners.AppboyDefaultInAppMessageManagerListener */
public class AppboyDefaultInAppMessageManagerListener implements IInAppMessageManagerListener {
    public void afterInAppMessageViewClosed(IInAppMessage iInAppMessage) {
    }

    public void afterInAppMessageViewOpened(View view, IInAppMessage iInAppMessage) {
    }

    public InAppMessageOperation beforeInAppMessageDisplayed(IInAppMessage iInAppMessage) {
        if ((iInAppMessage instanceof IInAppMessageThemeable) && ViewUtils.isDeviceInNightMode(AppboyInAppMessageManager.getInstance().getApplicationContext())) {
            ((IInAppMessageThemeable) iInAppMessage).enableDarkTheme();
        }
        return InAppMessageOperation.DISPLAY_NOW;
    }

    public void beforeInAppMessageViewClosed(View view, IInAppMessage iInAppMessage) {
    }

    public void beforeInAppMessageViewOpened(View view, IInAppMessage iInAppMessage) {
    }

    public boolean onInAppMessageButtonClicked(IInAppMessage iInAppMessage, MessageButton messageButton, InAppMessageCloser inAppMessageCloser) {
        return false;
    }

    public boolean onInAppMessageClicked(IInAppMessage iInAppMessage, InAppMessageCloser inAppMessageCloser) {
        return false;
    }

    public void onInAppMessageDismissed(IInAppMessage iInAppMessage) {
    }

    @Deprecated
    public boolean onInAppMessageReceived(IInAppMessage iInAppMessage) {
        return false;
    }
}
