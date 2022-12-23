package com.appboy.p044ui.inappmessage.views;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appboy.enums.inappmessage.ClickAction;
import com.appboy.models.IInAppMessage;
import com.appboy.p044ui.R$dimen;
import com.appboy.p044ui.R$id;
import com.appboy.p044ui.support.ViewUtils;
import com.appboy.support.AppboyLogger;
import p242s1.C6396v0;

/* renamed from: com.appboy.ui.inappmessage.views.AppboyInAppMessageSlideupView */
public class AppboyInAppMessageSlideupView extends AppboyInAppMessageBaseView {
    private static final String TAG = AppboyLogger.getBrazeLogTag(AppboyInAppMessageSlideupView.class);
    private InAppMessageImageView mInAppMessageImageView;

    public AppboyInAppMessageSlideupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void applyInAppMessageParameters(IInAppMessage iInAppMessage) {
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(R$id.com_appboy_inappmessage_slideup_imageview);
        this.mInAppMessageImageView = inAppMessageImageView;
        inAppMessageImageView.setInAppMessageImageCropType(iInAppMessage.getCropType());
    }

    public void applyWindowInsets(C6396v0 v0Var) {
        super.applyWindowInsets(v0Var);
        if (getLayoutParams() == null || !(getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            AppboyLogger.m5448d(TAG, "Close button view is null or not of the expected class. Not applying window insets.");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(v0Var) + marginLayoutParams.leftMargin, ViewUtils.getMaxSafeTopInset(v0Var) + marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(v0Var) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(v0Var) + marginLayoutParams.bottomMargin);
    }

    public View getMessageChevronView() {
        return findViewById(R$id.com_appboy_inappmessage_slideup_chevron);
    }

    public TextView getMessageIconView() {
        return (TextView) findViewById(R$id.com_appboy_inappmessage_slideup_icon);
    }

    public ImageView getMessageImageView() {
        return this.mInAppMessageImageView;
    }

    public TextView getMessageTextView() {
        return (TextView) findViewById(R$id.com_appboy_inappmessage_slideup_message);
    }

    public void resetMessageMargins(boolean z) {
        boolean z2;
        super.resetMessageMargins(z);
        if (getMessageIconView() == null || getMessageIconView().getText() == null || getMessageIconView().getText().length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && z2) {
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R$id.com_appboy_inappmessage_slideup_image_layout);
            if (relativeLayout != null) {
                ViewUtils.removeViewFromParent(relativeLayout);
            }
            TextView textView = (TextView) findViewById(R$id.com_appboy_inappmessage_slideup_message);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.leftMargin = getContext().getResources().getDimensionPixelSize(R$dimen.com_appboy_in_app_message_slideup_left_message_margin_no_image);
            textView.setLayoutParams(layoutParams);
        }
    }

    public void setMessageBackgroundColor(int i) {
        if (getMessageBackgroundObject().getBackground() instanceof GradientDrawable) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(getMessageBackgroundObject(), i);
        } else {
            super.setMessageBackgroundColor(i);
        }
    }

    public void setMessageChevron(int i, ClickAction clickAction) {
        if (clickAction == ClickAction.NONE) {
            getMessageChevronView().setVisibility(8);
        } else {
            InAppMessageViewUtils.setViewBackgroundColorFilter(getMessageChevronView(), i);
        }
    }

    public View getMessageBackgroundObject() {
        return findViewById(R$id.com_appboy_inappmessage_slideup_container);
    }
}
