package com.appboy.p044ui.support;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.appboy.enums.inappmessage.Orientation;
import com.appboy.support.AppboyLogger;
import p242s1.C6331d;
import p242s1.C6396v0;

/* renamed from: com.appboy.ui.support.ViewUtils */
public class ViewUtils {
    private static final String TAG = AppboyLogger.getBrazeLogTag(ViewUtils.class);

    public static double convertDpToPixels(Context context, double d) {
        return d * ((double) context.getResources().getDisplayMetrics().density);
    }

    public static int getMaxSafeBottomInset(C6396v0 v0Var) {
        int i;
        if (v0Var.mo22502a() == null) {
            return v0Var.mo22503b();
        }
        C6331d a = v0Var.mo22502a();
        if (Build.VERSION.SDK_INT >= 28) {
            i = C6331d.C6332a.m15009c(a.f19989a);
        } else {
            a.getClass();
            i = 0;
        }
        return Math.max(i, v0Var.mo22503b());
    }

    public static int getMaxSafeLeftInset(C6396v0 v0Var) {
        int i;
        if (v0Var.mo22502a() == null) {
            return v0Var.mo22504c();
        }
        C6331d a = v0Var.mo22502a();
        if (Build.VERSION.SDK_INT >= 28) {
            i = C6331d.C6332a.m15010d(a.f19989a);
        } else {
            a.getClass();
            i = 0;
        }
        return Math.max(i, v0Var.mo22504c());
    }

    public static int getMaxSafeRightInset(C6396v0 v0Var) {
        int i;
        if (v0Var.mo22502a() == null) {
            return v0Var.mo22505d();
        }
        C6331d a = v0Var.mo22502a();
        if (Build.VERSION.SDK_INT >= 28) {
            i = C6331d.C6332a.m15011e(a.f19989a);
        } else {
            a.getClass();
            i = 0;
        }
        return Math.max(i, v0Var.mo22505d());
    }

    public static int getMaxSafeTopInset(C6396v0 v0Var) {
        int i;
        if (v0Var.mo22502a() == null) {
            return v0Var.mo22506e();
        }
        C6331d a = v0Var.mo22502a();
        if (Build.VERSION.SDK_INT >= 28) {
            i = C6331d.C6332a.m15012f(a.f19989a);
        } else {
            a.getClass();
            i = 0;
        }
        return Math.max(i, v0Var.mo22506e());
    }

    public static boolean isCurrentOrientationValid(int i, Orientation orientation) {
        if (i == 2 && orientation == Orientation.LANDSCAPE) {
            AppboyLogger.m5448d(TAG, "Current and preferred orientation are landscape.");
            return true;
        } else if (i == 1 && orientation == Orientation.PORTRAIT) {
            AppboyLogger.m5448d(TAG, "Current and preferred orientation are portrait.");
            return true;
        } else {
            String str = TAG;
            AppboyLogger.m5448d(str, "Current orientation " + i + " and preferred orientation " + orientation + " don't match");
            return false;
        }
    }

    public static boolean isDeviceInNightMode(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static boolean isDeviceNotInTouchMode(View view) {
        return !view.isInTouchMode();
    }

    public static boolean isRunningOnTablet(Activity activity) {
        return activity.getResources().getConfiguration().smallestScreenWidthDp >= 600;
    }

    public static void removeViewFromParent(View view) {
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            viewGroup.removeView(view);
            String str = TAG;
            AppboyLogger.m5448d(str, "Removed view: " + view + "\nfrom parent: " + viewGroup);
        }
    }

    public static void setActivityRequestedOrientation(Activity activity, int i) {
        try {
            activity.setRequestedOrientation(i);
        } catch (Exception e) {
            String str = TAG;
            StringBuilder r = C25541a.m63887r("Failed to set requested orientation ", i, " for activity class: ");
            r.append(activity.getLocalClassName());
            AppboyLogger.m5452e(str, r.toString(), e);
        }
    }

    public static void setFocusableInTouchModeAndRequestFocus(View view) {
        try {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Caught exception while setting view to focusable in touch mode and requesting focus.", e);
        }
    }

    public static void setHeightOnViewLayoutParams(View view, int i) {
        if (view == null) {
            AppboyLogger.m5459w(TAG, "Cannot set height on null view.");
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }
}
