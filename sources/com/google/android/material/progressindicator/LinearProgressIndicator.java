package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import p188o.C5892b;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p355ac.C13401b;
import p355ac.C13410k;
import p718pc.C18888b;
import p718pc.C18893c;
import p718pc.C18900h;
import p718pc.C18907m;
import p718pc.C18908n;
import p718pc.C18910p;
import p718pc.C18914s;

public final class LinearProgressIndicator extends C18888b<LinearProgressIndicatorSpec> {

    /* renamed from: o */
    public static final int f35227o = C13410k.Widget_MaterialComponents_LinearProgressIndicator;

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.linearProgressIndicatorStyle);
    }

    /* renamed from: a */
    public final C18893c mo42091a(Context context, AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    /* renamed from: b */
    public final void mo42100b(int i, boolean z) {
        S s = this.f48066b;
        if (s == null || ((LinearProgressIndicatorSpec) s).f35228g != 0 || !isIndeterminate()) {
            super.mo42100b(i, z);
        }
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.f48066b).f35228g;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.f48066b).f35229h;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S s = this.f48066b;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s;
        boolean z2 = true;
        if (((LinearProgressIndicatorSpec) s).f35229h != 1) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (!((C6333d0.C6338e.m15063d(this) == 1 && ((LinearProgressIndicatorSpec) this.f48066b).f35229h == 2) || (C6333d0.C6338e.m15063d(this) == 0 && ((LinearProgressIndicatorSpec) this.f48066b).f35229h == 3))) {
                z2 = false;
            }
        }
        linearProgressIndicatorSpec.f35230i = z2;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        C18907m indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        C18900h progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        if (((LinearProgressIndicatorSpec) this.f48066b).f35228g != i) {
            if (!mo51354c() || !isIndeterminate()) {
                S s = this.f48066b;
                ((LinearProgressIndicatorSpec) s).f35228g = i;
                ((LinearProgressIndicatorSpec) s).mo42099a();
                if (i == 0) {
                    C18907m indeterminateDrawable = getIndeterminateDrawable();
                    C18910p pVar = new C18910p((LinearProgressIndicatorSpec) this.f48066b);
                    indeterminateDrawable.f48129n = pVar;
                    pVar.f18961a = indeterminateDrawable;
                } else {
                    C18907m indeterminateDrawable2 = getIndeterminateDrawable();
                    C18914s sVar = new C18914s(getContext(), (LinearProgressIndicatorSpec) this.f48066b);
                    indeterminateDrawable2.f48129n = sVar;
                    sVar.f18961a = indeterminateDrawable2;
                }
                invalidate();
                return;
            }
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f48066b).mo42099a();
    }

    public void setIndicatorDirection(int i) {
        S s = this.f48066b;
        ((LinearProgressIndicatorSpec) s).f35229h = i;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s;
        boolean z = true;
        if (i != 1) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (!((C6333d0.C6338e.m15063d(this) == 1 && ((LinearProgressIndicatorSpec) this.f48066b).f35229h == 2) || (C6333d0.C6338e.m15063d(this) == 0 && i == 3))) {
                z = false;
            }
        }
        linearProgressIndicatorSpec.f35230i = z;
        invalidate();
    }

    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((LinearProgressIndicatorSpec) this.f48066b).mo42099a();
        invalidate();
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, f35227o);
        C5892b bVar;
        Context context2 = getContext();
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.f48066b;
        C18908n nVar = new C18908n(linearProgressIndicatorSpec);
        if (linearProgressIndicatorSpec.f35228g == 0) {
            bVar = new C18910p(linearProgressIndicatorSpec);
        } else {
            bVar = new C18914s(context2, linearProgressIndicatorSpec);
        }
        setIndeterminateDrawable(new C18907m(context2, linearProgressIndicatorSpec, nVar, bVar));
        Context context3 = getContext();
        LinearProgressIndicatorSpec linearProgressIndicatorSpec2 = (LinearProgressIndicatorSpec) this.f48066b;
        setProgressDrawable(new C18900h(context3, linearProgressIndicatorSpec2, new C18908n(linearProgressIndicatorSpec2)));
    }
}
