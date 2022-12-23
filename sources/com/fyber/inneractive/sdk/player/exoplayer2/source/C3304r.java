package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.r */
public final class C3304r {

    /* renamed from: a */
    public final int f11871a;

    /* renamed from: b */
    public final C3226i[] f11872b;

    /* renamed from: c */
    public int f11873c;

    public C3304r(C3226i... iVarArr) {
        boolean z;
        if (iVarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C3380a.m8507b(z);
        this.f11872b = iVarArr;
        this.f11871a = iVarArr.length;
    }

    /* renamed from: a */
    public C3226i mo14431a(int i) {
        return this.f11872b[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3304r.class != obj.getClass()) {
            return false;
        }
        C3304r rVar = (C3304r) obj;
        if (this.f11871a != rVar.f11871a || !Arrays.equals(this.f11872b, rVar.f11872b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.f11873c == 0) {
            this.f11873c = Arrays.hashCode(this.f11872b) + 527;
        }
        return this.f11873c;
    }

    /* renamed from: a */
    public int mo14430a(C3226i iVar) {
        int i = 0;
        while (true) {
            C3226i[] iVarArr = this.f11872b;
            if (i >= iVarArr.length) {
                return -1;
            }
            if (iVar == iVarArr[i]) {
                return i;
            }
            i++;
        }
    }
}
