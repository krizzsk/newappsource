package com.veriff.sdk.internal;

import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public final class aba {

    /* renamed from: a */
    private static final byte[] f53532a = {42};

    /* renamed from: b */
    private static final String[] f53533b = new String[0];

    /* renamed from: c */
    private static final String[] f53534c = {"*"};

    /* renamed from: d */
    private static final aba f53535d = new aba();

    /* renamed from: e */
    private final AtomicBoolean f53536e = new AtomicBoolean(false);

    /* renamed from: f */
    private final CountDownLatch f53537f = new CountDownLatch(1);

    /* renamed from: g */
    private byte[] f53538g;

    /* renamed from: h */
    private byte[] f53539h;

    /* renamed from: a */
    public static aba m50302a() {
        return f53535d;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0025 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m50305b() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r5.m50306c()     // Catch:{ InterruptedIOException -> 0x0025, IOException -> 0x0010 }
            if (r0 == 0) goto L_0x000d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x000d:
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x002a
        L_0x0010:
            r1 = move-exception
            com.veriff.sdk.internal.aay r2 = com.veriff.sdk.internal.aay.m50281e()     // Catch:{ all -> 0x000e }
            r3 = 5
            java.lang.String r4 = "Failed to read public suffix list"
            r2.mo53800a((int) r3, (java.lang.String) r4, (java.lang.Throwable) r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0024
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0024:
            return
        L_0x0025:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x002a:
            if (r0 == 0) goto L_0x0033
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0033:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.aba.m50305b():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        if (r0 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        throw r2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m50306c() throws java.io.IOException {
        /*
            r3 = this;
            java.lang.Class<com.veriff.sdk.internal.aba> r0 = com.veriff.sdk.internal.aba.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            com.veriff.sdk.internal.abp r1 = new com.veriff.sdk.internal.abp
            com.veriff.sdk.internal.aca r0 = com.veriff.sdk.internal.abr.m50514a((java.io.InputStream) r0)
            r1.<init>(r0)
            com.veriff.sdk.internal.abk r0 = com.veriff.sdk.internal.abr.m50508a((com.veriff.sdk.internal.aca) r1)
            int r1 = r0.mo53906l()     // Catch:{ all -> 0x003c }
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x003c }
            r0.mo53861a((byte[]) r1)     // Catch:{ all -> 0x003c }
            int r2 = r0.mo53906l()     // Catch:{ all -> 0x003c }
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x003c }
            r0.mo53861a((byte[]) r2)     // Catch:{ all -> 0x003c }
            r0.close()
            monitor-enter(r3)
            r3.f53538g = r1     // Catch:{ all -> 0x0039 }
            r3.f53539h = r2     // Catch:{ all -> 0x0039 }
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            java.util.concurrent.CountDownLatch r0 = r3.f53537f
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
            if (r0 == 0) goto L_0x0049
            r0.close()     // Catch:{ all -> 0x0045 }
            goto L_0x0049
        L_0x0045:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0049:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.aba.m50306c():void");
    }

    /* renamed from: a */
    public String mo53826a(String str) {
        int i;
        int i2;
        if (str != null) {
            String[] split = IDN.toUnicode(str).split("\\.");
            String[] a = m50304a(split);
            if (split.length == a.length && a[0].charAt(0) != '!') {
                return null;
            }
            if (a[0].charAt(0) == '!') {
                i2 = split.length;
                i = a.length;
            } else {
                i2 = split.length;
                i = a.length + 1;
            }
            StringBuilder sb = new StringBuilder();
            String[] split2 = str.split("\\.");
            for (int i3 = i2 - i; i3 < split2.length; i3++) {
                sb.append(split2[i3]);
                sb.append('.');
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        throw new NullPointerException("domain == null");
    }

    /* renamed from: a */
    private String[] m50304a(String[] strArr) {
        String str;
        String str2;
        String str3;
        String[] strArr2;
        String[] strArr3;
        int i = 0;
        if (this.f53536e.get() || !this.f53536e.compareAndSet(false, true)) {
            try {
                this.f53537f.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            m50305b();
        }
        synchronized (this) {
            if (this.f53538g == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bArr[i2] = strArr[i2].getBytes(StandardCharsets.UTF_8);
        }
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 >= length) {
                str2 = null;
                break;
            }
            str2 = m50303a(this.f53538g, bArr, i3);
            if (str2 != null) {
                break;
            }
            i3++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            int i4 = 0;
            while (true) {
                if (i4 >= bArr2.length - 1) {
                    break;
                }
                bArr2[i4] = f53532a;
                str3 = m50303a(this.f53538g, bArr2, i4);
                if (str3 != null) {
                    break;
                }
                i4++;
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i >= length - 1) {
                    break;
                }
                String a = m50303a(this.f53539h, bArr, i);
                if (a != null) {
                    str = a;
                    break;
                }
                i++;
            }
        }
        if (str != null) {
            return ("!" + str).split("\\.");
        } else if (str2 == null && str3 == null) {
            return f53534c;
        } else {
            if (str2 != null) {
                strArr2 = str2.split("\\.");
            } else {
                strArr2 = f53533b;
            }
            if (str3 != null) {
                strArr3 = str3.split("\\.");
            } else {
                strArr3 = f53533b;
            }
            return strArr2.length > strArr3.length ? strArr2 : strArr3;
        }
    }

    /* renamed from: a */
    private static String m50303a(byte[] bArr, byte[][] bArr2, int i) {
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
}
