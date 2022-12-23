package com.google.android.gms.internal.nearby;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.ConnectionsClient;
import com.google.android.gms.nearby.connection.ConnectionsOptions;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.PayloadCallback;
import com.google.android.gms.nearby.zza;
import com.google.android.gms.tasks.Task;
import java.util.List;

public final class zzih extends GoogleApi implements ConnectionsClient {
    public static final /* synthetic */ int zza = 0;
    private static final Api.ClientKey zzb;
    private static final Api.AbstractClientBuilder zzc;
    private static final Api zzd;
    private final zzfg zze;
    private final zzkp zzf;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zzb = clientKey;
        zzhy zzhy = new zzhy();
        zzc = zzhy;
        zzd = new Api("Nearby.CONNECTIONS_API", zzhy, clientKey);
    }

    public zzih(Activity activity, ConnectionsOptions connectionsOptions) {
        super(activity, zzd, null, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zze = zzfg.zzd(this, (Api.ApiOptions) null);
        this.zzf = zzkp.zza(activity);
    }

    private final Task zzf(zzid zzid) {
        return doWrite(TaskApiCall.builder().setMethodKey(1229).run(new zzgz(this, zzid)).build());
    }

    private final Task zzg(zzig zzig) {
        return doWrite(TaskApiCall.builder().setMethodKey(1229).run(new zzhx(zzig)).build());
    }

    /* access modifiers changed from: private */
    public final void zzh(String str) {
        this.zze.zze(this, RegistrationMethods.builder().withHolder(this.zze.zzc(this, str, "connection")).register(zzhq.zza).unregister(zzhr.zza).setMethodKey(1268).build());
    }

    /* access modifiers changed from: private */
    public final void zzi(String str) {
        zzfg zzfg = this.zze;
        zzfg.zzg(this, zzfg.zza(str, "connection"));
    }

    public final Task<Void> acceptConnection(String str, PayloadCallback payloadCallback) {
        return doWrite(TaskApiCall.builder().run(new zzhe(this, str, registerListener(payloadCallback, PayloadCallback.class.getName()))).setMethodKey(1227).build());
    }

    public final Task<Void> cancelPayload(long j) {
        return zzf(new zzht(j));
    }

    public final void disconnectFromEndpoint(String str) {
        zzg(new zzhp(str));
        zzi(str);
    }

    public final Task<Void> rejectConnection(String str) {
        return zzf(new zzhw(str));
    }

    public final Task<Void> requestConnection(String str, String str2, ConnectionLifecycleCallback connectionLifecycleCallback) {
        ListenerHolder registerListener = registerListener(new zzie(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        zzh(str2);
        return doWrite(TaskApiCall.builder().run(new zzhf(this, str, str2, registerListener)).setMethodKey(1226).build()).addOnFailureListener(new zzic(this, str2));
    }

    public final Task<Void> sendPayload(String str, Payload payload) {
        return doWrite(TaskApiCall.builder().run(new zzhs(this, str, payload)).setMethodKey(1228).build());
    }

    public final Task<Void> startAdvertising(String str, String str2, ConnectionLifecycleCallback connectionLifecycleCallback, AdvertisingOptions advertisingOptions) {
        ListenerHolder registerListener = registerListener(new zzie(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        return this.zze.zze(this, RegistrationMethods.builder().withHolder(this.zze.zzb(this, new Object(), "advertising")).register(new zzhb(this, str, str2, registerListener, advertisingOptions)).unregister(zzhc.zza).setMethodKey(1266).build());
    }

    public final Task<Void> startDiscovery(String str, EndpointDiscoveryCallback endpointDiscoveryCallback, DiscoveryOptions discoveryOptions) {
        ListenerHolder zzb2 = this.zze.zzb(this, endpointDiscoveryCallback, "discovery");
        return this.zze.zze(this, RegistrationMethods.builder().withHolder(zzb2).register(new zzhi(this, str, zzb2, discoveryOptions)).unregister(zzhj.zza).setMethodKey(1267).build()).addOnSuccessListener(new zzhk(this, discoveryOptions)).addOnFailureListener(zzhl.zza);
    }

    public final void stopAdvertising() {
        this.zze.zzf(this, "advertising");
    }

    public final void stopAllEndpoints() {
        this.zze.zzf(this, "advertising");
        this.zze.zzf(this, "discovery").addOnSuccessListener(new zzho(this));
        zzg(zzhm.zza).addOnCompleteListener(new zzhn(this));
    }

    public final void stopDiscovery() {
        this.zze.zzf(this, "discovery").addOnSuccessListener(new zzho(this));
    }

    public final /* synthetic */ void zzc(DiscoveryOptions discoveryOptions, Void voidR) {
        zzkp zzkp;
        if (discoveryOptions.zzE() && (zzkp = this.zzf) != null) {
            zzkp.zze();
        }
    }

    public final /* synthetic */ void zzd(Task task) {
        this.zze.zzf(this, "connection");
        disconnectService();
    }

    public final /* synthetic */ void zze(Void voidR) {
        zzkp zzkp = this.zzf;
        if (zzkp != null) {
            zzkp.zzf();
        }
    }

    public zzih(Context context, ConnectionsOptions connectionsOptions) {
        super(context, zzd, null, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zze = zzfg.zzd(this, (Api.ApiOptions) null);
        this.zzf = null;
    }

    public final Task<Void> sendPayload(List<String> list, Payload payload) {
        return doWrite(TaskApiCall.builder().run(new zzhh(this, list, payload)).setMethodKey(1228).build());
    }

    public final Task<Void> requestConnection(String str, String str2, ConnectionLifecycleCallback connectionLifecycleCallback, ConnectionOptions connectionOptions) {
        ListenerHolder registerListener = registerListener(new zzie(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        zzh(str2);
        return doWrite(TaskApiCall.builder().setFeatures(zza.zzf).run(new zzhg(this, str, str2, registerListener, connectionOptions)).setMethodKey(1226).build()).addOnFailureListener(new zzhz(this, str2));
    }

    public final Task<Void> startAdvertising(byte[] bArr, String str, ConnectionLifecycleCallback connectionLifecycleCallback, AdvertisingOptions advertisingOptions) {
        ListenerHolder registerListener = registerListener(new zzie(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        ListenerHolder zzb2 = this.zze.zzb(this, new Object(), "advertising");
        return this.zze.zze(this, RegistrationMethods.builder().withHolder(zzb2).setFeatures(zza.zzf).register(new zzhu(this, bArr, str, registerListener, advertisingOptions)).unregister(zzhv.zza).setMethodKey(1266).build());
    }

    public final Task<Void> requestConnection(byte[] bArr, String str, ConnectionLifecycleCallback connectionLifecycleCallback) {
        ListenerHolder registerListener = registerListener(new zzie(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        zzh(str);
        return doWrite(TaskApiCall.builder().setFeatures(zza.zzf).run(new zzhd(this, bArr, str, registerListener)).setMethodKey(1226).build()).addOnFailureListener(new zzib(this, str));
    }

    public final Task<Void> requestConnection(byte[] bArr, String str, ConnectionLifecycleCallback connectionLifecycleCallback, ConnectionOptions connectionOptions) {
        ListenerHolder registerListener = registerListener(new zzie(this, connectionLifecycleCallback), ConnectionLifecycleCallback.class.getName());
        zzh(str);
        return doWrite(TaskApiCall.builder().setFeatures(zza.zzf).run(new zzha(this, bArr, str, registerListener, connectionOptions)).setMethodKey(1226).build()).addOnFailureListener(new zzia(this, str));
    }
}
