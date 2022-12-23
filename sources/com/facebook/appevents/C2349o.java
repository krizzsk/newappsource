package com.facebook.appevents;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;

/* renamed from: com.facebook.appevents.o */
public final class C2349o {

    /* renamed from: a */
    public int f8561a;

    /* renamed from: b */
    public Serializable f8562b;

    /* JADX WARNING: type inference failed for: r2v2, types: [int[], java.io.Serializable] */
    public C2349o(int i) {
        if (i != 1) {
            this.f8562b = FlushResult.SUCCESS;
        } else {
            this.f8562b = new int[10];
        }
    }

    /* renamed from: a */
    public final int mo12501a() {
        if ((this.f8561a & RecyclerView.C1119a0.FLAG_IGNORE) != 0) {
            return ((int[]) this.f8562b)[7];
        }
        return 65535;
    }

    /* renamed from: b */
    public final void mo12502b(int i, int i2) {
        if (i >= 0) {
            int[] iArr = (int[]) this.f8562b;
            if (i < iArr.length) {
                this.f8561a = (1 << i) | this.f8561a;
                iArr[i] = i2;
            }
        }
    }
}
