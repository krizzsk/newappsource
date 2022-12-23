package com.google.android.gms.internal.ads;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;

final class zzdv extends PhoneStateListener {
    public final /* synthetic */ zzdw zza;

    public /* synthetic */ zzdv(zzdw zzdw, zzdu zzdu) {
        this.zza = zzdw;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        boolean z;
        int i;
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        if (overrideNetworkType == 3 || overrideNetworkType == 4) {
            z = true;
        } else {
            z = false;
        }
        zzdw zzdw = this.zza;
        if (true != z) {
            i = 5;
        } else {
            i = 10;
        }
        zzdw.zzc(zzdw, i);
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
        String str;
        boolean z;
        int i;
        if (serviceState == null) {
            str = "";
        } else {
            str = serviceState.toString();
        }
        if (str.contains("nrState=CONNECTED") || str.contains("nrState=NOT_RESTRICTED")) {
            z = true;
        } else {
            z = false;
        }
        zzdw zzdw = this.zza;
        if (true != z) {
            i = 5;
        } else {
            i = 10;
        }
        zzdw.zzc(zzdw, i);
    }
}
