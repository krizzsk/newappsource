package com.fyber.inneractive.sdk.player.p050ui;

import android.view.TextureView;
import android.view.View;
import com.fyber.inneractive.sdk.util.C3727s;
import java.lang.ref.WeakReference;

/* renamed from: com.fyber.inneractive.sdk.player.ui.e */
public class C3453e extends TextureView {

    /* renamed from: a */
    public WeakReference<C3457i> f12323a;

    public C3453e(C3457i iVar) {
        super(iVar.getContext());
        this.f12323a = new WeakReference<>(iVar);
    }

    public void onMeasure(int i, int i2) {
        C3457i iVar = (C3457i) C3727s.m9987a(this.f12323a);
        if (iVar != null) {
            i = View.MeasureSpec.makeMeasureSpec(iVar.f12326B.f12915a, 1073741824);
            i2 = View.MeasureSpec.makeMeasureSpec(iVar.f12326B.f12916b, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
