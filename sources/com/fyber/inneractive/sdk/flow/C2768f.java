package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;

/* renamed from: com.fyber.inneractive.sdk.flow.f */
public class C2768f extends C2765e implements IAConfigManager.OnConfigurationReadyAndValidListener {

    /* renamed from: h */
    public final InneractiveAdSpot.RequestListener f9562h;

    /* renamed from: i */
    public final C2780m f9563i;

    public C2768f(InneractiveAdSpot.RequestListener requestListener, C2780m mVar) {
        this.f9562h = requestListener;
        this.f9563i = mVar;
    }

    /* renamed from: a */
    public void mo13527a() {
        super.mo13527a();
    }

    public void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
        IAConfigManager.removeListener(this);
        if (!z) {
            mo13528a(this.f9558e, mo13531c(), InneractiveErrorCode.SDK_NOT_INITIALIZED_OR_CONFIG_ERROR);
        }
    }

    /* renamed from: a */
    public void mo13529a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        super.mo13529a(inneractiveInfrastructureError);
        InneractiveAdSpot.RequestListener requestListener = this.f9562h;
        if (requestListener != null) {
            requestListener.onInneractiveFailedAdRequest(this.f9563i, inneractiveInfrastructureError.getErrorCode());
        }
    }
}
