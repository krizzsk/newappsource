package com.veriff.sdk.internal;

import android.app.Activity;
import android.widget.FrameLayout;
import com.veriff.sdk.internal.C21580du;
import com.veriff.sdk.views.C22932d;
import com.veriff.sdk.views.ScreenRunner;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0016g;
import ye0.C25292a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, mo59060d2 = {"Lcom/veriff/sdk/views/base/navigation/ScreenRenderer;", "Lcom/veriff/sdk/views/base/navigation/Renderer;", "Lbf0/d;", "attachToActivity", "Lcom/veriff/sdk/views/base/navigation/NavigationStep;", "step", "Ljava/lang/RuntimeException;", "noScreenBound", "", "onBackPressed", "Lcom/veriff/sdk/views/base/navigation/DisplayState;", "state", "render", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "Landroid/widget/FrameLayout;", "container", "Landroid/widget/FrameLayout;", "Lcom/veriff/sdk/views/ScreenRunner;", "runner", "Lcom/veriff/sdk/views/ScreenRunner;", "Lcom/veriff/di/ScreenComponent$Factory;", "screenComponentFactory", "Lcom/veriff/di/ScreenComponent$Factory;", "<init>", "(Landroid/app/Activity;Lcom/veriff/di/ScreenComponent$Factory;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.pf */
public final class C22259pf implements C22251pe {

    /* renamed from: a */
    private final FrameLayout f56120a;

    /* renamed from: b */
    private final ScreenRunner f56121b;

    /* renamed from: c */
    private final Activity f56122c;

    /* renamed from: d */
    private final C21580du.C21581a f56123d;

    public C22259pf(Activity activity, C21580du.C21581a aVar) {
        C24362h.m61211f(activity, "activity");
        C24362h.m61211f(aVar, "screenComponentFactory");
        this.f56122c = activity;
        this.f56123d = aVar;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f56120a = frameLayout;
        this.f56121b = new ScreenRunner(frameLayout);
    }

    /* renamed from: a */
    public void mo56199a(C22241oz ozVar) {
        C24362h.m61211f(ozVar, "state");
        C25292a aVar = this.f56123d.mo54575a().mo54576a().get(ozVar.mo56173a());
        if (aVar != null) {
            ScreenRunner screenRunner = this.f56121b;
            Object obj = aVar.get();
            C24362h.m61210e(obj, "screenProvider.get()");
            screenRunner.mo57561a((C22932d) obj);
            return;
        }
        throw m54183a(ozVar.mo56173a());
    }

    /* renamed from: b */
    public final void mo56215b() {
        this.f56122c.setContentView(this.f56120a);
    }

    /* renamed from: a */
    public boolean mo56200a() {
        return this.f56121b.mo56147f();
    }

    /* renamed from: a */
    private final RuntimeException m54183a(C22250pd pdVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("No screen created for step ");
        sb.append(pdVar);
        sb.append(". Is your Screen bound correctly? Add the following to your screen:\n");
        sb.append("@BindStep(NavigationStep.");
        sb.append(pdVar);
        return new IllegalStateException(C0016g.m31o(sb, ")\n", "@ContributesMultibinding(ScreenScope::class, boundType = Screen::class)"));
    }
}
