package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzgjs extends IOException {
    public zzgjs() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzgjs(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public zzgjs(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
