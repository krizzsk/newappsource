package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import java.util.HashMap;
import p330z2.C7441q;

/* renamed from: com.google.android.material.internal.k */
public final class C14074k extends Transition {

    /* renamed from: com.google.android.material.internal.k$a */
    public class C14075a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ TextView f35104a;

        public C14075a(TextView textView) {
            this.f35104a = textView;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f35104a.setScaleX(floatValue);
            this.f35104a.setScaleY(floatValue);
        }
    }

    /* renamed from: d */
    public final void mo5356d(C7441q qVar) {
        View view = qVar.f22855b;
        if (view instanceof TextView) {
            qVar.f22854a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    /* renamed from: g */
    public final void mo5357g(C7441q qVar) {
        View view = qVar.f22855b;
        if (view instanceof TextView) {
            qVar.f22854a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    /* renamed from: k */
    public final Animator mo5358k(ViewGroup viewGroup, C7441q qVar, C7441q qVar2) {
        float f;
        if (qVar == null || qVar2 == null || !(qVar.f22855b instanceof TextView)) {
            return null;
        }
        View view = qVar2.f22855b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap hashMap = qVar.f22854a;
        HashMap hashMap2 = qVar2.f22854a;
        float f2 = 1.0f;
        if (hashMap.get("android:textscale:scale") != null) {
            f = ((Float) hashMap.get("android:textscale:scale")).floatValue();
        } else {
            f = 1.0f;
        }
        if (hashMap2.get("android:textscale:scale") != null) {
            f2 = ((Float) hashMap2.get("android:textscale:scale")).floatValue();
        }
        if (f == f2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.addUpdateListener(new C14075a(textView));
        return ofFloat;
    }
}
