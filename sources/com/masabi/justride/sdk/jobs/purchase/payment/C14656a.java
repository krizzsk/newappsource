package com.masabi.justride.sdk.jobs.purchase.payment;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.masabi.justride.sdk.jobs.purchase.payment.OrderProgressStore;
import p364al.C13483d;
import p364al.C13487h;
import p388bk.C13634a;
import p517go.C17209a;
import p705on.C18794b;
import p725pj.C18926a;
import p798sn.C19495c;
import p843uk.C19937j;
import p868vl.C20158e;
import p917xm.C20541d;

/* renamed from: com.masabi.justride.sdk.jobs.purchase.payment.a */
public final class C14656a implements C13483d {

    /* renamed from: a */
    public final C17209a f37127a;

    /* renamed from: b */
    public final OrderProgressStore f37128b;

    /* renamed from: c */
    public final C20158e f37129c;

    /* renamed from: d */
    public final C20541d f37130d;

    /* renamed from: e */
    public final C18794b f37131e;

    /* renamed from: com.masabi.justride.sdk.jobs.purchase.payment.a$a */
    public static class C14657a {

        /* renamed from: a */
        public final C17209a f37132a;

        /* renamed from: b */
        public final OrderProgressStore f37133b;

        /* renamed from: c */
        public final C20158e f37134c;

        /* renamed from: d */
        public final C20541d f37135d;

        public C14657a(C17209a aVar, OrderProgressStore orderProgressStore, C20158e eVar, C20541d dVar) {
            this.f37132a = aVar;
            this.f37133b = orderProgressStore;
            this.f37134c = eVar;
            this.f37135d = dVar;
        }
    }

    public C14656a(C17209a aVar, OrderProgressStore orderProgressStore, C20158e eVar, C20541d dVar, C18794b bVar) {
        this.f37127a = aVar;
        this.f37128b = orderProgressStore;
        this.f37129c = eVar;
        this.f37130d = dVar;
        this.f37131e = bVar;
    }

    /* renamed from: C */
    public final C13487h<Void> mo40394C() {
        if (!this.f37129c.f51166a.contains("EXTERNAL_MPG")) {
            return new C13487h<>(null, new C13634a((C18926a) null, C13634a.f33597A, "See the 'Handling Errors from the SDK' page (https://masabi.atlassian.net/wiki/x/JrNsAw) for information about this error."));
        }
        C17209a aVar = this.f37127a;
        C19937j jVar = (C19937j) aVar.f44498a.get(this.f37131e.f47840a.f47845b);
        if (jVar == null) {
            return new C13487h<>(null, new C13634a((C18926a) null, C13634a.f33628v, "No finalised order found with given ID"));
        }
        C13487h<C19495c> C = this.f37130d.mo40394C();
        if (C.mo40399a()) {
            C18926a aVar2 = C.f33366b;
            if (aVar2.f48169a.equals(ProductAction.ACTION_PURCHASE)) {
                return new C13487h<>(null, aVar2);
            }
            return new C13487h<>(null, new C13634a(aVar2, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
        }
        OrderProgressStore orderProgressStore = this.f37128b;
        orderProgressStore.f37126a.put(jVar.f50631a, OrderProgressStore.OrderProgress.SUCCEEDED);
        return new C13487h<>(null, (C18926a) null);
    }
}
