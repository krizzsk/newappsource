package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.AppMetadata;
import com.google.android.gms.nearby.connection.ConnectionLifecycleCallback;
import com.google.android.gms.nearby.connection.Connections;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.EndpointDiscoveryCallback;
import com.google.android.gms.nearby.connection.Payload;
import com.google.android.gms.nearby.connection.PayloadCallback;
import java.util.List;

public final class zzji implements Connections {
    public static final Api.ClientKey zza = new Api.ClientKey();
    public static final Api.AbstractClientBuilder zzb = new zzis();

    public final PendingResult<Status> acceptConnection(GoogleApiClient googleApiClient, String str, PayloadCallback payloadCallback) {
        return googleApiClient.execute(new zzja(this, googleApiClient, str, googleApiClient.registerListener(payloadCallback)));
    }

    @Deprecated
    public final PendingResult<Status> acceptConnectionRequest(GoogleApiClient googleApiClient, String str, byte[] bArr, Connections.MessageListener messageListener) {
        return googleApiClient.execute(new zziq(this, googleApiClient, str, bArr, googleApiClient.registerListener(messageListener)));
    }

    public final PendingResult<Status> cancelPayload(GoogleApiClient googleApiClient, long j) {
        return googleApiClient.execute(new zzik(this, googleApiClient, j));
    }

    public final void disconnectFromEndpoint(GoogleApiClient googleApiClient, String str) {
        googleApiClient.execute(new zzil(this, googleApiClient, str));
    }

    public final PendingResult<Status> rejectConnection(GoogleApiClient googleApiClient, String str) {
        return googleApiClient.execute(new zzjb(this, googleApiClient, str));
    }

    @Deprecated
    public final PendingResult<Status> rejectConnectionRequest(GoogleApiClient googleApiClient, String str) {
        return googleApiClient.execute(new zzir(this, googleApiClient, str));
    }

    public final PendingResult<Status> requestConnection(GoogleApiClient googleApiClient, String str, String str2, ConnectionLifecycleCallback connectionLifecycleCallback) {
        return googleApiClient.execute(new zziz(this, googleApiClient, str, str2, googleApiClient.registerListener(connectionLifecycleCallback)));
    }

    @Deprecated
    public final PendingResult<Status> sendConnectionRequest(GoogleApiClient googleApiClient, String str, String str2, byte[] bArr, Connections.ConnectionResponseCallback connectionResponseCallback, Connections.MessageListener messageListener) {
        return googleApiClient.execute(new zzip(this, googleApiClient, str, str2, bArr, googleApiClient.registerListener(connectionResponseCallback), googleApiClient.registerListener(messageListener)));
    }

    public final PendingResult<Status> sendPayload(GoogleApiClient googleApiClient, String str, Payload payload) {
        return googleApiClient.execute(new zzii(this, googleApiClient, str, payload));
    }

    @Deprecated
    public final void sendReliableMessage(GoogleApiClient googleApiClient, String str, byte[] bArr) {
        googleApiClient.execute(new zzit(this, googleApiClient, str, bArr));
    }

    @Deprecated
    public final void sendUnreliableMessage(GoogleApiClient googleApiClient, String str, byte[] bArr) {
        googleApiClient.execute(new zzii(this, googleApiClient, str, Payload.fromBytes(bArr)));
    }

    @Deprecated
    public final PendingResult<Connections.StartAdvertisingResult> startAdvertising(GoogleApiClient googleApiClient, String str, AppMetadata appMetadata, long j, Connections.ConnectionRequestListener connectionRequestListener) {
        return googleApiClient.execute(new zzin(this, googleApiClient, str, j, googleApiClient.registerListener(connectionRequestListener)));
    }

    @Deprecated
    public final PendingResult<Status> startDiscovery(GoogleApiClient googleApiClient, String str, long j, Connections.EndpointDiscoveryListener endpointDiscoveryListener) {
        return googleApiClient.execute(new zzio(this, googleApiClient, str, j, googleApiClient.registerListener(endpointDiscoveryListener)));
    }

    public final void stopAdvertising(GoogleApiClient googleApiClient) {
        googleApiClient.execute(new zziw(this, googleApiClient));
    }

    public final void stopAllEndpoints(GoogleApiClient googleApiClient) {
        googleApiClient.execute(new zzim(this, googleApiClient));
    }

    public final void stopDiscovery(GoogleApiClient googleApiClient) {
        googleApiClient.execute(new zziy(this, googleApiClient));
    }

    public final PendingResult<Status> sendPayload(GoogleApiClient googleApiClient, List<String> list, Payload payload) {
        return googleApiClient.execute(new zzij(this, googleApiClient, list, payload));
    }

    @Deprecated
    public final void sendReliableMessage(GoogleApiClient googleApiClient, List<String> list, byte[] bArr) {
        googleApiClient.execute(new zziu(this, googleApiClient, list, bArr));
    }

    @Deprecated
    public final void stopDiscovery(GoogleApiClient googleApiClient, String str) {
        googleApiClient.execute(new zziy(this, googleApiClient));
    }

    @Deprecated
    public final void sendUnreliableMessage(GoogleApiClient googleApiClient, List<String> list, byte[] bArr) {
        googleApiClient.execute(new zzij(this, googleApiClient, list, Payload.fromBytes(bArr)));
    }

    public final PendingResult<Connections.StartAdvertisingResult> startAdvertising(GoogleApiClient googleApiClient, String str, String str2, ConnectionLifecycleCallback connectionLifecycleCallback, AdvertisingOptions advertisingOptions) {
        return googleApiClient.execute(new zziv(this, googleApiClient, str, str2, googleApiClient.registerListener(connectionLifecycleCallback), advertisingOptions));
    }

    public final PendingResult<Status> startDiscovery(GoogleApiClient googleApiClient, String str, EndpointDiscoveryCallback endpointDiscoveryCallback, DiscoveryOptions discoveryOptions) {
        return googleApiClient.execute(new zzix(this, googleApiClient, str, googleApiClient.registerListener(endpointDiscoveryCallback), discoveryOptions));
    }
}
