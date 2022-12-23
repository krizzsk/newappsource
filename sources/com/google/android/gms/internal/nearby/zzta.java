package com.google.android.gms.internal.nearby;

import java.io.IOException;

final class zzta implements Appendable {
    public int zza = 2;
    public final /* synthetic */ Appendable zzb;
    public final /* synthetic */ String zzc = ":";

    public zzta(int i, Appendable appendable, String str) {
        this.zzb = appendable;
    }

    public final Appendable append(char c) throws IOException {
        if (this.zza == 0) {
            this.zzb.append(this.zzc);
            this.zza = 2;
        }
        this.zzb.append(c);
        this.zza--;
        return this;
    }

    public final Appendable append(CharSequence charSequence) {
        throw new UnsupportedOperationException();
    }

    public final Appendable append(CharSequence charSequence, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
