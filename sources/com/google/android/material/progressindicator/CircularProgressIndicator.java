package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import p355ac.C13401b;
import p355ac.C13410k;
import p718pc.C18888b;
import p718pc.C18893c;
import p718pc.C18894d;
import p718pc.C18897g;
import p718pc.C18900h;
import p718pc.C18907m;

public final class CircularProgressIndicator extends C18888b<CircularProgressIndicatorSpec> {

    /* renamed from: o */
    public static final int f35223o = C13410k.Widget_MaterialComponents_CircularProgressIndicator;

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.circularProgressIndicatorStyle);
    }

    /* renamed from: a */
    public final C18893c mo42091a(Context context, AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f48066b).f35226i;
    }

    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f48066b).f35225h;
    }

    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f48066b).f35224g;
    }

    public void setIndicatorDirection(int i) {
        ((CircularProgressIndicatorSpec) this.f48066b).f35226i = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        S s = this.f48066b;
        if (((CircularProgressIndicatorSpec) s).f35225h != i) {
            ((CircularProgressIndicatorSpec) s).f35225h = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        S s = this.f48066b;
        if (((CircularProgressIndicatorSpec) s).f35224g != max) {
            ((CircularProgressIndicatorSpec) s).f35224g = max;
            ((CircularProgressIndicatorSpec) s).getClass();
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((CircularProgressIndicatorSpec) this.f48066b).getClass();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, f35223o);
        Context context2 = getContext();
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.f48066b;
        setIndeterminateDrawable(new C18907m(context2, circularProgressIndicatorSpec, new C18894d(circularProgressIndicatorSpec), new C18897g(circularProgressIndicatorSpec)));
        Context context3 = getContext();
        CircularProgressIndicatorSpec circularProgressIndicatorSpec2 = (CircularProgressIndicatorSpec) this.f48066b;
        setProgressDrawable(new C18900h(context3, circularProgressIndicatorSpec2, new C18894d(circularProgressIndicatorSpec2)));
    }
}
