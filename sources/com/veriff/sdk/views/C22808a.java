package com.veriff.sdk.views;

import androidx.lifecycle.C1033p;
import androidx.lifecycle.C1035q;
import androidx.lifecycle.Lifecycle;
import bf0.C21050d;
import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0004R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo59060d2 = {"Lcom/veriff/sdk/views/FloatingLifecycleOwner;", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "Lbf0/d;", "create", "destroy", "pause", "resume", "start", "stop", "Landroidx/lifecycle/q;", "registry", "Landroidx/lifecycle/q;", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.a */
public final class C22808a implements C1033p {

    /* renamed from: a */
    private final C1035q f57879a;

    public C22808a() {
        C1035q qVar = new C1035q(this);
        qVar.mo4321h(Lifecycle.State.INITIALIZED);
        C21050d dVar = C21050d.f52856a;
        this.f57879a = qVar;
    }

    /* renamed from: a */
    public final void mo57564a() {
        this.f57879a.mo4321h(Lifecycle.State.CREATED);
    }

    /* renamed from: b */
    public final void mo57565b() {
        this.f57879a.mo4321h(Lifecycle.State.STARTED);
    }

    /* renamed from: c */
    public final void mo57566c() {
        this.f57879a.mo4321h(Lifecycle.State.RESUMED);
    }

    /* renamed from: d */
    public final void mo57567d() {
        this.f57879a.mo4321h(Lifecycle.State.STARTED);
    }

    /* renamed from: e */
    public final void mo57568e() {
        this.f57879a.mo4321h(Lifecycle.State.CREATED);
    }

    /* renamed from: f */
    public final void mo57569f() {
        this.f57879a.mo4321h(Lifecycle.State.DESTROYED);
    }

    public Lifecycle getLifecycle() {
        return this.f57879a;
    }
}
