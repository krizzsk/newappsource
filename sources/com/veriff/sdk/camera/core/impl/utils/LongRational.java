package com.veriff.sdk.camera.core.impl.utils;

final class LongRational {
    private final long mDenominator;
    private final long mNumerator;

    public LongRational(long j, long j2) {
        this.mNumerator = j;
        this.mDenominator = j2;
    }

    public long getDenominator() {
        return this.mDenominator;
    }

    public long getNumerator() {
        return this.mNumerator;
    }

    public String toString() {
        return this.mNumerator + "/" + this.mDenominator;
    }

    public LongRational(double d) {
        this((long) (d * 10000.0d), 10000);
    }
}
