package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import p129j1.C5349b;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p242s1.C6391t;
import p242s1.C6396v0;
import p355ac.C13410k;
import p355ac.C13411l;

public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: b */
    public Drawable f34954b;

    /* renamed from: c */
    public Rect f34955c;

    /* renamed from: d */
    public Rect f34956d;

    /* renamed from: e */
    public boolean f34957e;

    /* renamed from: f */
    public boolean f34958f;

    /* renamed from: com.google.android.material.internal.ScrimInsetsFrameLayout$a */
    public class C14043a implements C6391t {
        public C14043a() {
        }

        public final C6396v0 onApplyWindowInsets(View view, C6396v0 v0Var) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f34955c == null) {
                scrimInsetsFrameLayout.f34955c = new Rect();
            }
            ScrimInsetsFrameLayout.this.f34955c.set(v0Var.mo22504c(), v0Var.mo22506e(), v0Var.mo22505d(), v0Var.mo22503b());
            ScrimInsetsFrameLayout.this.mo41843a(v0Var);
            ScrimInsetsFrameLayout scrimInsetsFrameLayout2 = ScrimInsetsFrameLayout.this;
            boolean z = true;
            if ((!v0Var.f20044a.mo22518j().equals(C5349b.f17645e)) && ScrimInsetsFrameLayout.this.f34954b != null) {
                z = false;
            }
            scrimInsetsFrameLayout2.setWillNotDraw(z);
            ScrimInsetsFrameLayout scrimInsetsFrameLayout3 = ScrimInsetsFrameLayout.this;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15051k(scrimInsetsFrameLayout3);
            return v0Var.f20044a.mo22526c();
        }
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo41843a(C6396v0 v0Var) {
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f34955c != null && this.f34954b != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (this.f34957e) {
                this.f34956d.set(0, 0, width, this.f34955c.top);
                this.f34954b.setBounds(this.f34956d);
                this.f34954b.draw(canvas);
            }
            if (this.f34958f) {
                this.f34956d.set(0, height - this.f34955c.bottom, width, height);
                this.f34954b.setBounds(this.f34956d);
                this.f34954b.draw(canvas);
            }
            Rect rect = this.f34956d;
            Rect rect2 = this.f34955c;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f34954b.setBounds(this.f34956d);
            this.f34954b.draw(canvas);
            Rect rect3 = this.f34956d;
            Rect rect4 = this.f34955c;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f34954b.setBounds(this.f34956d);
            this.f34954b.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f34954b;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f34954b;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f34958f = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f34957e = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f34954b = drawable;
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34956d = new Rect();
        this.f34957e = true;
        this.f34958f = true;
        TypedArray d = C14077m.m35060d(context, attributeSet, C13411l.ScrimInsetsFrameLayout, i, C13410k.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f34954b = d.getDrawable(C13411l.ScrimInsetsFrameLayout_insetForeground);
        d.recycle();
        setWillNotDraw(true);
        C14043a aVar = new C14043a();
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6342i.m15104u(this, aVar);
    }
}
