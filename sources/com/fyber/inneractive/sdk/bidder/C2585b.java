package com.fyber.inneractive.sdk.bidder;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.C3705k;
import com.fyber.inneractive.sdk.util.C3706k0;

/* renamed from: com.fyber.inneractive.sdk.bidder.b */
public class C2585b extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public final /* synthetic */ C2566a f9114a;

    public C2585b(C2566a aVar) {
        this.f9114a = aVar;
    }

    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        C3706k0 k0Var = C3706k0.UNKNOWN;
        if (networkCapabilities.hasTransport(3)) {
            k0Var = C3706k0.ETHERNET;
        } else if (networkCapabilities.hasTransport(0)) {
            if (C3705k.m9947i() == 13) {
                k0Var = C3706k0.MOBILE_4G;
            } else {
                k0Var = C3706k0.MOBILE_3G;
            }
        } else if (networkCapabilities.hasTransport(1)) {
            k0Var = C3706k0.WIFI;
        }
        if (!TextUtils.equals(this.f9114a.f9069c.f9144r, k0Var.f12892a)) {
            C2566a aVar = this.f9114a;
            aVar.f9069c.f9144r = k0Var.f12892a;
            aVar.mo13017b();
        }
    }
}
