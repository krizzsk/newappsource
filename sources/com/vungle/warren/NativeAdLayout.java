package com.vungle.warren;

import android.content.Context;
import android.content.IntentFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p130j2.C5367a;

public class NativeAdLayout extends FrameLayout {

    /* renamed from: b */
    public C23110d0 f58502b;

    /* renamed from: c */
    public final AtomicBoolean f58503c = new AtomicBoolean(false);

    /* renamed from: d */
    public final AtomicReference<Boolean> f58504d;

    /* renamed from: e */
    public boolean f58505e;

    /* renamed from: f */
    public Context f58506f;

    /* renamed from: com.vungle.warren.NativeAdLayout$a */
    public interface C23065a {
    }

    static {
        Class<NativeAdLayout> cls = NativeAdLayout.class;
    }

    public NativeAdLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new AtomicBoolean(false);
        this.f58504d = new AtomicReference<>();
        this.f58506f = context;
    }

    private void setAdVisibility(boolean z) {
        this.f58504d.set(Boolean.valueOf(z));
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hashCode();
        hashCode();
        this.f58502b = new C23110d0(this);
        C5367a.m13473a(this.f58506f).mo21146b(this.f58502b, new IntentFilter("AdvertisementBus"));
        hashCode();
        this.f58503c.set(true);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hashCode();
        hashCode();
        C5367a.m13473a(this.f58506f).mo21148d(this.f58502b);
    }

    public final void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        hashCode();
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        setAdVisibility(z);
    }

    public final void onWindowFocusChanged(boolean z) {
        hashCode();
        super.onWindowFocusChanged(z);
        setAdVisibility(z);
    }

    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        hashCode();
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        setAdVisibility(z);
    }

    public void setOnItemClickListener(C23065a aVar) {
    }

    public NativeAdLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new AtomicBoolean(false);
        this.f58504d = new AtomicReference<>();
        this.f58506f = context;
    }
}
