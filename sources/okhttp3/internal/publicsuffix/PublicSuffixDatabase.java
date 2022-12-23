package okhttp3.internal.publicsuffix;

import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public final class PublicSuffixDatabase {

    /* renamed from: e */
    public static final byte[] f62317e = {42};

    /* renamed from: f */
    public static final String[] f62318f = new String[0];

    /* renamed from: g */
    public static final String[] f62319g = {"*"};

    /* renamed from: h */
    public static final PublicSuffixDatabase f62320h = new PublicSuffixDatabase();

    /* renamed from: a */
    public final AtomicBoolean f62321a = new AtomicBoolean(false);

    /* renamed from: b */
    public final CountDownLatch f62322b = new CountDownLatch(1);

    /* renamed from: c */
    public byte[] f62323c;

    /* renamed from: d */
    public byte[] f62324d;

    /* renamed from: a */
    public static String m61897a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        byte b;
        int i3;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int length = bArr3.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = (i4 + length) / 2;
            while (i5 > -1 && bArr3[i5] != 10) {
                i5--;
            }
            int i6 = i5 + 1;
            int i7 = 1;
            while (true) {
                i2 = i6 + i7;
                if (bArr3[i2] == 10) {
                    break;
                }
                i7++;
            }
            int i8 = i2 - i6;
            int i9 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    b = 46;
                    z = false;
                } else {
                    z = z2;
                    b = bArr4[i9][i11] & 255;
                }
                i3 = b - (bArr3[i6 + i12] & 255);
                if (i3 == 0) {
                    i12++;
                    i11++;
                    if (i12 == i8) {
                        break;
                    } else if (bArr4[i9].length != i11) {
                        z2 = z;
                    } else if (i9 == bArr4.length - 1) {
                        break;
                    } else {
                        i9++;
                        z2 = true;
                        i11 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i3 >= 0) {
                if (i3 <= 0) {
                    int i13 = i8 - i12;
                    int length2 = bArr4[i9].length - i11;
                    while (true) {
                        i9++;
                        if (i9 >= bArr4.length) {
                            break;
                        }
                        length2 += bArr4[i9].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr3, i6, i8, StandardCharsets.UTF_8);
                        }
                    }
                }
                i4 = i2 + 1;
            }
            length = i6 - 1;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        throw r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60864b() throws java.io.IOException {
        /*
            r3 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            si0.o r1 = new si0.o
            si0.q r0 = si0.C24911r.m62553i(r0)
            r1.<init>(r0)
            si0.x r0 = si0.C24911r.m62547c(r1)
            int r1 = r0.readInt()     // Catch:{ all -> 0x003c }
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x003c }
            r0.mo61467j(r1)     // Catch:{ all -> 0x003c }
            int r2 = r0.readInt()     // Catch:{ all -> 0x003c }
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x003c }
            r0.mo61467j(r2)     // Catch:{ all -> 0x003c }
            r0.close()
            monitor-enter(r3)
            r3.f62323c = r1     // Catch:{ all -> 0x0039 }
            r3.f62324d = r2     // Catch:{ all -> 0x0039 }
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            java.util.concurrent.CountDownLatch r0 = r3.f62322b
            r0.countDown()
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            throw r0
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0043 }
            goto L_0x0047
        L_0x0043:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0047:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.mo60864b():void");
    }
}
