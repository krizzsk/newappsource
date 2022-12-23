package com.google.android.exoplayer2.p052ui;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.masabi.justride.sdk.p415ui.features.ticket.ValidationMode;
import p775ro.C19297d;

/* renamed from: com.google.android.exoplayer2.ui.v */
public final /* synthetic */ class C4056v implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f14511a;

    /* renamed from: b */
    public final /* synthetic */ Object f14512b;

    public /* synthetic */ C4056v(Object obj, int i) {
        this.f14511a = i;
        this.f14512b = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14511a) {
            case 0:
                C4060z zVar = (C4060z) this.f14512b;
                zVar.getClass();
                zVar.mo16674b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                C19297d dVar = (C19297d) this.f14512b;
                int i = C19297d.f49059N;
                dVar.getClass();
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams = dVar.f49085q.getLayoutParams();
                layoutParams.height = intValue;
                dVar.f49085q.setLayoutParams(layoutParams);
                dVar.f49086r.setVisibility(0);
                dVar.f49087s.setVisibility(0);
                int heightPixels = ValidationMode.VISUAL_VALIDATOR.getHeightPixels(dVar.getResources());
                float heightPixels2 = ((float) (intValue - heightPixels)) / ((float) (ValidationMode.BARCODE.getHeightPixels(dVar.getResources()) - heightPixels));
                dVar.f49087s.setAlpha(1.0f - heightPixels2);
                dVar.f49086r.setAlpha(heightPixels2);
                return;
        }
    }
}
