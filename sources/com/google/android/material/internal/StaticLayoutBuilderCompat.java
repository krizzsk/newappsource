package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.StaticLayout$Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Constructor;

public final class StaticLayoutBuilderCompat {

    /* renamed from: m */
    public static final int f34960m = (Build.VERSION.SDK_INT >= 23 ? 1 : 0);

    /* renamed from: n */
    public static boolean f34961n;

    /* renamed from: o */
    public static Constructor<StaticLayout> f34962o;

    /* renamed from: p */
    public static TextDirectionHeuristic f34963p;

    /* renamed from: a */
    public CharSequence f34964a;

    /* renamed from: b */
    public final TextPaint f34965b;

    /* renamed from: c */
    public final int f34966c;

    /* renamed from: d */
    public int f34967d;

    /* renamed from: e */
    public Layout.Alignment f34968e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f */
    public int f34969f = Integer.MAX_VALUE;

    /* renamed from: g */
    public float f34970g = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: h */
    public float f34971h = 1.0f;

    /* renamed from: i */
    public int f34972i = f34960m;

    /* renamed from: j */
    public boolean f34973j = true;

    /* renamed from: k */
    public boolean f34974k;

    /* renamed from: l */
    public TextUtils.TruncateAt f34975l = null;

    public static class StaticLayoutBuilderCompatException extends Exception {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public StaticLayoutBuilderCompatException(java.lang.Exception r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Error thrown initializing StaticLayout "
                java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException.<init>(java.lang.Exception):void");
        }
    }

    public StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f34964a = charSequence;
        this.f34965b = textPaint;
        this.f34966c = i;
        this.f34967d = charSequence.length();
    }

    /* renamed from: a */
    public final StaticLayout mo41850a() throws StaticLayoutBuilderCompatException {
        boolean z;
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2;
        if (this.f34964a == null) {
            this.f34964a = "";
        }
        int max = Math.max(0, this.f34966c);
        CharSequence charSequence = this.f34964a;
        if (this.f34969f == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f34965b, (float) max, this.f34975l);
        }
        int min = Math.min(charSequence.length(), this.f34967d);
        this.f34967d = min;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            if (this.f34974k && this.f34969f == 1) {
                this.f34968e = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout$Builder obtain = StaticLayout$Builder.obtain(charSequence, 0, min, this.f34965b, max);
            obtain.setAlignment(this.f34968e);
            obtain.setIncludePad(this.f34973j);
            if (this.f34974k) {
                textDirectionHeuristic2 = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic2 = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirectionHeuristic2);
            TextUtils.TruncateAt truncateAt = this.f34975l;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f34969f);
            float f = this.f34970g;
            if (!(f == BitmapDescriptorFactory.HUE_RED && this.f34971h == 1.0f)) {
                obtain.setLineSpacing(f, this.f34971h);
            }
            if (this.f34969f > 1) {
                obtain.setHyphenationFrequency(this.f34972i);
            }
            return obtain.build();
        }
        if (!f34961n) {
            try {
                if (!this.f34974k || i < 23) {
                    z = false;
                } else {
                    z = true;
                }
                Class<TextDirectionHeuristic> cls = TextDirectionHeuristic.class;
                if (z) {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                }
                f34963p = textDirectionHeuristic;
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2});
                f34962o = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f34961n = true;
            } catch (Exception e) {
                throw new StaticLayoutBuilderCompatException(e);
            }
        }
        try {
            Constructor<StaticLayout> constructor = f34962o;
            constructor.getClass();
            TextDirectionHeuristic textDirectionHeuristic3 = f34963p;
            textDirectionHeuristic3.getClass();
            return constructor.newInstance(new Object[]{charSequence, 0, Integer.valueOf(this.f34967d), this.f34965b, Integer.valueOf(max), this.f34968e, textDirectionHeuristic3, Float.valueOf(1.0f), Float.valueOf(BitmapDescriptorFactory.HUE_RED), Boolean.valueOf(this.f34973j), null, Integer.valueOf(max), Integer.valueOf(this.f34969f)});
        } catch (Exception e2) {
            throw new StaticLayoutBuilderCompatException(e2);
        }
    }
}
