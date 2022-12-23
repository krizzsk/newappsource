package p007a6;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import p007a6.C0082a;
import p072e6.C4564b;
import p195o6.C5997b;

/* renamed from: a6.e */
public final class C0087e implements C0082a {

    /* renamed from: a */
    public int[] f245a;

    /* renamed from: b */
    public final int[] f246b = new int[256];

    /* renamed from: c */
    public final C0082a.C0083a f247c;

    /* renamed from: d */
    public ByteBuffer f248d;

    /* renamed from: e */
    public byte[] f249e;

    /* renamed from: f */
    public short[] f250f;

    /* renamed from: g */
    public byte[] f251g;

    /* renamed from: h */
    public byte[] f252h;

    /* renamed from: i */
    public byte[] f253i;

    /* renamed from: j */
    public int[] f254j;

    /* renamed from: k */
    public int f255k;

    /* renamed from: l */
    public C0085c f256l;

    /* renamed from: m */
    public Bitmap f257m;

    /* renamed from: n */
    public boolean f258n;

    /* renamed from: o */
    public int f259o;

    /* renamed from: p */
    public int f260p;

    /* renamed from: q */
    public int f261q;

    /* renamed from: r */
    public int f262r;

    /* renamed from: s */
    public Boolean f263s;

    /* renamed from: t */
    public Bitmap.Config f264t = Bitmap.Config.ARGB_8888;

