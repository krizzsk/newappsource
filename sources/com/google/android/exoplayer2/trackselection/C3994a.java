package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.trackselection.C3997b;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import p252sb.C6502b;
import p265tb.C6647c;

/* renamed from: com.google.android.exoplayer2.trackselection.a */
public final class C3994a extends C6502b {

    /* renamed from: com.google.android.exoplayer2.trackselection.a$a */
    public static final class C3995a {

        /* renamed from: a */
        public final long f14140a;

        /* renamed from: b */
        public final long f14141b;

        public C3995a(long j, long j2) {
            this.f14140a = j;
            this.f14141b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3995a)) {
                return false;
            }
            C3995a aVar = (C3995a) obj;
            if (this.f14140a == aVar.f14140a && this.f14141b == aVar.f14141b) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((int) this.f14140a) * 31) + ((int) this.f14141b);
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.a$b */
    public static class C3996b implements C3997b.C3999b {
    }

    public C3994a(TrackGroup trackGroup, int[] iArr, int i, C6647c cVar, ImmutableList immutableList) {
        super(trackGroup, iArr);
        ImmutableList.m35691z(immutableList);
    }

    /* renamed from: m */
    public static void m10684m(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ImmutableList.C14367a aVar = (ImmutableList.C14367a) arrayList.get(i);
            if (aVar != null) {
                aVar.mo43128b(new C3995a(j, jArr[i]));
            }
        }
    }

    /* renamed from: e */
    public final void mo16331e() {
    }

    /* renamed from: f */
    public final void mo16332f() {
    }

    /* renamed from: g */
    public final void mo16333g() {
    }

    /* renamed from: i */
    public final void mo16334i() {
    }
}
