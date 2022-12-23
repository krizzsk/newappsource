package com.appboy.p044ui.inappmessage.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.appboy.enums.inappmessage.TextAlign;
import com.appboy.p044ui.inappmessage.AppboyInAppMessageManager;
import com.appboy.support.AppboyLogger;

/* renamed from: com.appboy.ui.inappmessage.views.InAppMessageViewUtils */
public class InAppMessageViewUtils {
    private static final String TAG = AppboyLogger.getBrazeLogTag(InAppMessageViewUtils.class);

    public static void closeInAppMessageOnKeycodeBack() {
        AppboyLogger.m5448d(TAG, "Back button intercepted by in-app message view, closing in-app message.");
        AppboyInAppMessageManager.getInstance().hideCurrentlyDisplayingInAppMessage(true);
    }

    public static void resetMessageMarginsIfNecessary(TextView textView, TextView textView2) {
        if (textView2 == null && textView != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(textView.getLayoutParams().width, textView.getLayoutParams().height);
            layoutParams.setMargins(0, 0, 0, 0);
            textView.setLayoutParams(layoutParams);
        }
    }

    public static void setDrawableColor(Drawable drawable, int i) {
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            if (layerDrawable.getNumberOfLayers() <= 0 || !(layerDrawable.getDrawable(0) instanceof GradientDrawable)) {
                AppboyLogger.m5448d(TAG, "LayerDrawable for button background did not have the expected number of layers or the 0th layer was not a GradientDrawable.");
            } else {
                setDrawableColor(layerDrawable.getDrawable(0), i);
            }
        }
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(i);
        } else {
            setDrawableColorFilter(drawable, i);
        }
    }

    private static void setDrawableColorFilter(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            drawable.setColorFilter(new BlendModeColorFilter(i, BlendMode.SRC_ATOP));
        } else {
            setDrawableColorFilterOld(drawable, i);
        }
    }

    private static void setDrawableColorFilterOld(Drawable drawable, int i) {
        drawable.setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
    }

    public static void setFrameColor(View view, Integer num) {
        if (num != null) {
            view.setBackgroundColor(num.intValue());
        }
    }

    public static void setIcon(Context context, String str, int i, int i2, TextView textView) {
        if (str != null) {
            try {
                textView.setTypeface(Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf"));
                textView.setText(str);
                setTextViewColor(textView, i);
                if (textView.getBackground() != null) {
                    setDrawableColor(textView.getBackground(), i2);
                } else {
                    setViewBackgroundColor(textView, i2);
                }
            } catch (Exception e) {
                AppboyLogger.m5452e(TAG, "Caught exception setting icon typeface. Not rendering icon.", e);
            }
        }
    }

    public static void setImage(Bitmap bitmap, ImageView imageView) {
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public static void setTextAlignment(TextView textView, TextAlign textAlign) {
        if (textAlign.equals(TextAlign.START)) {
            textView.setGravity(8388611);
        } else if (textAlign.equals(TextAlign.END)) {
            textView.setGravity(8388613);
        } else if (textAlign.equals(TextAlign.CENTER)) {
            textView.setGravity(17);
        }
    }

    public static void setTextViewColor(TextView textView, int i) {
        textView.setTextColor(i);
    }

    public static void setViewBackgroundColor(View view, int i) {
        view.setBackgroundColor(i);
    }

    public static void setViewBackgroundColorFilter(View view, int i) {
        setDrawableColorFilter(view.getBackground(), i);
        view.getBackground().setAlpha(Color.alpha(i));
    }
}
