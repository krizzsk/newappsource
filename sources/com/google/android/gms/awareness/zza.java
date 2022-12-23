package com.google.android.gms.awareness;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.internal.contextmanager.zzcj;

final class zza extends Api.AbstractClientBuilder<zzcj, AwarenessOptions> {
    public final /* bridge */ /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return new zzcj(context, looper, clientSettings, (AwarenessOptions) obj, connectionCallbacks, onConnectionFailedListener);
    }
}
