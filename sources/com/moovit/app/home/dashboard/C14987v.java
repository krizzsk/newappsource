package com.moovit.app.home.dashboard;

import android.content.Context;
import c00.C13722f;
import com.moovit.app.taxi.C15413a;
import com.moovit.app.taxi.providers.TaxiDashboardConfig;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.payment.account.model.PaymentAccount;

/* renamed from: com.moovit.app.home.dashboard.v */
public final /* synthetic */ class C14987v implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ Context f38357b;

    /* renamed from: c */
    public final /* synthetic */ PaymentAccount f38358c;

    /* renamed from: d */
    public final /* synthetic */ LatLonE6 f38359d;

    public /* synthetic */ C14987v(Context context, PaymentAccount paymentAccount, LatLonE6 latLonE6) {
        this.f38357b = context;
        this.f38358c = paymentAccount;
        this.f38359d = latLonE6;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        Context context = this.f38357b;
        PaymentAccount paymentAccount = this.f38358c;
        LatLonE6 latLonE6 = this.f38359d;
        TaxiProvider taxiProvider = (TaxiProvider) obj;
        int i = C14988w.f38360o;
        TaxiDashboardConfig taxiDashboardConfig = taxiProvider.f39978m;
        if (taxiDashboardConfig == null || !"TAXI".equals(taxiDashboardConfig.f39932b) || !C15413a.m39457b(context, taxiProvider, taxiDashboardConfig.f39935e, paymentAccount, latLonE6)) {
            return false;
        }
        return true;
    }
}
