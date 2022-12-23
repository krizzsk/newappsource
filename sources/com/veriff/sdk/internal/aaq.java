package com.veriff.sdk.internal;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

public final class aaq {

    /* renamed from: a */
    private int f53498a;

    /* renamed from: b */
    private final int[] f53499b = new int[10];

    /* renamed from: a */
    public void mo53779a() {
        this.f53498a = 0;
        Arrays.fill(this.f53499b, 0);
    }

    /* renamed from: b */
    public int mo53783b(int i) {
        return this.f53499b[i];
    }

    /* renamed from: c */
    public int mo53784c() {
        if ((this.f53498a & 2) != 0) {
            return this.f53499b[1];
        }
        return -1;
    }

    /* renamed from: d */
    public int mo53787d(int i) {
        return (this.f53498a & 32) != 0 ? this.f53499b[5] : i;
    }

    /* renamed from: b */
    public int mo53782b() {
        return Integer.bitCount(this.f53498a);
    }

    /* renamed from: c */
    public int mo53785c(int i) {
        return (this.f53498a & 16) != 0 ? this.f53499b[4] : i;
    }

    /* renamed from: d */
    public int mo53786d() {
        if ((this.f53498a & RecyclerView.C1119a0.FLAG_IGNORE) != 0) {
            return this.f53499b[7];
        }
        return 65535;
    }

    /* renamed from: a */
    public aaq mo53778a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f53499b;
            if (i < iArr.length) {
                this.f53498a = (1 << i) | this.f53498a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* renamed from: a */
    public boolean mo53781a(int i) {
        return ((1 << i) & this.f53498a) != 0;
    }

    /* renamed from: a */
    public void mo53780a(aaq aaq) {
        for (int i = 0; i < 10; i++) {
            if (aaq.mo53781a(i)) {
                mo53778a(i, aaq.mo53783b(i));
            }
        }
    }
}
