package com.fyber.inneractive.sdk.util;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.fyber.inneractive.sdk.util.h0 */
public class C3697h0 {

    /* renamed from: a */
    public transient C3698a[] f12873a;

    /* renamed from: b */
    public transient int f12874b;

    /* renamed from: c */
    public int f12875c;

    /* renamed from: com.fyber.inneractive.sdk.util.h0$a */
    public static class C3698a {

        /* renamed from: a */
        public int f12876a;

        /* renamed from: b */
        public Object f12877b;

        /* renamed from: c */
        public C3698a f12878c;

        public C3698a(int i, int i2, Object obj, C3698a aVar) {
            this.f12876a = i;
            this.f12877b = obj;
            this.f12878c = aVar;
        }
    }

    public C3697h0() {
        this(20, 0.75f);
    }

    public C3697h0(int i, float f) {
        if (i < 0) {
            throw new IllegalArgumentException(C16759e.m42349e("Illegal Capacity: ", i));
        } else if (f > BitmapDescriptorFactory.HUE_RED) {
            i = i == 0 ? 1 : i;
            this.f12873a = new C3698a[i];
            this.f12875c = (int) (((float) i) * f);
        } else {
            throw new IllegalArgumentException("Illegal Load: " + f);
        }
    }
}
