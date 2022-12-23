package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzjj extends IOException {
    public zzjj() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzjj(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public zzjj(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
