package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;
import p099ga.C4949x0;
import p099ga.C4952y0;
import p099ga.C4954z0;
import p100gb.C4961b0;
import p277ub.C6791m;
import p431cy.C16525b;
import p583jk.C17875h;

/* renamed from: com.google.android.exoplayer2.a */
public abstract class C3873a implements C4949x0, C4952y0 {

    /* renamed from: b */
    public final int f13462b;

    /* renamed from: c */
    public final C16525b f13463c = new C16525b();

    /* renamed from: d */
    public C4954z0 f13464d;

    /* renamed from: e */
    public int f13465e;

    /* renamed from: f */
    public int f13466f;

    /* renamed from: g */
    public C4961b0 f13467g;

    /* renamed from: h */
    public Format[] f13468h;

    /* renamed from: i */
    public long f13469i;

    /* renamed from: j */
    public long f13470j = Long.MIN_VALUE;

    /* renamed from: k */
    public boolean f13471k;

    /* renamed from: l */
    public boolean f13472l;

    public C3873a(int i) {
        this.f13462b = i;
    }

    /* renamed from: A */
    public void mo15808A() {
    }

    /* renamed from: B */
    public void mo15809B() throws ExoPlaybackException {
    }

    /* renamed from: C */
    public void mo15810C() {
    }

    /* renamed from: D */
    public abstract void mo15811D(Format[] formatArr, long j, long j2) throws ExoPlaybackException;

    /* renamed from: E */
    public final int mo15812E(C16525b bVar, DecoderInputBuffer decoderInputBuffer, int i) {
        C4961b0 b0Var = this.f13467g;
        b0Var.getClass();
        int b = b0Var.mo20649b(bVar, decoderInputBuffer, i);
        if (b == -4) {
            if (decoderInputBuffer.mo21174d(4)) {
                this.f13470j = Long.MIN_VALUE;
                if (this.f13471k) {
                    return -4;
                }
                return -3;
            }
            long j = decoderInputBuffer.f13649f + this.f13469i;
            decoderInputBuffer.f13649f = j;
            this.f13470j = Math.max(this.f13470j, j);
        } else if (b == -5) {
            Format format = (Format) bVar.f43144b;
            format.getClass();
            if (format.f13422q != Long.MAX_VALUE) {
                Format.C3872b bVar2 = new Format.C3872b(format);
                bVar2.f13450o = format.f13422q + this.f13469i;
                bVar.f43144b = new Format(bVar2);
            }
        }
        return b;
    }

    /* renamed from: e */
    public final void mo15813e() {
        boolean z = true;
        if (this.f13466f != 1) {
            z = false;
        }
        C17875h.m44304o(z);
        C16525b bVar = this.f13463c;
        bVar.f43143a = null;
        bVar.f43144b = null;
        this.f13466f = 0;
        this.f13467g = null;
        this.f13468h = null;
        this.f13471k = false;
        mo15835x();
    }

    /* renamed from: f */
    public final C3873a mo15814f() {
        return this;
    }

    /* renamed from: g */
    public final C4961b0 mo15815g() {
        return this.f13467g;
    }

    public final int getState() {
        return this.f13466f;
    }

    /* renamed from: h */
    public final boolean mo15817h() {
        return this.f13470j == Long.MIN_VALUE;
    }

    /* renamed from: i */
    public final void mo15818i() {
        this.f13471k = true;
    }

    /* renamed from: j */
    public void mo15819j(int i, Object obj) throws ExoPlaybackException {
    }

    /* renamed from: k */
    public final void mo15820k() throws IOException {
        C4961b0 b0Var = this.f13467g;
        b0Var.getClass();
        b0Var.mo20648a();
    }

    /* renamed from: l */
    public final boolean mo15821l() {
        return this.f13471k;
    }

    /* renamed from: m */
    public final int mo15822m() {
        return this.f13462b;
    }

