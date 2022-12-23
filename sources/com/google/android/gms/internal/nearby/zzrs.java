package com.google.android.gms.internal.nearby;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.nearby.uwb.RangingCapabilities;
import com.google.android.gms.nearby.uwb.RangingParameters;
import com.google.android.gms.nearby.uwb.RangingSessionCallback;
import com.google.android.gms.nearby.uwb.UwbAddress;
import com.google.android.gms.nearby.uwb.UwbClient;
import com.google.android.gms.nearby.uwb.UwbComplexChannel;
import com.google.android.gms.nearby.uwb.zze;
import com.google.android.gms.nearby.zza;
import com.google.android.gms.tasks.Task;

public final class zzrs extends GoogleApi implements UwbClient {
    public static final /* synthetic */ int zza = 0;
    private static final Api zzb = new Api("Nearby.UWB_API", new zzrf(), new Api.ClientKey());

    public zzrs(Context context, zze zze) {
        super(context, zzb, zze, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public final Task<Void> addControlee(UwbAddress uwbAddress) {
        return doWrite(TaskApiCall.builder().run(new zzrc(this, uwbAddress)).setFeatures(zza.zzJ).setMethodKey(1316).build());
    }

    public final Task<UwbComplexChannel> getComplexChannel() {
        return doRead(TaskApiCall.builder().run(new zzrd(this)).setFeatures(zza.zzI).setMethodKey(1303).build());
    }

    public final Task<UwbAddress> getLocalAddress() {
        return doRead(TaskApiCall.builder().run(new zzqy(this)).setFeatures(zza.zzI).setMethodKey(1302).build());
    }

    public final Task<RangingCapabilities> getRangingCapabilities() {
        return doRead(TaskApiCall.builder().run(new zzrb(this)).setFeatures(zza.zzI).setMethodKey(1301).build());
    }

    public final Task<Boolean> isAvailable() {
        return doRead(TaskApiCall.builder().run(new zzqz(this)).setFeatures(zza.zzI).setMethodKey(1300).build());
    }

    public final Task<Void> removeControlee(UwbAddress uwbAddress) {
        return doWrite(TaskApiCall.builder().run(new zzra(this, uwbAddress)).setFeatures(zza.zzK).setMethodKey(1317).build());
    }

    public final Task<Void> startRanging(RangingParameters rangingParameters, RangingSessionCallback rangingSessionCallback) {
        return doWrite(TaskApiCall.builder().run(new zzqx(this, rangingParameters, new zzrr(this, rangingSessionCallback))).setMethodKey(1304).setFeatures(zza.zzI).build());
    }

    public final Task<Void> stopRanging(RangingSessionCallback rangingSessionCallback) {
        return doWrite(TaskApiCall.builder().run(new zzre(this, rangingSessionCallback)).setMethodKey(1305).setFeatures(zza.zzI).build());
    }
}
