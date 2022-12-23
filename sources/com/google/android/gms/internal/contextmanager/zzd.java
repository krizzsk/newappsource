package com.google.android.gms.internal.contextmanager;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

public final class zzd {
    public static final zzd zza = new zzd("@@ContextManagerNullAccount@@");
    private final String zzb;

    public zzd(String str) {
        this.zzb = Preconditions.checkNotEmpty(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzd)) {
            return false;
        }
        return TextUtils.equals(this.zzb, ((zzd) obj).zzb);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb);
    }

    public final String toString() {
        return "#account#";
    }
}
