package p100gb;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import p100gb.C5001x;
import p265tb.C6654g;
import p265tb.C6657i;
import p265tb.C6670t;
import p265tb.C6671u;
import p583jk.C17875h;

/* renamed from: gb.h */
public final class C4976h implements C6654g {

    /* renamed from: a */
    public final C6654g f16823a;

    /* renamed from: b */
    public final int f16824b;

    /* renamed from: c */
    public final C4977a f16825c;

    /* renamed from: d */
    public final byte[] f16826d;

    /* renamed from: e */
    public int f16827e;

    /* renamed from: gb.h$a */
    public interface C4977a {
    }

    public C4976h(C6670t tVar, int i, C5001x.C5002a aVar) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44301k(z);
        this.f16823a = tVar;
        this.f16824b = i;
        this.f16825c = aVar;
        this.f16826d = new byte[1];
        this.f16827e = i;
    }

    /* renamed from: b */
    public final Map<String, List<String>> mo20679b() {
        return this.f16823a.mo20679b();
    }

    public final void close() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final void mo20680d(C6671u uVar) {
        uVar.getClass();
        this.f16823a.mo20680d(uVar);
    }

    /* renamed from: e */
    public final long mo16699e(C6657i iVar) {
        throw new UnsupportedOperationException();
    }

    public final Uri getUri() {
        return this.f16823a.getUri();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b1 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(byte[] r19, int r20, int r21) throws java.io.IOException {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f16827e
            r2 = -1
            if (r1 != 0) goto L_0x00b3
            tb.g r1 = r0.f16823a
            byte[] r3 = r0.f16826d
            r4 = 1
            r5 = 0
            int r1 = r1.read(r3, r5, r4)
            if (r1 != r2) goto L_0x0014
            goto L_0x002f
        L_0x0014:
            byte[] r1 = r0.f16826d
            byte r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 4
            if (r1 != 0) goto L_0x0021
        L_0x001e:
            r1 = 1
            goto L_0x00a9
        L_0x0021:
            byte[] r3 = new byte[r1]
            r6 = r1
            r7 = 0
        L_0x0025:
            if (r6 <= 0) goto L_0x0035
            tb.g r8 = r0.f16823a
            int r8 = r8.read(r3, r7, r6)
            if (r8 != r2) goto L_0x0032
        L_0x002f:
            r4 = 0
            goto L_0x00aa
        L_0x0032:
            int r7 = r7 + r8
            int r6 = r6 - r8
            goto L_0x0025
        L_0x0035:
            if (r1 <= 0) goto L_0x003f
            int r6 = r1 + -1
            byte r7 = r3[r6]
            if (r7 != 0) goto L_0x003f
            r1 = r6
            goto L_0x0035
        L_0x003f:
            if (r1 <= 0) goto L_0x001e
            gb.h$a r6 = r0.f16825c
            gb.x$a r6 = (p100gb.C5001x.C5002a) r6
            boolean r7 = r6.f16943m
            if (r7 != 0) goto L_0x004c
            long r7 = r6.f16939i
            goto L_0x005a
        L_0x004c:
            gb.x r7 = p100gb.C5001x.this
            java.util.Map<java.lang.String, java.lang.String> r8 = p100gb.C5001x.f16891N
            long r7 = r7.mo20712v()
            long r9 = r6.f16939i
            long r7 = java.lang.Math.max(r7, r9)
        L_0x005a:
            r10 = r7
            int r13 = r1 + 0
            gb.a0 r9 = r6.f16942l
            r9.getClass()
            gb.z r1 = r9.f16748a
            r7 = r13
        L_0x0065:
            if (r7 <= 0) goto L_0x009d
            int r8 = r1.mo20724b(r7)
            gb.z$a r12 = r1.f16971f
            tb.a r14 = r12.f16976d
            byte[] r15 = r14.f20645a
            r16 = r3
            long r2 = r1.f16972g
            r17 = r5
            long r4 = r12.f16973a
            long r2 = r2 - r4
            int r3 = (int) r2
            int r2 = r14.f20646b
            int r3 = r3 + r2
            r2 = r16
            r5 = r17
            java.lang.System.arraycopy(r2, r5, r15, r3, r8)
            int r5 = r5 + r8
            int r7 = r7 - r8
            long r3 = r1.f16972g
            long r14 = (long) r8
            long r3 = r3 + r14
            r1.f16972g = r3
            gb.z$a r8 = r1.f16971f
            long r14 = r8.f16974b
            int r12 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r12 != 0) goto L_0x0099
            gb.z$a r3 = r8.f16977e
            r1.f16971f = r3
        L_0x0099:
            r3 = r2
            r2 = -1
            r4 = 1
            goto L_0x0065
        L_0x009d:
            r1.getClass()
            r12 = 1
            r14 = 0
            r15 = 0
            r9.mo20633d(r10, r12, r13, r14, r15)
            r1 = 1
            r6.f16943m = r1
        L_0x00a9:
            r4 = 1
        L_0x00aa:
            if (r4 == 0) goto L_0x00b1
            int r1 = r0.f16824b
            r0.f16827e = r1
            goto L_0x00b3
        L_0x00b1:
            r1 = -1
            return r1
        L_0x00b3:
            r1 = -1
            tb.g r2 = r0.f16823a
            int r3 = r0.f16827e
            r4 = r21
            int r3 = java.lang.Math.min(r3, r4)
            r4 = r19
            r5 = r20
            int r2 = r2.read(r4, r5, r3)
            if (r2 == r1) goto L_0x00cd
            int r1 = r0.f16827e
            int r1 = r1 - r2
            r0.f16827e = r1
        L_0x00cd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p100gb.C4976h.read(byte[], int, int):int");
    }
}
