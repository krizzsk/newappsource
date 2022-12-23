package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.nearby.uwb.RangingParameters;
import com.google.android.gms.nearby.uwb.UwbComplexChannel;
import com.google.android.gms.nearby.uwb.UwbDevice;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzqx implements RemoteCall {
    public final /* synthetic */ zzrs zza;
    public final /* synthetic */ RangingParameters zzb;
    public final /* synthetic */ zzrr zzc;

    public /* synthetic */ zzqx(zzrs zzrs, RangingParameters rangingParameters, zzrr zzrr) {
        this.zza = zzrs;
        this.zzb = rangingParameters;
        this.zzc = zzrr;
    }

    public final void accept(Object obj, Object obj2) {
        zzrv[] zzrvArr;
        zzrs zzrs = this.zza;
        RangingParameters rangingParameters = this.zzb;
        zzrr zzrr = this.zzc;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        zzos zzos = (zzos) ((zzqs) obj).getService();
        zzqg zzqg = new zzqg();
        zzpw zzpw = new zzpw();
        zzpw.zzd(rangingParameters.getSessionId());
        zzpw.zzf(rangingParameters.getUwbConfigId());
        zzpw.zzc(rangingParameters.getRangingUpdateRate());
        int i = 0;
        if (rangingParameters.getPeerDevices().isEmpty()) {
            zzrvArr = new zzrv[0];
        } else {
            zzrvArr = new zzrv[rangingParameters.getPeerDevices().size()];
            for (UwbDevice address : rangingParameters.getPeerDevices()) {
                zzrt zzrt = new zzrt();
                zzqo zzqo = new zzqo();
                zzqo.zza(address.getAddress().getAddress());
                zzrt.zza(zzqo.zzb());
                zzrvArr[i] = zzrt.zzb();
                i++;
            }
        }
        zzpw.zzb(zzrvArr);
        byte[] sessionKeyInfo = rangingParameters.getSessionKeyInfo();
        if (sessionKeyInfo != null) {
            zzpw.zze(sessionKeyInfo);
        }
        UwbComplexChannel complexChannel = rangingParameters.getComplexChannel();
        if (complexChannel != null) {
            zzqt zzqt = new zzqt();
            zzqt.zza(complexChannel.getChannel());
            zzqt.zzb(complexChannel.getPreambleIndex());
            zzpw.zza(zzqt.zzc());
        }
        zzqg.zzb(zzpw.zzg());
        zzqg.zza(zzrr);
        zzqg.zzc(new zzrk(zzrs, taskCompletionSource));
        zzos.zzk(zzqg.zzd());
    }
}
