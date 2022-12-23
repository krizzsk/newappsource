package com.appboy.p044ui.inappmessage.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appboy.enums.inappmessage.ImageStyle;
import com.appboy.models.IInAppMessageImmersive;
import com.appboy.models.InAppMessageModal;
import com.appboy.p044ui.R$dimen;
import com.appboy.p044ui.R$id;
import com.appboy.p044ui.inappmessage.IInAppMessageImageView;
import com.appboy.p044ui.inappmessage.config.AppboyInAppMessageParams;
import com.appboy.p044ui.support.ViewUtils;
import com.appboy.support.AppboyLogger;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import p297w5.C6995b;
import p297w5.C6996c;

/* renamed from: com.appboy.ui.inappmessage.views.AppboyInAppMessageModalView */
public class AppboyInAppMessageModalView extends AppboyInAppMessageImmersiveBaseView {
    private static final String TAG = AppboyLogger.getBrazeLogTag(AppboyInAppMessageModalView.class);
    private InAppMessageModal mInAppMessage;
    private InAppMessageImageView mInAppMessageImageView;

    public AppboyInAppMessageModalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$resetMessageMargins$0(View view) {
        AppboyLogger.m5448d(TAG, "Passing scrollView click event to message clickable view.");
        getMessageClickableView().performClick();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$resizeGraphicFrameIfAppropriate$1(int i, int i2, int i3, double d) {
        double min = (double) Math.min(getMeasuredWidth() - i, i2);
        double min2 = (double) Math.min(getMeasuredHeight() - i, i3);
        View findViewById = findViewById(R$id.com_appboy_inappmessage_modal_graphic_bound);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById.getLayoutParams();
        if (d >= min / min2) {
            layoutParams.width = (int) min;
            layoutParams.height = (int) (min / d);
        } else {
            layoutParams.width = (int) (d * min2);
            layoutParams.height = (int) min2;
        }
        findViewById.setLayoutParams(layoutParams);
    }

    private void resizeGraphicFrameIfAppropriate(Context context, InAppMessageModal inAppMessageModal) {
        if (inAppMessageModal != null && inAppMessageModal.getBitmap() != null && inAppMessageModal.getImageStyle().equals(ImageStyle.GRAPHIC)) {
            Resources resources = context.getResources();
            post(new C6995b(this, resources.getDimensionPixelSize(R$dimen.com_appboy_in_app_message_modal_margin), resources.getDimensionPixelSize(R$dimen.com_appboy_in_app_message_modal_max_width), resources.getDimensionPixelSize(R$dimen.com_appboy_in_app_message_modal_max_height), ((double) inAppMessageModal.getBitmap().getWidth()) / ((double) inAppMessageModal.getBitmap().getHeight())));
        }
    }

    private void setInAppMessageImageViewAttributes(Context context, IInAppMessageImmersive iInAppMessageImmersive, IInAppMessageImageView iInAppMessageImageView) {
        float convertDpToPixels = (float) ViewUtils.convertDpToPixels(context, AppboyInAppMessageParams.getModalizedImageRadiusDp());
        if (iInAppMessageImmersive.getImageStyle().equals(ImageStyle.GRAPHIC)) {
            iInAppMessageImageView.setCornersRadiusPx(convertDpToPixels);
        } else {
            iInAppMessageImageView.setCornersRadiiPx(convertDpToPixels, convertDpToPixels, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        iInAppMessageImageView.setInAppMessageImageCropType(iInAppMessageImmersive.getCropType());
    }

    public void applyInAppMessageParameters(Context context, InAppMessageModal inAppMessageModal) {
        this.mInAppMessage = inAppMessageModal;
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(R$id.com_appboy_inappmessage_modal_imageview);
        this.mInAppMessageImageView = inAppMessageImageView;
        setInAppMessageImageViewAttributes(context, inAppMessageModal, inAppMessageImageView);
        resizeGraphicFrameIfAppropriate(context, inAppMessageModal);
    }

    public View getFrameView() {
        return findViewById(R$id.com_appboy_inappmessage_modal_frame);
    }

    public List<View> getMessageButtonViews(int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 1) {
            View findViewById = findViewById(R$id.com_appboy_inappmessage_modal_button_layout_single);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            View findViewById2 = findViewById(R$id.com_appboy_inappmessage_modal_button_single_one);
            if (findViewById2 != null) {
                arrayList.add(findViewById2);
            }
        } else if (i == 2) {
            View findViewById3 = findViewById(R$id.com_appboy_inappmessage_modal_button_layout_dual);
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
            }
            View findViewById4 = findViewById(R$id.com_appboy_inappmessage_modal_button_dual_one);
            View findViewById5 = findViewById(R$id.com_appboy_inappmessage_modal_button_dual_two);
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
        return findViewById(R$id.com_appboy_inappmessage_modal);
    }

    public View getMessageCloseButtonView() {
        return findViewById(R$id.com_appboy_inappmessage_modal_close_button);
    }

    public TextView getMessageHeaderTextView() {
        return (TextView) findViewById(R$id.com_appboy_inappmessage_modal_header_text);
    }

    public TextView getMessageIconView() {
        return (TextView) findViewById(R$id.com_appboy_inappmessage_modal_icon);
    }

    public ImageView getMessageImageView() {
        return this.mInAppMessageImageView;
    }

    public TextView getMessageTextView() {
        return (TextView) findViewById(R$id.com_appboy_inappmessage_modal_message);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        resizeGraphicFrameIfAppropriate(getContext(), this.mInAppMessage);
    }

    public void resetMessageMargins(boolean z) {
        super.resetMessageMargins(z);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R$id.com_appboy_inappmessage_modal_image_layout);
        if ((z || getMessageIconView() != null) && relativeLayout != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, 0, 0, 0);
            relativeLayout.setLayoutParams(layoutParams);
        }
        findViewById(R$id.com_appboy_inappmessage_modal_text_layout).setOnClickListener(new C6996c(this, 0));
    }

    public void setMessageBackgroundColor(int i) {
        InAppMessageViewUtils.setViewBackgroundColorFilter(findViewById(R$id.com_appboy_inappmessage_modal), i);
    }

    public Drawable getMessageBackgroundObject() {
        return getMessageClickableView().getBackground();
    }
}
