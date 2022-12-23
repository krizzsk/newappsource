package p314xa;

import android.media.MediaCodec;
import android.media.MediaCodec$CryptoInfo$Pattern;
import android.os.HandlerThread;
import bh0.C21060a;
import com.appsflyer.internal.referrer.Payload;
import com.google.android.play.core.appupdate.C14226d;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p137ja.C5410b;
import p277ub.C6774a0;

/* renamed from: xa.e */
public final class C7186e {

    /* renamed from: h */
    public static final ArrayDeque<C7187a> f22284h = new ArrayDeque<>();

    /* renamed from: i */
    public static final Object f22285i = new Object();

    /* renamed from: a */
    public final MediaCodec f22286a;

    /* renamed from: b */
    public final HandlerThread f22287b;

    /* renamed from: c */
    public C7185d f22288c;

    /* renamed from: d */
    public final AtomicReference<RuntimeException> f22289d = new AtomicReference<>();

    /* renamed from: e */
    public final C21060a f22290e;

    /* renamed from: f */
    public final boolean f22291f;

    /* renamed from: g */
    public boolean f22292g;

    /* renamed from: xa.e$a */
    public static class C7187a {

        /* renamed from: a */
        public int f22293a;

        /* renamed from: b */
        public int f22294b;

        /* renamed from: c */
        public int f22295c;

        /* renamed from: d */
        public final MediaCodec.CryptoInfo f22296d = new MediaCodec.CryptoInfo();

        /* renamed from: e */
        public long f22297e;

        /* renamed from: f */
        public int f22298f;
    }

    public C7186e(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z) {
        boolean z2;
        C21060a aVar = new C21060a();
        this.f22286a = mediaCodec;
        this.f22287b = handlerThread;
        this.f22290e = aVar;
        boolean z3 = true;
        if (!z) {
            String H0 = C14226d.m35341H0(C6774a0.f20961c);
            if (H0.contains(Payload.SOURCE_SAMSUNG) || H0.contains("motorola")) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                z3 = false;
            }
        }
        this.f22291f = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003c, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0048, code lost:
        throw new java.lang.IllegalStateException(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23488a() {
        /*
            r3 = this;
            boolean r0 = r3.f22292g
            if (r0 == 0) goto L_0x0049
            xa.d r0 = r3.f22288c     // Catch:{ InterruptedException -> 0x003b }
            int r1 = p277ub.C6774a0.f20959a     // Catch:{ InterruptedException -> 0x003b }
            r1 = 0
            r0.removeCallbacksAndMessages(r1)     // Catch:{ InterruptedException -> 0x003b }
            bh0.a r0 = r3.f22290e     // Catch:{ InterruptedException -> 0x003b }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x003b }
            r2 = 0
            r0.f52862b = r2     // Catch:{ all -> 0x0038 }
            monitor-exit(r0)     // Catch:{ InterruptedException -> 0x003b }
            xa.d r0 = r3.f22288c     // Catch:{ InterruptedException -> 0x003b }
            r2 = 2
            android.os.Message r0 = r0.obtainMessage(r2)     // Catch:{ InterruptedException -> 0x003b }
            r0.sendToTarget()     // Catch:{ InterruptedException -> 0x003b }
            bh0.a r0 = r3.f22290e     // Catch:{ InterruptedException -> 0x003b }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x003b }
        L_0x0020:
            boolean r2 = r0.f52862b     // Catch:{ all -> 0x0035 }
            if (r2 != 0) goto L_0x0028
            r0.wait()     // Catch:{ all -> 0x0035 }
            goto L_0x0020
        L_0x0028:
            monitor-exit(r0)     // Catch:{ InterruptedException -> 0x003b }
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r0 = r3.f22289d     // Catch:{ InterruptedException -> 0x003b }
            java.lang.Object r0 = r0.getAndSet(r1)     // Catch:{ InterruptedException -> 0x003b }
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch:{ InterruptedException -> 0x003b }
            if (r0 != 0) goto L_0x0034
            goto L_0x0049
        L_0x0034:
            throw r0     // Catch:{ InterruptedException -> 0x003b }
        L_0x0035:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ InterruptedException -> 0x003b }
            throw r1     // Catch:{ InterruptedException -> 0x003b }
        L_0x0038:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ InterruptedException -> 0x003b }
            throw r1     // Catch:{ InterruptedException -> 0x003b }
        L_0x003b:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p314xa.C7186e.mo23488a():void");
    }

    /* renamed from: b */
    public final void mo23489b(int i, C5410b bVar, long j) {
        C7187a aVar;
        RuntimeException andSet = this.f22289d.getAndSet((Object) null);
        if (andSet == null) {
            ArrayDeque<C7187a> arrayDeque = f22284h;
            synchronized (arrayDeque) {
                if (arrayDeque.isEmpty()) {
                    aVar = new C7187a();
                } else {
                    aVar = arrayDeque.removeFirst();
                }
            }
            aVar.f22293a = i;
            aVar.f22294b = 0;
            aVar.f22295c = 0;
            aVar.f22297e = j;
            aVar.f22298f = 0;
            MediaCodec.CryptoInfo cryptoInfo = aVar.f22296d;
            cryptoInfo.numSubSamples = bVar.f17763f;
            int[] iArr = bVar.f17761d;
            int[] iArr2 = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArr2 == null || iArr2.length < iArr.length) {
                    iArr2 = Arrays.copyOf(iArr, iArr.length);
                } else {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                }
            }
            cryptoInfo.numBytesOfClearData = iArr2;
            int[] iArr3 = bVar.f17762e;
            int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr3 != null) {
                if (iArr4 == null || iArr4.length < iArr3.length) {
                    iArr4 = Arrays.copyOf(iArr3, iArr3.length);
                } else {
                    System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArr4;
            byte[] bArr = bVar.f17759b;
            byte[] bArr2 = cryptoInfo.key;
            if (bArr != null) {
                if (bArr2 == null || bArr2.length < bArr.length) {
                    bArr2 = Arrays.copyOf(bArr, bArr.length);
                } else {
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                }
            }
            bArr2.getClass();
            cryptoInfo.key = bArr2;
            byte[] bArr3 = bVar.f17758a;
            byte[] bArr4 = cryptoInfo.iv;
            if (bArr3 != null) {
                if (bArr4 == null || bArr4.length < bArr3.length) {
                    bArr4 = Arrays.copyOf(bArr3, bArr3.length);
                } else {
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                }
            }
            bArr4.getClass();
            cryptoInfo.iv = bArr4;
            cryptoInfo.mode = bVar.f17760c;
            if (C6774a0.f20959a >= 24) {
                cryptoInfo.setPattern(new MediaCodec$CryptoInfo$Pattern(bVar.f17764g, bVar.f17765h));
            }
            this.f22288c.obtainMessage(1, aVar).sendToTarget();
            return;
        }
        throw andSet;
    }
}