    public C0087e(C5997b bVar, C0085c cVar, ByteBuffer byteBuffer, int i) {
        byte[] bArr;
        int[] iArr;
        this.f247c = bVar;
        this.f256l = new C0085c();
        synchronized (this) {
            if (i > 0) {
                int highestOneBit = Integer.highestOneBit(i);
                this.f259o = 0;
                this.f256l = cVar;
                this.f255k = -1;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f248d = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                this.f248d.order(ByteOrder.LITTLE_ENDIAN);
                this.f258n = false;
                Iterator it = cVar.f234e.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C0084b) it.next()).f225g == 3) {
                            this.f258n = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                this.f260p = highestOneBit;
                int i2 = cVar.f235f;
                this.f262r = i2 / highestOneBit;
                int i3 = cVar.f236g;
                this.f261q = i3 / highestOneBit;
                int i4 = i2 * i3;
                C4564b bVar2 = ((C5997b) this.f247c).f19161b;
                if (bVar2 == null) {
                    bArr = new byte[i4];
                } else {
                    bArr = (byte[]) bVar2.mo20074c(i4, byte[].class);
                }
                this.f253i = bArr;
                C0082a.C0083a aVar = this.f247c;
                int i5 = this.f262r * this.f261q;
                C4564b bVar3 = ((C5997b) aVar).f19161b;
                if (bVar3 == null) {
                    iArr = new int[i5];
                } else {
                    iArr = (int[]) bVar3.mo20074c(i5, int[].class);
                }
                this.f254j = iArr;
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0096, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.Bitmap mo181a() {
        /*
            r7 = this;
            monitor-enter(r7)
            a6.c r0 = r7.f256l     // Catch:{ all -> 0x0097 }
            int r0 = r0.f232c     // Catch:{ all -> 0x0097 }
            r1 = 3
            r2 = 1
            if (r0 <= 0) goto L_0x000d
            int r0 = r7.f255k     // Catch:{ all -> 0x0097 }
            if (r0 >= 0) goto L_0x001b
        L_0x000d:
            java.lang.String r0 = "e"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0019
            a6.c r0 = r7.f256l     // Catch:{ all -> 0x0097 }
            int r0 = r0.f232c     // Catch:{ all -> 0x0097 }
        L_0x0019:
            r7.f259o = r2     // Catch:{ all -> 0x0097 }
        L_0x001b:
            int r0 = r7.f259o     // Catch:{ all -> 0x0097 }
            r1 = 0
            if (r0 == r2) goto L_0x0095
            r3 = 2
            if (r0 != r3) goto L_0x0025
            goto L_0x0095
        L_0x0025:
            r0 = 0
            r7.f259o = r0     // Catch:{ all -> 0x0097 }
            byte[] r4 = r7.f249e     // Catch:{ all -> 0x0097 }
            if (r4 != 0) goto L_0x0043
            a6.a$a r4 = r7.f247c     // Catch:{ all -> 0x0097 }
            r5 = 255(0xff, float:3.57E-43)
            o6.b r4 = (p195o6.C5997b) r4     // Catch:{ all -> 0x0097 }
            e6.b r4 = r4.f19161b     // Catch:{ all -> 0x0097 }
            if (r4 != 0) goto L_0x0039
            byte[] r4 = new byte[r5]     // Catch:{ all -> 0x0097 }
            goto L_0x0041
        L_0x0039:
            java.lang.Class<byte[]> r6 = byte[].class
            java.lang.Object r4 = r4.mo20074c(r5, r6)     // Catch:{ all -> 0x0097 }
            byte[] r4 = (byte[]) r4     // Catch:{ all -> 0x0097 }
        L_0x0041:
            r7.f249e = r4     // Catch:{ all -> 0x0097 }
        L_0x0043:
            a6.c r4 = r7.f256l     // Catch:{ all -> 0x0097 }
            java.util.ArrayList r4 = r4.f234e     // Catch:{ all -> 0x0097 }
            int r5 = r7.f255k     // Catch:{ all -> 0x0097 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x0097 }
            a6.b r4 = (p007a6.C0084b) r4     // Catch:{ all -> 0x0097 }
            int r5 = r7.f255k     // Catch:{ all -> 0x0097 }
            int r5 = r5 - r2
            if (r5 < 0) goto L_0x005f
            a6.c r6 = r7.f256l     // Catch:{ all -> 0x0097 }
            java.util.ArrayList r6 = r6.f234e     // Catch:{ all -> 0x0097 }
            java.lang.Object r5 = r6.get(r5)     // Catch:{ all -> 0x0097 }
            a6.b r5 = (p007a6.C0084b) r5     // Catch:{ all -> 0x0097 }
            goto L_0x0060
        L_0x005f:
            r5 = r1
        L_0x0060:
            int[] r6 = r4.f229k     // Catch:{ all -> 0x0097 }
            if (r6 == 0) goto L_0x0065
            goto L_0x0069
        L_0x0065:
            a6.c r6 = r7.f256l     // Catch:{ all -> 0x0097 }
            int[] r6 = r6.f230a     // Catch:{ all -> 0x0097 }
        L_0x0069:
            r7.f245a = r6     // Catch:{ all -> 0x0097 }
            if (r6 != 0) goto L_0x0071
            r7.f259o = r2     // Catch:{ all -> 0x0097 }
            monitor-exit(r7)
            return r1
        L_0x0071:
            boolean r1 = r4.f224f     // Catch:{ all -> 0x0097 }
            if (r1 == 0) goto L_0x008f
            int[] r1 = r7.f246b     // Catch:{ all -> 0x0097 }
            int r2 = r6.length     // Catch:{ all -> 0x0097 }
            java.lang.System.arraycopy(r6, r0, r1, r0, r2)     // Catch:{ all -> 0x0097 }
            int[] r1 = r7.f246b     // Catch:{ all -> 0x0097 }
            r7.f245a = r1     // Catch:{ all -> 0x0097 }
            int r2 = r4.f226h     // Catch:{ all -> 0x0097 }
            r1[r2] = r0     // Catch:{ all -> 0x0097 }
            int r0 = r4.f225g     // Catch:{ all -> 0x0097 }
            if (r0 != r3) goto L_0x008f
            int r0 = r7.f255k     // Catch:{ all -> 0x0097 }
            if (r0 != 0) goto L_0x008f
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0097 }
            r7.f263s = r0     // Catch:{ all -> 0x0097 }
        L_0x008f:
            android.graphics.Bitmap r0 = r7.mo198i(r4, r5)     // Catch:{ all -> 0x0097 }
            monitor-exit(r7)
            return r0
        L_0x0095:
            monitor-exit(r7)
            return r1
        L_0x0097:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p007a6.C0087e.mo181a():android.graphics.Bitmap");
    }

    /* renamed from: b */
    public final void mo182b() {
        this.f255k = (this.f255k + 1) % this.f256l.f232c;
    }

    /* renamed from: c */
    public final int mo183c() {
        return this.f256l.f232c;
    }

    public final void clear() {
        C4564b bVar;
        C4564b bVar2;
        C4564b bVar3;
        this.f256l = null;
        byte[] bArr = this.f253i;
        if (!(bArr == null || (bVar3 = ((C5997b) this.f247c).f19161b) == null)) {
            bVar3.put(bArr);
        }
        int[] iArr = this.f254j;
        if (!(iArr == null || (bVar2 = ((C5997b) this.f247c).f19161b) == null)) {
            bVar2.put(iArr);
        }
        Bitmap bitmap = this.f257m;
        if (bitmap != null) {
            ((C5997b) this.f247c).f19160a.mo20086d(bitmap);
        }
        this.f257m = null;
        this.f248d = null;
        this.f263s = null;
        byte[] bArr2 = this.f249e;
        if (bArr2 != null && (bVar = ((C5997b) this.f247c).f19161b) != null) {
            bVar.put(bArr2);
        }
    }

    /* renamed from: d */
    public final int mo185d() {
        int i;
        C0085c cVar = this.f256l;
        int i2 = cVar.f232c;
        if (i2 <= 0 || (i = this.f255k) < 0) {
            return 0;
        }
        if (i < 0 || i >= i2) {
            return -1;
        }
        return ((C0084b) cVar.f234e.get(i)).f227i;
    }

    /* renamed from: e */
    public final int mo186e() {
        return this.f255k;
    }

    /* renamed from: f */
    public final int mo187f() {
        return (this.f254j.length * 4) + this.f248d.limit() + this.f253i.length;
    }

    /* renamed from: g */
    public final Bitmap mo196g() {
        Bitmap.Config config;
        Boolean bool = this.f263s;
        if (bool == null || bool.booleanValue()) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = this.f264t;
        }
        C0082a.C0083a aVar = this.f247c;
        Bitmap c = ((C5997b) aVar).f19160a.mo20085c(this.f262r, this.f261q, config);
        c.setHasAlpha(true);
        return c;
    }

    public final ByteBuffer getData() {
        return this.f248d;
    }

    /* renamed from: h */
    public final void mo197h(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.f264t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v9, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r3.f239j == r1.f226h) goto L_0x0047;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r5v31, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0060  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo198i(p007a6.C0084b r36, p007a6.C0084b r37) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r2 = r37
            int[] r10 = r0.f254j
            r11 = 0
            if (r2 != 0) goto L_0x001e
            android.graphics.Bitmap r3 = r0.f257m
            if (r3 == 0) goto L_0x0018
            a6.a$a r4 = r0.f247c
            o6.b r4 = (p195o6.C5997b) r4
            e6.d r4 = r4.f19160a
            r4.mo20086d(r3)
        L_0x0018:
            r3 = 0
            r0.f257m = r3
            java.util.Arrays.fill(r10, r11)
        L_0x001e:
            r12 = 3
            if (r2 == 0) goto L_0x002c
            int r3 = r2.f225g
            if (r3 != r12) goto L_0x002c
            android.graphics.Bitmap r3 = r0.f257m
            if (r3 != 0) goto L_0x002c
            java.util.Arrays.fill(r10, r11)
        L_0x002c:
            r13 = 2
            if (r2 == 0) goto L_0x0080
            int r3 = r2.f225g
            if (r3 <= 0) goto L_0x0080
            if (r3 != r13) goto L_0x006e
            boolean r3 = r1.f224f
            if (r3 != 0) goto L_0x0047
            a6.c r3 = r0.f256l
            int r4 = r3.f240k
            int[] r5 = r1.f229k
            if (r5 == 0) goto L_0x0048
            int r3 = r3.f239j
            int r5 = r1.f226h
            if (r3 != r5) goto L_0x0048
        L_0x0047:
            r4 = 0
        L_0x0048:
            int r3 = r2.f222d
            int r5 = r0.f260p
            int r3 = r3 / r5
            int r6 = r2.f220b
            int r6 = r6 / r5
            int r7 = r2.f221c
            int r7 = r7 / r5
            int r2 = r2.f219a
            int r2 = r2 / r5
            int r5 = r0.f262r
            int r6 = r6 * r5
            int r6 = r6 + r2
            int r3 = r3 * r5
            int r3 = r3 + r6
        L_0x005e:
            if (r6 >= r3) goto L_0x0080
            int r2 = r6 + r7
            r5 = r6
        L_0x0063:
            if (r5 >= r2) goto L_0x006a
            r10[r5] = r4
            int r5 = r5 + 1
            goto L_0x0063
        L_0x006a:
            int r2 = r0.f262r
            int r6 = r6 + r2
            goto L_0x005e
        L_0x006e:
            if (r3 != r12) goto L_0x0080
            android.graphics.Bitmap r2 = r0.f257m
            if (r2 == 0) goto L_0x0080
            r4 = 0
            int r8 = r0.f262r
            r6 = 0
            r7 = 0
            int r9 = r0.f261q
            r3 = r10
            r5 = r8
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)
        L_0x0080:
            java.nio.ByteBuffer r2 = r0.f248d
            int r3 = r1.f228j
            r2.position(r3)
            int r2 = r1.f221c
            int r3 = r1.f222d
            int r2 = r2 * r3
            byte[] r3 = r0.f253i
            if (r3 == 0) goto L_0x0094
            int r3 = r3.length
            if (r3 >= r2) goto L_0x00a9
        L_0x0094:
            a6.a$a r3 = r0.f247c
            o6.b r3 = (p195o6.C5997b) r3
            e6.b r3 = r3.f19161b
            if (r3 != 0) goto L_0x009f
            byte[] r3 = new byte[r2]
            goto L_0x00a7
        L_0x009f:
            java.lang.Class<byte[]> r4 = byte[].class
            java.lang.Object r3 = r3.mo20074c(r2, r4)
            byte[] r3 = (byte[]) r3
        L_0x00a7:
            r0.f253i = r3
        L_0x00a9:
            byte[] r3 = r0.f253i
            short[] r4 = r0.f250f
            r5 = 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x00b5
            short[] r4 = new short[r5]
            r0.f250f = r4
        L_0x00b5:
            short[] r4 = r0.f250f
            byte[] r6 = r0.f251g
            if (r6 != 0) goto L_0x00bf
            byte[] r6 = new byte[r5]
            r0.f251g = r6
        L_0x00bf:
            byte[] r6 = r0.f251g
            byte[] r7 = r0.f252h
            if (r7 != 0) goto L_0x00cb
            r7 = 4097(0x1001, float:5.741E-42)
            byte[] r7 = new byte[r7]
            r0.f252h = r7
        L_0x00cb:
            byte[] r7 = r0.f252h
            java.nio.ByteBuffer r8 = r0.f248d
            byte r8 = r8.get()
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 1
            int r14 = r9 << r8
            int r15 = r14 + 1
            int r16 = r14 + 2
            int r8 = r8 + r9
            int r17 = r9 << r8
            r13 = -1
            int r17 = r17 + -1
            r5 = 0
        L_0x00e3:
            if (r5 >= r14) goto L_0x00ee
            r4[r5] = r11
            byte r13 = (byte) r5
            r6[r5] = r13
            int r5 = r5 + 1
            r13 = -1
            goto L_0x00e3
        L_0x00ee:
            byte[] r5 = r0.f249e
            r12 = r0
            r25 = r8
            r24 = r16
            r28 = r17
            r9 = 0
            r13 = -1
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r26 = 0
            r27 = 0
            r29 = 0
        L_0x0107:
            r30 = 8
            if (r9 >= r2) goto L_0x01fa
            if (r20 != 0) goto L_0x0144
            java.nio.ByteBuffer r11 = r0.f248d
            byte r11 = r11.get()
            r11 = r11 & 255(0xff, float:3.57E-43)
            if (r11 > 0) goto L_0x0120
            r31 = r8
            r32 = r9
            r34 = r10
            r33 = r13
            goto L_0x0138
        L_0x0120:
            r31 = r8
            java.nio.ByteBuffer r8 = r12.f248d
            r32 = r9
            byte[] r9 = r12.f249e
            r33 = r13
            int r13 = r8.remaining()
            int r13 = java.lang.Math.min(r11, r13)
            r34 = r10
            r10 = 0
            r8.get(r9, r10, r13)
        L_0x0138:
            if (r11 > 0) goto L_0x013f
            r8 = 3
            r12.f259o = r8
            goto L_0x01fc
        L_0x013f:
            r20 = r11
            r21 = 0
            goto L_0x014c
        L_0x0144:
            r31 = r8
            r32 = r9
            r34 = r10
            r33 = r13
        L_0x014c:
            byte r8 = r5[r21]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << r22
            int r23 = r23 + r8
            int r22 = r22 + 8
            r8 = 1
            int r21 = r21 + 1
            r8 = -1
            int r20 = r20 + -1
            r10 = r22
            r11 = r24
            r8 = r25
            r9 = r32
            r13 = r33
            r22 = r5
            r5 = r26
        L_0x016a:
            if (r10 < r8) goto L_0x01e4
            r24 = r12
            r12 = r23 & r28
            int r23 = r23 >> r8
            int r10 = r10 - r8
            if (r12 != r14) goto L_0x017f
            r11 = r16
            r28 = r17
            r12 = r24
            r8 = r31
            r13 = -1
            goto L_0x016a
        L_0x017f:
            if (r12 != r15) goto L_0x0189
            r12 = r24
            r24 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x01e9
        L_0x0189:
            r25 = r10
            r10 = -1
            if (r13 != r10) goto L_0x019b
            byte r5 = r6[r12]
            r3[r27] = r5
            int r27 = r27 + 1
            int r9 = r9 + 1
            r24 = r12
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x01dd
        L_0x019b:
            if (r12 < r11) goto L_0x01a4
            byte r5 = (byte) r5
            r7[r29] = r5
            int r29 = r29 + 1
            r5 = r13
            goto L_0x01a5
        L_0x01a4:
            r5 = r12
        L_0x01a5:
            if (r5 < r14) goto L_0x01b0
            byte r10 = r6[r5]
            r7[r29] = r10
            int r29 = r29 + 1
            short r5 = r4[r5]
            goto L_0x01a5
        L_0x01b0:
            byte r5 = r6[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r5
            r3[r27] = r10
        L_0x01b7:
            r19 = 1
            int r27 = r27 + 1
            int r9 = r9 + 1
            if (r29 <= 0) goto L_0x01c6
            int r29 = r29 + -1
            byte r24 = r7[r29]
            r3[r27] = r24
            goto L_0x01b7
        L_0x01c6:
            r24 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            if (r11 >= r5) goto L_0x01dd
            short r13 = (short) r13
            r4[r11] = r13
            r6[r11] = r10
            int r11 = r11 + 1
            r10 = r11 & r28
            if (r10 != 0) goto L_0x01dd
            if (r11 >= r5) goto L_0x01dd
            int r8 = r8 + 1
            int r28 = r28 + r11
        L_0x01dd:
            r13 = r12
            r5 = r24
            r10 = r25
            r12 = r0
            goto L_0x016a
        L_0x01e4:
            r24 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            r12 = r0
        L_0x01e9:
            r25 = r8
            r5 = r22
            r26 = r24
            r8 = r31
            r22 = r10
            r24 = r11
            r10 = r34
            r11 = 0
            goto L_0x0107
        L_0x01fa:
            r34 = r10
        L_0x01fc:
            r11 = r27
            r10 = 0
            java.util.Arrays.fill(r3, r11, r2, r10)
            boolean r2 = r1.f223e
            if (r2 != 0) goto L_0x027b
            int r2 = r0.f260p
            r3 = 1
            if (r2 == r3) goto L_0x020d
            goto L_0x027b
        L_0x020d:
            int[] r2 = r0.f254j
            int r3 = r1.f222d
            int r4 = r1.f220b
            int r5 = r1.f221c
            int r6 = r1.f219a
            int r7 = r0.f255k
            if (r7 != 0) goto L_0x021d
            r7 = 1
            goto L_0x021e
        L_0x021d:
            r7 = 0
        L_0x021e:
            int r8 = r0.f262r
            byte[] r9 = r0.f253i
            int[] r11 = r0.f245a
            r12 = -1
            r13 = 0
        L_0x0226:
            if (r13 >= r3) goto L_0x025d
            int r14 = r13 + r4
            int r14 = r14 * r8
            int r15 = r14 + r6
            int r10 = r15 + r5
            int r14 = r14 + r8
            if (r14 >= r10) goto L_0x0234
            r10 = r14
        L_0x0234:
            int r14 = r1.f221c
            int r14 = r14 * r13
        L_0x0238:
            if (r15 >= r10) goto L_0x0255
            r16 = r3
            byte r3 = r9[r14]
            r17 = r4
            r4 = r3 & 255(0xff, float:3.57E-43)
            if (r4 == r12) goto L_0x024c
            r4 = r11[r4]
            if (r4 == 0) goto L_0x024b
            r2[r15] = r4
            goto L_0x024c
        L_0x024b:
            r12 = r3
        L_0x024c:
            int r14 = r14 + 1
            int r15 = r15 + 1
            r3 = r16
            r4 = r17
            goto L_0x0238
        L_0x0255:
            r16 = r3
            r17 = r4
            int r13 = r13 + 1
            r10 = 0
            goto L_0x0226
        L_0x025d:
            java.lang.Boolean r2 = r0.f263s
            if (r2 == 0) goto L_0x0267
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0270
        L_0x0267:
            java.lang.Boolean r2 = r0.f263s
            if (r2 != 0) goto L_0x0272
            if (r7 == 0) goto L_0x0272
            r2 = -1
            if (r12 == r2) goto L_0x0272
        L_0x0270:
            r11 = 1
            goto L_0x0273
        L_0x0272:
            r11 = 0
        L_0x0273:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            r0.f263s = r2
            goto L_0x0409
        L_0x027b:
            int[] r2 = r0.f254j
            int r3 = r1.f222d
            int r4 = r0.f260p
            int r3 = r3 / r4
            int r5 = r1.f220b
            int r5 = r5 / r4
            int r6 = r1.f221c
            int r6 = r6 / r4
            int r7 = r1.f219a
            int r7 = r7 / r4
            int r8 = r0.f255k
            if (r8 != 0) goto L_0x0291
            r10 = 1
            goto L_0x0292
        L_0x0291:
            r10 = 0
        L_0x0292:
            int r8 = r0.f262r
            int r9 = r0.f261q
            byte[] r11 = r0.f253i
            int[] r12 = r0.f245a
            java.lang.Boolean r13 = r0.f263s
            r14 = r13
            r13 = 0
            r15 = 0
            r16 = 1
            r17 = 8
        L_0x02a3:
            if (r13 >= r3) goto L_0x03f5
            r37 = r14
            boolean r14 = r1.f223e
            if (r14 == 0) goto L_0x02d2
            if (r15 < r3) goto L_0x02cd
            int r14 = r16 + 1
            r20 = r3
            r3 = 2
            if (r14 == r3) goto L_0x02c8
            r3 = 3
            if (r14 == r3) goto L_0x02c1
            r3 = 4
            r16 = r14
            if (r14 == r3) goto L_0x02bd
            goto L_0x02cf
        L_0x02bd:
            r15 = 1
            r17 = 2
            goto L_0x02cf
        L_0x02c1:
            r3 = 4
            r16 = r14
            r15 = 2
            r17 = 4
            goto L_0x02cf
        L_0x02c8:
            r3 = 4
            r16 = r14
            r15 = 4
            goto L_0x02cf
        L_0x02cd:
            r20 = r3
        L_0x02cf:
            int r3 = r15 + r17
            goto L_0x02d6
        L_0x02d2:
            r20 = r3
            r3 = r15
            r15 = r13
        L_0x02d6:
            int r15 = r15 + r5
            r14 = 1
            if (r4 != r14) goto L_0x02dc
            r14 = 1
            goto L_0x02dd
        L_0x02dc:
            r14 = 0
        L_0x02dd:
            if (r15 >= r9) goto L_0x03d5
            int r15 = r15 * r8
            int r18 = r15 + r7
            r21 = r3
            int r3 = r18 + r6
            int r15 = r15 + r8
            if (r15 >= r3) goto L_0x02eb
            r3 = r15
        L_0x02eb:
            int r15 = r13 * r4
            r22 = r5
            int r5 = r1.f221c
            int r15 = r15 * r5
            if (r14 == 0) goto L_0x0315
            r14 = r37
            r5 = r18
        L_0x02f9:
            r23 = r6
            if (r5 >= r3) goto L_0x03ce
            byte r6 = r11[r15]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r12[r6]
            if (r6 == 0) goto L_0x0308
            r2[r5] = r6
            goto L_0x030f
        L_0x0308:
            if (r10 == 0) goto L_0x030f
            if (r14 != 0) goto L_0x030f
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r14 = r6
        L_0x030f:
            int r15 = r15 + r4
            int r5 = r5 + 1
            r6 = r23
            goto L_0x02f9
        L_0x0315:
            r23 = r6
            int r5 = r3 - r18
            int r5 = r5 * r4
            int r5 = r5 + r15
            r14 = r37
            r6 = r18
        L_0x0320:
            if (r6 >= r3) goto L_0x03ce
            r18 = r3
            int r3 = r1.f221c
            r29 = r7
            r31 = r8
            r7 = r15
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
        L_0x0335:
            int r8 = r0.f260p
            int r8 = r8 + r15
            if (r7 >= r8) goto L_0x036a
            byte[] r8 = r0.f253i
            r32 = r9
            int r9 = r8.length
            if (r7 >= r9) goto L_0x036c
            if (r7 >= r5) goto L_0x036c
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.f245a
            r8 = r9[r8]
            if (r8 == 0) goto L_0x0365
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x0365:
            int r7 = r7 + 1
            r9 = r32
            goto L_0x0335
        L_0x036a:
            r32 = r9
        L_0x036c:
            int r3 = r3 + r15
            r7 = r3
        L_0x036e:
            int r8 = r0.f260p
            int r8 = r8 + r3
            if (r7 >= r8) goto L_0x039f
            byte[] r8 = r0.f253i
            int r9 = r8.length
            if (r7 >= r9) goto L_0x039f
            if (r7 >= r5) goto L_0x039f
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.f245a
            r8 = r9[r8]
            if (r8 == 0) goto L_0x039c
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x039c:
            int r7 = r7 + 1
            goto L_0x036e
        L_0x039f:
            if (r28 != 0) goto L_0x03a3
            r3 = 0
            goto L_0x03b5
        L_0x03a3:
            int r24 = r24 / r28
            int r3 = r24 << 24
            int r25 = r25 / r28
            int r7 = r25 << 16
            r3 = r3 | r7
            int r26 = r26 / r28
            int r7 = r26 << 8
            r3 = r3 | r7
            int r27 = r27 / r28
            r3 = r3 | r27
        L_0x03b5:
            if (r3 == 0) goto L_0x03ba
            r2[r6] = r3
            goto L_0x03c1
        L_0x03ba:
            if (r10 == 0) goto L_0x03c1
            if (r14 != 0) goto L_0x03c1
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r14 = r3
        L_0x03c1:
            int r15 = r15 + r4
            int r6 = r6 + 1
            r3 = r18
            r7 = r29
            r8 = r31
            r9 = r32
            goto L_0x0320
        L_0x03ce:
            r29 = r7
            r31 = r8
            r32 = r9
            goto L_0x03e3
        L_0x03d5:
            r21 = r3
            r22 = r5
            r23 = r6
            r29 = r7
            r31 = r8
            r32 = r9
            r14 = r37
        L_0x03e3:
            int r13 = r13 + 1
            r3 = r20
            r15 = r21
            r5 = r22
            r6 = r23
            r7 = r29
            r8 = r31
            r9 = r32
            goto L_0x02a3
        L_0x03f5:
            r37 = r14
            java.lang.Boolean r2 = r0.f263s
            if (r2 != 0) goto L_0x0409
            if (r37 != 0) goto L_0x03ff
            r11 = 0
            goto L_0x0403
        L_0x03ff:
            boolean r11 = r37.booleanValue()
        L_0x0403:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r11)
            r0.f263s = r2
        L_0x0409:
            boolean r2 = r0.f258n
            if (r2 == 0) goto L_0x042d
            int r1 = r1.f225g
            if (r1 == 0) goto L_0x0414
            r2 = 1
            if (r1 != r2) goto L_0x042d
        L_0x0414:
            android.graphics.Bitmap r1 = r0.f257m
            if (r1 != 0) goto L_0x041e
            android.graphics.Bitmap r1 = r35.mo196g()
            r0.f257m = r1
        L_0x041e:
            android.graphics.Bitmap r1 = r0.f257m
            r3 = 0
            int r7 = r0.f262r
            r5 = 0
            r6 = 0
            int r8 = r0.f261q
            r2 = r34
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
        L_0x042d:
            android.graphics.Bitmap r9 = r35.mo196g()
            r3 = 0
            int r7 = r0.f262r
            r5 = 0
            r6 = 0
            int r8 = r0.f261q
            r1 = r9
            r2 = r34
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p007a6.C0087e.mo198i(a6.b, a6.b):android.graphics.Bitmap");
    }
}
