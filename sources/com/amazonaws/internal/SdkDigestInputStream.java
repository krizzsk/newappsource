package com.amazonaws.internal;

import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;

public class SdkDigestInputStream extends DigestInputStream implements MetricAware {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int SKIP_BUF_SIZE = 2048;

    static {
        Class<SdkDigestInputStream> cls = SdkDigestInputStream.class;
    }

    public SdkDigestInputStream(InputStream inputStream, MessageDigest messageDigest) {
        super(inputStream, messageDigest);
    }

    @Deprecated
    public final boolean isMetricActivated() {
        if (this.in instanceof MetricAware) {
            return ((MetricAware) this.in).isMetricActivated();
        }
        return false;
    }

    public final long skip(long j) throws IOException {
        if (j <= 0) {
            return j;
        }
        int min = (int) Math.min(2048, j);
        byte[] bArr = new byte[min];
        long j2 = j;
        while (j2 > 0) {
            int read = read(bArr, 0, (int) Math.min(j2, (long) min));
            if (read != -1) {
                j2 -= (long) read;
            } else if (j2 == j) {
                return -1;
            } else {
                return j - j2;
            }
        }
        return j;
    }
}
