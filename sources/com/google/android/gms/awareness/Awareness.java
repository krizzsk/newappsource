package com.google.android.gms.awareness;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.contextmanager.zzam;
import com.google.android.gms.internal.contextmanager.zzbd;
import com.google.android.gms.internal.contextmanager.zzcj;

public final class Awareness {
    @Deprecated
    public static final Api<AwarenessOptions> API;
    @Deprecated
    public static final FenceApi FenceApi = new zzbd();
    @Deprecated
    public static final SnapshotApi SnapshotApi = new zzam();
    public static final Api.ClientKey<zzcj> zza;
    private static final Api.AbstractClientBuilder<zzcj, AwarenessOptions> zzb;

    static {
        Api.ClientKey<zzcj> clientKey = new Api.ClientKey<>();
        zza = clientKey;
        zza zza2 = new zza();
        zzb = zza2;
        API = new Api<>("ContextManager.API", zza2, clientKey);
    }

    private Awareness() {
    }

    public static FenceClient getFenceClient(Activity activity) {
        return new FenceClient(activity, AwarenessOptions.zzd(activity.getPackageName()));
    }

    public static SnapshotClient getSnapshotClient(Activity activity) {
        return new SnapshotClient(activity, AwarenessOptions.zzd(activity.getPackageName()));
    }

    public static FenceClient getFenceClient(Context context) {
        return new FenceClient(context, AwarenessOptions.zzd(context.getPackageName()));
    }

    public static SnapshotClient getSnapshotClient(Context context) {
        return new SnapshotClient(context, AwarenessOptions.zzd(context.getPackageName()));
    }
}
