package com.google.android.gms.awareness.fence;

import android.app.PendingIntent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.contextmanager.zzbj;
import com.google.android.gms.internal.contextmanager.zzbs;
import com.google.android.gms.internal.contextmanager.zzcc;
import java.util.ArrayList;

public interface FenceUpdateRequest {

    public static class Builder {
        private final ArrayList<zzcc> zza = new ArrayList<>();

        public Builder addFence(String str, AwarenessFence awarenessFence, PendingIntent pendingIntent) {
            Preconditions.checkNotEmpty(str);
            Preconditions.checkNotNull(awarenessFence);
            Preconditions.checkNotNull(pendingIntent);
            this.zza.add(zzcc.zza(str, 0, (zzbj) awarenessFence, pendingIntent));
            return this;
        }

        public FenceUpdateRequest build() {
            return new zzbs(this.zza);
        }

        public Builder removeFence(PendingIntent pendingIntent) {
            Preconditions.checkNotNull(pendingIntent);
            this.zza.add(zzcc.zzb(pendingIntent));
            return this;
        }

        public Builder removeFence(String str) {
            Preconditions.checkNotEmpty(str);
            this.zza.add(zzcc.zzc(str));
            return this;
        }
    }
}
