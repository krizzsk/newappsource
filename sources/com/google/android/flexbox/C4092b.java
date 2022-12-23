package com.google.android.flexbox;

import android.view.View;
import java.util.ArrayList;

/* renamed from: com.google.android.flexbox.b */
public final class C4092b {

    /* renamed from: a */
    public int f14759a = Integer.MAX_VALUE;

    /* renamed from: b */
    public int f14760b = Integer.MAX_VALUE;

    /* renamed from: c */
    public int f14761c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f14762d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f14763e;

    /* renamed from: f */
    public int f14764f;

    /* renamed from: g */
    public int f14765g;

    /* renamed from: h */
    public int f14766h;

    /* renamed from: i */
    public int f14767i;

    /* renamed from: j */
    public float f14768j;

    /* renamed from: k */
    public float f14769k;

    /* renamed from: l */
    public int f14770l;

    /* renamed from: m */
    public int f14771m;

    /* renamed from: n */
    public ArrayList f14772n = new ArrayList();

    /* renamed from: o */
    public int f14773o;

    /* renamed from: p */
    public int f14774p;

    /* renamed from: q */
    public boolean f14775q;

    /* renamed from: r */
    public boolean f14776r;

    /* renamed from: a */
    public final void mo16865a(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f14759a = Math.min(this.f14759a, (view.getLeft() - flexItem.mo16765v1()) - i);
        this.f14760b = Math.min(this.f14760b, (view.getTop() - flexItem.mo16760m0()) - i2);
        this.f14761c = Math.max(this.f14761c, view.getRight() + flexItem.mo16750Q1() + i3);
        this.f14762d = Math.max(this.f14762d, view.getBottom() + flexItem.mo16763s1() + i4);
    }
}
