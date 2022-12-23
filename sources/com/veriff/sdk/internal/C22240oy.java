package com.veriff.sdk.internal;

import android.content.ComponentName;
import android.content.Intent;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0004J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0004R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, mo59060d2 = {"Lcom/veriff/sdk/views/base/LegacyNavigator;", "", "Lbf0/d;", "finish", "Landroid/content/Intent;", "intent", "notifyIdler", "Lcom/veriff/sdk/internal/analytics/Page;", "page", "Lcom/veriff/sdk/internal/analytics/EventSource;", "source", "Lmobi/lab/veriff/model/AuthenticationFlowSession;", "session", "showConfirmExitDialog", "startActivity", "", "requestCode", "startActivityForResult", "Lcom/veriff/sdk/views/base/BaseActivity;", "activity", "Lcom/veriff/sdk/views/base/BaseActivity;", "<init>", "(Lcom/veriff/sdk/views/base/BaseActivity;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.oy */
public class C22240oy {

    /* renamed from: a */
    private final C22233ot f56078a;

    public C22240oy(C22233ot otVar) {
        C24362h.m61211f(otVar, "activity");
        this.f56078a = otVar;
    }

    /* renamed from: b */
    private final void m54140b(Intent intent) {
        String className;
        ComponentName component = intent.getComponent();
        if (component != null && (className = component.getClassName()) != null) {
            C21618ez.f54604a.mo54890a(className);
        }
    }

    /* renamed from: a */
    public final void mo56170a(Intent intent) {
        C24362h.m61211f(intent, "intent");
        m54140b(intent);
        this.f56078a.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo56172a(C21783is isVar, C21719gi giVar, C22661wm wmVar) {
        C24362h.m61211f(isVar, "page");
        C24362h.m61211f(giVar, "source");
        this.f56078a.mo56152a(isVar, giVar, wmVar);
    }

    /* renamed from: a */
    public final void mo56171a(Intent intent, int i) {
        C24362h.m61211f(intent, "intent");
        m54140b(intent);
        this.f56078a.startActivityForResult(intent, i);
    }

    /* renamed from: a */
    public final void mo56169a() {
        this.f56078a.finish();
    }
}
