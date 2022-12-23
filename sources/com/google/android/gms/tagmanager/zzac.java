package com.google.android.gms.tagmanager;

final class zzac {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ zzal zzb;
    private Long zzc;

    public zzac(zzal zzal, boolean z) {
        this.zzb = zzal;
        this.zza = z;
    }

    public final boolean zza(Container container) {
        if (this.zza) {
            long lastRefreshTime = container.getLastRefreshTime();
            if (this.zzc == null) {
                this.zzc = Long.valueOf(this.zzb.zzi.zza());
            }
            if (this.zzc.longValue() + lastRefreshTime >= this.zzb.zza.currentTimeMillis()) {
                return true;
            }
            return false;
        } else if (!container.isDefault()) {
            return true;
        } else {
            return false;
        }
    }
}
