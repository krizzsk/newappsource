package com.google.android.play.core.assetpacks;

import ce0.C21100e;
import com.moovit.payment.account.external.mot.MotPaymentMethodType;
import f60.C16947a;
import p434dd.C16552f0;

/* renamed from: com.google.android.play.core.assetpacks.s */
public final class C14314s implements C16552f0 {

    /* renamed from: b */
    public final Object f36023b;

    /* renamed from: c */
    public final Object f36024c;

    /* renamed from: d */
    public final Object f36025d;

    public /* synthetic */ C14314s(Object obj, Object obj2, Object obj3) {
        this.f36023b = obj;
        this.f36024c = obj2;
        this.f36025d = obj3;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        return new C14310r(((C14337x2) ((C16552f0) this.f36023b)).mo42910a(), (C14335x0) ((C16552f0) this.f36024c).zza(), (C14245a2) ((C16552f0) this.f36025d).zza());
    }

    public /* synthetic */ C14314s(MotPaymentMethodType motPaymentMethodType, C16947a aVar, String str) {
        C21100e.m49373x(motPaymentMethodType, "paymentMethodType");
        this.f36023b = motPaymentMethodType;
        this.f36024c = aVar;
        this.f36025d = str;
    }
}
