package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

final class zzaw implements ListenerHolder.Notifier {
    public final /* synthetic */ LocationResult zza;

    public zzaw(zzay zzay, LocationResult locationResult) {
        this.zza = locationResult;
    }

    public final /* synthetic */ void notifyListener(Object obj) {
        ((LocationCallback) obj).onLocationResult(this.zza);
    }

    public final void onNotifyListenerFailed() {
    }
}
