package com.appboy.p044ui.inappmessage.factories;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.appboy.models.IInAppMessage;
import com.appboy.models.InAppMessageSlideup;
import com.appboy.p044ui.R$layout;
import com.appboy.p044ui.inappmessage.IInAppMessageViewFactory;
import com.appboy.p044ui.inappmessage.views.AppboyInAppMessageBaseView;
import com.appboy.p044ui.inappmessage.views.AppboyInAppMessageSlideupView;
import com.appboy.p044ui.support.ViewUtils;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import com.braze.Braze;
import com.braze.enums.BrazeViewBounds;

/* renamed from: com.appboy.ui.inappmessage.factories.AppboySlideupViewFactory */
public class AppboySlideupViewFactory implements IInAppMessageViewFactory {
    private static final String TAG = AppboyLogger.getBrazeLogTag(AppboySlideupViewFactory.class);

    public AppboyInAppMessageSlideupView createInAppMessageView(Activity activity, IInAppMessage iInAppMessage) {
        AppboyInAppMessageSlideupView appboyInAppMessageSlideupView = (AppboyInAppMessageSlideupView) activity.getLayoutInflater().inflate(R$layout.com_appboy_inappmessage_slideup, (ViewGroup) null);
        if (ViewUtils.isDeviceNotInTouchMode(appboyInAppMessageSlideupView)) {
            AppboyLogger.m5459w(TAG, "The device is not currently in touch mode. This message requires user touch interaction to display properly.");
            return null;
        }
        InAppMessageSlideup inAppMessageSlideup = (InAppMessageSlideup) iInAppMessage;
        Context applicationContext = activity.getApplicationContext();
        appboyInAppMessageSlideupView.applyInAppMessageParameters(iInAppMessage);
        String appropriateImageUrl = AppboyInAppMessageBaseView.getAppropriateImageUrl(inAppMessageSlideup);
        if (!StringUtils.isNullOrEmpty(appropriateImageUrl)) {
            Braze.getInstance(applicationContext).getImageLoader().renderUrlIntoInAppMessageView(applicationContext, iInAppMessage, appropriateImageUrl, appboyInAppMessageSlideupView.getMessageImageView(), BrazeViewBounds.IN_APP_MESSAGE_SLIDEUP);
        }
        appboyInAppMessageSlideupView.setMessageBackgroundColor(inAppMessageSlideup.getBackgroundColor());
        appboyInAppMessageSlideupView.setMessage(inAppMessageSlideup.getMessage());
        appboyInAppMessageSlideupView.setMessageTextColor(inAppMessageSlideup.getMessageTextColor());
        appboyInAppMessageSlideupView.setMessageTextAlign(inAppMessageSlideup.getMessageTextAlign());
        appboyInAppMessageSlideupView.setMessageIcon(inAppMessageSlideup.getIcon(), inAppMessageSlideup.getIconColor(), inAppMessageSlideup.getIconBackgroundColor());
        appboyInAppMessageSlideupView.setMessageChevron(inAppMessageSlideup.getChevronColor(), inAppMessageSlideup.getClickAction());
        appboyInAppMessageSlideupView.resetMessageMargins(inAppMessageSlideup.getImageDownloadSuccessful());
        return appboyInAppMessageSlideupView;
    }
}
