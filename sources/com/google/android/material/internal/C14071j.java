package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import ci0.C21211f;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import p742qc.C19100d;

/* renamed from: com.google.android.material.internal.j */
public final class C14071j {

    /* renamed from: a */
    public final TextPaint f35097a = new TextPaint(1);

    /* renamed from: b */
    public final C14072a f35098b = new C14072a();

    /* renamed from: c */
    public float f35099c;

    /* renamed from: d */
    public boolean f35100d = true;

    /* renamed from: e */
    public WeakReference<C14073b> f35101e = new WeakReference<>((Object) null);

    /* renamed from: f */
    public C19100d f35102f;

    /* renamed from: com.google.android.material.internal.j$a */
    public class C14072a extends C21211f {
        public C14072a() {
        }

        /* renamed from: s */
        public final void mo41361s(int i) {
            C14071j jVar = C14071j.this;
            jVar.f35100d = true;
            C14073b bVar = jVar.f35101e.get();
            if (bVar != null) {
                bVar.mo40982a();
            }
        }

        /* renamed from: t */
        public final void mo41362t(Typeface typeface, boolean z) {
            if (!z) {
                C14071j jVar = C14071j.this;
                jVar.f35100d = true;
                C14073b bVar = jVar.f35101e.get();
                if (bVar != null) {
                    bVar.mo40982a();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.internal.j$b */
    public interface C14073b {
        /* renamed from: a */
        void mo40982a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C14071j(C14073b bVar) {
        this.f35101e = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public final float mo41882a(String str) {
        float f;
        if (!this.f35100d) {
            return this.f35099c;
        }
        if (str == null) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = this.f35097a.measureText(str, 0, str.length());
        }
        this.f35099c = f;
        this.f35100d = false;
        return f;
    }

    /* renamed from: b */
    public final void mo41883b(C19100d dVar, Context context) {
        if (this.f35102f != dVar) {
            this.f35102f = dVar;
            if (dVar != null) {
                dVar.mo51532f(context, this.f35097a, this.f35098b);
                C14073b bVar = this.f35101e.get();
                if (bVar != null) {
                    this.f35097a.drawableState = bVar.getState();
                }
                dVar.mo51531e(context, this.f35097a, this.f35098b);
                this.f35100d = true;
            }
            C14073b bVar2 = this.f35101e.get();
            if (bVar2 != null) {
                bVar2.mo40982a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}
