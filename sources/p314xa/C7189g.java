package p314xa;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

/* renamed from: xa.g */
public final class C7189g extends DecoderInputBuffer {

    /* renamed from: j */
    public long f22312j;

    /* renamed from: k */
    public int f22313k;

    /* renamed from: l */
    public int f22314l = 32;

    public C7189g() {
        super(2);
    }

    /* renamed from: h */
    public final void mo15948h() {
        super.mo15948h();
        this.f22313k = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        if ((r0.remaining() + r3.position()) > 3072000) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo23495l(com.google.android.exoplayer2.decoder.DecoderInputBuffer r5) {
        /*
            r4 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            boolean r0 = r5.mo21174d(r0)
            r1 = 1
            r0 = r0 ^ r1
            p583jk.C17875h.m44301k(r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            boolean r0 = r5.mo21174d(r0)
            r0 = r0 ^ r1
            p583jk.C17875h.m44301k(r0)
            r0 = 4
            boolean r0 = r5.mo21174d(r0)
            r0 = r0 ^ r1
            p583jk.C17875h.m44301k(r0)
            int r0 = r4.f22313k
            r2 = 0
            if (r0 <= 0) goto L_0x0025
            r3 = 1
            goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            if (r3 != 0) goto L_0x0029
            goto L_0x0051
        L_0x0029:
            int r3 = r4.f22314l
            if (r0 < r3) goto L_0x002e
            goto L_0x004f
        L_0x002e:
            boolean r0 = r5.mo21175g()
            boolean r3 = r4.mo21175g()
            if (r0 == r3) goto L_0x0039
            goto L_0x004f
        L_0x0039:
            java.nio.ByteBuffer r0 = r5.f13647d
            if (r0 == 0) goto L_0x0051
            java.nio.ByteBuffer r3 = r4.f13647d
            if (r3 == 0) goto L_0x0051
            int r3 = r3.position()
            int r0 = r0.remaining()
            int r0 = r0 + r3
            r3 = 3072000(0x2ee000, float:4.304789E-39)
            if (r0 <= r3) goto L_0x0051
        L_0x004f:
            r0 = 0
            goto L_0x0052
        L_0x0051:
            r0 = 1
        L_0x0052:
            if (r0 != 0) goto L_0x0055
            return r2
        L_0x0055:
            int r0 = r4.f22313k
            int r2 = r0 + 1
            r4.f22313k = r2
            if (r0 != 0) goto L_0x0069
            long r2 = r5.f13649f
            r4.f13649f = r2
            boolean r0 = r5.mo21174d(r1)
            if (r0 == 0) goto L_0x0069
            r4.f17757b = r1
        L_0x0069:
            boolean r0 = r5.mo21175g()
            if (r0 == 0) goto L_0x0073
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4.f17757b = r0
        L_0x0073:
            java.nio.ByteBuffer r0 = r5.f13647d
            if (r0 == 0) goto L_0x0083
            int r2 = r0.remaining()
            r4.mo15950j(r2)
            java.nio.ByteBuffer r2 = r4.f13647d
            r2.put(r0)
        L_0x0083:
            long r2 = r5.f13649f
            r4.f22312j = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p314xa.C7189g.mo23495l(com.google.android.exoplayer2.decoder.DecoderInputBuffer):boolean");
    }
}
