package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3304r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.a */
public abstract class C3311a implements C3321e {

    /* renamed from: a */
    public final C3304r f11881a;

    /* renamed from: b */
    public final int f11882b;

    /* renamed from: c */
    public final int[] f11883c;

    /* renamed from: d */
    public final C3226i[] f11884d;

    /* renamed from: e */
    public final long[] f11885e;

    /* renamed from: f */
    public int f11886f;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.a$b */
    public static final class C3313b implements Comparator<C3226i> {
        public C3313b() {
        }

        public int compare(Object obj, Object obj2) {
            return ((C3226i) obj2).f11629b - ((C3226i) obj).f11629b;
        }
    }

    public C3311a(C3304r rVar, int... iArr) {
        boolean z;
        int i = 0;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C3380a.m8507b(z);
        this.f11881a = (C3304r) C3380a.m8503a(rVar);
        int length = iArr.length;
        this.f11882b = length;
        this.f11884d = new C3226i[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f11884d[i2] = rVar.mo14431a(iArr[i2]);
        }
        Arrays.sort(this.f11884d, new C3313b());
        this.f11883c = new int[this.f11882b];
        while (true) {
            int i3 = this.f11882b;
            if (i < i3) {
                this.f11883c[i] = rVar.mo14430a(this.f11884d[i]);
                i++;
            } else {
                this.f11885e = new long[i3];
                return;
            }
        }
    }

    /* renamed from: a */
    public final C3226i mo14439a(int i) {
        return this.f11884d[i];
    }

    /* renamed from: b */
    public final C3304r mo14442b() {
        return this.f11881a;
    }

    /* renamed from: c */
    public final int mo14444c(int i) {
        for (int i2 = 0; i2 < this.f11882b; i2++) {
            if (this.f11883c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3311a aVar = (C3311a) obj;
        if (this.f11881a != aVar.f11881a || !Arrays.equals(this.f11883c, aVar.f11883c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final int mo14447f() {
        return this.f11883c.length;
    }

    public int hashCode() {
        if (this.f11886f == 0) {
            this.f11886f = Arrays.hashCode(this.f11883c) + (System.identityHashCode(this.f11881a) * 31);
        }
        return this.f11886f;
    }

    /* renamed from: a */
    public final int mo14438a(C3226i iVar) {
        for (int i = 0; i < this.f11882b; i++) {
            if (this.f11884d[i] == iVar) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo14441b(int i) {
        return this.f11883c[i];
    }

    /* renamed from: b */
    public final boolean mo14443b(int i, long j) {
        return this.f11885e[i] > j;
    }

    /* renamed from: c */
    public final C3226i mo14445c() {
        return this.f11884d[mo14130e()];
    }

    /* renamed from: a */
    public final int mo14437a() {
        return this.f11883c[mo14130e()];
    }

    /* renamed from: a */
    public final boolean mo14440a(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean b = mo14443b(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.f11882b && !b) {
            b = i2 != i && !mo14443b(i2, elapsedRealtime);
            i2++;
        }
        if (!b) {
            return false;
        }
        long[] jArr = this.f11885e;
        jArr[i] = Math.max(jArr[i], elapsedRealtime + j);
        return true;
    }
}
