package com.appboy.p044ui.inappmessage.factories;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.appboy.enums.inappmessage.ImageStyle;
import com.appboy.enums.inappmessage.Orientation;
import com.appboy.models.IInAppMessage;
import com.appboy.models.InAppMessageFull;
import com.appboy.p044ui.R$id;
import com.appboy.p044ui.R$layout;
import com.appboy.p044ui.inappmessage.IInAppMessageViewFactory;
import com.appboy.p044ui.inappmessage.views.AppboyInAppMessageBaseView;
import com.appboy.p044ui.inappmessage.views.AppboyInAppMessageFullView;
import com.appboy.p044ui.inappmessage.views.InAppMessageImageView;
import com.appboy.p044ui.support.ViewUtils;
import com.appboy.support.StringUtils;
import com.braze.Braze;
import com.braze.enums.BrazeViewBounds;
import p272u5.C6706a;

/* renamed from: com.appboy.ui.inappmessage.factories.AppboyFullViewFactory */
public class AppboyFullViewFactory implements IInAppMessageViewFactory {
    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$createInAppMessageView$0(View view, AppboyInAppMessageFullView appboyInAppMessageFullView, InAppMessageFull inAppMessageFull, Context context, View view2) {
        int height = view.getHeight() / 2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) appboyInAppMessageFullView.findViewById(R$id.com_appboy_inappmessage_full_text_and_button_content_parent).getLayoutParams();
        int i = marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
        if (!inAppMessageFull.getMessageButtons().isEmpty()) {
            i += (int) ViewUtils.convertDpToPixels(context, 64.0d);
        }
        ViewUtils.setHeightOnViewLayoutParams(view2, Math.min(view2.getHeight(), height - i));
        view2.requestLayout();
        appboyInAppMessageFullView.getMessageImageView().requestLayout();
    }

    @SuppressLint({"InflateParams"})
    public AppboyInAppMessageFullView getAppropriateFullView(Activity activity, boolean z) {
        if (z) {
            return (AppboyInAppMessageFullView) activity.getLayoutInflater().inflate(R$layout.com_appboy_inappmessage_full_graphic, (ViewGroup) null);
        }
        return (AppboyInAppMessageFullView) activity.getLayoutInflater().inflate(R$layout.com_appboy_inappmessage_full, (ViewGroup) null);
    }

    public boolean resetLayoutParamsIfAppropriate(Activity activity, IInAppMessage iInAppMessage, AppboyInAppMessageFullView appboyInAppMessageFullView) {
        RelativeLayout.LayoutParams layoutParams;
        if (!(!ViewUtils.isRunningOnTablet(activity) || iInAppMessage.getOrientation() == null || iInAppMessage.getOrientation() == Orientation.ANY)) {
            int longEdge = appboyInAppMessageFullView.getLongEdge();
            int shortEdge = appboyInAppMessageFullView.getShortEdge();
            if (longEdge > 0 && shortEdge > 0) {
                if (iInAppMessage.getOrientation() == Orientation.LANDSCAPE) {
                    layoutParams = new RelativeLayout.LayoutParams(longEdge, shortEdge);
                } else {
                    layoutParams = new RelativeLayout.LayoutParams(shortEdge, longEdge);
                }
                layoutParams.addRule(13, -1);
                appboyInAppMessageFullView.getMessageBackgroundObject().setLayoutParams(layoutParams);
                return true;
            }
        }
        return false;
    }

    public AppboyInAppMessageFullView createInAppMessageView(Activity activity, IInAppMessage iInAppMessage) {
        Context applicationContext = activity.getApplicationContext();
        InAppMessageFull inAppMessageFull = (InAppMessageFull) iInAppMessage;
        boolean equals = inAppMessageFull.getImageStyle().equals(ImageStyle.GRAPHIC);
        AppboyInAppMessageFullView appropriateFullView = getAppropriateFullView(activity, equals);
        appropriateFullView.createAppropriateViews(activity, inAppMessageFull, equals);
        String appropriateImageUrl = AppboyInAppMessageBaseView.getAppropriateImageUrl(inAppMessageFull);
        if (!StringUtils.isNullOrEmpty(appropriateImageUrl)) {
            Braze.getInstance(applicationContext).getImageLoader().renderUrlIntoInAppMessageView(applicationContext, iInAppMessage, appropriateImageUrl, appropriateFullView.getMessageImageView(), BrazeViewBounds.NO_BOUNDS);
        }
        appropriateFullView.getFrameView().setOnClickListener((View.OnClickListener) null);
        appropriateFullView.setMessageBackgroundColor(inAppMessageFull.getBackgroundColor());
        appropriateFullView.setFrameColor(inAppMessageFull.getFrameColor());
        appropriateFullView.setMessageButtons(inAppMessageFull.getMessageButtons());
        appropriateFullView.setMessageCloseButtonColor(inAppMessageFull.getCloseButtonColor());
        if (!equals) {
            appropriateFullView.setMessage(inAppMessageFull.getMessage());
            appropriateFullView.setMessageTextColor(inAppMessageFull.getMessageTextColor());
            appropriateFullView.setMessageHeaderText(inAppMessageFull.getHeader());
            appropriateFullView.setMessageHeaderTextColor(inAppMessageFull.getHeaderTextColor());
            appropriateFullView.setMessageHeaderTextAlignment(inAppMessageFull.getHeaderTextAlign());
            appropriateFullView.setMessageTextAlign(inAppMessageFull.getMessageTextAlign());
            appropriateFullView.resetMessageMargins(inAppMessageFull.getImageDownloadSuccessful());
            ((InAppMessageImageView) appropriateFullView.getMessageImageView()).setToHalfParentHeight(true);
        }
        appropriateFullView.setLargerCloseButtonClickArea(appropriateFullView.getMessageCloseButtonView());
        resetLayoutParamsIfAppropriate(activity, inAppMessageFull, appropriateFullView);
        appropriateFullView.setupDirectionalNavigation(inAppMessageFull.getMessageButtons().size());
        View findViewById = appropriateFullView.findViewById(R$id.com_appboy_inappmessage_full_scrollview);
        if (findViewById != null) {
            findViewById.post(new C6706a(appropriateFullView.findViewById(R$id.com_appboy_inappmessage_full_all_content_parent), appropriateFullView, inAppMessageFull, applicationContext, findViewById));
        }
        return appropriateFullView;
    }
}
