package si0;

import java.io.IOException;
import java.util.zip.Inflater;

/* renamed from: si0.p */
public final class C24909p implements C24893c0 {

    /* renamed from: b */
    public int f62966b;

    /* renamed from: c */
    public boolean f62967c;

    /* renamed from: d */
    public final C24902i f62968d;

    /* renamed from: e */
    public final Inflater f62969e;

    public C24909p(C24918x xVar, Inflater inflater) {
        this.f62968d = xVar;
        this.f62969e = inflater;
    }

    /* renamed from: E */
    public final C24895d0 mo58974E() {
        return this.f62968d.mo58974E();
    }

    public final void close() throws IOException {
        if (!this.f62967c) {
            this.f62969e.end();
            this.f62967c = true;
            this.f62968d.close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0096 A[SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo53601m(si0.C24898f r9, long r10) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            mf0.C24362h.m61211f(r9, r0)
        L_0x0005:
            r0 = 0
            r2 = 1
            int r3 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x000e
            r4 = 1
            goto L_0x000f
        L_0x000e:
            r4 = 0
        L_0x000f:
            if (r4 == 0) goto L_0x00d0
            boolean r4 = r8.f62967c
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x00c4
            if (r3 != 0) goto L_0x001a
            goto L_0x0091
        L_0x001a:
            si0.y r2 = r9.mo61391S(r2)     // Catch:{ DataFormatException -> 0x00bd }
            int r3 = r2.f62993c     // Catch:{ DataFormatException -> 0x00bd }
            int r3 = 8192 - r3
            long r3 = (long) r3     // Catch:{ DataFormatException -> 0x00bd }
            long r3 = java.lang.Math.min(r10, r3)     // Catch:{ DataFormatException -> 0x00bd }
            int r4 = (int) r3     // Catch:{ DataFormatException -> 0x00bd }
            java.util.zip.Inflater r3 = r8.f62969e     // Catch:{ DataFormatException -> 0x00bd }
            boolean r3 = r3.needsInput()     // Catch:{ DataFormatException -> 0x00bd }
            if (r3 != 0) goto L_0x0031
            goto L_0x0053
        L_0x0031:
            si0.i r3 = r8.f62968d     // Catch:{ DataFormatException -> 0x00bd }
            boolean r3 = r3.mo61415l1()     // Catch:{ DataFormatException -> 0x00bd }
            if (r3 == 0) goto L_0x003a
            goto L_0x0053
        L_0x003a:
            si0.i r3 = r8.f62968d     // Catch:{ DataFormatException -> 0x00bd }
            si0.f r3 = r3.getBuffer()     // Catch:{ DataFormatException -> 0x00bd }
            si0.y r3 = r3.f62946b     // Catch:{ DataFormatException -> 0x00bd }
            mf0.C24362h.m61208c(r3)     // Catch:{ DataFormatException -> 0x00bd }
            int r5 = r3.f62993c     // Catch:{ DataFormatException -> 0x00bd }
            int r6 = r3.f62992b     // Catch:{ DataFormatException -> 0x00bd }
            int r5 = r5 - r6
            r8.f62966b = r5     // Catch:{ DataFormatException -> 0x00bd }
            java.util.zip.Inflater r7 = r8.f62969e     // Catch:{ DataFormatException -> 0x00bd }
            byte[] r3 = r3.f62991a     // Catch:{ DataFormatException -> 0x00bd }
            r7.setInput(r3, r6, r5)     // Catch:{ DataFormatException -> 0x00bd }
        L_0x0053:
            java.util.zip.Inflater r3 = r8.f62969e     // Catch:{ DataFormatException -> 0x00bd }
            byte[] r5 = r2.f62991a     // Catch:{ DataFormatException -> 0x00bd }
            int r6 = r2.f62993c     // Catch:{ DataFormatException -> 0x00bd }
            int r3 = r3.inflate(r5, r6, r4)     // Catch:{ DataFormatException -> 0x00bd }
            int r4 = r8.f62966b     // Catch:{ DataFormatException -> 0x00bd }
            if (r4 != 0) goto L_0x0062
            goto L_0x0074
        L_0x0062:
            java.util.zip.Inflater r5 = r8.f62969e     // Catch:{ DataFormatException -> 0x00bd }
            int r5 = r5.getRemaining()     // Catch:{ DataFormatException -> 0x00bd }
            int r4 = r4 - r5
            int r5 = r8.f62966b     // Catch:{ DataFormatException -> 0x00bd }
            int r5 = r5 - r4
            r8.f62966b = r5     // Catch:{ DataFormatException -> 0x00bd }
            si0.i r5 = r8.f62968d     // Catch:{ DataFormatException -> 0x00bd }
            long r6 = (long) r4     // Catch:{ DataFormatException -> 0x00bd }
            r5.skip(r6)     // Catch:{ DataFormatException -> 0x00bd }
        L_0x0074:
            if (r3 <= 0) goto L_0x0082
            int r4 = r2.f62993c     // Catch:{ DataFormatException -> 0x00bd }
            int r4 = r4 + r3
            r2.f62993c = r4     // Catch:{ DataFormatException -> 0x00bd }
            long r4 = r9.f62947c     // Catch:{ DataFormatException -> 0x00bd }
            long r2 = (long) r3     // Catch:{ DataFormatException -> 0x00bd }
            long r4 = r4 + r2
            r9.f62947c = r4     // Catch:{ DataFormatException -> 0x00bd }
            goto L_0x0092
        L_0x0082:
            int r3 = r2.f62992b     // Catch:{ DataFormatException -> 0x00bd }
            int r4 = r2.f62993c     // Catch:{ DataFormatException -> 0x00bd }
            if (r3 != r4) goto L_0x0091
            si0.y r3 = r2.mo61475a()     // Catch:{ DataFormatException -> 0x00bd }
            r9.f62946b = r3     // Catch:{ DataFormatException -> 0x00bd }
            si0.C24921z.m62598a(r2)     // Catch:{ DataFormatException -> 0x00bd }
        L_0x0091:
            r2 = r0
        L_0x0092:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0097
            return r2
        L_0x0097:
            java.util.zip.Inflater r0 = r8.f62969e
            boolean r0 = r0.finished()
            if (r0 != 0) goto L_0x00ba
            java.util.zip.Inflater r0 = r8.f62969e
            boolean r0 = r0.needsDictionary()
            if (r0 == 0) goto L_0x00a8
            goto L_0x00ba
        L_0x00a8:
            si0.i r0 = r8.f62968d
            boolean r0 = r0.mo61415l1()
            if (r0 != 0) goto L_0x00b2
            goto L_0x0005
        L_0x00b2:
            java.io.EOFException r9 = new java.io.EOFException
            java.lang.String r10 = "source exhausted prematurely"
            r9.<init>(r10)
            throw r9
        L_0x00ba:
            r9 = -1
            return r9
        L_0x00bd:
            r9 = move-exception
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r9)
            throw r10
        L_0x00c4:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x00d0:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = p001a0.C0016g.m29l(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: si0.C24909p.mo53601m(si0.f, long):long");
    }
}
