package com.google.android.gms.nearby.messages;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

public class MessagesOptions implements Api.ApiOptions.Optional {
    public final String zza = null;
    public final boolean zzb = false;
    public final int zzc;
    public final String zzd;
    public final String zze;

    public static class Builder {
        /* access modifiers changed from: private */
        public int zza = -1;

        public MessagesOptions build() {
            return new MessagesOptions(this, (zzd) null);
        }

        public Builder setPermissions(int i) {
            this.zza = i;
            return this;
        }
    }

    public /* synthetic */ MessagesOptions(Builder builder, zzd zzd2) {
        this.zzc = builder.zza;
        this.zzd = null;
        this.zze = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MessagesOptions)) {
            return false;
        }
        MessagesOptions messagesOptions = (MessagesOptions) obj;
        String str = messagesOptions.zza;
        if (!Objects.equal((Object) null, (Object) null) || !Objects.equal((Object) null, (Object) null) || !Objects.equal((Object) null, (Object) null) || this.zzc != messagesOptions.zzc) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(null, Boolean.FALSE, null, null, Integer.valueOf(this.zzc));
    }
}
