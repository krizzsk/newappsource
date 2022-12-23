package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.messages.StatusCallback;

final class zznq extends zznp {
    public final /* synthetic */ boolean zza;

    public zznq(zznr zznr, boolean z) {
        this.zza = z;
    }

    public final /* synthetic */ void notifyListener(Object obj) {
        ((StatusCallback) obj).onPermissionChanged(this.zza);
    }
}
