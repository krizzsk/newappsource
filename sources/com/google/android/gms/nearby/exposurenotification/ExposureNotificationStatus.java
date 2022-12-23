package com.google.android.gms.nearby.exposurenotification;

import com.google.android.gms.internal.nearby.zzsr;
import com.google.android.gms.internal.nearby.zzss;

public enum ExposureNotificationStatus {
    ACTIVATED(1),
    INACTIVATED(2),
    BLUETOOTH_DISABLED(4),
    LOCATION_DISABLED(8),
    NO_CONSENT(16),
    NOT_IN_ALLOWLIST(32),
    BLUETOOTH_SUPPORT_UNKNOWN(64),
    HW_NOT_SUPPORT(128),
    FOCUS_LOST(256),
    LOW_STORAGE(512),
    UNKNOWN(1024),
    EN_NOT_SUPPORT(2048),
    USER_PROFILE_NOT_SUPPORT(4096);
    
    private final long zzb;

    private ExposureNotificationStatus(long j) {
        this.zzb = j;
    }

    public static zzss zza(long j) {
        zzsr zzsr = new zzsr();
        for (ExposureNotificationStatus exposureNotificationStatus : values()) {
            if ((exposureNotificationStatus.zzb & j) != 0) {
                zzsr.zzb(exposureNotificationStatus);
            }
        }
        return zzsr.zzc();
    }
}
