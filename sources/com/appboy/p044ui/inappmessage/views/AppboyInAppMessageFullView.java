package com.appboy.p044ui.inappmessage.views;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.enums.inappmessage.ImageStyle;
import com.appboy.models.IInAppMessageImmersive;
import com.appboy.p044ui.R$id;
import com.appboy.p044ui.inappmessage.IInAppMessageImageView;
import com.appboy.p044ui.inappmessage.config.AppboyInAppMessageParams;
import com.appboy.p044ui.support.ViewUtils;
import com.appboy.support.AppboyLogger;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import p242s1.C6396v0;
import p297w5.C6994a;

/* renamed from: com.appboy.ui.inappmessage.views.AppboyInAppMessageFullView */
public class AppboyInAppMessageFullView extends AppboyInAppMessageImmersiveBaseView {
    private static final String TAG = AppboyLogger.getBrazeLogTag(AppboyInAppMessageFullView.class);
    private InAppMessageImageView mInAppMessageImageView;
    private boolean mIsGraphic;

    public AppboyInAppMessageFullView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void applyDisplayCutoutMarginsToCloseButton(C6396v0 v0Var, View view) {
        if (view.getLayoutParams() == null || !(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            AppboyLogger.m5448d(TAG, "Close button layout params are null or not of the expected class. Not applying window insets.");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(v0Var) + marginLayoutParams.leftMargin, ViewUtils.getMaxSafeTopInset(v0Var) + marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(v0Var) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(v0Var) + marginLayoutParams.bottomMargin);
    }

    private void applyDisplayCutoutMarginsToContentArea(C6396v0 v0Var, View view) {
        if (view.getLayoutParams() == null || !(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            AppboyLogger.m5448d(TAG, "Content area layout params are null or not of the expected class. Not applying window insets.");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(v0Var) + marginLayoutParams.leftMargin, marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(v0Var) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(v0Var) + marginLayoutParams.bottomMargin);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$resetMessageMargins$0(View view) {
        AppboyLogger.m5448d(TAG, "Passing scrollView click event to message clickable view.");
        getMessageClickableView().performClick();
    }

    private void setInAppMessageImageViewAttributes(Activity activity, IInAppMessageImmersive iInAppMessageImmersive, IInAppMessageImageView iInAppMessageImageView) {
        iInAppMessageImageView.setInAppMessageImageCropType(iInAppMessageImmersive.getCropType());
        if (ViewUtils.isRunningOnTablet(activity)) {
            float convertDpToPixels = (float) ViewUtils.convertDpToPixels(activity, AppboyInAppMessageParams.getModalizedImageRadiusDp());
            if (iInAppMessageImmersive.getImageStyle().equals(ImageStyle.GRAPHIC)) {
                iInAppMessageImageView.setCornersRadiusPx(convertDpToPixels);
            } else {
                iInAppMessageImageView.setCornersRadiiPx(convertDpToPixels, convertDpToPixels, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
        } else {
            iInAppMessageImageView.setCornersRadiusPx(BitmapDescriptorFactory.HUE_RED);
        }
    }

    public void applyWindowInsets(C6396v0 v0Var) {
        super.applyWindowInsets(v0Var);
        View messageCloseButtonView = getMessageCloseButtonView();
        if (messageCloseButtonView != null) {
            applyDisplayCutoutMarginsToCloseButton(v0Var, messageCloseButtonView);
        }
        if (this.mIsGraphic) {
            View findViewById = findViewById(R$id.com_appboy_inappmessage_full_button_layout_single);
            if (findViewById == null || findViewById.getVisibility() != 0) {
                View findViewById2 = findViewById(R$id.com_appboy_inappmessage_full_button_layout_dual);
                if (findViewById2 != null && findViewById2.getVisibility() == 0) {
                    applyDisplayCutoutMarginsToContentArea(v0Var, findViewById2);
                    return;
                }
                return;
            }
            applyDisplayCutoutMarginsToContentArea(v0Var, findViewById);
            return;
        }
        View findViewById3 = findViewById(R$id.com_appboy_inappmessage_full_text_and_button_content_parent);
        if (findViewById3 != null) {
            applyDisplayCutoutMarginsToContentArea(v0Var, findViewById3);
        }
    }

    public void createAppropriateViews(Activity activity, IInAppMessageImmersive iInAppMessageImmersive, boolean z) {
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(R$id.com_appboy_inappmessage_full_imageview);
        this.mInAppMessageImageView = inAppMessageImageView;
        setInAppMessageImageViewAttributes(activity, iInAppMessageImmersive, inAppMessageImageView);
        this.mIsGraphic = z;
    }

    public View getFrameView() {
        return findViewById(R$id.com_appboy_inappmessage_full_frame);
    }

    public int getLongEdge() {
        return findViewById(R$id.com_appboy_inappmessage_full).getLayoutParams().height;
    }

    public List<View> getMessageButtonViews(int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 1) {
            View findViewById = findViewById(R$id.com_appboy_inappmessage_full_button_layout_single);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            View findViewById2 = findViewById(R$id.com_appboy_inappmessage_full_button_single_one);
            if (findViewById2 != null) {
                arrayList.add(findViewById2);
            }
        } else if (i == 2) {
            View findViewById3 = findViewById(R$id.com_appboy_inappmessage_full_button_layout_dual);
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
            }
            View findViewById4 = findViewById(R$id.com_appboy_inappmessage_full_button_dual_one);
            View findViewById5 = findViewById(R$id.com_appboy_inappmessage_full_button_dual_two);
            if (findViewById4 != null) {
                arrayList.add(findViewById4);
            }
            if (findViewById5 != null) {
                arrayList.add(findViewById5);
            }
        }
        return arrayList;
    }

    public View getMessageClickableView() {
        return findViewById(R$id.com_appboy_inappmessage_full);
    }

    public View getMessageCloseButtonView() {
        return findViewById(R$id.com_appboy_inappmessage_full_close_button);
    }

    public TextView getMessageHeaderTextView() {
        return (TextView) findViewById(R$id.com_appboy_inappmessage_full_header_text);
    }

    public TextView getMessageIconView() {
        return null;
    }

    public ImageView getMessageImageView() {
        return this.mInAppMessageImageView;
    }

    public TextView getMessageTextView() {
        return (TextView) findViewById(R$id.com_appboy_inappmessage_full_message);
    }

    public int getShortEdge() {
        return findViewById(R$id.com_appboy_inappmessage_full).getLayoutParams().width;
    }

    public void resetMessageMargins(boolean z) {
        super.resetMessageMargins(z);
        findViewById(R$id.com_appboy_inappmessage_full_text_layout).setOnClickListener(new C6994a(this, 0));
    }

    public void setMessageBackgroundColor(int i) {
        if (getMessageBackgroundObject().getBackground() instanceof GradientDrawable) {
            InAppMessageViewUtils.setViewBackgroundColorFilter(getMessageBackgroundObject(), i);
        } else if (this.mIsGraphic) {
            super.setMessageBackgroundColor(i);
        } else {
            InAppMessageViewUtils.setViewBackgroundColor(findViewById(R$id.com_appboy_inappmessage_full_all_content_parent), i);
            InAppMessageViewUtils.setViewBackgroundColor(findViewById(R$id.com_appboy_inappmessage_full_text_and_button_content_parent), i);
        }
    }

    public View getMessageBackgroundObject() {
        return findViewById(R$id.com_appboy_inappmessage_full);
    }
}
