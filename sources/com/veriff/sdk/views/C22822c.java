package com.veriff.sdk.views;

import androidx.lifecycle.C1020l;
import androidx.lifecycle.Lifecycle;
import com.veriff.sdk.views.C22932d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import p584jl.C17885a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo59060d2 = {"Lcom/veriff/sdk/views/LifecycleScreen;", "Lcom/veriff/sdk/views/Screen;", "Lbf0/d;", "create", "start", "resume", "pause", "stop", "destroy", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "Landroidx/lifecycle/l;", "getLifecycleScope", "()Landroidx/lifecycle/l;", "lifecycleScope", "Lcom/veriff/sdk/views/FloatingLifecycleOwner;", "owner", "Lcom/veriff/sdk/views/FloatingLifecycleOwner;", "getOwner", "()Lcom/veriff/sdk/views/FloatingLifecycleOwner;", "<init>", "(Lcom/veriff/sdk/views/FloatingLifecycleOwner;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.c */
public abstract class C22822c implements C22932d {

    /* renamed from: a */
    private final C22808a f57903a;

    public C22822c(C22808a aVar) {
        C24362h.m61211f(aVar, "owner");
        this.f57903a = aVar;
    }

    /* renamed from: c */
    public final Lifecycle mo57590c() {
        return this.f57903a.getLifecycle();
    }

    public void create() {
        C22932d.C22933a.m56592b(this);
        this.f57903a.mo57564a();
    }

    /* renamed from: d */
    public final C1020l mo57591d() {
        return C17885a.m44426W(this.f57903a);
    }

    public void destroy() {
        C22932d.C22933a.m56597g(this);
        this.f57903a.mo57569f();
    }

    /* renamed from: f */
    public boolean mo56147f() {
        return C22932d.C22933a.m56598h(this);
    }

    public Integer getStatusBarColor() {
        return C22932d.C22933a.m56591a(this);
    }

    /* renamed from: k_ */
    public final C22808a mo57592k_() {
        return this.f57903a;
    }

    public void pause() {
        C22932d.C22933a.m56595e(this);
        this.f57903a.mo57567d();
    }

    public void resume() {
        C22932d.C22933a.m56594d(this);
        this.f57903a.mo57566c();
    }

    public void start() {
        C22932d.C22933a.m56593c(this);
        this.f57903a.mo57565b();
    }

    public void stop() {
        C22932d.C22933a.m56596f(this);
        this.f57903a.mo57568e();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22822c(C22808a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C22808a() : aVar);
    }
}
