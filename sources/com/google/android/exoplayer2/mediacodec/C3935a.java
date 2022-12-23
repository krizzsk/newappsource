package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.appcompat.widget.C0436m1;
import com.google.android.exoplayer2.mediacodec.C3937b;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Objects;
import p137ja.C5410b;
import p277ub.C6774a0;
import p304x.C7078n;
import p314xa.C7182a;
import p314xa.C7183b;
import p314xa.C7184c;
import p314xa.C7185d;
import p314xa.C7186e;
import p314xa.C7188f;
import p583jk.C17875h;
import p624ld.C18198i;

/* renamed from: com.google.android.exoplayer2.mediacodec.a */
public final class C3935a implements C3937b {

    /* renamed from: a */
    public final MediaCodec f13838a;

    /* renamed from: b */
    public final C7188f f13839b;

    /* renamed from: c */
    public final C7186e f13840c;

    /* renamed from: d */
    public final boolean f13841d;

    /* renamed from: e */
    public boolean f13842e;

    /* renamed from: f */
    public int f13843f = 0;

    /* renamed from: com.google.android.exoplayer2.mediacodec.a$a */
    public static final class C3936a implements C3937b.C3939b {

        /* renamed from: b */
        public final C18198i<HandlerThread> f13844b;

        /* renamed from: c */
        public final C18198i<HandlerThread> f13845c;

        /* renamed from: d */
        public final boolean f13846d;

        /* renamed from: e */
        public final boolean f13847e;

