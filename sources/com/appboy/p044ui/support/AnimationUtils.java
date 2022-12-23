package com.appboy.p044ui.support;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.appboy.ui.support.AnimationUtils */
public class AnimationUtils {
    private static final Interpolator sAccelerateInterpolator = new AccelerateInterpolator();
    private static final Interpolator sDecelerateInterpolator = new DecelerateInterpolator();

    public static Animation createVerticalAnimation(float f, float f2, long j, boolean z) {
        return setAnimationParams(new TranslateAnimation(2, BitmapDescriptorFactory.HUE_RED, 2, BitmapDescriptorFactory.HUE_RED, 1, f, 1, f2), j, z);
    }

    public static Animation setAnimationParams(Animation animation, long j, boolean z) {
        animation.setDuration(j);
        if (z) {
            animation.setInterpolator(sAccelerateInterpolator);
        } else {
            animation.setInterpolator(sDecelerateInterpolator);
        }
        return animation;
    }
}
