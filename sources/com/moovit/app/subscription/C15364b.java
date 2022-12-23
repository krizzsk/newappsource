package com.moovit.app.subscription;

import android.app.Application;
import androidx.lifecycle.C0989a;
import androidx.lifecycle.C1001d0;
import androidx.lifecycle.C1040t;
import androidx.lifecycle.C1043v;
import ce0.C21100e;
import com.moovit.MoovitApplication;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import com.moovit.app.subscription.model.SubscriptionDetails;
import java.util.List;
import p501fw.C17110h;
import p977zz.C20961r;

/* renamed from: com.moovit.app.subscription.b */
public final class C15364b extends C0989a {

    /* renamed from: c */
    public final C1001d0 f39781c;

    /* renamed from: d */
    public final C1043v<C20961r<List<SubscriptionDetails>>> f39782d = new C1043v<>();

    /* renamed from: e */
    public final C1040t<C20961r<List<SubscriptionDetails>>> f39783e;

    public C15364b(Application application, C1001d0 d0Var) {
        super(application);
        C21100e.m49373x(d0Var, "savedState");
        this.f39781c = d0Var;
        C1043v<MoovitSubscriptionsManager.C15361d> vVar = MoovitSubscriptionsManager.m39315c((MoovitApplication) this.f3907b).f39763e;
        C1040t<C20961r<List<SubscriptionDetails>>> tVar = new C1040t<>();
        this.f39783e = tVar;
        tVar.addSource(vVar, new C17110h(this, 1));
    }
}
