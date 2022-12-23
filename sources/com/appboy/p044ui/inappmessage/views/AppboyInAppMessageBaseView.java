package com.appboy.p044ui.inappmessage.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appboy.enums.inappmessage.TextAlign;
import com.appboy.models.IInAppMessageWithImage;
import com.appboy.p044ui.inappmessage.IInAppMessageView;
import com.appboy.p044ui.support.ViewUtils;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.io.File;
import p242s1.C6396v0;

/* renamed from: com.appboy.ui.inappmessage.views.AppboyInAppMessageBaseView */
public abstract class AppboyInAppMessageBaseView extends RelativeLayout implements IInAppMessageView {
    private static final String TAG = AppboyLogger.getBrazeLogTag(AppboyInAppMessageBaseView.class);
    public boolean mHasAppliedWindowInsets = false;

    public AppboyInAppMessageBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static String getAppropriateImageUrl(IInAppMessageWithImage iInAppMessageWithImage) {
        String localImageUrl = iInAppMessageWithImage.getLocalImageUrl();
        if (!StringUtils.isNullOrBlank(localImageUrl)) {
            if (new File(localImageUrl).exists()) {
                return localImageUrl;
            }
            String str = TAG;
            AppboyLogger.m5448d(str, "Local bitmap file does not exist. Using remote url instead. Local path: " + localImageUrl);
        }
        return iInAppMessageWithImage.getRemoteImageUrl();
    }

    public void applyWindowInsets(C6396v0 v0Var) {
        this.mHasAppliedWindowInsets = true;
    }

    public abstract Object getMessageBackgroundObject();

    public View getMessageClickableView() {
        return this;
    }

    public abstract TextView getMessageIconView();

    public abstract ImageView getMessageImageView();

    public abstract TextView getMessageTextView();

    public boolean hasAppliedWindowInsets() {
        return this.mHasAppliedWindowInsets;
    }

    public void resetMessageMargins(boolean z) {
        ImageView messageImageView = getMessageImageView();
        if (messageImageView != null) {
            if (!z) {
                ViewUtils.removeViewFromParent(messageImageView);
            } else {
                ViewUtils.removeViewFromParent(getMessageIconView());
            }
        }
        if (getMessageIconView() != null && getMessageIconView().getText() != null && StringUtils.isNullOrBlank(getMessageIconView().getText().toString())) {
            ViewUtils.removeViewFromParent(getMessageIconView());
        }
    }

    public void setMessage(String str) {
        getMessageTextView().setText(str);
    }

    public void setMessageBackgroundColor(int i) {
        InAppMessageViewUtils.setViewBackgroundColor((View) getMessageBackgroundObject(), i);
    }

    public void setMessageIcon(String str, int i, int i2) {
        if (getMessageIconView() != null) {
            InAppMessageViewUtils.setIcon(getContext(), str, i, i2, getMessageIconView());
        }
    }

    public void setMessageImageView(Bitmap bitmap) {
        InAppMessageViewUtils.setImage(bitmap, getMessageImageView());
    }

    public void setMessageTextAlign(TextAlign textAlign) {
        InAppMessageViewUtils.setTextAlignment(getMessageTextView(), textAlign);
    }

    public void setMessageTextColor(int i) {
        InAppMessageViewUtils.setTextViewColor(getMessageTextView(), i);
    }
}
