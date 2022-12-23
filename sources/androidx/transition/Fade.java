package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.WeakHashMap;
import p116i1.C5256j;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p330z2.C7438n;
import p330z2.C7441q;
import p330z2.C7444t;

public class Fade extends Visibility {

    /* renamed from: androidx.transition.Fade$a */
    public static class C1302a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final View f4926a;

        /* renamed from: b */
        public boolean f4927b = false;

        public C1302a(View view) {
            this.f4926a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            C7444t.m17083b(this.f4926a, 1.0f);
            if (this.f4927b) {
                this.f4926a.setLayerType(0, (Paint) null);
            }
        }

        public final void onAnimationStart(Animator animator) {
            View view = this.f4926a;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (C6333d0.C6337d.m15048h(view) && this.f4926a.getLayerType() == 0) {
                this.f4927b = true;
                this.f4926a.setLayerType(2, (Paint) null);
            }
        }
    }

    public Fade(int i) {
        if ((i & -4) == 0) {
            this.f4976z = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    /* renamed from: L */
    public final Animator mo5393L(ViewGroup viewGroup, View view, C7441q qVar, C7441q qVar2) {
        float f;
        Float f2;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        if (qVar == null || (f2 = (Float) qVar.f22854a.get("android:fade:transitionAlpha")) == null) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = f2.floatValue();
        }
        if (f != 1.0f) {
            f3 = f;
        }
        return mo5396N(view, f3, 1.0f);
    }

    /* renamed from: M */
    public final Animator mo5394M(ViewGroup viewGroup, View view, C7441q qVar) {
        float f;
        Float f2;
        C7444t.f22865a.getClass();
        if (qVar == null || (f2 = (Float) qVar.f22854a.get("android:fade:transitionAlpha")) == null) {
            f = 1.0f;
        } else {
            f = f2.floatValue();
        }
        return mo5396N(view, f, BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: N */
    public final ObjectAnimator mo5396N(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C7444t.m17083b(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C7444t.f22866b, new float[]{f2});
        ofFloat.addListener(new C1302a(view));
        mo5411a(new C1321b(view));
        return ofFloat;
    }

    /* renamed from: g */
    public final void mo5357g(C7441q qVar) {
        mo5437J(qVar);
        qVar.f22854a.put("android:fade:transitionAlpha", Float.valueOf(C7444t.f22865a.mo23700f(qVar.f22855b)));
    }

    public Fade() {
    }

    @SuppressLint({"RestrictedApi"})
    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7438n.f22845d);
        int c = C5256j.m13275c(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, this.f4976z);
        if ((c & -4) == 0) {
            this.f4976z = c;
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}
