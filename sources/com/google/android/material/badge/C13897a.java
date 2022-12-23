package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.C14071j;
import com.google.android.material.internal.C14077m;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p355ac.C13401b;
import p355ac.C13403d;
import p355ac.C13409j;
import p355ac.C13410k;
import p742qc.C19100d;
import p811tc.C19648g;

/* renamed from: com.google.android.material.badge.a */
public final class C13897a extends Drawable implements C14071j.C14073b {

    /* renamed from: o */
    public static final int f34263o = C13410k.Widget_MaterialComponents_Badge;

    /* renamed from: p */
    public static final int f34264p = C13401b.badgeStyle;

    /* renamed from: b */
    public final WeakReference<Context> f34265b;

    /* renamed from: c */
    public final C19648g f34266c;

    /* renamed from: d */
    public final C14071j f34267d;

    /* renamed from: e */
    public final Rect f34268e = new Rect();

    /* renamed from: f */
    public final BadgeState f34269f;

    /* renamed from: g */
    public float f34270g;

    /* renamed from: h */
    public float f34271h;

    /* renamed from: i */
    public int f34272i;

    /* renamed from: j */
    public float f34273j;

    /* renamed from: k */
    public float f34274k;

    /* renamed from: l */
    public float f34275l;

    /* renamed from: m */
    public WeakReference<View> f34276m;

    /* renamed from: n */
    public WeakReference<FrameLayout> f34277n;

    public C13897a(Context context, BadgeState.State state) {
        FrameLayout frameLayout;
        C19100d dVar;
        Context context2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.f34265b = weakReference;
        C14077m.m35059c(context, C14077m.f35106b, "Theme.MaterialComponents");
        C19648g gVar = new C19648g();
        this.f34266c = gVar;
        C14071j jVar = new C14071j(this);
        this.f34267d = jVar;
        jVar.f35097a.setTextAlign(Paint.Align.CENTER);
        int i = C13410k.TextAppearance_MaterialComponents_Badge;
        Context context3 = weakReference.get();
        if (!(context3 == null || jVar.f35102f == (dVar = new C19100d(context3, i)) || (context2 = weakReference.get()) == null)) {
            jVar.mo41883b(dVar, context2);
            mo40994h();
        }
        BadgeState badgeState = new BadgeState(context, state);
        this.f34269f = badgeState;
        this.f34272i = ((int) Math.pow(10.0d, ((double) badgeState.f34241b.f34250g) - 1.0d)) - 1;
        jVar.f35100d = true;
        mo40994h();
        invalidateSelf();
        jVar.f35100d = true;
        mo40994h();
        invalidateSelf();
        jVar.f35097a.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(badgeState.f34241b.f34246c.intValue());
        if (gVar.f49837b.f49863c != valueOf) {
            gVar.mo52005n(valueOf);
            invalidateSelf();
        }
        jVar.f35097a.setColor(badgeState.f34241b.f34247d.intValue());
        invalidateSelf();
        WeakReference<View> weakReference2 = this.f34276m;
        if (!(weakReference2 == null || weakReference2.get() == null)) {
            View view = this.f34276m.get();
            WeakReference<FrameLayout> weakReference3 = this.f34277n;
            if (weakReference3 != null) {
                frameLayout = weakReference3.get();
            } else {
                frameLayout = null;
            }
            mo40989g(view, frameLayout);
        }
        mo40994h();
        setVisible(badgeState.f34241b.f34256m.booleanValue(), false);
    }

    /* renamed from: a */
    public final void mo40982a() {
        invalidateSelf();
    }

    /* renamed from: b */
    public final String mo40983b() {
        if (mo40987e() <= this.f34272i) {
            return NumberFormat.getInstance(this.f34269f.f34241b.f34251h).format((long) mo40987e());
        }
        Context context = this.f34265b.get();
        if (context == null) {
            return "";
        }
        return String.format(this.f34269f.f34241b.f34251h, context.getString(C13409j.mtrl_exceed_max_badge_number_suffix), new Object[]{Integer.valueOf(this.f34272i), "+"});
    }

