package com.android.billingclient.api;

import com.moovit.app.subscription.MoovitSubscriptionsManager;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p506gd.C17170a;

/* renamed from: com.android.billingclient.api.z */
public final /* synthetic */ class C1970z implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f6818b = 0;

    /* renamed from: c */
    public final /* synthetic */ Object f6819c;

    /* renamed from: d */
    public final /* synthetic */ Object f6820d;

    public /* synthetic */ C1970z(C1943c cVar, C1949f fVar) {
        this.f6819c = cVar;
        this.f6820d = fVar;
    }

    public final void run() {
        switch (this.f6818b) {
            case 0:
                ((MoovitSubscriptionsManager) ((C1967w) ((C1943c) this.f6819c).f6741d.f43144b).f6808a).mo45937g((C1949f) this.f6820d, (List<Purchase>) null);
                return;
            default:
                try {
                    AtomicReference atomicReference = C17170a.f44404e;
                    ((C17170a) this.f6820d).mo49753a((Set) this.f6819c);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }

    public C1970z(C17170a aVar, HashSet hashSet) {
        this.f6820d = aVar;
        this.f6819c = hashSet;
    }
}
