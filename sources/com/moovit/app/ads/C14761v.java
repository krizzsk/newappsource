package com.moovit.app.ads;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.moovit.payment.account.paymentmethod.C25696b;
import com.moovit.payment.account.paymentmethod.PaymentMethodId;
import java.io.Serializable;
import p484ff.C16982k0;
import p977zz.C20949l;

/* renamed from: com.moovit.app.ads.v */
public final /* synthetic */ class C14761v implements CallbackToFutureAdapter.C0674b, C20949l {

    /* renamed from: b */
    public final /* synthetic */ boolean f37574b;

    /* renamed from: c */
    public final /* synthetic */ Object f37575c;

    /* renamed from: d */
    public final /* synthetic */ Serializable f37576d;

    public /* synthetic */ C14761v(MobileAdsManager mobileAdsManager, String str, boolean z) {
        this.f37575c = mobileAdsManager;
        this.f37576d = str;
        this.f37574b = z;
    }

    public /* synthetic */ C14761v(C25696b bVar, boolean z, Exception exc) {
        this.f37575c = bVar;
        this.f37574b = z;
        this.f37576d = exc;
    }

    public final Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        return ((MobileAdsManager) this.f37575c).mo44718s((String) this.f37576d, this.f37574b).addOnCompleteListener(new C16982k0(aVar, 1));
    }

    public final boolean invoke(Object obj) {
        C25696b bVar = (C25696b) this.f37575c;
        boolean z = this.f37574b;
        Exception exc = (Exception) this.f37576d;
        C25696b.C25698b bVar2 = (C25696b.C25698b) obj;
        if (z) {
            PaymentMethodId paymentMethodId = bVar.f64068i;
            bVar2.mo83526i1();
            return true;
        }
        PaymentMethodId paymentMethodId2 = bVar.f64068i;
        bVar2.mo83529y1(exc);
        return true;
    }
}
