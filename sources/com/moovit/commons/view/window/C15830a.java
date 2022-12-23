package com.moovit.commons.view.window;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import ce0.C21100e;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.moovit.commons.view.window.C15830a.C15831a;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p242s1.C6391t;
import p304x.C7038d0;
import p622kz.C18165g;

/* renamed from: com.moovit.commons.view.window.a */
public final class C15830a<V extends View & C15831a<V>> implements View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final V f41318b;

    /* renamed from: c */
    public final Drawable f41319c;

    /* renamed from: d */
    public Rect f41320d = null;

    /* renamed from: e */
    public final Rect f41321e = new Rect();

    /* renamed from: f */
    public final boolean f41322f;

    /* renamed from: com.moovit.commons.view.window.a$a */
    public interface C15831a<V extends View & C15831a<V>> {
        /* renamed from: a */
        void mo47376a();

        C15830a<V> getScrimInsetsLayout();
    }

    /* JADX INFO: finally extract failed */
    public C15830a(V v, Context context, AttributeSet attributeSet, int i) {
        C21100e.m49373x(v, Promotion.ACTION_VIEW);
        this.f41318b = v;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C18165g.ScrimInsetsLayout, i, 0);
        try {
            this.f41319c = obtainStyledAttributes.getDrawable(C18165g.ScrimInsetsLayout_insetsForeground);
            this.f41322f = obtainStyledAttributes.getBoolean(C18165g.ScrimInsetsLayout_setInsetsAsPadding, false);
            obtainStyledAttributes.recycle();
            v.setWillNotDraw(true);
            v.addOnAttachStateChangeListener(this);
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            mo47387b(C6333d0.C6337d.m15042b(v));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo47386a(Canvas canvas) {
        if (this.f41320d != null && this.f41319c != null) {
            int width = this.f41318b.getWidth();
            int height = this.f41318b.getHeight();
            int save = canvas.save();
            canvas.translate((float) this.f41318b.getScrollX(), (float) this.f41318b.getScrollY());
            this.f41321e.set(0, 0, width, this.f41320d.top);
            this.f41319c.setBounds(this.f41321e);
            this.f41319c.draw(canvas);
            this.f41321e.set(0, height - this.f41320d.bottom, width, height);
            this.f41319c.setBounds(this.f41321e);
            this.f41319c.draw(canvas);
            Rect rect = this.f41321e;
            Rect rect2 = this.f41320d;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f41319c.setBounds(this.f41321e);
            this.f41319c.draw(canvas);
            Rect rect3 = this.f41321e;
            Rect rect4 = this.f41320d;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f41319c.setBounds(this.f41321e);
            this.f41319c.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: b */
    public final void mo47387b(boolean z) {
        if (z) {
            V v = this.f41318b;
            C7038d0 d0Var = new C7038d0(this, 17);
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6342i.m15104u(v, d0Var);
            this.f41318b.setSystemUiVisibility(1280);
            if (this.f41320d == null && C6333d0.C6340g.m15075b(this.f41318b)) {
                C6333d0.C6341h.m15083c(this.f41318b);
                return;
            }
            return;
        }
        V v2 = this.f41318b;
        WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
        C6333d0.C6342i.m15104u(v2, (C6391t) null);
        this.f41320d = null;
    }

    public final void onViewAttachedToWindow(View view) {
        if (this.f41320d == null) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (C6333d0.C6337d.m15042b(view)) {
                C6333d0.C6341h.m15083c(view);
            }
        }
        Drawable drawable = this.f41319c;
        if (drawable != null) {
            drawable.setCallback(view);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        Drawable drawable = this.f41319c;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }
}
