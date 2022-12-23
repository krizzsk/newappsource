package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import p355ac.C13401b;
import p355ac.C13406g;

/* renamed from: com.google.android.material.appbar.j */
public final class C13895j {

    /* renamed from: a */
    public static final int[] f34239a = {16843848};

    /* renamed from: a */
    public static void m34670a(View view, float f) {
        int integer = view.getResources().getInteger(C13406g.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842910, C13401b.state_liftable, -C13401b.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }
}
