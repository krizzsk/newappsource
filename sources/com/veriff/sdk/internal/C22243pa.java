package com.veriff.sdk.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import mobi.lab.veriff.util.C24454g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u001a\u0010\b\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005J\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00068\u0000@BX\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, mo59060d2 = {"Lcom/veriff/sdk/views/base/navigation/NavigationManager;", "", "Lbf0/d;", "goBack", "goForward", "Lkotlin/Function1;", "Lcom/veriff/sdk/views/base/navigation/NavigationState;", "transform", "navigate", "", "onBackPressed", "Lcom/veriff/sdk/views/base/navigation/Renderer;", "renderer", "Lcom/veriff/sdk/views/base/navigation/Renderer;", "<set-?>", "state", "Lcom/veriff/sdk/views/base/navigation/NavigationState;", "getState$veriff_library_dist", "()Lcom/veriff/sdk/views/base/navigation/NavigationState;", "<init>", "(Lcom/veriff/sdk/views/base/navigation/Renderer;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.pa */
public final class C22243pa {

    /* renamed from: a */
    private C22247pc f56093a = C22247pc.f56098a.mo56194a();

    /* renamed from: b */
    private final C22251pe f56094b;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/base/navigation/NavigationState;", "it", "invoke", "(Lcom/veriff/sdk/views/base/navigation/NavigationState;)Lcom/veriff/sdk/views/base/navigation/NavigationState;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.pa$a */
    public static final class C22244a extends Lambda implements C24236l<C22247pc, C22247pc> {

        /* renamed from: a */
        public static final C22244a f56095a = new C22244a();

        public C22244a() {
            super(1);
        }

        /* renamed from: a */
        public final C22247pc invoke(C22247pc pcVar) {
            C24362h.m61211f(pcVar, "it");
            return C22247pc.m54156a(pcVar, (List) null, pcVar.mo56188c() - 1, (C24454g) null, 5, (Object) null);
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lcom/veriff/sdk/views/base/navigation/NavigationState;", "it", "invoke", "(Lcom/veriff/sdk/views/base/navigation/NavigationState;)Lcom/veriff/sdk/views/base/navigation/NavigationState;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.pa$b */
    public static final class C22245b extends Lambda implements C24236l<C22247pc, C22247pc> {

        /* renamed from: a */
        public static final C22245b f56096a = new C22245b();

        public C22245b() {
            super(1);
        }

        /* renamed from: a */
        public final C22247pc invoke(C22247pc pcVar) {
            C24362h.m61211f(pcVar, "it");
            return C22247pc.m54156a(pcVar, (List) null, pcVar.mo56188c() + 1, (C24454g) null, 5, (Object) null);
        }
    }

    public C22243pa(C22251pe peVar) {
        C24362h.m61211f(peVar, "renderer");
        this.f56094b = peVar;
    }

    /* renamed from: a */
    public final C22247pc mo56177a() {
        return this.f56093a;
    }

    /* renamed from: b */
    public final void mo56179b() {
        mo56178a(C22245b.f56096a);
    }

    /* renamed from: c */
    public final void mo56180c() {
        mo56178a(C22244a.f56095a);
    }

    /* renamed from: d */
    public final boolean mo56181d() {
        return this.f56094b.mo56200a();
    }

    /* renamed from: a */
    public final void mo56178a(C24236l<? super C22247pc, C22247pc> lVar) {
        C24362h.m61211f(lVar, "transform");
        C22247pc invoke = lVar.invoke(this.f56093a);
        C22241oz a = invoke.mo56185a();
        C22241oz a2 = this.f56093a.mo56185a();
        this.f56093a = invoke;
        if ((!C24362h.m61206a(a, a2)) && a != null) {
            this.f56094b.mo56199a(a);
        }
    }
}
