package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.Objects;

final class zzff {
    private final Class zza;
    private final Api.ApiOptions zzb = null;

    public zzff(GoogleApi googleApi, Api.ApiOptions apiOptions) {
        this.zza = googleApi.getClass();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzff) || !Objects.equal(this.zza, ((zzff) obj).zza) || !Objects.equal((Object) null, (Object) null)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zza, null);
    }
}
