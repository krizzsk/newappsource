package com.google.android.gms.location;

import android.os.WorkSource;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
public final class zzk {
    private long zza = Long.MIN_VALUE;

    public final zzk zza(long j) {
        Preconditions.checkArgument(j >= 0, "intervalMillis can't be negative.");
        this.zza = j;
        return this;
    }

    public final zzl zzb() {
        boolean z;
        if (this.zza != Long.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Must set intervalMillis.");
        return new zzl(this.zza, true, (WorkSource) null, (String) null, (int[]) null, false, (String) null, 0, (String) null);
    }
}
