package com.appboy.p044ui.inappmessage.factories;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.appboy.enums.inappmessage.ImageStyle;
import com.appboy.models.IInAppMessage;
import com.appboy.models.InAppMessageModal;
import com.appboy.p044ui.R$layout;
import com.appboy.p044ui.inappmessage.AppboyInAppMessageManager;
import com.appboy.p044ui.inappmessage.IInAppMessageViewFactory;
import com.appboy.p044ui.inappmessage.views.AppboyInAppMessageBaseView;
import com.appboy.p044ui.inappmessage.views.AppboyInAppMessageModalView;
import com.appboy.p044ui.inappmessage.views.InAppMessageImageView;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import com.braze.Braze;
import com.braze.enums.BrazeViewBounds;
import p272u5.C6707b;

/* renamed from: com.appboy.ui.inappmessage.factories.AppboyModalViewFactory */
public class AppboyModalViewFactory implements IInAppMessageViewFactory {
    private static final String TAG = AppboyLogger.getBrazeLogTag(AppboyModalViewFactory.class);

    @SuppressLint({"InflateParams"})
    private AppboyInAppMessageModalView getAppropriateModalView(Activity activity, boolean z) {
        if (z) {
            return (AppboyInAppMessageModalView) activity.getLayoutInflater().inflate(R$layout.com_appboy_inappmessage_modal_graphic, (ViewGroup) null);
        }
        return (AppboyInAppMessageModalView) activity.getLayoutInflater().inflate(R$layout.com_appboy_inappmessage_modal, (ViewGroup) null);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$createInAppMessageView$0(View view) {
        if (AppboyInAppMessageManager.getInstance().getDoesClickOutsideModalViewDismissInAppMessageView()) {
            AppboyLogger.m5453i(TAG, "Dismissing modal after frame click");
            AppboyInAppMessageManager.getInstance().hideCurrentlyDisplayingInAppMessage(true);
        }
    }

    public AppboyInAppMessageModalView createInAppMessageView(Activity activity, IInAppMessage iInAppMessage) {
        Context applicationContext = activity.getApplicationContext();
        InAppMessageModal inAppMessageModal = (InAppMessageModal) iInAppMessage;
        boolean equals = inAppMessageModal.getImageStyle().equals(ImageStyle.GRAPHIC);
        AppboyInAppMessageModalView appropriateModalView = getAppropriateModalView(activity, equals);
        appropriateModalView.applyInAppMessageParameters(applicationContext, inAppMessageModal);
        String appropriateImageUrl = AppboyInAppMessageBaseView.getAppropriateImageUrl(inAppMessageModal);
        if (!StringUtils.isNullOrEmpty(appropriateImageUrl)) {
            Braze.getInstance(applicationContext).getImageLoader().renderUrlIntoInAppMessageView(applicationContext, iInAppMessage, appropriateImageUrl, appropriateModalView.getMessageImageView(), BrazeViewBounds.IN_APP_MESSAGE_MODAL);
        }
        appropriateModalView.getFrameView().setOnClickListener(new C6707b(0));
        appropriateModalView.setMessageBackgroundColor(iInAppMessage.getBackgroundColor());
        appropriateModalView.setFrameColor(inAppMessageModal.getFrameColor());
        appropriateModalView.setMessageButtons(inAppMessageModal.getMessageButtons());
        appropriateModalView.setMessageCloseButtonColor(inAppMessageModal.getCloseButtonColor());
        if (!equals) {
            appropriateModalView.setMessage(iInAppMessage.getMessage());
            appropriateModalView.setMessageTextColor(iInAppMessage.getMessageTextColor());
            appropriateModalView.setMessageHeaderText(inAppMessageModal.getHeader());
            appropriateModalView.setMessageHeaderTextColor(inAppMessageModal.getHeaderTextColor());
            appropriateModalView.setMessageIcon(iInAppMessage.getIcon(), iInAppMessage.getIconColor(), iInAppMessage.getIconBackgroundColor());
            appropriateModalView.setMessageHeaderTextAlignment(inAppMessageModal.getHeaderTextAlign());
            appropriateModalView.setMessageTextAlign(inAppMessageModal.getMessageTextAlign());
            appropriateModalView.resetMessageMargins(inAppMessageModal.getImageDownloadSuccessful());
            ((InAppMessageImageView) appropriateModalView.getMessageImageView()).setAspectRatio(2.9f);
        }
        appropriateModalView.setLargerCloseButtonClickArea(appropriateModalView.getMessageCloseButtonView());
        appropriateModalView.setupDirectionalNavigation(inAppMessageModal.getMessageButtons().size());
        return appropriateModalView;
    }
}
