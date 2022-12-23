package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.play.core.assetpacks.C14256d1;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p355ac.C13401b;
import p811tc.C19648g;
import p811tc.C19654k;
import p811tc.C19666o;

/* renamed from: com.google.android.material.button.a */
public final class C13935a {

    /* renamed from: t */
    public static final boolean f34469t = true;

    /* renamed from: u */
    public static final boolean f34470u;

    /* renamed from: a */
    public final MaterialButton f34471a;

    /* renamed from: b */
    public C19654k f34472b;

    /* renamed from: c */
    public int f34473c;

    /* renamed from: d */
    public int f34474d;

    /* renamed from: e */
    public int f34475e;

    /* renamed from: f */
    public int f34476f;

    /* renamed from: g */
    public int f34477g;

    /* renamed from: h */
    public int f34478h;

    /* renamed from: i */
    public PorterDuff.Mode f34479i;

    /* renamed from: j */
    public ColorStateList f34480j;

    /* renamed from: k */
    public ColorStateList f34481k;

    /* renamed from: l */
    public ColorStateList f34482l;

    /* renamed from: m */
    public Drawable f34483m;

    /* renamed from: n */
    public boolean f34484n = false;

    /* renamed from: o */
    public boolean f34485o = false;

    /* renamed from: p */
    public boolean f34486p = false;

    /* renamed from: q */
    public boolean f34487q;

    /* renamed from: r */
    public LayerDrawable f34488r;

