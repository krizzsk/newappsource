package com.usebutton.sdk.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.Notification;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

public class CompatHelpers {

    public static class LollipopHelper {
        private LollipopHelper() {
        }

        @TargetApi(21)
        public Bundle createSceneTransition(Activity activity, String str, View view) {
            return ActivityOptions.makeSceneTransitionAnimation(activity, new Pair[]{new Pair(view, str)}).toBundle();
        }
    }

    public static class RippleBackground {

        @TargetApi(21)
        public static class LollipopRippleBackground {
            private LollipopRippleBackground() {
            }

            public static ColorDrawable getColorDrawableFromColor(int i) {
                return new ColorDrawable(i);
            }

            public static ColorStateList getPressedColorSelector(int i, int i2) {
                return new ColorStateList(new int[][]{new int[]{16842919}, new int[]{16842908}, new int[]{16843518}, new int[0]}, new int[]{i2, i2, i2, i});
            }

            public Drawable from(int i, int i2) {
                return new RippleDrawable(getPressedColorSelector(i, i2), getColorDrawableFromColor(i), (Drawable) null);
            }
        }

        public static Drawable fromColor(int i) {
            return fromColors(i, rippleColor(i));
        }

        public static Drawable fromColors(int i, int i2) {
            return new LollipopRippleBackground().from(i, i2);
        }

        private static int rippleColor(int i) {
            float[] fArr = new float[3];
            Color.colorToHSV(i, fArr);
            float f = fArr[2];
            if (((double) f) < 0.5d) {
                fArr[2] = f + 0.2f;
            } else {
                fArr[2] = f - 0.2f;
            }
            return Color.HSVToColor(fArr);
        }
    }

    public static Bundle createSceneTransition(Activity activity, String str, View view) {
        return new LollipopHelper().createSceneTransition(activity, str, view);
    }

    public static int getColor(Context context, int i) {
        Resources resources = context.getResources();
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i, (Resources.Theme) null);
        }
        return resources.getColor(i);
    }

    public static Drawable getDrawable(Context context, int i) {
        return context.getResources().getDrawable(i, (Resources.Theme) null);
    }

    public static int getMinimumHeight(View view) {
        if (view == null) {
            return 0;
        }
        return view.getMinimumHeight();
    }

    public static int getMinimumWidth(View view) {
        if (view == null) {
            return 0;
        }
        return view.getMinimumWidth();
    }

    public static void setBackground(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    @TargetApi(16)
    public static void setPriorityHigh(Notification.Builder builder) {
        builder.setPriority(1);
    }

    @TargetApi(17)
    public static void setShowWhen(Notification.Builder builder) {
        builder.setShowWhen(true);
    }

    public static ColorStateList stateListFromPrimaryColor(int i) {
        return new ColorStateList(new int[][]{new int[]{16842919}, new int[]{-16842910}, new int[]{16842910}}, new int[]{-65536, -16711936, i});
    }
}
