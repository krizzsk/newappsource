package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import android.media.MediaCodec;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.C3228j;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C3055a;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.C3058b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3326a;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3328b;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3358k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.d */
public final class C3074d implements C3161n {

    /* renamed from: a */
    public final C3328b f10553a;

    /* renamed from: b */
    public final int f10554b;

    /* renamed from: c */
    public final C3077c f10555c = new C3077c();

    /* renamed from: d */
    public final LinkedBlockingDeque<C3326a> f10556d = new LinkedBlockingDeque<>();

    /* renamed from: e */
    public final C3076b f10557e = new C3076b();

    /* renamed from: f */
    public final C3393k f10558f = new C3393k(32);

    /* renamed from: g */
    public final AtomicInteger f10559g = new AtomicInteger();

    /* renamed from: h */
    public long f10560h;

    /* renamed from: i */
    public C3226i f10561i;

    /* renamed from: j */
    public long f10562j;

    /* renamed from: k */
    public C3326a f10563k;

    /* renamed from: l */
    public int f10564l;

    /* renamed from: m */
    public boolean f10565m;

    /* renamed from: n */
    public C3078d f10566n;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.d$b */
    public static final class C3076b {

        /* renamed from: a */
        public int f10567a;

        /* renamed from: b */
        public long f10568b;

        /* renamed from: c */
        public long f10569c;

        /* renamed from: d */
        public byte[] f10570d;

