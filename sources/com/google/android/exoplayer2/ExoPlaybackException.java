package com.google.android.exoplayer2;

import java.io.IOException;
import p100gb.C4986n;
import p100gb.C4987o;
import p277ub.C6774a0;
import p583jk.C17875h;

public final class ExoPlaybackException extends Exception {
    private final Throwable cause;
    public final boolean isRecoverable;
    public final C4986n mediaPeriodId;
    public final Format rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;
    public final long timestampMs;
    public final int type;

    public ExoPlaybackException(int i, Throwable th) {
        this(i, th, (String) null, -1, (Format) null, 4, false);
    }

    /* renamed from: a */
    public final ExoPlaybackException mo15793a(C4987o.C4988a aVar) {
        String message = getMessage();
        int i = C6774a0.f20959a;
        return new ExoPlaybackException(message, this.cause, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, aVar, this.timestampMs, this.isRecoverable);
    }

    /* renamed from: b */
    public final Exception mo15794b() {
        boolean z = true;
        if (this.type != 1) {
            z = false;
        }
        C17875h.m44304o(z);
        Throwable th = this.cause;
        th.getClass();
        return (Exception) th;
    }

    /* renamed from: c */
    public final IOException mo15795c() {
        boolean z;
        if (this.type == 0) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        Throwable th = this.cause;
        th.getClass();
        return (IOException) th;
    }

    /* renamed from: d */
    public final RuntimeException mo15796d() {
        boolean z;
        if (this.type == 2) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        Throwable th = this.cause;
        th.getClass();
        return (RuntimeException) th;
    }

    public ExoPlaybackException(String str, Throwable th, int i, String str2, int i2, Format format, int i3, C4987o.C4988a aVar, long j, boolean z) {
        super(str, th);
        boolean z2 = true;
        if (z && i != 1) {
            z2 = false;
        }
        C17875h.m44301k(z2);
        this.type = i;
        this.cause = th;
        this.rendererName = str2;
        this.rendererIndex = i2;
        this.rendererFormat = format;
        this.rendererFormatSupport = i3;
        this.mediaPeriodId = aVar;
        this.timestampMs = j;
        this.isRecoverable = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExoPlaybackException(int r13, java.lang.Throwable r14, java.lang.String r15, int r16, com.google.android.exoplayer2.Format r17, int r18, boolean r19) {
        /*
            r12 = this;
            r3 = r13
            r4 = r15
            r7 = r18
            r0 = 2
            if (r3 == 0) goto L_0x0068
            r1 = 3
            r2 = 1
            if (r3 == r2) goto L_0x0015
            if (r3 == r1) goto L_0x0010
            java.lang.String r1 = "Unexpected runtime error"
            goto L_0x0012
        L_0x0010:
            java.lang.String r1 = "Remote error"
        L_0x0012:
            r8 = r16
            goto L_0x006c
        L_0x0015:
            java.lang.String r5 = java.lang.String.valueOf(r17)
            java.util.UUID r6 = p099ga.C4883f.f16441a
            if (r7 == 0) goto L_0x0038
            if (r7 == r2) goto L_0x0035
            if (r7 == r0) goto L_0x0032
            if (r7 == r1) goto L_0x002f
            r1 = 4
            if (r7 != r1) goto L_0x0029
            java.lang.String r1 = "YES"
            goto L_0x003a
        L_0x0029:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x002f:
            java.lang.String r1 = "NO_EXCEEDS_CAPABILITIES"
            goto L_0x003a
        L_0x0032:
            java.lang.String r1 = "NO_UNSUPPORTED_DRM"
            goto L_0x003a
        L_0x0035:
            java.lang.String r1 = "NO_UNSUPPORTED_TYPE"
            goto L_0x003a
        L_0x0038:
            java.lang.String r1 = "NO"
        L_0x003a:
            r2 = 53
            int r2 = p001a0.C0016g.m25h(r15, r2)
            int r6 = r5.length()
            int r6 = r6 + r2
            int r2 = r1.length()
            int r2 = r2 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r2)
            r6.append(r15)
            java.lang.String r2 = " error, index="
            r6.append(r2)
            r8 = r16
            r6.append(r8)
            java.lang.String r2 = ", format="
            r6.append(r2)
            java.lang.String r2 = ", format_supported="
            java.lang.String r1 = p379.C13715c.m34245k(r6, r5, r2, r1)
            goto L_0x006c
        L_0x0068:
            r8 = r16
            java.lang.String r1 = "Source error"
        L_0x006c:
            r2 = 0
            boolean r5 = android.text.TextUtils.isEmpty(r2)
            if (r5 != 0) goto L_0x008a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r5 = r1.length()
            int r5 = r5 + r0
            java.lang.String r0 = "null"
            int r0 = r0.length()
            int r0 = r0 + r5
            java.lang.String r5 = ": "
            java.lang.String r0 = p379.C25541a.m63875e(r0, r1, r5, r2)
            r1 = r0
        L_0x008a:
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r12
            r2 = r14
            r3 = r13
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r9
            r9 = r10
            r11 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlaybackException.<init>(int, java.lang.Throwable, java.lang.String, int, com.google.android.exoplayer2.Format, int, boolean):void");
    }
}
