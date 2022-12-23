package com.google.android.gms.internal.nearby;

import android.annotation.SuppressLint;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.nearby.uwb.RangingMeasurement;
import com.google.android.gms.nearby.uwb.RangingPosition;
import com.google.android.gms.nearby.uwb.RangingSessionCallback;
import com.google.android.gms.nearby.zza;

final class zzrr extends zzox {
    public final /* synthetic */ zzrs zza;
    private final ListenerHolder zzb;
    /* access modifiers changed from: private */
    public final RangingSessionCallback zzc;

    public zzrr(zzrs zzrs, RangingSessionCallback rangingSessionCallback) {
        this.zza = zzrs;
        this.zzb = zzrs.registerListener(rangingSessionCallback, RangingSessionCallback.class.getName());
        this.zzc = rangingSessionCallback;
    }

    public static /* bridge */ /* synthetic */ RangingPosition zzb(zzrr zzrr, zzqa zzqa) {
        RangingMeasurement rangingMeasurement;
        RangingMeasurement rangingMeasurement2;
        RangingMeasurement zzi = zzi(zzqa.zzc());
        if (zzqa.zzb() != null) {
            rangingMeasurement = zzi(zzqa.zzb());
        } else {
            rangingMeasurement = null;
        }
        if (zzqa.zzd() != null) {
            rangingMeasurement2 = zzi(zzqa.zzd());
        } else {
            rangingMeasurement2 = null;
        }
        return new RangingPosition(zzi, rangingMeasurement, rangingMeasurement2, zzqa.zza());
    }

    @SuppressLint({"WrongConstant"})
    private static final RangingMeasurement zzi(zzpu zzpu) {
        return new RangingMeasurement(zzpu.zzb(), zzpu.zza());
    }

    public final void zzd(zzpm zzpm) {
        int i = zzrs.zza;
        zzrl zzrl = new zzrl(this, zzpm);
        this.zza.doRegisterEventListener(RegistrationMethods.builder().register(new zzrm(zzrl)).unregister(zzrn.zza).withHolder(this.zzb).setFeatures(zza.zzI).setMethodKey(1304).build());
    }

    public final void zze(zzpo zzpo) {
        int i = zzrs.zza;
        this.zzb.notifyListener(new zzrp(this, zzpo));
    }

    @SuppressLint({"WrongConstant"})
    public final void zzf(zzpq zzpq) {
        int i = zzrs.zza;
        this.zzb.notifyListener(new zzrq(this, zzpq));
    }

    public final /* synthetic */ void zzh(zzpm zzpm) {
        this.zzb.notifyListener(new zzro(this, zzpm));
    }
}
