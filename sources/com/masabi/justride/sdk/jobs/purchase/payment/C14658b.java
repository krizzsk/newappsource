package com.masabi.justride.sdk.jobs.purchase.payment;

import ce0.C21100e;
import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.masabi.justride.sdk.jobs.network.forc.FOrcEndpoint;
import com.masabi.justride.sdk.jobs.purchase.payment.OrderProgressStore;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import p364al.C13487h;
import p388bk.C13634a;
import p413co.C13869o;
import p561ik.C17618a;
import p583jk.C17873f;
import p586jn.C17898d;
import p586jn.C17900f;
import p633lm.C18241b;
import p633lm.C18242c;
import p633lm.C18244e;
import p633lm.C18245f;
import p634ln.C18247a;
import p705on.C18798f;
import p705on.C18800h;
import p705on.C18804k;
import p705on.C18805l;
import p705on.C18810p;
import p725pj.C18926a;
import p843uk.C19925d0;
import p843uk.C19930f0;
import p843uk.C19937j;
import p843uk.C19956z;
import p846un.C19960b;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.masabi.justride.sdk.jobs.purchase.payment.b */
public final class C14658b {

    /* renamed from: a */
    public final C18241b f37136a;

    /* renamed from: b */
    public final OrderProgressStore f37137b;

    /* renamed from: c */
    public final C19960b f37138c;

    /* renamed from: d */
    public final C18244e f37139d;

    /* renamed from: e */
    public final C18242c f37140e;

    /* renamed from: f */
    public final C17873f f37141f;

    /* renamed from: g */
    public final C13869o f37142g;

    public C14658b(C18241b bVar, OrderProgressStore orderProgressStore, C19960b bVar2, C18244e eVar, C18242c cVar, C17873f fVar, C13869o oVar) {
        this.f37136a = bVar;
        this.f37137b = orderProgressStore;
        this.f37138c = bVar2;
        this.f37139d = eVar;
        this.f37140e = cVar;
        this.f37141f = fVar;
        this.f37142g = oVar;
    }

    /* renamed from: c */
    public static C13487h m36792c(C18926a aVar) {
        if (aVar.f48169a.equals(ProductAction.ACTION_PURCHASE)) {
            return new C13487h(null, aVar);
        }
        return new C13487h(null, new C13634a(aVar, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
    }

    /* renamed from: a */
    public final C13487h<Void> mo44361a(C19937j jVar, C19925d0 d0Var) {
        C13487h<Void> hVar;
        C13487h hVar2;
        C13634a aVar;
        String str = jVar.f50631a;
        String str2 = jVar.f50632b.get(0).f47858a.f47909l;
        OrderProgressStore orderProgressStore = this.f37137b;
        ConcurrentHashMap<String, OrderProgressStore.OrderProgress> concurrentHashMap = orderProgressStore.f37126a;
        OrderProgressStore.OrderProgress orderProgress = OrderProgressStore.OrderProgress.IN_PROGRESS;
        OrderProgressStore.OrderProgress putIfAbsent = concurrentHashMap.putIfAbsent(str, orderProgress);
        if (putIfAbsent == OrderProgressStore.OrderProgress.SUCCEEDED) {
            hVar = new C13487h<>(null, new C13634a((C18926a) null, C13634a.f33602F, "The purchase for this order has already succeeded"));
        } else if (putIfAbsent == orderProgress) {
            hVar = new C13487h<>(null, new C13634a((C18926a) null, C13634a.f33603G, "The purchase for this order is already in progress"));
        } else {
            OrderProgressStore.OrderProgress orderProgress2 = OrderProgressStore.OrderProgress.FAILED;
            if (putIfAbsent != orderProgress2 || orderProgressStore.f37126a.replace(str, orderProgress2, orderProgress)) {
                hVar = new C13487h<>(null, (C18926a) null);
            } else {
                hVar = new C13487h<>(null, new C13634a((C18926a) null, C13634a.f33604H, "Multiple concurrent purchases for the same order have conflicted"));
            }
        }
        if (hVar.mo40399a()) {
            return hVar;
        }
        C18241b bVar = this.f37136a;
        bVar.getClass();
        try {
            C13487h<String> a = bVar.mo50653a(FOrcEndpoint.PURCHASE_V1, str2, bVar.f46535a.mo52733b(d0Var));
            if (a.mo40399a()) {
                hVar2 = new C13487h(null, a.f33366b);
            } else {
                C19930f0 f0Var = (C19930f0) bVar.f46535a.mo52732a(C19930f0.class, (String) a.f33365a);
                String str3 = f0Var.f50610a;
                if (!C21100e.m49352m0(str3)) {
                    if (str3.equals("CVV_FAIL")) {
                        aVar = new C13634a((C18926a) null, C13634a.f33624r, "See the 'Handling Errors from the SDK' page (https://masabi.atlassian.net/wiki/x/JrNsAw) for information about this error.");
                    } else {
                        aVar = new C13634a((C18926a) null, C13634a.f33621o, str3);
                    }
                    hVar2 = new C13487h(null, aVar);
                } else {
                    hVar2 = new C13487h(f0Var, (C18926a) null);
                }
            }
        } catch (JSONException e) {
            hVar2 = new C13487h(null, new C17618a(e.getMessage()));
        }
        if (hVar2.mo40399a()) {
            this.f37137b.f37126a.replace(str, OrderProgressStore.OrderProgress.IN_PROGRESS, OrderProgressStore.OrderProgress.FAILED);
            C18926a aVar2 = hVar2.f33366b;
            if (!aVar2.f48169a.equals(ProductAction.ACTION_PURCHASE)) {
                aVar2 = new C13634a(aVar2, 200, "Underlying network error.");
            }
            return new C13487h<>(null, aVar2);
        }
        this.f37137b.f37126a.put(str, OrderProgressStore.OrderProgress.SUCCEEDED);
        return new C13487h<>(null, (C18926a) null);
    }

    /* renamed from: b */
    public final C18245f mo44362b(C19956z zVar, String str) {
        Integer num;
        Integer num2;
        String str2;
        C18247a aVar;
        C19956z zVar2 = zVar;
        C19937j jVar = zVar2.f50738a;
        C17898d dVar = zVar2.f50739b;
        String str3 = zVar2.f50740c;
        C18247a aVar2 = jVar.f50637g;
        String str4 = null;
        if (aVar2 == null || (aVar = jVar.f50638h) == null) {
            num2 = null;
            num = null;
        } else {
            num2 = aVar2.f46552a;
            num = aVar.f46552a;
        }
        if (!dVar.f45931b) {
            str2 = str;
        } else {
            str2 = null;
        }
        C18245f fVar = new C18245f();
        fVar.f46549d = this.f37138c.mo52262a();
        C17900f fVar2 = dVar.f45930a;
        if (fVar2 != null) {
            str4 = fVar2.f45939a;
        }
        fVar.f46550e = new C18810p(str3, str4);
        fVar.f46546a = jVar.f50633c;
        List<C18798f> list = jVar.f50632b;
        ArrayList arrayList = new ArrayList();
        for (C18798f next : list) {
            C18805l lVar = next.f47858a;
            arrayList.add(new C18800h(lVar.f47906i, lVar.f47907j, next.f47859b, (Integer) null, (Integer) null));
        }
        fVar.f46548c = new C18804k(str2, (Long) null, num2, num, arrayList);
        return fVar;
    }
}
