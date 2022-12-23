package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.appsflyer.internal.ai */
public class C2071ai extends FilterInputStream {
    private C2068ac $$a;
    private byte[] $$b;
    private byte[] AFDateFormat;
    private int[] AFDeepLinkManager;
    private int collectIntentsFromActivities = Integer.MAX_VALUE;
    private int dateFormatUTC;
    private int getDataFormatter;
    private int getInstance;
    private final int valueOf;
    private byte[] values;

    private void $$b() {
        if (this.getDataFormatter == 2) {
            byte[] bArr = this.$$b;
            System.arraycopy(bArr, 0, this.values, 0, bArr.length);
        }
        byte[] bArr2 = this.$$b;
        int i = ((bArr2[0] << 24) & -16777216) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i2 = (-16777216 & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = this.valueOf;
        C2068ac acVar = this.$$a;
        C2063aa.AFDateFormat(i, i2, false, i3, acVar.f6859a, acVar.f6860c, this.AFDeepLinkManager);
        int[] iArr = this.AFDeepLinkManager;
        int i4 = iArr[0];
        int i5 = iArr[1];
        byte[] bArr3 = this.$$b;
        bArr3[0] = (byte) (i4 >> 24);
        bArr3[1] = (byte) (i4 >> 16);
        bArr3[2] = (byte) (i4 >> 8);
        bArr3[3] = (byte) i4;
        bArr3[4] = (byte) (i5 >> 24);
        bArr3[5] = (byte) (i5 >> 16);
        bArr3[6] = (byte) (i5 >> 8);
        bArr3[7] = (byte) i5;
        if (this.getDataFormatter == 2) {
            for (int i6 = 0; i6 < 8; i6++) {
                byte[] bArr4 = this.$$b;
                bArr4[i6] = (byte) (bArr4[i6] ^ this.AFDateFormat[i6]);
            }
            byte[] bArr5 = this.values;
            System.arraycopy(bArr5, 0, this.AFDateFormat, 0, bArr5.length);
        }
    }

    public C2071ai(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) throws IOException {
        super(inputStream);
        int min = Math.min(Math.max(i, 3), 16);
        this.valueOf = min;
        this.$$b = new byte[8];
        byte[] bArr2 = new byte[8];
        this.AFDateFormat = bArr2;
        this.values = new byte[8];
        this.AFDeepLinkManager = new int[2];
        this.getInstance = 8;
        this.dateFormatUTC = 8;
        this.getDataFormatter = i2;
        if (i2 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.$$a = new C2068ac(iArr, min, true, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int AFDateFormat() throws java.io.IOException {
        /*
            r7 = this;
            int r0 = r7.collectIntentsFromActivities
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r1) goto L_0x000f
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.collectIntentsFromActivities = r0
        L_0x000f:
            int r0 = r7.getInstance
            r1 = 8
            if (r0 != r1) goto L_0x005a
            byte[] r0 = r7.$$b
            int r2 = r7.collectIntentsFromActivities
            byte r3 = (byte) r2
            r4 = 0
            r0[r4] = r3
            java.lang.String r0 = "unexpected block size"
            if (r2 < 0) goto L_0x0054
            r2 = 1
        L_0x0023:
            java.io.InputStream r3 = r7.in
            byte[] r5 = r7.$$b
            int r6 = 8 - r2
            int r3 = r3.read(r5, r2, r6)
            if (r3 <= 0) goto L_0x0032
            int r2 = r2 + r3
            if (r2 < r1) goto L_0x0023
        L_0x0032:
            if (r2 < r1) goto L_0x004e
            r7.$$b()
            java.io.InputStream r0 = r7.in
            int r0 = r0.read()
            r7.collectIntentsFromActivities = r0
            r7.getInstance = r4
            if (r0 >= 0) goto L_0x004b
            byte[] r0 = r7.$$b
            r2 = 7
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 - r0
        L_0x004b:
            r7.dateFormatUTC = r1
            goto L_0x005a
        L_0x004e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0054:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x005a:
            int r0 = r7.dateFormatUTC
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C2071ai.AFDateFormat():int");
    }

    public int available() throws IOException {
        AFDateFormat();
        return this.dateFormatUTC - this.getInstance;
    }

    public boolean markSupported() {
        return false;
    }

    public int read() throws IOException {
        AFDateFormat();
        int i = this.getInstance;
        if (i >= this.dateFormatUTC) {
            return -1;
        }
        byte[] bArr = this.$$b;
        this.getInstance = i + 1;
        return bArr[i] & 255;
    }

    public long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            AFDateFormat();
            int i5 = this.getInstance;
            if (i5 < this.dateFormatUTC) {
                byte[] bArr2 = this.$$b;
                this.getInstance = i5 + 1;
                bArr[i4] = bArr2[i5];
                i4++;
            } else if (i4 == i) {
                return -1;
            } else {
                return i2 - (i3 - i4);
            }
        }
        return i2;
    }
}