    /* renamed from: c */
    public final CharSequence mo40984c() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!mo40988f()) {
            return this.f34269f.f34241b.f34252i;
        }
        if (this.f34269f.f34241b.f34253j == 0 || (context = this.f34265b.get()) == null) {
            return null;
        }
        int e = mo40987e();
        int i = this.f34272i;
        if (e <= i) {
            return context.getResources().getQuantityString(this.f34269f.f34241b.f34253j, mo40987e(), new Object[]{Integer.valueOf(mo40987e())});
        }
        return context.getString(this.f34269f.f34241b.f34254k, new Object[]{Integer.valueOf(i)});
    }

    /* renamed from: d */
    public final FrameLayout mo40985d() {
        WeakReference<FrameLayout> weakReference = this.f34277n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f34266c.draw(canvas);
            if (mo40988f()) {
                Rect rect = new Rect();
                String b = mo40983b();
                this.f34267d.f35097a.getTextBounds(b, 0, b.length(), rect);
                canvas.drawText(b, this.f34270g, this.f34271h + ((float) (rect.height() / 2)), this.f34267d.f35097a);
            }
        }
    }

    /* renamed from: e */
    public final int mo40987e() {
        if (mo40988f()) {
            return this.f34269f.f34241b.f34249f;
        }
        return 0;
    }

    /* renamed from: f */
    public final boolean mo40988f() {
        if (this.f34269f.f34241b.f34249f != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo40989g(View view, FrameLayout frameLayout) {
        this.f34276m = new WeakReference<>(view);
        this.f34277n = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        mo40994h();
        invalidateSelf();
    }

    public final int getAlpha() {
        return this.f34269f.f34241b.f34248e;
    }

    public final int getIntrinsicHeight() {
        return this.f34268e.height();
    }

    public final int getIntrinsicWidth() {
        return this.f34268e.width();
    }

    public final int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public final void mo40994h() {
        View view;
        int i;
        int i2;
        int i3;
        float f;
        float f2;
        float f3;
        Context context = this.f34265b.get();
        WeakReference<View> weakReference = this.f34276m;
        FrameLayout frameLayout = null;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f34268e);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference2 = this.f34277n;
            if (weakReference2 != null) {
                frameLayout = weakReference2.get();
            }
            if (frameLayout != null) {
                frameLayout.offsetDescendantRectToMyCoords(view, rect2);
            }
            if (mo40988f()) {
                i = this.f34269f.f34241b.f34260q.intValue();
            } else {
                i = this.f34269f.f34241b.f34258o.intValue();
            }
            int intValue = this.f34269f.f34241b.f34262s.intValue() + i;
            int intValue2 = this.f34269f.f34241b.f34255l.intValue();
            if (intValue2 == 8388691 || intValue2 == 8388693) {
                this.f34271h = (float) (rect2.bottom - intValue);
            } else {
                this.f34271h = (float) (rect2.top + intValue);
            }
            if (mo40987e() <= 9) {
                if (!mo40988f()) {
                    f3 = this.f34269f.f34242c;
                } else {
                    f3 = this.f34269f.f34243d;
                }
                this.f34273j = f3;
                this.f34275l = f3;
                this.f34274k = f3;
            } else {
                float f4 = this.f34269f.f34243d;
                this.f34273j = f4;
                this.f34275l = f4;
                this.f34274k = (this.f34267d.mo41882a(mo40983b()) / 2.0f) + this.f34269f.f34244e;
            }
            Resources resources = context.getResources();
            if (mo40988f()) {
                i2 = C13403d.mtrl_badge_text_horizontal_edge_offset;
            } else {
                i2 = C13403d.mtrl_badge_horizontal_edge_offset;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i2);
            if (mo40988f()) {
                i3 = this.f34269f.f34241b.f34259p.intValue();
            } else {
                i3 = this.f34269f.f34241b.f34257n.intValue();
            }
            int intValue3 = this.f34269f.f34241b.f34261r.intValue() + i3;
            int intValue4 = this.f34269f.f34241b.f34255l.intValue();
            if (intValue4 == 8388659 || intValue4 == 8388691) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                if (C6333d0.C6338e.m15063d(view) == 0) {
                    f = (((float) rect2.left) - this.f34274k) + ((float) dimensionPixelSize) + ((float) intValue3);
                } else {
                    f = ((((float) rect2.right) + this.f34274k) - ((float) dimensionPixelSize)) - ((float) intValue3);
                }
                this.f34270g = f;
            } else {
                WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
                if (C6333d0.C6338e.m15063d(view) == 0) {
                    f2 = ((((float) rect2.right) + this.f34274k) - ((float) dimensionPixelSize)) - ((float) intValue3);
                } else {
                    f2 = (((float) rect2.left) - this.f34274k) + ((float) dimensionPixelSize) + ((float) intValue3);
                }
                this.f34270g = f2;
            }
            Rect rect3 = this.f34268e;
            float f5 = this.f34270g;
            float f6 = this.f34271h;
            float f7 = this.f34274k;
            float f8 = this.f34275l;
            rect3.set((int) (f5 - f7), (int) (f6 - f8), (int) (f5 + f7), (int) (f6 + f8));
            C19648g gVar = this.f34266c;
            gVar.setShapeAppearanceModel(gVar.f49837b.f49861a.mo52021g(this.f34273j));
            if (!rect.equals(this.f34268e)) {
                this.f34266c.setBounds(this.f34268e);
            }
        }
    }

    public final boolean isStateful() {
        return false;
    }

    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public final void setAlpha(int i) {
        BadgeState badgeState = this.f34269f;
        badgeState.f34240a.f34248e = i;
        badgeState.f34241b.f34248e = i;
        this.f34267d.f35097a.setAlpha(getAlpha());
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