    /* renamed from: o */
    public /* synthetic */ void mo15823o(float f, float f2) {
    }

    /* renamed from: p */
    public int mo15824p() throws ExoPlaybackException {
        return 0;
    }

    /* renamed from: r */
    public final void mo15825r(C4954z0 z0Var, Format[] formatArr, C4961b0 b0Var, long j, boolean z, boolean z2, long j2, long j3) throws ExoPlaybackException {
        boolean z3;
        boolean z4 = z;
        if (this.f13466f == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C17875h.m44304o(z3);
        this.f13464d = z0Var;
        this.f13466f = 1;
        mo15836y(z, z2);
        mo15832u(formatArr, b0Var, j2, j3);
        long j4 = j;
        mo15837z(j, z);
    }

    public final void reset() {
        boolean z;
        if (this.f13466f == 0) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        C16525b bVar = this.f13463c;
        bVar.f43143a = null;
        bVar.f43144b = null;
        mo15808A();
    }

    /* renamed from: s */
    public final long mo15827s() {
        return this.f13470j;
    }

    public final void setIndex(int i) {
        this.f13465e = i;
    }

    public final void start() throws ExoPlaybackException {
        boolean z = true;
        if (this.f13466f != 1) {
            z = false;
        }
        C17875h.m44304o(z);
        this.f13466f = 2;
        mo15809B();
    }

    public final void stop() {
        boolean z;
        if (this.f13466f == 2) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        this.f13466f = 1;
        mo15810C();
    }

    /* renamed from: t */
    public final void mo15831t(long j) throws ExoPlaybackException {
        this.f13471k = false;
        this.f13470j = j;
        mo15837z(j, false);
    }

    /* renamed from: u */
    public final void mo15832u(Format[] formatArr, C4961b0 b0Var, long j, long j2) throws ExoPlaybackException {
        C17875h.m44304o(!this.f13471k);
        this.f13467g = b0Var;
        this.f13470j = j2;
        this.f13468h = formatArr;
        this.f13469i = j2;
        mo15811D(formatArr, j, j2);
    }

    /* renamed from: v */
    public C6791m mo15833v() {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0027  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.exoplayer2.ExoPlaybackException mo15834w(java.lang.Exception r12, com.google.android.exoplayer2.Format r13, boolean r14) {
        /*
            r11 = this;
            r0 = 4
            if (r13 == 0) goto L_0x001a
            boolean r1 = r11.f13472l
            if (r1 != 0) goto L_0x001a
            r1 = 1
            r11.f13472l = r1
            r1 = 0
            int r2 = r11.mo16040c(r13)     // Catch:{ ExoPlaybackException -> 0x0018, all -> 0x0014 }
            r2 = r2 & 7
            r11.f13472l = r1
            goto L_0x001b
        L_0x0014:
            r12 = move-exception
            r11.f13472l = r1
            throw r12
        L_0x0018:
            r11.f13472l = r1
        L_0x001a:
            r2 = 4
        L_0x001b:
            java.lang.String r6 = r11.getName()
            int r7 = r11.f13465e
            com.google.android.exoplayer2.ExoPlaybackException r1 = new com.google.android.exoplayer2.ExoPlaybackException
            if (r13 != 0) goto L_0x0027
            r9 = 4
            goto L_0x0028
        L_0x0027:
            r9 = r2
        L_0x0028:
            r4 = 1
            r3 = r1
            r5 = r12
            r8 = r13
            r10 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C3873a.mo15834w(java.lang.Exception, com.google.android.exoplayer2.Format, boolean):com.google.android.exoplayer2.ExoPlaybackException");
    }

    /* renamed from: x */
    public abstract void mo15835x();

    /* renamed from: y */
    public void mo15836y(boolean z, boolean z2) throws ExoPlaybackException {
    }

    /* renamed from: z */
    public abstract void mo15837z(long j, boolean z) throws ExoPlaybackException;
}
