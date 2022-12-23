package com.google.android.gms.appindexing;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.icing.zzal;
import com.google.android.gms.internal.icing.zze;

@Deprecated
@VisibleForTesting
public final class AppIndex {
    public static final Api<Api.ApiOptions.NoOptions> API;
    @Deprecated
    public static final Api<Api.ApiOptions.NoOptions> APP_INDEX_API;
    public static final AppIndexApi AppIndexApi = new zzal();

    static {
        Api<Api.ApiOptions.NoOptions> api = zze.zzb;
        API = api;
        APP_INDEX_API = api;
    }

    private AppIndex() {
    }
}