    /* renamed from: s */
    public int f34489s;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i > 22) {
            z = false;
        }
        f34470u = z;
    }

    public C13935a(MaterialButton materialButton, C19654k kVar) {
        this.f34471a = materialButton;
        this.f34472b = kVar;
    }

    /* renamed from: a */
    public final C19666o mo41164a() {
        LayerDrawable layerDrawable = this.f34488r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f34488r.getNumberOfLayers() > 2) {
            return (C19666o) this.f34488r.getDrawable(2);
        }
        return (C19666o) this.f34488r.getDrawable(1);
    }

    /* renamed from: b */
    public final C19648g mo41165b(boolean z) {
        LayerDrawable layerDrawable = this.f34488r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f34469t) {
            return (C19648g) ((LayerDrawable) ((InsetDrawable) this.f34488r.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
        }
        return (C19648g) this.f34488r.getDrawable(z ^ true ? 1 : 0);
    }

    /* renamed from: c */
    public final void mo41166c(C19654k kVar) {
        this.f34472b = kVar;
        if (!f34470u || this.f34485o) {
            if (mo41165b(false) != null) {
                mo41165b(false).setShapeAppearanceModel(kVar);
            }
            if (mo41165b(true) != null) {
                mo41165b(true).setShapeAppearanceModel(kVar);
            }
            if (mo41164a() != null) {
                mo41164a().setShapeAppearanceModel(kVar);
                return;
            }
            return;
        }
        MaterialButton materialButton = this.f34471a;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        int f = C6333d0.C6338e.m15065f(materialButton);
        int paddingTop = this.f34471a.getPaddingTop();
        int e = C6333d0.C6338e.m15064e(this.f34471a);
        int paddingBottom = this.f34471a.getPaddingBottom();
        mo41168e();
        C6333d0.C6338e.m15070k(this.f34471a, f, paddingTop, e, paddingBottom);
    }

    /* renamed from: d */
    public final void mo41167d(int i, int i2) {
        MaterialButton materialButton = this.f34471a;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        int f = C6333d0.C6338e.m15065f(materialButton);
        int paddingTop = this.f34471a.getPaddingTop();
        int e = C6333d0.C6338e.m15064e(this.f34471a);
        int paddingBottom = this.f34471a.getPaddingBottom();
        int i3 = this.f34475e;
        int i4 = this.f34476f;
        this.f34476f = i2;
        this.f34475e = i;
        if (!this.f34485o) {
            mo41168e();
        }
        C6333d0.C6338e.m15070k(this.f34471a, f, (paddingTop + i) - i3, e, (paddingBottom + i2) - i4);
    }

    /* JADX WARNING: type inference failed for: r4v11, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo41168e() {
        /*
            r14 = this;
            com.google.android.material.button.MaterialButton r0 = r14.f34471a
            tc.g r1 = new tc.g
            tc.k r2 = r14.f34472b
            r1.<init>((p811tc.C19654k) r2)
            com.google.android.material.button.MaterialButton r2 = r14.f34471a
            android.content.Context r2 = r2.getContext()
            r1.mo52001k(r2)
            android.content.res.ColorStateList r2 = r14.f34480j
            p141k1.C5450a.C5452b.m13617h(r1, r2)
            android.graphics.PorterDuff$Mode r2 = r14.f34479i
            if (r2 == 0) goto L_0x001e
            p141k1.C5450a.C5452b.m13618i(r1, r2)
        L_0x001e:
            int r2 = r14.f34478h
            float r2 = (float) r2
            android.content.res.ColorStateList r3 = r14.f34481k
            tc.g$b r4 = r1.f49837b
            r4.f49871k = r2
            r1.invalidateSelf()
            r1.mo52011s(r3)
            tc.g r2 = new tc.g
            tc.k r3 = r14.f34472b
            r2.<init>((p811tc.C19654k) r3)
            r3 = 0
            r2.setTint(r3)
            int r4 = r14.f34478h
            float r4 = (float) r4
            boolean r5 = r14.f34484n
            if (r5 == 0) goto L_0x0048
            com.google.android.material.button.MaterialButton r5 = r14.f34471a
            int r6 = p355ac.C13401b.colorSurface
            int r5 = com.google.android.play.core.assetpacks.C14256d1.m35485c(r6, r5)
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            tc.g$b r6 = r2.f49837b
            r6.f49871k = r4
            r2.invalidateSelf()
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r5)
            r2.mo52011s(r4)
            boolean r4 = f34469t
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0093
            tc.g r4 = new tc.g
            tc.k r7 = r14.f34472b
            r4.<init>((p811tc.C19654k) r7)
            r14.f34483m = r4
            r7 = -1
            p141k1.C5450a.C5452b.m13616g(r4, r7)
            android.graphics.drawable.RippleDrawable r4 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r7 = r14.f34482l
            android.content.res.ColorStateList r7 = p763rc.C19252b.m46506c(r7)
            android.graphics.drawable.LayerDrawable r9 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r5 = new android.graphics.drawable.Drawable[r5]
            r5[r3] = r2
            r5[r6] = r1
            r9.<init>(r5)
            android.graphics.drawable.InsetDrawable r1 = new android.graphics.drawable.InsetDrawable
            int r10 = r14.f34473c
            int r11 = r14.f34475e
            int r12 = r14.f34474d
            int r13 = r14.f34476f
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            android.graphics.drawable.Drawable r2 = r14.f34483m
            r4.<init>(r7, r1, r2)
            r14.f34488r = r4
            goto L_0x00c5
        L_0x0093:
            rc.a r4 = new rc.a
            tc.k r7 = r14.f34472b
            r4.<init>((p811tc.C19654k) r7)
            r14.f34483m = r4
            android.content.res.ColorStateList r7 = r14.f34482l
            android.content.res.ColorStateList r7 = p763rc.C19252b.m46506c(r7)
            p141k1.C5450a.C5452b.m13617h(r4, r7)
            android.graphics.drawable.LayerDrawable r9 = new android.graphics.drawable.LayerDrawable
            r4 = 3
            android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[r4]
            r4[r3] = r2
            r4[r6] = r1
            android.graphics.drawable.Drawable r1 = r14.f34483m
            r4[r5] = r1
            r9.<init>(r4)
            r14.f34488r = r9
            android.graphics.drawable.InsetDrawable r4 = new android.graphics.drawable.InsetDrawable
            int r10 = r14.f34473c
            int r11 = r14.f34475e
            int r12 = r14.f34474d
            int r13 = r14.f34476f
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x00c5:
            r0.setInternalBackground(r4)
            tc.g r0 = r14.mo41165b(r3)
            if (r0 == 0) goto L_0x00d4
            int r1 = r14.f34489s
            float r1 = (float) r1
            r0.mo52003m(r1)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.C13935a.mo41168e():void");
    }

    /* renamed from: f */
    public final void mo41169f() {
        int i = 0;
        C19648g b = mo41165b(false);
        C19648g b2 = mo41165b(true);
        if (b != null) {
            ColorStateList colorStateList = this.f34481k;
            b.f49837b.f49871k = (float) this.f34478h;
            b.invalidateSelf();
            b.mo52011s(colorStateList);
            if (b2 != null) {
                float f = (float) this.f34478h;
                if (this.f34484n) {
                    i = C14256d1.m35485c(C13401b.colorSurface, this.f34471a);
                }
                b2.f49837b.f49871k = f;
                b2.invalidateSelf();
                b2.mo52011s(ColorStateList.valueOf(i));
            }
        }
    }
}
