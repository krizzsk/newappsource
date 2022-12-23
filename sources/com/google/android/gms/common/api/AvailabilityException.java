package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import p241s0.C6302b;
import p241s0.C6307g;

public class AvailabilityException extends Exception {
    private final C6302b zaa;

    public AvailabilityException(C6302b bVar) {
        this.zaa = bVar;
    }

    public ConnectionResult getConnectionResult(GoogleApi<? extends Api.ApiOptions> googleApi) {
        ApiKey<? extends Api.ApiOptions> apiKey = googleApi.getApiKey();
        boolean z = this.zaa.getOrDefault(apiKey, null) != null;
        String zaa2 = apiKey.zaa();
        Preconditions.checkArgument(z, "The given API (" + zaa2 + ") was not part of the availability request.");
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.getOrDefault(apiKey, null));
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C6307g.C6310c) this.zaa.keySet()).iterator();
        boolean z = true;
        while (it.hasNext()) {
            ApiKey apiKey = (ApiKey) it.next();
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.getOrDefault(apiKey, null));
            z &= !connectionResult.isSuccess();
            String zaa2 = apiKey.zaa();
            String valueOf = String.valueOf(connectionResult);
            arrayList.add(zaa2 + ": " + valueOf);
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("None of the queried APIs are available. ");
        } else {
            sb.append("Some of the queried APIs are unavailable. ");
        }
        sb.append(TextUtils.join("; ", arrayList));
        return sb.toString();
    }

    public ConnectionResult getConnectionResult(HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        ApiKey<? extends Api.ApiOptions> apiKey = hasApiKey.getApiKey();
        boolean z = this.zaa.getOrDefault(apiKey, null) != null;
        String zaa2 = apiKey.zaa();
        Preconditions.checkArgument(z, "The given API (" + zaa2 + ") was not part of the availability request.");
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.getOrDefault(apiKey, null));
    }
}
