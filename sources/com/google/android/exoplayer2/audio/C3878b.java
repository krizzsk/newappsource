package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.exoplayer2.audio.C3882e;
import java.lang.reflect.Method;
import p125ia.C5324k;
import p277ub.C6774a0;

/* renamed from: com.google.android.exoplayer2.audio.b */
public final class C3878b {

    /* renamed from: A */
    public long f13481A;

    /* renamed from: B */
    public long f13482B;

    /* renamed from: C */
    public long f13483C;

    /* renamed from: D */
    public boolean f13484D;

    /* renamed from: E */
    public long f13485E;

    /* renamed from: F */
    public long f13486F;

    /* renamed from: a */
    public final C3879a f13487a;

    /* renamed from: b */
    public final long[] f13488b;

    /* renamed from: c */
    public AudioTrack f13489c;

    /* renamed from: d */
    public int f13490d;

    /* renamed from: e */
    public int f13491e;

    /* renamed from: f */
    public C5324k f13492f;

    /* renamed from: g */
    public int f13493g;

    /* renamed from: h */
    public boolean f13494h;

    /* renamed from: i */
    public long f13495i;

    /* renamed from: j */
    public float f13496j;

    /* renamed from: k */
    public boolean f13497k;

    /* renamed from: l */
    public long f13498l;

    /* renamed from: m */
    public long f13499m;

    /* renamed from: n */
    public Method f13500n;

    /* renamed from: o */
    public long f13501o;

    /* renamed from: p */
    public boolean f13502p;

    /* renamed from: q */
    public boolean f13503q;

    /* renamed from: r */
    public long f13504r;

    /* renamed from: s */
    public long f13505s;

    /* renamed from: t */
    public long f13506t;

    /* renamed from: u */
    public long f13507u;

    /* renamed from: v */
    public int f13508v;

    /* renamed from: w */
    public int f13509w;

    /* renamed from: x */
    public long f13510x;

    /* renamed from: y */
    public long f13511y;

    /* renamed from: z */
    public long f13512z;

    /* renamed from: com.google.android.exoplayer2.audio.b$a */
    public interface C3879a {
        /* renamed from: a */
        void mo15884a(int i, long j);

        /* renamed from: b */
        void mo15885b(long j);

        /* renamed from: c */
        void mo15886c(long j, long j2, long j3, long j4);

        /* renamed from: d */
        void mo15887d(long j, long j2, long j3, long j4);

        /* renamed from: e */
        void mo15888e();
    }

    public C3878b(C3882e.C3889g gVar) {
        this.f13487a = gVar;
        if (C6774a0.f20959a >= 18) {
            try {
                this.f13500n = AudioTrack.class.getMethod("getLatency", (Class[]) null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f13488b = new long[10];
    }

    /* renamed from: a */
    public final long mo15881a() {
        AudioTrack audioTrack = this.f13489c;
        audioTrack.getClass();
        if (this.f13510x != -9223372036854775807L) {
            return Math.min(this.f13481A, this.f13512z + ((((SystemClock.elapsedRealtime() * 1000) - this.f13510x) * ((long) this.f13493g)) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = 4294967295L & ((long) audioTrack.getPlaybackHeadPosition());
        if (this.f13494h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f13507u = this.f13505s;
            }
            playbackHeadPosition += this.f13507u;
        }
        if (C6774a0.f20959a <= 29) {
            if (playbackHeadPosition == 0 && this.f13505s > 0 && playState == 3) {
                if (this.f13511y == -9223372036854775807L) {
                    this.f13511y = SystemClock.elapsedRealtime();
                }
                return this.f13505s;
            }
            this.f13511y = -9223372036854775807L;
        }
        if (this.f13505s > playbackHeadPosition) {
            this.f13506t++;
        }
        this.f13505s = playbackHeadPosition;
        return playbackHeadPosition + (this.f13506t << 32);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo15882b(long r6) {
        /*
            r5 = this;
            long r0 = r5.mo15881a()
            r2 = 0
            r3 = 1
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x0029
            boolean r6 = r5.f13494h
            if (r6 == 0) goto L_0x0026
            android.media.AudioTrack r6 = r5.f13489c
            r6.getClass()
            int r6 = r6.getPlayState()
            r7 = 2
            if (r6 != r7) goto L_0x0026
            long r6 = r5.mo15881a()
            r0 = 0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x0026
            r6 = 1
            goto L_0x0027
        L_0x0026:
            r6 = 0
        L_0x0027:
            if (r6 == 0) goto L_0x002a
        L_0x0029:
            r2 = 1
        L_0x002a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C3878b.mo15882b(long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r5 != false) goto L_0x002a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15883c(android.media.AudioTrack r4, boolean r5, int r6, int r7, int r8) {
        /*
            r3 = this;
            r3.f13489c = r4
            r3.f13490d = r7
            r3.f13491e = r8
            ia.k r0 = new ia.k
            r0.<init>(r4)
            r3.f13492f = r0
            int r4 = r4.getSampleRate()
            r3.f13493g = r4
            r4 = 1
            r0 = 0
            if (r5 == 0) goto L_0x0029
            int r5 = p277ub.C6774a0.f20959a
            r1 = 23
            if (r5 >= r1) goto L_0x0025
            r5 = 5
            if (r6 == r5) goto L_0x0023
            r5 = 6
            if (r6 != r5) goto L_0x0025
        L_0x0023:
            r5 = 1
            goto L_0x0026
        L_0x0025:
            r5 = 0
        L_0x0026:
            if (r5 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r4 = 0
        L_0x002a:
            r3.f13494h = r4
            boolean r4 = p277ub.C6774a0.m15963w(r6)
            r3.f13503q = r4
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x0045
            int r8 = r8 / r7
            long r7 = (long) r8
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r7 * r1
            int r4 = r3.f13493g
            long r1 = (long) r4
            long r7 = r7 / r1
            goto L_0x0046
        L_0x0045:
            r7 = r5
        L_0x0046:
            r3.f13495i = r7
            r7 = 0
            r3.f13505s = r7
            r3.f13506t = r7
            r3.f13507u = r7
            r3.f13502p = r0
            r3.f13510x = r5
            r3.f13511y = r5
            r3.f13504r = r7
            r3.f13501o = r7
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.f13496j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.C3878b.mo15883c(android.media.AudioTrack, boolean, int, int, int):void");
    }
}
