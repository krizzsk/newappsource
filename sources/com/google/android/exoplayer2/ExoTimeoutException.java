package com.google.android.exoplayer2;

public final class ExoTimeoutException extends Exception {
    public final int timeoutOperation;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExoTimeoutException(int r2) {
        /*
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L_0x0012
            r0 = 2
            if (r2 == r0) goto L_0x000f
            r0 = 3
            if (r2 == r0) goto L_0x000c
            java.lang.String r0 = "Undefined timeout."
            goto L_0x0014
        L_0x000c:
            java.lang.String r0 = "Detaching surface timed out."
            goto L_0x0014
        L_0x000f:
            java.lang.String r0 = "Setting foreground mode timed out."
            goto L_0x0014
        L_0x0012:
            java.lang.String r0 = "Player release timed out."
        L_0x0014:
            r1.<init>(r0)
            r1.timeoutOperation = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoTimeoutException.<init>(int):void");
    }
}
