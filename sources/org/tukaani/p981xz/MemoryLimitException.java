package org.tukaani.p981xz;

/* renamed from: org.tukaani.xz.MemoryLimitException */
public class MemoryLimitException extends XZIOException {
    private static final long serialVersionUID = 3;
    private final int memoryLimit;
    private final int memoryNeeded;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MemoryLimitException(int r3, int r4) {
        /*
            r2 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = " KiB of memory would be needed; limit was "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " KiB"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.memoryNeeded = r3
            r2.memoryLimit = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tukaani.p981xz.MemoryLimitException.<init>(int, int):void");
    }
}
