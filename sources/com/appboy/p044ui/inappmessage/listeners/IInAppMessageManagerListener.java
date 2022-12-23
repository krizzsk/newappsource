package com.appboy.p044ui.inappmessage.listeners;

import android.view.View;
import com.appboy.models.IInAppMessage;
import com.appboy.models.MessageButton;
import com.appboy.p044ui.inappmessage.InAppMessageCloser;
import com.appboy.p044ui.inappmessage.InAppMessageOperation;

/* renamed from: com.appboy.ui.inappmessage.listeners.IInAppMessageManagerListener */
public interface IInAppMessageManagerListener {
    void afterInAppMessageViewClosed(IInAppMessage iInAppMessage);

    void afterInAppMessageViewOpened(View view, IInAppMessage iInAppMessage);

    InAppMessageOperation beforeInAppMessageDisplayed(IInAppMessage iInAppMessage);

    void beforeInAppMessageViewClosed(View view, IInAppMessage iInAppMessage);

    void beforeInAppMessageViewOpened(View view, IInAppMessage iInAppMessage);

    boolean onInAppMessageButtonClicked(IInAppMessage iInAppMessage, MessageButton messageButton, InAppMessageCloser inAppMessageCloser);

    boolean onInAppMessageClicked(IInAppMessage iInAppMessage, InAppMessageCloser inAppMessageCloser);

    void onInAppMessageDismissed(IInAppMessage iInAppMessage);

    @Deprecated
    boolean onInAppMessageReceived(IInAppMessage iInAppMessage);
}