        public C3076b() {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.d$d */
    public interface C3078d {
        /* renamed from: a */
        void mo14111a(C3226i iVar);
    }

    public C3074d(C3328b bVar) {
        this.f10553a = bVar;
        int a = ((C3358k) bVar).mo14504a();
        this.f10554b = a;
        this.f10564l = a;
    }

    /* renamed from: a */
    public void mo14100a(boolean z) {
        int andSet = this.f10559g.getAndSet(z ? 0 : 2);
        mo14094a();
        C3077c cVar = this.f10555c;
        cVar.f10583m = Long.MIN_VALUE;
        cVar.f10584n = Long.MIN_VALUE;
        if (andSet == 2) {
            this.f10561i = null;
        }
    }

    /* renamed from: b */
    public void mo14102b() {
        if (this.f10559g.getAndSet(2) == 0) {
            mo14094a();
        }
    }

    /* renamed from: c */
    public final void mo14103c() {
        if (!this.f10559g.compareAndSet(1, 0)) {
            mo14094a();
        }
    }

    /* renamed from: d */
    public long mo14104d() {
        long max;
        C3077c cVar = this.f10555c;
        synchronized (cVar) {
            max = Math.max(cVar.f10583m, cVar.f10584n);
        }
        return max;
    }

    /* renamed from: e */
    public C3226i mo14105e() {
        C3226i iVar;
        C3077c cVar = this.f10555c;
        synchronized (cVar) {
            if (cVar.f10586p) {
                iVar = null;
            } else {
                iVar = cVar.f10587q;
            }
        }
        return iVar;
    }

    /* renamed from: f */
    public boolean mo14106f() {
        boolean z;
        C3077c cVar = this.f10555c;
        synchronized (cVar) {
            if (cVar.f10579i == 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: g */
    public void mo14107g() {
        long j;
        C3077c cVar = this.f10555c;
        synchronized (cVar) {
            int i = cVar.f10579i;
            if (i == 0) {
                j = -1;
            } else {
                int i2 = cVar.f10581k + i;
                int i3 = cVar.f10571a;
                int i4 = (i2 - 1) % i3;
                cVar.f10581k = i2 % i3;
                cVar.f10580j += i;
                cVar.f10579i = 0;
                j = cVar.f10573c[i4] + ((long) cVar.f10574d[i4]);
            }
        }
        if (j != -1) {
            mo14095a(j);
        }
    }

    /* renamed from: h */
    public final boolean mo14108h() {
        return this.f10559g.compareAndSet(0, 1);
    }

    /* renamed from: a */
    public boolean mo14101a(long j, boolean z) {
        long j2;
        C3077c cVar = this.f10555c;
        synchronized (cVar) {
            if (cVar.f10579i != 0) {
                long[] jArr = cVar.f10576f;
                int i = cVar.f10581k;
                if (j >= jArr[i]) {
                    if (j <= cVar.f10584n || z) {
                        int i2 = -1;
                        int i3 = 0;
                        while (true) {
                            if (i == cVar.f10582l) {
                                break;
                            } else if (cVar.f10576f[i] > j) {
                                break;
                            } else {
                                if ((cVar.f10575e[i] & 1) != 0) {
                                    i2 = i3;
                                }
                                i = (i + 1) % cVar.f10571a;
                                i3++;
                            }
                        }
                        if (i2 != -1) {
                            int i4 = (cVar.f10581k + i2) % cVar.f10571a;
                            cVar.f10581k = i4;
                            cVar.f10580j += i2;
                            cVar.f10579i -= i2;
                            j2 = cVar.f10573c[i4];
                        }
                    }
                }
            }
            j2 = -1;
        }
        if (j2 == -1) {
            return false;
        }
        mo14095a(j2);
        return true;
    }

    /* renamed from: a */
    public int mo14093a(C3228j jVar, C3058b bVar, boolean z, boolean z2, long j) {
        char c;
        int i;
        long j2;
        C3228j jVar2 = jVar;
        C3058b bVar2 = bVar;
        C3077c cVar = this.f10555c;
        C3226i iVar = this.f10561i;
        C3076b bVar3 = this.f10557e;
        synchronized (cVar) {
            if (cVar.f10579i != 0) {
                if (!z) {
                    C3226i[] iVarArr = cVar.f10578h;
                    int i2 = cVar.f10581k;
                    if (iVarArr[i2] == iVar) {
                        if (!(bVar2.f10528c == null && bVar2.f10530e == 0)) {
                            long j3 = cVar.f10576f[i2];
                            bVar2.f10529d = j3;
                            bVar2.f10526a = cVar.f10575e[i2];
                            bVar3.f10567a = cVar.f10574d[i2];
                            bVar3.f10568b = cVar.f10573c[i2];
                            bVar3.f10570d = cVar.f10577g[i2];
                            cVar.f10583m = Math.max(cVar.f10583m, j3);
                            int i3 = cVar.f10579i - 1;
                            cVar.f10579i = i3;
                            int i4 = cVar.f10581k + 1;
                            cVar.f10581k = i4;
                            cVar.f10580j++;
                            if (i4 == cVar.f10571a) {
                                cVar.f10581k = 0;
                            }
                            if (i3 > 0) {
                                j2 = cVar.f10573c[cVar.f10581k];
                            } else {
                                j2 = bVar3.f10568b + ((long) bVar3.f10567a);
                            }
                            bVar3.f10569c = j2;
                            c = 65532;
                        }
                    }
                }
                jVar2.f11654a = cVar.f10578h[cVar.f10581k];
                c = 65531;
            } else if (z2) {
                bVar2.f10526a = 4;
                c = 65532;
            } else {
                C3226i iVar2 = cVar.f10587q;
                if (iVar2 != null && (z || iVar2 != iVar)) {
                    jVar2.f11654a = iVar2;
                    c = 65531;
                }
            }
            c = 65533;
        }
        if (c == 65531) {
            this.f10561i = jVar2.f11654a;
            return -5;
        } else if (c != 65532) {
            if (c == 65533) {
                return -3;
            }
            throw new IllegalStateException();
        } else if (bVar2.mo14058b(4)) {
            return -4;
        } else {
            if (bVar2.f10529d < j) {
                bVar2.f10526a |= Integer.MIN_VALUE;
            }
            if (bVar2.mo14058b(1073741824)) {
                C3076b bVar4 = this.f10557e;
                long j4 = bVar4.f10568b;
                this.f10558f.mo14545c(1);
                mo14097a(j4, this.f10558f.f12121a, 1);
                long j5 = j4 + 1;
                byte b = this.f10558f.f12121a[0];
                boolean z3 = (b & 128) != 0;
                byte b2 = b & Byte.MAX_VALUE;
                C3055a aVar = bVar2.f10527b;
                if (aVar.f10516a == null) {
                    aVar.f10516a = new byte[16];
                }
                mo14097a(j5, aVar.f10516a, (int) b2);
                long j6 = j5 + ((long) b2);
                if (z3) {
                    this.f10558f.mo14545c(2);
                    mo14097a(j6, this.f10558f.f12121a, 2);
                    j6 += 2;
                    i = this.f10558f.mo14562q();
                } else {
                    i = 1;
                }
                C3055a aVar2 = bVar2.f10527b;
                int[] iArr = aVar2.f10519d;
                if (iArr == null || iArr.length < i) {
                    iArr = new int[i];
                }
                int[] iArr2 = aVar2.f10520e;
                if (iArr2 == null || iArr2.length < i) {
                    iArr2 = new int[i];
                }
                if (z3) {
                    int i5 = i * 6;
                    this.f10558f.mo14545c(i5);
                    mo14097a(j6, this.f10558f.f12121a, i5);
                    j6 += (long) i5;
                    this.f10558f.mo14549e(0);
                    for (int i6 = 0; i6 < i; i6++) {
                        iArr[i6] = this.f10558f.mo14562q();
                        iArr2[i6] = this.f10558f.mo14560o();
                    }
                } else {
                    iArr[0] = 0;
                    iArr2[0] = bVar4.f10567a - ((int) (j6 - bVar4.f10568b));
                }
                C3055a aVar3 = bVar2.f10527b;
                byte[] bArr = bVar4.f10570d;
                byte[] bArr2 = aVar3.f10516a;
                aVar3.f10521f = i;
                aVar3.f10519d = iArr;
                aVar3.f10520e = iArr2;
                aVar3.f10517b = bArr;
                aVar3.f10516a = bArr2;
                aVar3.f10518c = 1;
                int i7 = C3406u.f12148a;
                if (i7 >= 16) {
                    MediaCodec.CryptoInfo cryptoInfo = aVar3.f10522g;
                    cryptoInfo.numSubSamples = i;
                    cryptoInfo.numBytesOfClearData = iArr;
                    cryptoInfo.numBytesOfEncryptedData = iArr2;
                    cryptoInfo.key = bArr;
                    cryptoInfo.iv = bArr2;
                    cryptoInfo.mode = 1;
                    if (i7 >= 24) {
                        C3055a.C3057b bVar5 = aVar3.f10523h;
                        bVar5.f10525b.set(0, 0);
                        bVar5.f10524a.setPattern(bVar5.f10525b);
                    }
                }
                long j7 = bVar4.f10568b;
                int i8 = (int) (j6 - j7);
                bVar4.f10568b = j7 + ((long) i8);
                bVar4.f10567a -= i8;
            }
            int i9 = this.f10557e.f10567a;
            ByteBuffer byteBuffer = bVar2.f10528c;
            if (byteBuffer == null) {
                bVar2.f10528c = bVar2.mo14056a(i9);
            } else {
                int capacity = byteBuffer.capacity();
                int position = bVar2.f10528c.position();
                int i11 = i9 + position;
                if (capacity < i11) {
                    ByteBuffer a = bVar2.mo14056a(i11);
                    if (position > 0) {
                        bVar2.f10528c.position(0);
                        bVar2.f10528c.limit(position);
                        a.put(bVar2.f10528c);
                    }
                    bVar2.f10528c = a;
                }
            }
            C3076b bVar6 = this.f10557e;
            long j8 = bVar6.f10568b;
            ByteBuffer byteBuffer2 = bVar2.f10528c;
            int i12 = bVar6.f10567a;
            while (i12 > 0) {
                mo14095a(j8);
                int i13 = (int) (j8 - this.f10560h);
                int min = Math.min(i12, this.f10554b - i13);
                C3326a peek = this.f10556d.peek();
                byteBuffer2.put(peek.f11916a, peek.f11917b + i13, min);
                j8 += (long) min;
                i12 -= min;
            }
            mo14095a(this.f10557e.f10569c);
            return -4;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.d$c */
    public static final class C3077c {

        /* renamed from: a */
        public int f10571a = 1000;

        /* renamed from: b */
        public int[] f10572b = new int[1000];

        /* renamed from: c */
        public long[] f10573c = new long[1000];

        /* renamed from: d */
        public int[] f10574d = new int[1000];

        /* renamed from: e */
        public int[] f10575e = new int[1000];

        /* renamed from: f */
        public long[] f10576f = new long[1000];

        /* renamed from: g */
        public byte[][] f10577g = new byte[1000][];

        /* renamed from: h */
        public C3226i[] f10578h = new C3226i[1000];

        /* renamed from: i */
        public int f10579i;

        /* renamed from: j */
        public int f10580j;

        /* renamed from: k */
        public int f10581k;

        /* renamed from: l */
        public int f10582l;

        /* renamed from: m */
        public long f10583m = Long.MIN_VALUE;

        /* renamed from: n */
        public long f10584n = Long.MIN_VALUE;

        /* renamed from: o */
        public boolean f10585o = true;

        /* renamed from: p */
        public boolean f10586p = true;

        /* renamed from: q */
        public C3226i f10587q;

        /* renamed from: r */
        public int f10588r;

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        /* renamed from: a */
        public synchronized void mo14109a(long r6, int r8, long r9, int r11, byte[] r12) {
            /*
                r5 = this;
                monitor-enter(r5)
                boolean r0 = r5.f10585o     // Catch:{ all -> 0x00d6 }
                r1 = 0
                if (r0 == 0) goto L_0x000e
                r0 = r8 & 1
                if (r0 != 0) goto L_0x000c
                monitor-exit(r5)
                return
            L_0x000c:
                r5.f10585o = r1     // Catch:{ all -> 0x00d6 }
            L_0x000e:
                boolean r0 = r5.f10586p     // Catch:{ all -> 0x00d6 }
                r0 = r0 ^ 1
                com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8507b(r0)     // Catch:{ all -> 0x00d6 }
                monitor-enter(r5)     // Catch:{ all -> 0x00d6 }
                long r2 = r5.f10584n     // Catch:{ all -> 0x00d3 }
                long r2 = java.lang.Math.max(r2, r6)     // Catch:{ all -> 0x00d3 }
                r5.f10584n = r2     // Catch:{ all -> 0x00d3 }
                monitor-exit(r5)     // Catch:{ all -> 0x00d6 }
                long[] r0 = r5.f10576f     // Catch:{ all -> 0x00d6 }
                int r2 = r5.f10582l     // Catch:{ all -> 0x00d6 }
                r0[r2] = r6     // Catch:{ all -> 0x00d6 }
                long[] r6 = r5.f10573c     // Catch:{ all -> 0x00d6 }
                r6[r2] = r9     // Catch:{ all -> 0x00d6 }
                int[] r7 = r5.f10574d     // Catch:{ all -> 0x00d6 }
                r7[r2] = r11     // Catch:{ all -> 0x00d6 }
                int[] r7 = r5.f10575e     // Catch:{ all -> 0x00d6 }
                r7[r2] = r8     // Catch:{ all -> 0x00d6 }
                byte[][] r7 = r5.f10577g     // Catch:{ all -> 0x00d6 }
                r7[r2] = r12     // Catch:{ all -> 0x00d6 }
                com.fyber.inneractive.sdk.player.exoplayer2.i[] r7 = r5.f10578h     // Catch:{ all -> 0x00d6 }
                com.fyber.inneractive.sdk.player.exoplayer2.i r8 = r5.f10587q     // Catch:{ all -> 0x00d6 }
                r7[r2] = r8     // Catch:{ all -> 0x00d6 }
                int[] r7 = r5.f10572b     // Catch:{ all -> 0x00d6 }
                int r8 = r5.f10588r     // Catch:{ all -> 0x00d6 }
                r7[r2] = r8     // Catch:{ all -> 0x00d6 }
                int r7 = r5.f10579i     // Catch:{ all -> 0x00d6 }
                int r7 = r7 + 1
                r5.f10579i = r7     // Catch:{ all -> 0x00d6 }
                int r8 = r5.f10571a     // Catch:{ all -> 0x00d6 }
                if (r7 != r8) goto L_0x00c9
                int r7 = r8 + 1000
                int[] r9 = new int[r7]     // Catch:{ all -> 0x00d6 }
                long[] r10 = new long[r7]     // Catch:{ all -> 0x00d6 }
                long[] r11 = new long[r7]     // Catch:{ all -> 0x00d6 }
                int[] r12 = new int[r7]     // Catch:{ all -> 0x00d6 }
                int[] r0 = new int[r7]     // Catch:{ all -> 0x00d6 }
                byte[][] r2 = new byte[r7][]     // Catch:{ all -> 0x00d6 }
                com.fyber.inneractive.sdk.player.exoplayer2.i[] r3 = new com.fyber.inneractive.sdk.player.exoplayer2.C3226i[r7]     // Catch:{ all -> 0x00d6 }
                int r4 = r5.f10581k     // Catch:{ all -> 0x00d6 }
                int r8 = r8 - r4
                java.lang.System.arraycopy(r6, r4, r10, r1, r8)     // Catch:{ all -> 0x00d6 }
                long[] r6 = r5.f10576f     // Catch:{ all -> 0x00d6 }
                int r4 = r5.f10581k     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r6, r4, r11, r1, r8)     // Catch:{ all -> 0x00d6 }
                int[] r6 = r5.f10575e     // Catch:{ all -> 0x00d6 }
                int r4 = r5.f10581k     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r6, r4, r12, r1, r8)     // Catch:{ all -> 0x00d6 }
                int[] r6 = r5.f10574d     // Catch:{ all -> 0x00d6 }
                int r4 = r5.f10581k     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r6, r4, r0, r1, r8)     // Catch:{ all -> 0x00d6 }
                byte[][] r6 = r5.f10577g     // Catch:{ all -> 0x00d6 }
                int r4 = r5.f10581k     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r6, r4, r2, r1, r8)     // Catch:{ all -> 0x00d6 }
                com.fyber.inneractive.sdk.player.exoplayer2.i[] r6 = r5.f10578h     // Catch:{ all -> 0x00d6 }
                int r4 = r5.f10581k     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r6, r4, r3, r1, r8)     // Catch:{ all -> 0x00d6 }
                int[] r6 = r5.f10572b     // Catch:{ all -> 0x00d6 }
                int r4 = r5.f10581k     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r6, r4, r9, r1, r8)     // Catch:{ all -> 0x00d6 }
                int r6 = r5.f10581k     // Catch:{ all -> 0x00d6 }
                long[] r4 = r5.f10573c     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r4, r1, r10, r8, r6)     // Catch:{ all -> 0x00d6 }
                long[] r4 = r5.f10576f     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r4, r1, r11, r8, r6)     // Catch:{ all -> 0x00d6 }
                int[] r4 = r5.f10575e     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r4, r1, r12, r8, r6)     // Catch:{ all -> 0x00d6 }
                int[] r4 = r5.f10574d     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r4, r1, r0, r8, r6)     // Catch:{ all -> 0x00d6 }
                byte[][] r4 = r5.f10577g     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r4, r1, r2, r8, r6)     // Catch:{ all -> 0x00d6 }
                com.fyber.inneractive.sdk.player.exoplayer2.i[] r4 = r5.f10578h     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r4, r1, r3, r8, r6)     // Catch:{ all -> 0x00d6 }
                int[] r4 = r5.f10572b     // Catch:{ all -> 0x00d6 }
                java.lang.System.arraycopy(r4, r1, r9, r8, r6)     // Catch:{ all -> 0x00d6 }
                r5.f10573c = r10     // Catch:{ all -> 0x00d6 }
                r5.f10576f = r11     // Catch:{ all -> 0x00d6 }
                r5.f10575e = r12     // Catch:{ all -> 0x00d6 }
                r5.f10574d = r0     // Catch:{ all -> 0x00d6 }
                r5.f10577g = r2     // Catch:{ all -> 0x00d6 }
                r5.f10578h = r3     // Catch:{ all -> 0x00d6 }
                r5.f10572b = r9     // Catch:{ all -> 0x00d6 }
                r5.f10581k = r1     // Catch:{ all -> 0x00d6 }
                int r6 = r5.f10571a     // Catch:{ all -> 0x00d6 }
                r5.f10582l = r6     // Catch:{ all -> 0x00d6 }
                r5.f10579i = r6     // Catch:{ all -> 0x00d6 }
                r5.f10571a = r7     // Catch:{ all -> 0x00d6 }
                goto L_0x00d1
            L_0x00c9:
                int r2 = r2 + 1
                r5.f10582l = r2     // Catch:{ all -> 0x00d6 }
                if (r2 != r8) goto L_0x00d1
                r5.f10582l = r1     // Catch:{ all -> 0x00d6 }
            L_0x00d1:
                monitor-exit(r5)
                return
            L_0x00d3:
                r6 = move-exception
                monitor-exit(r5)     // Catch:{ all -> 0x00d6 }
                throw r6     // Catch:{ all -> 0x00d6 }
            L_0x00d6:
                r6 = move-exception
                monitor-exit(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3074d.C3077c.mo14109a(long, int, long, int, byte[]):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0080, code lost:
            return true;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized boolean mo14110a(long r7) {
            /*
                r6 = this;
                monitor-enter(r6)
                long r0 = r6.f10583m     // Catch:{ all -> 0x0081 }
                r2 = 0
                int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r3 < 0) goto L_0x000a
                monitor-exit(r6)
                return r2
            L_0x000a:
                int r0 = r6.f10579i     // Catch:{ all -> 0x0081 }
            L_0x000c:
                r1 = 1
                if (r0 <= 0) goto L_0x0021
                long[] r3 = r6.f10576f     // Catch:{ all -> 0x0081 }
                int r4 = r6.f10581k     // Catch:{ all -> 0x0081 }
                int r4 = r4 + r0
                int r4 = r4 - r1
                int r5 = r6.f10571a     // Catch:{ all -> 0x0081 }
                int r4 = r4 % r5
                r4 = r3[r4]     // Catch:{ all -> 0x0081 }
                int r3 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r3 < 0) goto L_0x0021
                int r0 = r0 + -1
                goto L_0x000c
            L_0x0021:
                int r7 = r6.f10580j     // Catch:{ all -> 0x0081 }
                int r0 = r0 + r7
                int r8 = r6.f10579i     // Catch:{ all -> 0x0081 }
                int r7 = r7 + r8
                int r7 = r7 - r0
                if (r7 < 0) goto L_0x002d
                if (r7 > r8) goto L_0x002d
                r2 = 1
            L_0x002d:
                com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8505a((boolean) r2)     // Catch:{ all -> 0x0081 }
                if (r7 != 0) goto L_0x0047
                int r7 = r6.f10580j     // Catch:{ all -> 0x0081 }
                if (r7 != 0) goto L_0x0037
                goto L_0x007f
            L_0x0037:
                int r7 = r6.f10582l     // Catch:{ all -> 0x0081 }
                if (r7 != 0) goto L_0x003d
                int r7 = r6.f10571a     // Catch:{ all -> 0x0081 }
            L_0x003d:
                int r7 = r7 - r1
                long[] r8 = r6.f10573c     // Catch:{ all -> 0x0081 }
                r2 = r8[r7]     // Catch:{ all -> 0x0081 }
                int[] r8 = r6.f10574d     // Catch:{ all -> 0x0081 }
                r7 = r8[r7]     // Catch:{ all -> 0x0081 }
                goto L_0x007f
            L_0x0047:
                int r8 = r6.f10579i     // Catch:{ all -> 0x0081 }
                int r8 = r8 - r7
                r6.f10579i = r8     // Catch:{ all -> 0x0081 }
                int r0 = r6.f10582l     // Catch:{ all -> 0x0081 }
                int r2 = r6.f10571a     // Catch:{ all -> 0x0081 }
                int r0 = r0 + r2
                int r0 = r0 - r7
                int r0 = r0 % r2
                r6.f10582l = r0     // Catch:{ all -> 0x0081 }
                r2 = -9223372036854775808
                r6.f10584n = r2     // Catch:{ all -> 0x0081 }
                int r8 = r8 - r1
            L_0x005a:
                if (r8 < 0) goto L_0x0079
                int r7 = r6.f10581k     // Catch:{ all -> 0x0081 }
                int r7 = r7 + r8
                int r0 = r6.f10571a     // Catch:{ all -> 0x0081 }
                int r7 = r7 % r0
                long r2 = r6.f10584n     // Catch:{ all -> 0x0081 }
                long[] r0 = r6.f10576f     // Catch:{ all -> 0x0081 }
                r4 = r0[r7]     // Catch:{ all -> 0x0081 }
                long r2 = java.lang.Math.max(r2, r4)     // Catch:{ all -> 0x0081 }
                r6.f10584n = r2     // Catch:{ all -> 0x0081 }
                int[] r0 = r6.f10575e     // Catch:{ all -> 0x0081 }
                r7 = r0[r7]     // Catch:{ all -> 0x0081 }
                r7 = r7 & r1
                if (r7 == 0) goto L_0x0076
                goto L_0x0079
            L_0x0076:
                int r8 = r8 + -1
                goto L_0x005a
            L_0x0079:
                long[] r7 = r6.f10573c     // Catch:{ all -> 0x0081 }
                int r8 = r6.f10582l     // Catch:{ all -> 0x0081 }
                r2 = r7[r8]     // Catch:{ all -> 0x0081 }
            L_0x007f:
                monitor-exit(r6)
                return r1
            L_0x0081:
                r7 = move-exception
                monitor-exit(r6)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3074d.C3077c.mo14110a(long):boolean");
        }
    }

    /* renamed from: a */
    public final void mo14097a(long j, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            mo14095a(j);
            int i3 = (int) (j - this.f10560h);
            int min = Math.min(i - i2, this.f10554b - i3);
            C3326a peek = this.f10556d.peek();
            System.arraycopy(peek.f11916a, peek.f11917b + i3, bArr, i2, min);
            j += (long) min;
            i2 += min;
        }
    }

    /* renamed from: a */
    public final void mo14095a(long j) {
        int i = ((int) (j - this.f10560h)) / this.f10554b;
        for (int i2 = 0; i2 < i; i2++) {
            C3328b bVar = this.f10553a;
            C3326a remove = this.f10556d.remove();
            C3358k kVar = (C3358k) bVar;
            synchronized (kVar) {
                C3326a[] aVarArr = kVar.f12014d;
                aVarArr[0] = remove;
                kVar.mo14505a(aVarArr);
            }
            this.f10560h += (long) this.f10554b;
        }
    }

    /* renamed from: a */
    public void mo14098a(C3226i iVar) {
        boolean z;
        if (iVar == null) {
            iVar = null;
        }
        C3077c cVar = this.f10555c;
        synchronized (cVar) {
            z = true;
            if (iVar == null) {
                cVar.f10586p = true;
            } else {
                cVar.f10586p = false;
                if (!C3406u.m8596a((Object) iVar, (Object) cVar.f10587q)) {
                    cVar.f10587q = iVar;
                }
            }
            z = false;
        }
        C3078d dVar = this.f10566n;
        if (dVar != null && z) {
            dVar.mo14111a(iVar);
        }
    }

    /* renamed from: a */
    public int mo14092a(C3087g gVar, int i, boolean z) throws IOException, InterruptedException {
        if (!mo14108h()) {
            int b = ((C3072b) gVar).mo14086b(i);
            if (b != -1) {
                return b;
            }
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        try {
            int a = mo14091a(i);
            C3326a aVar = this.f10563k;
            int a2 = ((C3072b) gVar).mo14081a(aVar.f11916a, aVar.f11917b + this.f10564l, a);
            if (a2 != -1) {
                this.f10564l += a2;
                this.f10562j += (long) a2;
                mo14103c();
                return a2;
            } else if (z) {
                return -1;
            } else {
                throw new EOFException();
            }
        } finally {
            mo14103c();
        }
    }

    /* renamed from: a */
    public void mo14099a(C3393k kVar, int i) {
        if (!mo14108h()) {
            kVar.mo14549e(kVar.f12122b + i);
            return;
        }
        while (i > 0) {
            int a = mo14091a(i);
            C3326a aVar = this.f10563k;
            kVar.mo14541a(aVar.f11916a, aVar.f11917b + this.f10564l, a);
            this.f10564l += a;
            this.f10562j += (long) a;
            i -= a;
        }
        mo14103c();
    }

    /* renamed from: a */
    public void mo14096a(long j, int i, int i2, int i3, byte[] bArr) {
        long j2 = j;
        if (!mo14108h()) {
            C3077c cVar = this.f10555c;
            synchronized (cVar) {
                cVar.f10584n = Math.max(cVar.f10584n, j);
            }
            return;
        }
        try {
            if (this.f10565m) {
                if ((i & 1) != 0) {
                    if (this.f10555c.mo14110a(j)) {
                        this.f10565m = false;
                    }
                }
                return;
            }
            long j3 = j2 + 0;
            this.f10555c.mo14109a(j3, i, (this.f10562j - ((long) i2)) - ((long) i3), i2, bArr);
            mo14103c();
        } finally {
            mo14103c();
        }
    }

    /* renamed from: a */
    public final void mo14094a() {
        C3077c cVar = this.f10555c;
        cVar.f10580j = 0;
        cVar.f10581k = 0;
        cVar.f10582l = 0;
        cVar.f10579i = 0;
        cVar.f10585o = true;
        C3328b bVar = this.f10553a;
        LinkedBlockingDeque<C3326a> linkedBlockingDeque = this.f10556d;
        ((C3358k) bVar).mo14505a((C3326a[]) linkedBlockingDeque.toArray(new C3326a[linkedBlockingDeque.size()]));
        this.f10556d.clear();
        ((C3358k) this.f10553a).mo14506b();
        this.f10560h = 0;
        this.f10562j = 0;
        this.f10563k = null;
        this.f10564l = this.f10554b;
    }

    /* renamed from: a */
    public final int mo14091a(int i) {
        C3326a aVar;
        if (this.f10564l == this.f10554b) {
            this.f10564l = 0;
            C3358k kVar = (C3358k) this.f10553a;
            synchronized (kVar) {
                kVar.f12016f++;
                int i2 = kVar.f12017g;
                if (i2 > 0) {
                    C3326a[] aVarArr = kVar.f12018h;
                    int i3 = i2 - 1;
                    kVar.f12017g = i3;
                    aVar = aVarArr[i3];
                    aVarArr[i3] = null;
                } else {
                    aVar = new C3326a(new byte[kVar.f12012b], 0);
                }
            }
            this.f10563k = aVar;
            this.f10556d.add(aVar);
        }
        return Math.min(i, this.f10554b - this.f10564l);
    }
}
