package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p114i.C5224j;
import p141k1.C5450a;
import p242s1.C6333d0;

/* renamed from: androidx.appcompat.widget.t */
public final class C0457t extends C0448q {

    /* renamed from: d */
    public final SeekBar f1614d;

    /* renamed from: e */
    public Drawable f1615e;

    /* renamed from: f */
    public ColorStateList f1616f = null;

    /* renamed from: g */
    public PorterDuff.Mode f1617g = null;

    /* renamed from: h */
    public boolean f1618h = false;

    /* renamed from: i */
    public boolean f1619i = false;

    public C0457t(SeekBar seekBar) {
        super(seekBar);
        this.f1614d = seekBar;
    }

    /* renamed from: a */
    public final void mo2179a(AttributeSet attributeSet, int i) {
        super.mo2179a(attributeSet, i);
        Context context = this.f1614d.getContext();
        int[] iArr = C5224j.AppCompatSeekBar;
        C0413h1 m = C0413h1.m1063m(context, attributeSet, iArr, i);
        SeekBar seekBar = this.f1614d;
        C6333d0.m15028p(seekBar, seekBar.getContext(), iArr, attributeSet, m.f1515b, i, 0);
        Drawable f = m.mo2092f(C5224j.AppCompatSeekBar_android_thumb);
        if (f != null) {
            this.f1614d.setThumb(f);
        }
        Drawable e = m.mo2091e(C5224j.AppCompatSeekBar_tickMark);
        Drawable drawable = this.f1615e;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.f1615e = e;
        if (e != null) {
            e.setCallback(this.f1614d);
            C5450a.m13600c(e, C6333d0.C6338e.m15063d(this.f1614d));
            if (e.isStateful()) {
                e.setState(this.f1614d.getDrawableState());
            }
            mo2182c();
        }
        this.f1614d.invalidate();
        int i2 = C5224j.AppCompatSeekBar_tickMarkTintMode;
        if (m.mo2098l(i2)) {
            this.f1617g = C0418j0.m1109c(m.mo2094h(i2, -1), this.f1617g);
            this.f1619i = true;
        }
        int i3 = C5224j.AppCompatSeekBar_tickMarkTint;
        if (m.mo2098l(i3)) {
            this.f1616f = m.mo2088b(i3);
            this.f1618h = true;
        }
        m.mo2099n();
        mo2182c();
    }

    /* renamed from: c */
    public final void mo2182c() {
        Drawable drawable = this.f1615e;
        if (drawable == null) {
            return;
        }
        if (this.f1618h || this.f1619i) {
            Drawable g = C5450a.m13604g(drawable.mutate());
            this.f1615e = g;
            if (this.f1618h) {
                C5450a.C5452b.m13617h(g, this.f1616f);
            }
            if (this.f1619i) {
                C5450a.C5452b.m13618i(this.f1615e, this.f1617g);
            }
            if (this.f1615e.isStateful()) {
                this.f1615e.setState(this.f1614d.getDrawableState());
            }
        }
    }

    /* renamed from: d */
    public final void mo2183d(Canvas canvas) {
        int i;
        if (this.f1615e != null) {
            int max = this.f1614d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1615e.getIntrinsicWidth();
                int intrinsicHeight = this.f1615e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i = intrinsicWidth / 2;
                } else {
                    i = 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.f1615e.setBounds(-i, -i2, i, i2);
                float width = ((float) ((this.f1614d.getWidth() - this.f1614d.getPaddingLeft()) - this.f1614d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1614d.getPaddingLeft(), (float) (this.f1614d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1615e.draw(canvas);
                    canvas.translate(width, BitmapDescriptorFactory.HUE_RED);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
