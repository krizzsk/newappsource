package com.google.android.gms.nearby.connection;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

public class ConnectionsOptions implements Api.ApiOptions.Optional {
    private final String zza = null;

    public static class Builder {
        public ConnectionsOptions build() {
            return new ConnectionsOptions(this, (zzk) null);
        }
    }

    public /* synthetic */ ConnectionsOptions(Builder builder, zzk zzk) {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionsOptions)) {
            return false;
        }
        String str = ((ConnectionsOptions) obj).zza;
        return Objects.equal((Object) null, (Object) null);
    }

    public final int hashCode() {
        return Objects.hashCode(null);
    }
}