        public C3936a(int i, boolean z, boolean z2) {
            C7183b bVar = new C7183b(i);
            C7184c cVar = new C7184c(i);
            this.f13844b = bVar;
            this.f13845c = cVar;
            this.f13846d = z;
            this.f13847e = z2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x008e  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.google.android.exoplayer2.mediacodec.C3935a mo16076a(com.google.android.exoplayer2.mediacodec.C3937b.C3938a r10) throws java.io.IOException {
            /*
                r9 = this;
                com.google.android.exoplayer2.mediacodec.c r0 = r10.f13848a
                java.lang.String r0 = r0.f13853a
                r1 = 0
                java.lang.String r2 = "createCodec:"
                java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0084 }
                int r4 = r3.length()     // Catch:{ Exception -> 0x0084 }
                if (r4 == 0) goto L_0x0016
                java.lang.String r2 = r2.concat(r3)     // Catch:{ Exception -> 0x0084 }
                goto L_0x001c
            L_0x0016:
                java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x0084 }
                r3.<init>(r2)     // Catch:{ Exception -> 0x0084 }
                r2 = r3
            L_0x001c:
                p583jk.C17884p.m44368g(r2)     // Catch:{ Exception -> 0x0084 }
                android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x0084 }
                com.google.android.exoplayer2.mediacodec.a r2 = new com.google.android.exoplayer2.mediacodec.a     // Catch:{ Exception -> 0x0082 }
                ld.i<android.os.HandlerThread> r3 = r9.f13844b     // Catch:{ Exception -> 0x0082 }
                java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x0082 }
                r5 = r3
                android.os.HandlerThread r5 = (android.os.HandlerThread) r5     // Catch:{ Exception -> 0x0082 }
                ld.i<android.os.HandlerThread> r3 = r9.f13845c     // Catch:{ Exception -> 0x0082 }
                java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x0082 }
                r6 = r3
                android.os.HandlerThread r6 = (android.os.HandlerThread) r6     // Catch:{ Exception -> 0x0082 }
                boolean r7 = r9.f13846d     // Catch:{ Exception -> 0x0082 }
                boolean r8 = r9.f13847e     // Catch:{ Exception -> 0x0082 }
                r3 = r2
                r4 = r0
                r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0082 }
                p583jk.C17884p.m44382v()     // Catch:{ Exception -> 0x007f }
                java.lang.String r1 = "configureCodec"
                p583jk.C17884p.m44368g(r1)     // Catch:{ Exception -> 0x007f }
                android.media.MediaFormat r1 = r10.f13849b     // Catch:{ Exception -> 0x007f }
                android.view.Surface r3 = r10.f13850c     // Catch:{ Exception -> 0x007f }
                android.media.MediaCrypto r10 = r10.f13851d     // Catch:{ Exception -> 0x007f }
                r4 = 0
                com.google.android.exoplayer2.mediacodec.C3935a.m10555n(r2, r1, r3, r10, r4)     // Catch:{ Exception -> 0x007f }
                p583jk.C17884p.m44382v()     // Catch:{ Exception -> 0x007f }
                java.lang.String r10 = "startCodec"
                p583jk.C17884p.m44368g(r10)     // Catch:{ Exception -> 0x007f }
                xa.e r10 = r2.f13840c     // Catch:{ Exception -> 0x007f }
                boolean r1 = r10.f22292g     // Catch:{ Exception -> 0x007f }
                if (r1 != 0) goto L_0x0075
                android.os.HandlerThread r1 = r10.f22287b     // Catch:{ Exception -> 0x007f }
                r1.start()     // Catch:{ Exception -> 0x007f }
                xa.d r1 = new xa.d     // Catch:{ Exception -> 0x007f }
                android.os.HandlerThread r3 = r10.f22287b     // Catch:{ Exception -> 0x007f }
                android.os.Looper r3 = r3.getLooper()     // Catch:{ Exception -> 0x007f }
                r1.<init>(r10, r3)     // Catch:{ Exception -> 0x007f }
                r10.f22288c = r1     // Catch:{ Exception -> 0x007f }
                r1 = 1
                r10.f22292g = r1     // Catch:{ Exception -> 0x007f }
            L_0x0075:
                r0.start()     // Catch:{ Exception -> 0x007f }
                r10 = 2
                r2.f13843f = r10     // Catch:{ Exception -> 0x007f }
                p583jk.C17884p.m44382v()     // Catch:{ Exception -> 0x007f }
                return r2
            L_0x007f:
                r10 = move-exception
                r1 = r2
                goto L_0x0086
            L_0x0082:
                r10 = move-exception
                goto L_0x0086
            L_0x0084:
                r10 = move-exception
                r0 = r1
            L_0x0086:
                if (r1 != 0) goto L_0x008e
                if (r0 == 0) goto L_0x0091
                r0.release()
                goto L_0x0091
            L_0x008e:
                r1.release()
            L_0x0091:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.C3935a.C3936a.mo16076a(com.google.android.exoplayer2.mediacodec.b$a):com.google.android.exoplayer2.mediacodec.a");
        }
    }

    public C3935a(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, boolean z2) {
        this.f13838a = mediaCodec;
        this.f13839b = new C7188f(handlerThread);
        this.f13840c = new C7186e(mediaCodec, handlerThread2, z);
        this.f13841d = z2;
    }

    /* renamed from: n */
    public static void m10555n(C3935a aVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        boolean z;
        C7188f fVar = aVar.f13839b;
        MediaCodec mediaCodec = aVar.f13838a;
        if (fVar.f22301c == null) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        fVar.f22300b.start();
        Handler handler = new Handler(fVar.f22300b.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.f22301c = handler;
        aVar.f13838a.configure(mediaFormat, surface, mediaCrypto, i);
        aVar.f13843f = 1;
    }

    /* renamed from: o */
    public static String m10556o(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final MediaFormat mo16060a() {
        MediaFormat mediaFormat;
        C7188f fVar = this.f13839b;
        synchronized (fVar.f22299a) {
            mediaFormat = fVar.f22306h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* renamed from: b */
    public final void mo16061b(int i, C5410b bVar, long j) {
        this.f13840c.mo23489b(i, bVar, j);
    }

    /* renamed from: c */
    public final void mo16062c(C3937b.C3940c cVar, Handler handler) {
        mo16074p();
        this.f13838a.setOnFrameRenderedListener(new C7182a(this, cVar), handler);
    }

    /* renamed from: d */
    public final void mo16063d(int i) {
        mo16074p();
        this.f13838a.setVideoScalingMode(i);
    }

    /* renamed from: e */
    public final ByteBuffer mo16064e(int i) {
        return this.f13838a.getInputBuffer(i);
    }

    /* renamed from: f */
    public final void mo16065f(Surface surface) {
        mo16074p();
        this.f13838a.setOutputSurface(surface);
    }

    public final void flush() {
        this.f13840c.mo23488a();
        this.f13838a.flush();
        C7188f fVar = this.f13839b;
        MediaCodec mediaCodec = this.f13838a;
        Objects.requireNonNull(mediaCodec);
        C0436m1 m1Var = new C0436m1(mediaCodec, 9);
        synchronized (fVar.f22299a) {
            fVar.f22309k++;
            Handler handler = fVar.f22301c;
            int i = C6774a0.f20959a;
            handler.post(new C7078n(7, fVar, m1Var));
        }
    }

    /* renamed from: g */
    public final void mo16067g(Bundle bundle) {
        mo16074p();
        this.f13838a.setParameters(bundle);
    }

    /* renamed from: h */
    public final void mo16068h(int i, long j) {
        this.f13838a.releaseOutputBuffer(i, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001a A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001c  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16069i() {
        /*
            r9 = this;
            xa.f r0 = r9.f13839b
            java.lang.Object r1 = r0.f22299a
            monitor-enter(r1)
            long r2 = r0.f22309k     // Catch:{ all -> 0x0051 }
            r4 = 0
            r6 = 0
            r7 = 1
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 > 0) goto L_0x0016
            boolean r2 = r0.f22310l     // Catch:{ all -> 0x0051 }
            if (r2 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r2 = 0
            goto L_0x0017
        L_0x0016:
            r2 = 1
        L_0x0017:
            r3 = -1
            if (r2 == 0) goto L_0x001c
            monitor-exit(r1)     // Catch:{ all -> 0x0051 }
            goto L_0x0042
        L_0x001c:
            java.lang.IllegalStateException r2 = r0.f22311m     // Catch:{ all -> 0x0051 }
            r4 = 0
            if (r2 != 0) goto L_0x004c
            android.media.MediaCodec$CodecException r2 = r0.f22308j     // Catch:{ all -> 0x0051 }
            if (r2 != 0) goto L_0x0049
            ub.h r0 = r0.f22302d     // Catch:{ all -> 0x0051 }
            int r2 = r0.f20983c     // Catch:{ all -> 0x0051 }
            if (r2 != 0) goto L_0x002c
            r6 = 1
        L_0x002c:
            if (r6 == 0) goto L_0x002f
            goto L_0x0041
        L_0x002f:
            if (r2 == 0) goto L_0x0043
            int[] r4 = r0.f20984d     // Catch:{ all -> 0x0051 }
            int r5 = r0.f20981a     // Catch:{ all -> 0x0051 }
            r4 = r4[r5]     // Catch:{ all -> 0x0051 }
            int r5 = r5 + r7
            int r6 = r0.f20985e     // Catch:{ all -> 0x0051 }
            r5 = r5 & r6
            r0.f20981a = r5     // Catch:{ all -> 0x0051 }
            int r2 = r2 + r3
            r0.f20983c = r2     // Catch:{ all -> 0x0051 }
            r3 = r4
        L_0x0041:
            monitor-exit(r1)     // Catch:{ all -> 0x0051 }
        L_0x0042:
            return r3
        L_0x0043:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0051 }
            r0.<init>()     // Catch:{ all -> 0x0051 }
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0049:
            r0.f22308j = r4     // Catch:{ all -> 0x0051 }
            throw r2     // Catch:{ all -> 0x0051 }
        L_0x004c:
            r0.f22311m = r4     // Catch:{ all -> 0x0051 }
            throw r2     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r1)     // Catch:{ all -> 0x0051 }
            throw r0
        L_0x0051:
            r0 = move-exception
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.C3935a.mo16069i():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001a A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001c  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo16070j(android.media.MediaCodec.BufferInfo r13) {
        /*
            r12 = this;
            xa.f r0 = r12.f13839b
            java.lang.Object r1 = r0.f22299a
            monitor-enter(r1)
            long r2 = r0.f22309k     // Catch:{ all -> 0x007b }
            r4 = 0
            r6 = 0
            r7 = 1
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 > 0) goto L_0x0016
            boolean r2 = r0.f22310l     // Catch:{ all -> 0x007b }
            if (r2 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r2 = 0
            goto L_0x0017
        L_0x0016:
            r2 = 1
        L_0x0017:
            r3 = -1
            if (r2 == 0) goto L_0x001c
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            goto L_0x006c
        L_0x001c:
            java.lang.IllegalStateException r2 = r0.f22311m     // Catch:{ all -> 0x007b }
            r4 = 0
            if (r2 != 0) goto L_0x0076
            android.media.MediaCodec$CodecException r2 = r0.f22308j     // Catch:{ all -> 0x007b }
            if (r2 != 0) goto L_0x0073
            ub.h r2 = r0.f22303e     // Catch:{ all -> 0x007b }
            int r4 = r2.f20983c     // Catch:{ all -> 0x007b }
            if (r4 != 0) goto L_0x002c
            r6 = 1
        L_0x002c:
            if (r6 == 0) goto L_0x0030
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            goto L_0x006c
        L_0x0030:
            if (r4 == 0) goto L_0x006d
            int[] r5 = r2.f20984d     // Catch:{ all -> 0x007b }
            int r6 = r2.f20981a     // Catch:{ all -> 0x007b }
            r5 = r5[r6]     // Catch:{ all -> 0x007b }
            int r6 = r6 + r7
            int r7 = r2.f20985e     // Catch:{ all -> 0x007b }
            r6 = r6 & r7
            r2.f20981a = r6     // Catch:{ all -> 0x007b }
            int r4 = r4 + r3
            r2.f20983c = r4     // Catch:{ all -> 0x007b }
            if (r5 < 0) goto L_0x005d
            android.media.MediaFormat r2 = r0.f22306h     // Catch:{ all -> 0x007b }
            p583jk.C17875h.m44306q(r2)     // Catch:{ all -> 0x007b }
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r0 = r0.f22304f     // Catch:{ all -> 0x007b }
            java.lang.Object r0 = r0.remove()     // Catch:{ all -> 0x007b }
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch:{ all -> 0x007b }
            int r7 = r0.offset     // Catch:{ all -> 0x007b }
            int r8 = r0.size     // Catch:{ all -> 0x007b }
            long r9 = r0.presentationTimeUs     // Catch:{ all -> 0x007b }
            int r11 = r0.flags     // Catch:{ all -> 0x007b }
            r6 = r13
            r6.set(r7, r8, r9, r11)     // Catch:{ all -> 0x007b }
            goto L_0x006a
        L_0x005d:
            r13 = -2
            if (r5 != r13) goto L_0x006a
            java.util.ArrayDeque<android.media.MediaFormat> r13 = r0.f22305g     // Catch:{ all -> 0x007b }
            java.lang.Object r13 = r13.remove()     // Catch:{ all -> 0x007b }
            android.media.MediaFormat r13 = (android.media.MediaFormat) r13     // Catch:{ all -> 0x007b }
            r0.f22306h = r13     // Catch:{ all -> 0x007b }
        L_0x006a:
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            r3 = r5
        L_0x006c:
            return r3
        L_0x006d:
            java.util.NoSuchElementException r13 = new java.util.NoSuchElementException     // Catch:{ all -> 0x007b }
            r13.<init>()     // Catch:{ all -> 0x007b }
            throw r13     // Catch:{ all -> 0x007b }
        L_0x0073:
            r0.f22308j = r4     // Catch:{ all -> 0x007b }
            throw r2     // Catch:{ all -> 0x007b }
        L_0x0076:
            r0.f22311m = r4     // Catch:{ all -> 0x007b }
            throw r2     // Catch:{ all -> 0x007b }
        L_0x0079:
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            throw r13
        L_0x007b:
            r13 = move-exception
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.C3935a.mo16070j(android.media.MediaCodec$BufferInfo):int");
    }

    /* renamed from: k */
    public final void mo16071k(int i, int i2, int i3, long j) {
        C7186e.C7187a aVar;
        C7186e eVar = this.f13840c;
        RuntimeException andSet = eVar.f22289d.getAndSet((Object) null);
        if (andSet == null) {
            ArrayDeque<C7186e.C7187a> arrayDeque = C7186e.f22284h;
            synchronized (arrayDeque) {
                if (arrayDeque.isEmpty()) {
                    aVar = new C7186e.C7187a();
                } else {
                    aVar = arrayDeque.removeFirst();
                }
            }
            aVar.f22293a = i;
            aVar.f22294b = 0;
            aVar.f22295c = i2;
            aVar.f22297e = j;
            aVar.f22298f = i3;
            C7185d dVar = eVar.f22288c;
            int i4 = C6774a0.f20959a;
            dVar.obtainMessage(0, aVar).sendToTarget();
            return;
        }
        throw andSet;
    }

    /* renamed from: l */
    public final void mo16072l(int i, boolean z) {
        this.f13838a.releaseOutputBuffer(i, z);
    }

    /* renamed from: m */
    public final ByteBuffer mo16073m(int i) {
        return this.f13838a.getOutputBuffer(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x002d, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0039, code lost:
        throw new java.lang.IllegalStateException(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16074p() {
        /*
            r3 = this;
            boolean r0 = r3.f13841d
            if (r0 == 0) goto L_0x003a
            xa.e r0 = r3.f13840c     // Catch:{ InterruptedException -> 0x002c }
            bh0.a r1 = r0.f22290e     // Catch:{ InterruptedException -> 0x002c }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x002c }
            r2 = 0
            r1.f52862b = r2     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)     // Catch:{ InterruptedException -> 0x002c }
            xa.d r1 = r0.f22288c     // Catch:{ InterruptedException -> 0x002c }
            int r2 = p277ub.C6774a0.f20959a     // Catch:{ InterruptedException -> 0x002c }
            r2 = 2
            android.os.Message r1 = r1.obtainMessage(r2)     // Catch:{ InterruptedException -> 0x002c }
            r1.sendToTarget()     // Catch:{ InterruptedException -> 0x002c }
            bh0.a r0 = r0.f22290e     // Catch:{ InterruptedException -> 0x002c }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x002c }
        L_0x001c:
            boolean r1 = r0.f52862b     // Catch:{ all -> 0x0026 }
            if (r1 != 0) goto L_0x0024
            r0.wait()     // Catch:{ all -> 0x0026 }
            goto L_0x001c
        L_0x0024:
            monitor-exit(r0)     // Catch:{ InterruptedException -> 0x002c }
            goto L_0x003a
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ InterruptedException -> 0x002c }
            throw r1     // Catch:{ InterruptedException -> 0x002c }
        L_0x0029:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ InterruptedException -> 0x002c }
            throw r0     // Catch:{ InterruptedException -> 0x002c }
        L_0x002c:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.C3935a.mo16074p():void");
    }

    public final void release() {
        try {
            if (this.f13843f == 2) {
                C7186e eVar = this.f13840c;
                if (eVar.f22292g) {
                    eVar.mo23488a();
                    eVar.f22287b.quit();
                }
                eVar.f22292g = false;
            }
            int i = this.f13843f;
            if (i == 1 || i == 2) {
                C7188f fVar = this.f13839b;
                synchronized (fVar.f22299a) {
                    fVar.f22310l = true;
                    fVar.f22300b.quit();
                    fVar.mo23490a();
                }
            }
            this.f13843f = 3;
            if (!this.f13842e) {
                this.f13838a.release();
                this.f13842e = true;
            }
        } catch (Throwable th) {
            if (!this.f13842e) {
                this.f13838a.release();
                this.f13842e = true;
            }
            throw th;
        }
    }
}
