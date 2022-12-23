package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.i */
public final class C14068i {

    /* renamed from: a */
    public final ArrayList<C14070b> f35093a = new ArrayList<>();

    /* renamed from: b */
    public ValueAnimator f35094b = null;

    /* renamed from: c */
    public final C14069a f35095c = new C14069a();

    /* renamed from: com.google.android.material.internal.i$a */
    public class C14069a extends AnimatorListenerAdapter {
        public C14069a() {
        }

        public final void onAnimationEnd(Animator animator) {
            C14068i iVar = C14068i.this;
            if (iVar.f35094b == animator) {
                iVar.f35094b = null;
            }
        }
    }

    /* renamed from: com.google.android.material.internal.i$b */
    public static class C14070b {
        public C14070b(int[] iArr, ValueAnimator valueAnimator) {
        }
    }

    /* renamed from: a */
    public final void mo41880a(int[] iArr, ValueAnimator valueAnimator) {
        C14070b bVar = new C14070b(iArr, valueAnimator);
        valueAnimator.addListener(this.f35095c);
        this.f35093a.add(bVar);
    }
}
